package com.entity.vo;

import com.entity.ChongwuYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宠物领养申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chongwu_yuyue")
public class ChongwuYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 宠物
     */

    @TableField(value = "chongwu_id")
    private Integer chongwuId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 领养原因
     */

    @TableField(value = "chongwu_yuyue_text")
    private String chongwuYuyueText;


    /**
     * 领养状态
     */

    @TableField(value = "chongwu_yuyue_types")
    private Integer chongwuYuyueTypes;


    /**
     * 领养审核
     */

    @TableField(value = "chongwu_yuyue_yesno_types")
    private Integer chongwuYuyueYesnoTypes;


    /**
     * 审核结果
     */

    @TableField(value = "chongwu_yuyue_yesno_text")
    private String chongwuYuyueYesnoText;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：宠物
	 */
    public Integer getChongwuId() {
        return chongwuId;
    }


    /**
	 * 获取：宠物
	 */

    public void setChongwuId(Integer chongwuId) {
        this.chongwuId = chongwuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：领养原因
	 */
    public String getChongwuYuyueText() {
        return chongwuYuyueText;
    }


    /**
	 * 获取：领养原因
	 */

    public void setChongwuYuyueText(String chongwuYuyueText) {
        this.chongwuYuyueText = chongwuYuyueText;
    }
    /**
	 * 设置：领养状态
	 */
    public Integer getChongwuYuyueTypes() {
        return chongwuYuyueTypes;
    }


    /**
	 * 获取：领养状态
	 */

    public void setChongwuYuyueTypes(Integer chongwuYuyueTypes) {
        this.chongwuYuyueTypes = chongwuYuyueTypes;
    }
    /**
	 * 设置：领养审核
	 */
    public Integer getChongwuYuyueYesnoTypes() {
        return chongwuYuyueYesnoTypes;
    }


    /**
	 * 获取：领养审核
	 */

    public void setChongwuYuyueYesnoTypes(Integer chongwuYuyueYesnoTypes) {
        this.chongwuYuyueYesnoTypes = chongwuYuyueYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getChongwuYuyueYesnoText() {
        return chongwuYuyueYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setChongwuYuyueYesnoText(String chongwuYuyueYesnoText) {
        this.chongwuYuyueYesnoText = chongwuYuyueYesnoText;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
