package com.entity.model;

import com.entity.MinsuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 客房
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MinsuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 客房编号
     */
    private String minsuUuidNumber;


    /**
     * 客房名称
     */
    private String minsuName;


    /**
     * 客房照片
     */
    private String minsuPhoto;


    /**
     * 客房类型
     */
    private Integer minsuTypes;


    /**
     * 客房定金
     */
    private Double minsuNewMoney;


    /**
     * 点击次数
     */
    private Integer minsuClicknum;


    /**
     * 客房介绍
     */
    private String minsuContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer minsuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
