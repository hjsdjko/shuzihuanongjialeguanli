package com.entity.vo;

import com.entity.MinsuOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 客房预定
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("minsu_order")
public class MinsuOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单号
     */

    @TableField(value = "minsu_order_uuid_number")
    private String minsuOrderUuidNumber;


    /**
     * 客房
     */

    @TableField(value = "minsu_id")
    private Integer minsuId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "minsu_order_time")
    private Date minsuOrderTime;


    /**
     * 实付价格
     */

    @TableField(value = "minsu_order_true_price")
    private Double minsuOrderTruePrice;


    /**
     * 订单类型
     */

    @TableField(value = "minsu_order_types")
    private Integer minsuOrderTypes;


    /**
     * 支付类型
     */

    @TableField(value = "minsu_order_payment_types")
    private Integer minsuOrderPaymentTypes;


    /**
     * 订单创建时间
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
	 * 设置：订单号
	 */
    public String getMinsuOrderUuidNumber() {
        return minsuOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setMinsuOrderUuidNumber(String minsuOrderUuidNumber) {
        this.minsuOrderUuidNumber = minsuOrderUuidNumber;
    }
    /**
	 * 设置：客房
	 */
    public Integer getMinsuId() {
        return minsuId;
    }


    /**
	 * 获取：客房
	 */

    public void setMinsuId(Integer minsuId) {
        this.minsuId = minsuId;
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
	 * 设置：预约时间
	 */
    public Date getMinsuOrderTime() {
        return minsuOrderTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setMinsuOrderTime(Date minsuOrderTime) {
        this.minsuOrderTime = minsuOrderTime;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getMinsuOrderTruePrice() {
        return minsuOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setMinsuOrderTruePrice(Double minsuOrderTruePrice) {
        this.minsuOrderTruePrice = minsuOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getMinsuOrderTypes() {
        return minsuOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setMinsuOrderTypes(Integer minsuOrderTypes) {
        this.minsuOrderTypes = minsuOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getMinsuOrderPaymentTypes() {
        return minsuOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setMinsuOrderPaymentTypes(Integer minsuOrderPaymentTypes) {
        this.minsuOrderPaymentTypes = minsuOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
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
