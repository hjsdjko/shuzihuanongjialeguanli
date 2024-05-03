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
 * 客房预定
 *
 * @author 
 * @email
 */
@TableName("minsu_order")
public class MinsuOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MinsuOrderEntity() {

	}

	public MinsuOrderEntity(T t) {
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
     * 订单号
     */
    @ColumnInfo(comment="订单号",type="varchar(200)")
    @TableField(value = "minsu_order_uuid_number")

    private String minsuOrderUuidNumber;


    /**
     * 客房
     */
    @ColumnInfo(comment="客房",type="int(11)")
    @TableField(value = "minsu_id")

    private Integer minsuId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="预约时间",type="timestamp")
    @TableField(value = "minsu_order_time")

    private Date minsuOrderTime;


    /**
     * 实付价格
     */
    @ColumnInfo(comment="实付价格",type="decimal(10,2)")
    @TableField(value = "minsu_order_true_price")

    private Double minsuOrderTruePrice;


    /**
     * 订单类型
     */
    @ColumnInfo(comment="订单类型",type="int(11)")
    @TableField(value = "minsu_order_types")

    private Integer minsuOrderTypes;


    /**
     * 支付类型
     */
    @ColumnInfo(comment="支付类型",type="int(11)")
    @TableField(value = "minsu_order_payment_types")

    private Integer minsuOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="订单创建时间",type="timestamp")
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
	 * 获取：订单号
	 */
    public String getMinsuOrderUuidNumber() {
        return minsuOrderUuidNumber;
    }
    /**
	 * 设置：订单号
	 */

    public void setMinsuOrderUuidNumber(String minsuOrderUuidNumber) {
        this.minsuOrderUuidNumber = minsuOrderUuidNumber;
    }
    /**
	 * 获取：客房
	 */
    public Integer getMinsuId() {
        return minsuId;
    }
    /**
	 * 设置：客房
	 */

    public void setMinsuId(Integer minsuId) {
        this.minsuId = minsuId;
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
	 * 获取：预约时间
	 */
    public Date getMinsuOrderTime() {
        return minsuOrderTime;
    }
    /**
	 * 设置：预约时间
	 */

    public void setMinsuOrderTime(Date minsuOrderTime) {
        this.minsuOrderTime = minsuOrderTime;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getMinsuOrderTruePrice() {
        return minsuOrderTruePrice;
    }
    /**
	 * 设置：实付价格
	 */

    public void setMinsuOrderTruePrice(Double minsuOrderTruePrice) {
        this.minsuOrderTruePrice = minsuOrderTruePrice;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getMinsuOrderTypes() {
        return minsuOrderTypes;
    }
    /**
	 * 设置：订单类型
	 */

    public void setMinsuOrderTypes(Integer minsuOrderTypes) {
        this.minsuOrderTypes = minsuOrderTypes;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getMinsuOrderPaymentTypes() {
        return minsuOrderPaymentTypes;
    }
    /**
	 * 设置：支付类型
	 */

    public void setMinsuOrderPaymentTypes(Integer minsuOrderPaymentTypes) {
        this.minsuOrderPaymentTypes = minsuOrderPaymentTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：订单创建时间
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
        return "MinsuOrder{" +
            ", id=" + id +
            ", minsuOrderUuidNumber=" + minsuOrderUuidNumber +
            ", minsuId=" + minsuId +
            ", yonghuId=" + yonghuId +
            ", minsuOrderTime=" + DateUtil.convertString(minsuOrderTime,"yyyy-MM-dd") +
            ", minsuOrderTruePrice=" + minsuOrderTruePrice +
            ", minsuOrderTypes=" + minsuOrderTypes +
            ", minsuOrderPaymentTypes=" + minsuOrderPaymentTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
