package com.logistics_management.domain;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * create by dongjiayao zhangningbo zhangkuan on 2021/12/7
 */
@Table(name = "tb_car")
public class Car implements Serializable {
    @Id
    private Integer id;//车辆id
    private String picture;//车辆照片
    private Integer ownerId;//所属成员（业主）
    private String color;//车辆颜色
    private String carNumber;//车牌号
    private String remark;//备注
    private Date createTime;//创建时间
    private Date updateTime;//更新时间

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", picture='" + picture + '\'' +
                ", ownerId=" + ownerId +
                ", color='" + color + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Car() {
    }

    public Car(Integer id, String picture, Integer ownerId, String color, String carNumber, String remark, Date createTime, Date updateTime) {
        this.id = id;
        this.picture = picture;
        this.ownerId = ownerId;
        this.color = color;
        this.carNumber = carNumber;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
