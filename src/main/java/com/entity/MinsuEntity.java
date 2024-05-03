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
 * 客房
 *
 * @author 
 * @email
 */
@TableName("minsu")
public class MinsuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MinsuEntity() {

	}

	public MinsuEntity(T t) {
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
     * 客房编号
     */
    @ColumnInfo(comment="客房编号",type="varchar(200)")
    @TableField(value = "minsu_uuid_number")

    private String minsuUuidNumber;


    /**
     * 客房名称
     */
    @ColumnInfo(comment="客房名称",type="varchar(200)")
    @TableField(value = "minsu_name")

    private String minsuName;


    /**
     * 客房照片
     */
    @ColumnInfo(comment="客房照片",type="varchar(200)")
    @TableField(value = "minsu_photo")

    private String minsuPhoto;


    /**
     * 客房类型
     */
    @ColumnInfo(comment="客房类型",type="int(11)")
    @TableField(value = "minsu_types")

    private Integer minsuTypes;


    /**
     * 客房定金
     */
    @ColumnInfo(comment="客房定金",type="decimal(10,2)")
    @TableField(value = "minsu_new_money")

    private Double minsuNewMoney;


    /**
     * 点击次数
     */
    @ColumnInfo(comment="点击次数",type="int(11)")
    @TableField(value = "minsu_clicknum")

    private Integer minsuClicknum;


    /**
     * 客房介绍
     */
    @ColumnInfo(comment="客房介绍",type="text")
    @TableField(value = "minsu_content")

    private String minsuContent;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "minsu_delete")

    private Integer minsuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：客房编号
	 */
    public String getMinsuUuidNumber() {
        return minsuUuidNumber;
    }
    /**
	 * 设置：客房编号
	 */

    public void setMinsuUuidNumber(String minsuUuidNumber) {
        this.minsuUuidNumber = minsuUuidNumber;
    }
    /**
	 * 获取：客房名称
	 */
    public String getMinsuName() {
        return minsuName;
    }
    /**
	 * 设置：客房名称
	 */

    public void setMinsuName(String minsuName) {
        this.minsuName = minsuName;
    }
    /**
	 * 获取：客房照片
	 */
    public String getMinsuPhoto() {
        return minsuPhoto;
    }
    /**
	 * 设置：客房照片
	 */

    public void setMinsuPhoto(String minsuPhoto) {
        this.minsuPhoto = minsuPhoto;
    }
    /**
	 * 获取：客房类型
	 */
    public Integer getMinsuTypes() {
        return minsuTypes;
    }
    /**
	 * 设置：客房类型
	 */

    public void setMinsuTypes(Integer minsuTypes) {
        this.minsuTypes = minsuTypes;
    }
    /**
	 * 获取：客房定金
	 */
    public Double getMinsuNewMoney() {
        return minsuNewMoney;
    }
    /**
	 * 设置：客房定金
	 */

    public void setMinsuNewMoney(Double minsuNewMoney) {
        this.minsuNewMoney = minsuNewMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getMinsuClicknum() {
        return minsuClicknum;
    }
    /**
	 * 设置：点击次数
	 */

    public void setMinsuClicknum(Integer minsuClicknum) {
        this.minsuClicknum = minsuClicknum;
    }
    /**
	 * 获取：客房介绍
	 */
    public String getMinsuContent() {
        return minsuContent;
    }
    /**
	 * 设置：客房介绍
	 */

    public void setMinsuContent(String minsuContent) {
        this.minsuContent = minsuContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getMinsuDelete() {
        return minsuDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setMinsuDelete(Integer minsuDelete) {
        this.minsuDelete = minsuDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Minsu{" +
            ", id=" + id +
            ", minsuUuidNumber=" + minsuUuidNumber +
            ", minsuName=" + minsuName +
            ", minsuPhoto=" + minsuPhoto +
            ", minsuTypes=" + minsuTypes +
            ", minsuNewMoney=" + minsuNewMoney +
            ", minsuClicknum=" + minsuClicknum +
            ", minsuContent=" + minsuContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", minsuDelete=" + minsuDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
