package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 考试
 *
 * @author 
 * @email
 */
@TableName("kaoshi")
public class KaoshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KaoshiEntity() {

	}

	public KaoshiEntity(T t) {
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
    @TableField(value = "id")

    private Integer id;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 班级
     */
    @TableField(value = "banji_types")

    private Integer banjiTypes;


    /**
     * 考试编号
     */
    @TableField(value = "kaoshi_uuid_number")

    private String kaoshiUuidNumber;


    /**
     * 考试名称
     */
    @TableField(value = "kaoshi_name")

    private String kaoshiName;


    /**
     * 年
     */
    @TableField(value = "kaoshi_nian")

    private String kaoshiNian;


    /**
     * 学期
     */
    @TableField(value = "kaoshi_types")

    private Integer kaoshiTypes;


    /**
     * 考试地点
     */
    @TableField(value = "kaoshi_address")

    private String kaoshiAddress;


    /**
     * 考试时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "kaoshi_time")

    private Date kaoshiTime;


    /**
     * 考试详情
     */
    @TableField(value = "kaoshi_content")

    private String kaoshiContent;


    /**
     * 考试发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }
    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }
    /**
	 * 获取：班级
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 设置：考试编号
	 */
    public String getKaoshiUuidNumber() {
        return kaoshiUuidNumber;
    }
    /**
	 * 获取：考试编号
	 */

    public void setKaoshiUuidNumber(String kaoshiUuidNumber) {
        this.kaoshiUuidNumber = kaoshiUuidNumber;
    }
    /**
	 * 设置：考试名称
	 */
    public String getKaoshiName() {
        return kaoshiName;
    }
    /**
	 * 获取：考试名称
	 */

    public void setKaoshiName(String kaoshiName) {
        this.kaoshiName = kaoshiName;
    }
    /**
	 * 设置：年
	 */
    public String getKaoshiNian() {
        return kaoshiNian;
    }
    /**
	 * 获取：年
	 */

    public void setKaoshiNian(String kaoshiNian) {
        this.kaoshiNian = kaoshiNian;
    }
    /**
	 * 设置：学期
	 */
    public Integer getKaoshiTypes() {
        return kaoshiTypes;
    }
    /**
	 * 获取：学期
	 */

    public void setKaoshiTypes(Integer kaoshiTypes) {
        this.kaoshiTypes = kaoshiTypes;
    }
    /**
	 * 设置：考试地点
	 */
    public String getKaoshiAddress() {
        return kaoshiAddress;
    }
    /**
	 * 获取：考试地点
	 */

    public void setKaoshiAddress(String kaoshiAddress) {
        this.kaoshiAddress = kaoshiAddress;
    }
    /**
	 * 设置：考试时间
	 */
    public Date getKaoshiTime() {
        return kaoshiTime;
    }
    /**
	 * 获取：考试时间
	 */

    public void setKaoshiTime(Date kaoshiTime) {
        this.kaoshiTime = kaoshiTime;
    }
    /**
	 * 设置：考试详情
	 */
    public String getKaoshiContent() {
        return kaoshiContent;
    }
    /**
	 * 获取：考试详情
	 */

    public void setKaoshiContent(String kaoshiContent) {
        this.kaoshiContent = kaoshiContent;
    }
    /**
	 * 设置：考试发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：考试发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kaoshi{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", banjiTypes=" + banjiTypes +
            ", kaoshiUuidNumber=" + kaoshiUuidNumber +
            ", kaoshiName=" + kaoshiName +
            ", kaoshiNian=" + kaoshiNian +
            ", kaoshiTypes=" + kaoshiTypes +
            ", kaoshiAddress=" + kaoshiAddress +
            ", kaoshiTime=" + kaoshiTime +
            ", kaoshiContent=" + kaoshiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
