package com.ghb.sshdemo.service.impl;

import com.ghb.sshdemo.dao.StudentDao;
import com.ghb.sshdemo.entity.StudentEntity;
import com.ghb.sshdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by lenovo on 2016/4/14.
 */
@Service("stuService")
public class StudentServiceImpl implements StudentService{
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }
    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Serializable saveStudent(StudentEntity student) {
        return studentDao.saveStudent(student);
    }

    @Override
    public StudentEntity getStudent(String name) {
        return studentDao.getStudent(name);
    }
}
