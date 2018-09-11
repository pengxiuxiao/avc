package com.supadata.pojo;

import java.util.Date;

public class TeamBuy{

    private Integer id;

    private Date updateTime;

    private Integer uId;

    private String uOrderId;

    private Date payTime;

    private Date endTime;

    private String freeFee;

    private String totalFee;

    private String tbStatus;

    private String tbNumber;

    private String payNumber;

    private String tbUrl;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuOrderId() {
        return uOrderId;
    }

    public void setuOrderId(String uOrderId) {
        this.uOrderId = uOrderId == null ? null : uOrderId.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getFreeFee() {
        return freeFee;
    }

    public void setFreeFee(String freeFee) {
        this.freeFee = freeFee == null ? null : freeFee.trim();
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee == null ? null : totalFee.trim();
    }

    public String getTbStatus() {
        return tbStatus;
    }

    public void setTbStatus(String tbStatus) {
        this.tbStatus = tbStatus == null ? null : tbStatus.trim();
    }

    public String getTbNumber() {
        return tbNumber;
    }

    public void setTbNumber(String tbNumber) {
        this.tbNumber = tbNumber == null ? null : tbNumber.trim();
    }

    public String getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(String payNumber) {
        this.payNumber = payNumber == null ? null : payNumber.trim();
    }

    public String getTbUrl() {
        return tbUrl;
    }

    public void setTbUrl(String tbUrl) {
        this.tbUrl = tbUrl == null ? null : tbUrl.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}