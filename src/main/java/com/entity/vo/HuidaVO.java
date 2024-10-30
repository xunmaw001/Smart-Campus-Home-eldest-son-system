package com.entity.vo;

import com.entity.HuidaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 回答
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huida")
public class HuidaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 作业
     */

    @TableField(value = "zuoye_id")
    private Integer zuoyeId;


    /**
     * 家长学生
     */

    @TableField(value = "jiazhangxuesheng_id")
    private Integer jiazhangxueshengId;


    /**
     * 回答文件
     */

    @TableField(value = "huifu_file")
    private String huifuFile;


    /**
     * 作业得分
     */

    @TableField(value = "huida_defen")
    private Double huidaDefen;


    /**
     * 批改意见
     */

    @TableField(value = "huida_content")
    private String huidaContent;


    /**
     * 创建时间
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
	 * 设置：作业
	 */
    public Integer getZuoyeId() {
        return zuoyeId;
    }


    /**
	 * 获取：作业
	 */

    public void setZuoyeId(Integer zuoyeId) {
        this.zuoyeId = zuoyeId;
    }
    /**
	 * 设置：家长学生
	 */
    public Integer getJiazhangxueshengId() {
        return jiazhangxueshengId;
    }


    /**
	 * 获取：家长学生
	 */

    public void setJiazhangxueshengId(Integer jiazhangxueshengId) {
        this.jiazhangxueshengId = jiazhangxueshengId;
    }
    /**
	 * 设置：回答文件
	 */
    public String getHuifuFile() {
        return huifuFile;
    }


    /**
	 * 获取：回答文件
	 */

    public void setHuifuFile(String huifuFile) {
        this.huifuFile = huifuFile;
    }
    /**
	 * 设置：作业得分
	 */
    public Double getHuidaDefen() {
        return huidaDefen;
    }


    /**
	 * 获取：作业得分
	 */

    public void setHuidaDefen(Double huidaDefen) {
        this.huidaDefen = huidaDefen;
    }
    /**
	 * 设置：批改意见
	 */
    public String getHuidaContent() {
        return huidaContent;
    }


    /**
	 * 获取：批改意见
	 */

    public void setHuidaContent(String huidaContent) {
        this.huidaContent = huidaContent;
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

}
