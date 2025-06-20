
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 宠物领养申请
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/chongwuYuyue")
public class ChongwuYuyueController {
    private static final Logger logger = LoggerFactory.getLogger(ChongwuYuyueController.class);

    private static final String TABLE_NAME = "chongwuYuyue";

    @Autowired
    private ChongwuYuyueService chongwuYuyueService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private AddressService addressService;//收货地址
    @Autowired
    private ChongwuService chongwuService;//宠物
    @Autowired
    private ChongwuyongpinService chongwuyongpinService;//宠物用品
    @Autowired
    private ChongwuyongpinCollectionService chongwuyongpinCollectionService;//宠物用品收藏
    @Autowired
    private ChongwuyongpinOrderService chongwuyongpinOrderService;//宠物用品订单
    @Autowired
    private DictionaryService dictionaryService;//字典表
    @Autowired
    private ForumService forumService;//萌宠讨论
    @Autowired
    private LiuyanService liuyanService;//留言反馈
    @Autowired
    private NewsService newsService;//通知公告
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = chongwuYuyueService.queryPage(params);

        //字典表数据转换
        List<ChongwuYuyueView> list =(List<ChongwuYuyueView>)page.getList();
        for(ChongwuYuyueView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChongwuYuyueEntity chongwuYuyue = chongwuYuyueService.selectById(id);
        if(chongwuYuyue !=null){
            //entity转view
            ChongwuYuyueView view = new ChongwuYuyueView();
            BeanUtils.copyProperties( chongwuYuyue , view );//把实体数据重构到view中
            //级联表 宠物
            //级联表
            ChongwuEntity chongwu = chongwuService.selectById(chongwuYuyue.getChongwuId());
            if(chongwu != null){
            BeanUtils.copyProperties( chongwu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setChongwuId(chongwu.getId());
            }
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(chongwuYuyue.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuYuyueEntity chongwuYuyue, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,chongwuYuyue:{}",this.getClass().getName(),chongwuYuyue.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            chongwuYuyue.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ChongwuYuyueEntity> queryWrapper = new EntityWrapper<ChongwuYuyueEntity>()
            .eq("chongwu_id", chongwuYuyue.getChongwuId())
            .eq("yonghu_id", chongwuYuyue.getYonghuId())
            .eq("chongwu_yuyue_types", chongwuYuyue.getChongwuYuyueTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChongwuYuyueEntity chongwuYuyueEntity = chongwuYuyueService.selectOne(queryWrapper);
        if(chongwuYuyueEntity==null){
            chongwuYuyue.setChongwuYuyueYesnoTypes(1);
            chongwuYuyue.setInsertTime(new Date());
            chongwuYuyue.setCreateTime(new Date());
            chongwuYuyueService.insert(chongwuYuyue);
            return R.ok();
        }else {
            if(chongwuYuyueEntity.getChongwuYuyueYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(chongwuYuyueEntity.getChongwuYuyueYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChongwuYuyueEntity chongwuYuyue, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,chongwuYuyue:{}",this.getClass().getName(),chongwuYuyue.toString());
        ChongwuYuyueEntity oldChongwuYuyueEntity = chongwuYuyueService.selectById(chongwuYuyue.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            chongwuYuyue.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

            chongwuYuyueService.updateById(chongwuYuyue);//根据id更新
            return R.ok();
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody ChongwuYuyueEntity chongwuYuyueEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,chongwuYuyueEntity:{}",this.getClass().getName(),chongwuYuyueEntity.toString());

        ChongwuYuyueEntity oldChongwuYuyue = chongwuYuyueService.selectById(chongwuYuyueEntity.getId());//查询原先数据

        if(chongwuYuyueEntity.getChongwuYuyueYesnoTypes() == 2){//通过
            chongwuYuyueEntity.setChongwuYuyueTypes(99);
            ChongwuEntity chongwuEntity = new ChongwuEntity();
            chongwuEntity.setId(oldChongwuYuyue.getChongwuId());
            chongwuEntity.setDongwuTypes(2);
            chongwuService.updateById(chongwuEntity);
        }else if(chongwuYuyueEntity.getChongwuYuyueYesnoTypes() == 3){//拒绝
            chongwuYuyueEntity.setChongwuYuyueTypes(100);
        }
        chongwuYuyueService.updateById(chongwuYuyueEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ChongwuYuyueEntity> oldChongwuYuyueList =chongwuYuyueService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        chongwuYuyueService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<ChongwuYuyueEntity> chongwuYuyueList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ChongwuYuyueEntity chongwuYuyueEntity = new ChongwuYuyueEntity();
//                            chongwuYuyueEntity.setChongwuId(Integer.valueOf(data.get(0)));   //宠物 要改的
//                            chongwuYuyueEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            chongwuYuyueEntity.setChongwuYuyueText(data.get(0));                    //领养原因 要改的
//                            chongwuYuyueEntity.setChongwuYuyueTypes(Integer.valueOf(data.get(0)));   //领养状态 要改的
//                            chongwuYuyueEntity.setChongwuYuyueYesnoTypes(Integer.valueOf(data.get(0)));   //领养审核 要改的
//                            chongwuYuyueEntity.setChongwuYuyueYesnoText(data.get(0));                    //审核结果 要改的
//                            chongwuYuyueEntity.setInsertTime(date);//时间
//                            chongwuYuyueEntity.setCreateTime(date);//时间
                            chongwuYuyueList.add(chongwuYuyueEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        chongwuYuyueService.insertBatch(chongwuYuyueList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = chongwuYuyueService.queryPage(params);

        //字典表数据转换
        List<ChongwuYuyueView> list =(List<ChongwuYuyueView>)page.getList();
        for(ChongwuYuyueView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChongwuYuyueEntity chongwuYuyue = chongwuYuyueService.selectById(id);
            if(chongwuYuyue !=null){


                //entity转view
                ChongwuYuyueView view = new ChongwuYuyueView();
                BeanUtils.copyProperties( chongwuYuyue , view );//把实体数据重构到view中

                //级联表
                    ChongwuEntity chongwu = chongwuService.selectById(chongwuYuyue.getChongwuId());
                if(chongwu != null){
                    BeanUtils.copyProperties( chongwu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setChongwuId(chongwu.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(chongwuYuyue.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuYuyueEntity chongwuYuyue, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,chongwuYuyue:{}",this.getClass().getName(),chongwuYuyue.toString());
        Wrapper<ChongwuYuyueEntity> queryWrapper = new EntityWrapper<ChongwuYuyueEntity>()
            .eq("chongwu_id", chongwuYuyue.getChongwuId())
            .eq("yonghu_id", chongwuYuyue.getYonghuId())
            .eq("chongwu_yuyue_text", chongwuYuyue.getChongwuYuyueText())
            .eq("chongwu_yuyue_types", chongwuYuyue.getChongwuYuyueTypes())
            .eq("chongwu_yuyue_yesno_types", new Integer[]{1,2})
            .eq("chongwu_yuyue_yesno_text", chongwuYuyue.getChongwuYuyueYesnoText())
//            .notIn("chongwu_yuyue_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChongwuYuyueEntity chongwuYuyueEntity = chongwuYuyueService.selectOne(queryWrapper);
        if(chongwuYuyueEntity==null){
            chongwuYuyue.setChongwuYuyueYesnoTypes(1);
            chongwuYuyue.setInsertTime(new Date());
            chongwuYuyue.setCreateTime(new Date());
        chongwuYuyueService.insert(chongwuYuyue);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 取消领养
    */
    @RequestMapping("/refund")
    public R refund(Integer id, HttpServletRequest request){
        logger.debug("refund方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        String role = String.valueOf(request.getSession().getAttribute("role"));

            ChongwuYuyueEntity chongwuYuyue = chongwuYuyueService.selectById(id);//当前表service
            Integer chongwuId = chongwuYuyue.getChongwuId();
            if(chongwuId == null)
                return R.error(511,"查不到该宠物");
            ChongwuEntity chongwuEntity = chongwuService.selectById(chongwuId);
            if(chongwuEntity == null)
                return R.error(511,"查不到该宠物");

            Integer userId = (Integer) request.getSession().getAttribute("userId");
            YonghuEntity yonghuEntity = yonghuService.selectById(userId);
            if(yonghuEntity == null)
                return R.error(511,"用户不能为空");
            if(yonghuEntity.getNewMoney() == null)
            return R.error(511,"用户金额不能为空");
            Double zhekou = 1.0;


            chongwuYuyue.setChongwuYuyueTypes(102);//设置订单状态为取消领养
            chongwuYuyueService.updateById(chongwuYuyue);//根据id更新
            yonghuService.updateById(yonghuEntity);//更新用户信息
            chongwuService.updateById(chongwuEntity);//更新订单中宠物的信息

            return R.ok();
    }

    /**
     * 寄送
     */
    @RequestMapping("/deliver")
    public R deliver(Integer id ){
        logger.debug("refund:,,Controller:{},,ids:{}",this.getClass().getName(),id.toString());
        ChongwuYuyueEntity  chongwuYuyueEntity = chongwuYuyueService.selectById(id);
        chongwuYuyueEntity.setChongwuYuyueTypes(103);//设置订单状态为已寄送
        chongwuYuyueService.updateById( chongwuYuyueEntity);

        return R.ok();
    }


    /**
     * 收到
     */
    @RequestMapping("/receiving")
    public R receiving(Integer id){
        logger.debug("refund:,,Controller:{},,ids:{}",this.getClass().getName(),id.toString());
        ChongwuYuyueEntity  chongwuYuyueEntity = chongwuYuyueService.selectById(id);
        chongwuYuyueEntity.setChongwuYuyueTypes(104);//设置订单状态为收到
        chongwuYuyueService.updateById( chongwuYuyueEntity);
        return R.ok();
    }

}

