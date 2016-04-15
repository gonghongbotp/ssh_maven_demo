package com.ghb.sshdemo.entity;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/4/14.
 */
@Entity
@Table(name = "student", schema = "test")//删除了,catalog = ""
public class StudentEntity {
    private String no;
    private String name;

    @Id
    @Column(name = "NO")
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
