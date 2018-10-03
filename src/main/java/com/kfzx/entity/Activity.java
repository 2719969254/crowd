package com.kfzx.entity;

public class Activity {
    private Integer id;

    private Integer uid;

    private Double number;

    private String enjoytime;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public String getEnjoytime() {
        return enjoytime;
    }

    public void setEnjoytime(String enjoytime) {
        this.enjoytime = enjoytime == null ? null : enjoytime.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}