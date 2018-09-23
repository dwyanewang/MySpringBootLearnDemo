package com.deyanewang.chapter04.entity;


public class TUser {

    private Integer tId;
    private String tName;
    private Integer tAge;
    private String tAddress;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tAge=" + tAge +
                ", tAddress='" + tAddress + '\'' +
                '}';
    }
}
