package com.kfzx.entity;

public class Initiate {
    private Integer id;

    private Integer uid;

    private String type;

    private String name;

    private Double neednumber;

    private Double mynumber;

    private String desces;

    private String place;

    private String createtime;

    private String ceasetime;

    private String imgurl;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getNeednumber() {
        return neednumber;
    }

    public void setNeednumber(Double neednumber) {
        this.neednumber = neednumber;
    }

    public Double getMynumber() {
        return mynumber;
    }

    public void setMynumber(Double mynumber) {
        this.mynumber = mynumber;
    }

    public String getDesces() {
        return desces;
    }

    public void setDesces(String desces) {
        this.desces = desces == null ? null : desces.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getCeasetime() {
        return ceasetime;
    }

    public void setCeasetime(String ceasetime) {
        this.ceasetime = ceasetime == null ? null : ceasetime.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}