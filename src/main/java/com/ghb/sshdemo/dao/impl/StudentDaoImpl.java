package com.ghb.sshdemo.dao.impl;

import com.ghb.sshdemo.dao.StudentDao;
import com.ghb.sshdemo.entity.InfoEntity;
import com.ghb.sshdemo.entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by lenovo on 2016/4/14.
 */
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    //2014年4月4日 00:15:20直接只使用@Autowired,这里提示sessionFactory没办法注入，必须再加上@Qualifier
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    /**
     * 保存用户
     * @param student
     * @return
     */
    @Override
    public Serializable saveStudent(StudentEntity student) {
        return this.getCurrentSession().save(student);
    }

    /**
     * 通过ID查询用户信息
     * @param name
     * @return
     */
    @Override
    public StudentEntity getStudent(String name) {
        return (StudentEntity) this.getCurrentSession().get(StudentEntity.class, name);
    }
}
