package com.ghb.sshdemo.dao;

import com.ghb.sshdemo.entity.InfoEntity;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lenovo on 2016/4/14.
 */
public interface InfoDao {
    /*private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Transactional("transactionManager")
    public List<InfoEntity> getInfos(){
        String hql = "from Info";
        //sessionFactory.getCurrentSession().createQuery("from Info").list();
        return sessionFactory.getCurrentSession().createQuery("from InfoEntity ").list();
    }*/
    public Serializable saveInfo(InfoEntity info);
    public InfoEntity getInfo(String name);
}
