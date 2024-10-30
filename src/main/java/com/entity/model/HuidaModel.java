package com.entity.model;

import com.entity.HuidaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 回答
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuidaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 作业
     */
    private Integer zuoyeId;


    /**
     * 家长学生
     */
    private Integer jiazhangxueshengId;


    /**
     * 回答文件
     */
    private String huifuFile;


    /**
     * 作业得分
     */
    private Double huidaDefen;


    /**
     * 批改意见
     */
    private String huidaContent;


    /**
     * 创建时间
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
	 * 获取：作业
	 */
    public Integer getZuoyeId() {
        return zuoyeId;
    }


    /**
	 * 设置：作业
	 */
    public void setZuoyeId(Integer zuoyeId) {
        this.zuoyeId = zuoyeId;
    }
    /**
	 * 获取：家长学生
	 */
    public Integer getJiazhangxueshengId() {
        return jiazhangxueshengId;
    }


    /**
	 * 设置：家长学生
	 */
    public void setJiazhangxueshengId(Integer jiazhangxueshengId) {
        this.jiazhangxueshengId = jiazhangxueshengId;
    }
    /**
	 * 获取：回答文件
	 */
    public String getHuifuFile() {
        return huifuFile;
    }


    /**
	 * 设置：回答文件
	 */
    public void setHuifuFile(String huifuFile) {
        this.huifuFile = huifuFile;
    }
    /**
	 * 获取：作业得分
	 */
    public Double getHuidaDefen() {
        return huidaDefen;
    }


    /**
	 * 设置：作业得分
	 */
    public void setHuidaDefen(Double huidaDefen) {
        this.huidaDefen = huidaDefen;
    }
    /**
	 * 获取：批改意见
	 */
    public String getHuidaContent() {
        return huidaContent;
    }


    /**
	 * 设置：批改意见
	 */
    public void setHuidaContent(String huidaContent) {
        this.huidaContent = huidaContent;
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

    }
