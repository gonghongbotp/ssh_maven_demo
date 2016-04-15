package com.ghb.sshdemo.dao.impl;

import com.ghb.sshdemo.dao.InfoDao;
import com.ghb.sshdemo.entity.InfoEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lenovo on 2016/4/14.
 */
@Repository("infoDao")
public class InfoDaoImpl implements InfoDao {
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
     * @param info
     * @return
     */
    @Override
    public Serializable saveInfo(InfoEntity info) {
        return this.getCurrentSession().save(info);
    }

    /**
     * 通过ID查询用户信息
     * @param name
     * @return
     */
    @Override
    public InfoEntity getInfo(String name) {
        //System.out.println(name);
        List list = this.getCurrentSession().createQuery("from InfoEntity i where i.name=?")
                .setParameter(0,name).list();
        if (list != null)
            return (InfoEntity)list.get(0);
        return null;
    }
}
