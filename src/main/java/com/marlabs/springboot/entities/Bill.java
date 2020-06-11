package com.marlabs.springboot.entities;

import java.util.Date;


public class Bill {

    private Integer bid;
    private String billCode;
    private String billName;
    private String billCom;
    private Integer billNum;
    private Double money;
    private Provider provider;
    private Integer pid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    // O: NOT YET PAY  1:PAID
    private Integer pay;
    private Date createDate;
    public Bill() {}

    public Bill(Integer bid, String billCode, String billName, String billCom, Integer billNum, Double money, Provider provider, Integer pay) {
        this.bid = bid;
        this.billCode = billCode;
        this.billName = billName;
        this.billCom = billCom;
        this.billNum = billNum;
        this.money = money;
        this.provider = provider;
        this.pay = pay;
        this.createDate = new Date();
    }

    @Override
    public String toString() {
        return "Bill{" +
                "bid=" + bid +
                ", billCode='" + billCode + '\'' +
                ", billName='" + billName + '\'' +
                ", billCom='" + billCom + '\'' +
                ", billNum=" + billNum +
                ", money=" + money +
                ", provider=" + provider +
                ", pay=" + pay +
                ", createDate=" + createDate +
                '}';
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getBillCom() {
        return billCom;
    }

    public void setBillCom(String billCom) {
        this.billCom = billCom;
    }

    public Integer getBillNum() {
        return billNum;
    }

    public void setBillNum(Integer billNum) {
        this.billNum = billNum;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
