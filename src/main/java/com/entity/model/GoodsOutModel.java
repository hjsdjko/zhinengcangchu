package com.entity.model;

import com.entity.GoodsOutEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 出库
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GoodsOutModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 商品
     */
    private Integer goodsId;


    /**
     * 操作人
     */
    private Integer yuangongId;


    /**
     * 单号
     */
    private String goodsOutDanhaoNumber;


    /**
     * 出库数量
     */
    private Integer goodsOutNumber;


    /**
     * 出库时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 备注
     */
    private String goodsOutContent;


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
	 * 获取：商品
	 */
    public Integer getGoodsId() {
        return goodsId;
    }


    /**
	 * 设置：商品
	 */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    /**
	 * 获取：操作人
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 设置：操作人
	 */
    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：单号
	 */
    public String getGoodsOutDanhaoNumber() {
        return goodsOutDanhaoNumber;
    }


    /**
	 * 设置：单号
	 */
    public void setGoodsOutDanhaoNumber(String goodsOutDanhaoNumber) {
        this.goodsOutDanhaoNumber = goodsOutDanhaoNumber;
    }
    /**
	 * 获取：出库数量
	 */
    public Integer getGoodsOutNumber() {
        return goodsOutNumber;
    }


    /**
	 * 设置：出库数量
	 */
    public void setGoodsOutNumber(Integer goodsOutNumber) {
        this.goodsOutNumber = goodsOutNumber;
    }
    /**
	 * 获取：出库时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：出库时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：备注
	 */
    public String getGoodsOutContent() {
        return goodsOutContent;
    }


    /**
	 * 设置：备注
	 */
    public void setGoodsOutContent(String goodsOutContent) {
        this.goodsOutContent = goodsOutContent;
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
