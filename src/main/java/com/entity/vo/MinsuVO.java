package com.entity.vo;

import com.entity.MinsuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 客房
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("minsu")
public class MinsuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 客房编号
     */

    @TableField(value = "minsu_uuid_number")
    private String minsuUuidNumber;


    /**
     * 客房名称
     */

    @TableField(value = "minsu_name")
    private String minsuName;


    /**
     * 客房照片
     */

    @TableField(value = "minsu_photo")
    private String minsuPhoto;


    /**
     * 客房类型
     */

    @TableField(value = "minsu_types")
    private Integer minsuTypes;


    /**
     * 客房定金
     */

    @TableField(value = "minsu_new_money")
    private Double minsuNewMoney;


    /**
     * 点击次数
     */

    @TableField(value = "minsu_clicknum")
    private Integer minsuClicknum;


    /**
     * 客房介绍
     */

    @TableField(value = "minsu_content")
    private String minsuContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "minsu_delete")
    private Integer minsuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：客房编号
	 */
    public String getMinsuUuidNumber() {
        return minsuUuidNumber;
    }


    /**
	 * 获取：客房编号
	 */

    public void setMinsuUuidNumber(String minsuUuidNumber) {
        this.minsuUuidNumber = minsuUuidNumber;
    }
    /**
	 * 设置：客房名称
	 */
    public String getMinsuName() {
        return minsuName;
    }


    /**
	 * 获取：客房名称
	 */

    public void setMinsuName(String minsuName) {
        this.minsuName = minsuName;
    }
    /**
	 * 设置：客房照片
	 */
    public String getMinsuPhoto() {
        return minsuPhoto;
    }


    /**
	 * 获取：客房照片
	 */

    public void setMinsuPhoto(String minsuPhoto) {
        this.minsuPhoto = minsuPhoto;
    }
    /**
	 * 设置：客房类型
	 */
    public Integer getMinsuTypes() {
        return minsuTypes;
    }


    /**
	 * 获取：客房类型
	 */

    public void setMinsuTypes(Integer minsuTypes) {
        this.minsuTypes = minsuTypes;
    }
    /**
	 * 设置：客房定金
	 */
    public Double getMinsuNewMoney() {
        return minsuNewMoney;
    }


    /**
	 * 获取：客房定金
	 */

    public void setMinsuNewMoney(Double minsuNewMoney) {
        this.minsuNewMoney = minsuNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getMinsuClicknum() {
        return minsuClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setMinsuClicknum(Integer minsuClicknum) {
        this.minsuClicknum = minsuClicknum;
    }
    /**
	 * 设置：客房介绍
	 */
    public String getMinsuContent() {
        return minsuContent;
    }


    /**
	 * 获取：客房介绍
	 */

    public void setMinsuContent(String minsuContent) {
        this.minsuContent = minsuContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getMinsuDelete() {
        return minsuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setMinsuDelete(Integer minsuDelete) {
        this.minsuDelete = minsuDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
