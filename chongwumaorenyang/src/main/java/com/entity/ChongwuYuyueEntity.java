package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 宠物领养申请
 *
 * @author 
 * @email
 */
@TableName("chongwu_yuyue")
public class ChongwuYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwuYuyueEntity() {

	}

	public ChongwuYuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 宠物
     */
    @ColumnInfo(comment="宠物",type="int(11)")
    @TableField(value = "chongwu_id")

    private Integer chongwuId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 领养原因
     */
    @ColumnInfo(comment="领养原因",type="text")
    @TableField(value = "chongwu_yuyue_text")

    private String chongwuYuyueText;


    /**
     * 领养状态
     */
    @ColumnInfo(comment="领养状态",type="int(11)")
    @TableField(value = "chongwu_yuyue_types")

    private Integer chongwuYuyueTypes;


    /**
     * 领养审核
     */
    @ColumnInfo(comment="领养审核",type="int(11)")
    @TableField(value = "chongwu_yuyue_yesno_types")

    private Integer chongwuYuyueYesnoTypes;


    /**
     * 审核结果
     */
    @ColumnInfo(comment="审核结果",type="text")
    @TableField(value = "chongwu_yuyue_yesno_text")

    private String chongwuYuyueYesnoText;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：宠物
	 */
    public Integer getChongwuId() {
        return chongwuId;
    }
    /**
	 * 设置：宠物
	 */

    public void setChongwuId(Integer chongwuId) {
        this.chongwuId = chongwuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：领养原因
	 */
    public String getChongwuYuyueText() {
        return chongwuYuyueText;
    }
    /**
	 * 设置：领养原因
	 */

    public void setChongwuYuyueText(String chongwuYuyueText) {
        this.chongwuYuyueText = chongwuYuyueText;
    }
    /**
	 * 获取：领养状态
	 */
    public Integer getChongwuYuyueTypes() {
        return chongwuYuyueTypes;
    }
    /**
	 * 设置：领养状态
	 */

    public void setChongwuYuyueTypes(Integer chongwuYuyueTypes) {
        this.chongwuYuyueTypes = chongwuYuyueTypes;
    }
    /**
	 * 获取：领养审核
	 */
    public Integer getChongwuYuyueYesnoTypes() {
        return chongwuYuyueYesnoTypes;
    }
    /**
	 * 设置：领养审核
	 */

    public void setChongwuYuyueYesnoTypes(Integer chongwuYuyueYesnoTypes) {
        this.chongwuYuyueYesnoTypes = chongwuYuyueYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getChongwuYuyueYesnoText() {
        return chongwuYuyueYesnoText;
    }
    /**
	 * 设置：审核结果
	 */

    public void setChongwuYuyueYesnoText(String chongwuYuyueYesnoText) {
        this.chongwuYuyueYesnoText = chongwuYuyueYesnoText;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ChongwuYuyue{" +
            ", id=" + id +
            ", chongwuId=" + chongwuId +
            ", yonghuId=" + yonghuId +
            ", chongwuYuyueText=" + chongwuYuyueText +
            ", chongwuYuyueTypes=" + chongwuYuyueTypes +
            ", chongwuYuyueYesnoTypes=" + chongwuYuyueYesnoTypes +
            ", chongwuYuyueYesnoText=" + chongwuYuyueYesnoText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
