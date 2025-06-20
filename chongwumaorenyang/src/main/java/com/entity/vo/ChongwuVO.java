package com.entity.vo;

import com.entity.ChongwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宠物
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chongwu")
public class ChongwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 宠物名称
     */

    @TableField(value = "chongwu_name")
    private String chongwuName;


    /**
     * 宠物照片
     */

    @TableField(value = "chongwu_photo")
    private String chongwuPhoto;


    /**
     * 宠物品种
     */

    @TableField(value = "chongwu_types")
    private Integer chongwuTypes;


    /**
     * 宠物类型
     */

    @TableField(value = "chongwuleix_types")
    private Integer chongwuleixTypes;


    /**
     * 宠物年龄
     */

    @TableField(value = "chongwu_age")
    private Integer chongwuAge;


    /**
     * 宠物性别
     */

    @TableField(value = "xingbie_types")
    private Integer xingbieTypes;


    /**
     * 宠物特征
     */

    @TableField(value = "chongwu_tezheng")
    private String chongwuTezheng;


    /**
     * 宠物状态
     */

    @TableField(value = "dongwu_types")
    private Integer dongwuTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "chongwu_delete")
    private Integer chongwuDelete;


    /**
     * 宠物简介
     */

    @TableField(value = "chongwu_content")
    private String chongwuContent;


    /**
     * 创建时间  show1 show2 photoShow homeMain
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
	 * 设置：宠物名称
	 */
    public String getChongwuName() {
        return chongwuName;
    }


    /**
	 * 获取：宠物名称
	 */

    public void setChongwuName(String chongwuName) {
        this.chongwuName = chongwuName;
    }
    /**
	 * 设置：宠物照片
	 */
    public String getChongwuPhoto() {
        return chongwuPhoto;
    }


    /**
	 * 获取：宠物照片
	 */

    public void setChongwuPhoto(String chongwuPhoto) {
        this.chongwuPhoto = chongwuPhoto;
    }
    /**
	 * 设置：宠物品种
	 */
    public Integer getChongwuTypes() {
        return chongwuTypes;
    }


    /**
	 * 获取：宠物品种
	 */

    public void setChongwuTypes(Integer chongwuTypes) {
        this.chongwuTypes = chongwuTypes;
    }
    /**
	 * 设置：宠物类型
	 */
    public Integer getChongwuleixTypes() {
        return chongwuleixTypes;
    }


    /**
	 * 获取：宠物类型
	 */

    public void setChongwuleixTypes(Integer chongwuleixTypes) {
        this.chongwuleixTypes = chongwuleixTypes;
    }
    /**
	 * 设置：宠物年龄
	 */
    public Integer getChongwuAge() {
        return chongwuAge;
    }


    /**
	 * 获取：宠物年龄
	 */

    public void setChongwuAge(Integer chongwuAge) {
        this.chongwuAge = chongwuAge;
    }
    /**
	 * 设置：宠物性别
	 */
    public Integer getXingbieTypes() {
        return xingbieTypes;
    }


    /**
	 * 获取：宠物性别
	 */

    public void setXingbieTypes(Integer xingbieTypes) {
        this.xingbieTypes = xingbieTypes;
    }
    /**
	 * 设置：宠物特征
	 */
    public String getChongwuTezheng() {
        return chongwuTezheng;
    }


    /**
	 * 获取：宠物特征
	 */

    public void setChongwuTezheng(String chongwuTezheng) {
        this.chongwuTezheng = chongwuTezheng;
    }
    /**
	 * 设置：宠物状态
	 */
    public Integer getDongwuTypes() {
        return dongwuTypes;
    }


    /**
	 * 获取：宠物状态
	 */

    public void setDongwuTypes(Integer dongwuTypes) {
        this.dongwuTypes = dongwuTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getChongwuDelete() {
        return chongwuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setChongwuDelete(Integer chongwuDelete) {
        this.chongwuDelete = chongwuDelete;
    }
    /**
	 * 设置：宠物简介
	 */
    public String getChongwuContent() {
        return chongwuContent;
    }


    /**
	 * 获取：宠物简介
	 */

    public void setChongwuContent(String chongwuContent) {
        this.chongwuContent = chongwuContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow homeMain
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
