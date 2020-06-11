package com.marlabs.springboot.entities;

import java.util.Date;


public class Provider {
    private Integer pid;
    private String providerCode;
    private String providerName;
    private String people;
    private String phone;
    private String address;
    private String fax;
    private String describe;
    private Date createDate;

    public Provider() {
    }

    public Provider(Integer pid, String providerCode, String providerName, String people, String phone, String address, String fax, String describe) {
        this.pid = pid;
        this.providerCode = providerCode;
        this.providerName = providerName;
        this.people = people;
        this.phone = phone;
        this.address = address;
        this.fax = fax;
        this.describe = describe;
        this.createDate = new Date();
    }

    @Override
    public String toString() {
        return "Provider{" +
                "pid=" + pid +
                ", providerCode='" + providerCode + '\'' +
                ", providerName='" + providerName + '\'' +
                ", people='" + people + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", fax='" + fax + '\'' +
                ", describe='" + describe + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date date) {
        this.createDate = date;
    }
}
