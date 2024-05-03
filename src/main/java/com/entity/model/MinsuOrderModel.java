package com.entity.model;

import com.entity.MinsuOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 客房预定
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MinsuOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String minsuOrderUuidNumber;


    /**
     * 客房
     */
    private Integer minsuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date minsuOrderTime;


    /**
     * 实付价格
     */
    private Double minsuOrderTruePrice;


    /**
     * 订单类型
     */
    private Integer minsuOrderTypes;


    /**
     * 支付类型
     */
    private Integer minsuOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
