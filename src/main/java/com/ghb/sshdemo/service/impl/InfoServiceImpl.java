package com.ghb.sshdemo.service.impl;

import com.ghb.sshdemo.dao.InfoDao;
import com.ghb.sshdemo.entity.InfoEntity;
import com.ghb.sshdemo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lenovo on 2016/4/14.
 */
@Service("infoService")
public class InfoServiceImpl implements InfoService{
    private InfoDao infoDao;
    public InfoDao getInfoDao(){ return infoDao;}

    @Autowired
    public void setInfoDao(InfoDao infoDao) {
        this.infoDao = infoDao;
    }

    @Override
    public Serializable saveInfo(InfoEntity info) {
        return infoDao.saveInfo(info);
    }

    @Override
    public InfoEntity getInfo(String name) {
        return infoDao.getInfo(name);
    }
}
