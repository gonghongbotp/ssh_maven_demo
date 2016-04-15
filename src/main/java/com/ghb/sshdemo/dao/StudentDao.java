package com.ghb.sshdemo.dao;

import com.ghb.sshdemo.entity.StudentEntity;

import java.io.Serializable;

/**
 * Created by lenovo on 2016/4/14.
 */
public interface StudentDao {
    public Serializable saveStudent(StudentEntity student);
    public StudentEntity getStudent(String name);
}
