package com.ghb.sshdemo.service;

import com.ghb.sshdemo.entity.InfoEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lenovo on 2016/4/14.
 */
public interface InfoService {
    public Serializable saveInfo(InfoEntity info);
    public InfoEntity getInfo(String name);
}
