package com.ghb.sshdemo.entity;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/4/14.
 */
@Entity
@Table(name = "info", schema = "test")//删除了,catalog = ""
public class InfoEntity {
    private int id;
    private String name;
    private String tel;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


}
