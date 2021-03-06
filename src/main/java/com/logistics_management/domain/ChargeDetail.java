package com.logistics_management.domain;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 待完成 收费名细表
 */
@Table(name = "tb_charge_detail")
public class ChargeDetail {
    @Id
    private Integer id;//收费明细ID
    private Integer communityId;//所属小区ID
    private String communityName;//所属小区名称
    private Integer chargeItemId;//收费项目id
    private String chargeItemName;//收费项目名称
    private String contractor;//承办人名称
    private Integer telephone;//承办人联系电话
    private Integer payMoney;//应收金额（单位：分）
    private Integer actualMoney;//实收金额（单位：分）
    private Date createTime;//创建时间
    private Date updateTime;//更新时间
    private Date payTime;//缴费时间
    private String status;//状态：0-生效中（默认），1-已过期

    @Override
    public String toString() {
        return "ChargeDetail{" +
                "id=" + id +
                ", communityId=" + communityId +
                ", communityName='" + communityName + '\'' +
                ", chargeItemId=" + chargeItemId +
                ", chargeItemName='" + chargeItemName + '\'' +
                ", contractor='" + contractor + '\'' +
                ", telephone=" + telephone +
                ", payMoney=" + payMoney +
                ", actualMoney=" + actualMoney +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", payTime=" + payTime +
                ", status='" + status + '\'' +
                '}';
    }

    public ChargeDetail() {
    }

    public ChargeDetail(Integer id, Integer communityId, String communityName, Integer chargeItemId, String chargeItemName, String contractor, Integer telephone, Integer payMoney, Integer actualMoney, Date createTime, Date updateTime, Date payTime, String status) {
        this.id = id;
        this.communityId = communityId;
        this.communityName = communityName;
        this.chargeItemId = chargeItemId;
        this.chargeItemName = chargeItemName;
        this.contractor = contractor;
        this.telephone = telephone;
        this.payMoney = payMoney;
        this.actualMoney = actualMoney;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.payTime = payTime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Integer getChargeItemId() {
        return chargeItemId;
    }

    public void setChargeItemId(Integer chargeItemId) {
        this.chargeItemId = chargeItemId;
    }

    public String getChargeItemName() {
        return chargeItemName;
    }

    public void setChargeItemName(String chargeItemName) {
        this.chargeItemName = chargeItemName;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getActualMoney() {
        return actualMoney;
    }

    public void setActualMoney(Integer actualMoney) {
        this.actualMoney = actualMoney;
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
