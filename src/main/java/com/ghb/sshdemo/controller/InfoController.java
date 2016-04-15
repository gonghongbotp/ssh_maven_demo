package com.ghb.sshdemo.controller;

import com.alibaba.druid.support.logging.Log4jImpl;
import com.ghb.sshdemo.entity.InfoEntity;
import com.ghb.sshdemo.service.InfoService;
import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on 2016/4/14.
 */
@Controller
@RequestMapping("/front/infoController")

public class InfoController {
    private InfoService infoService;

    public InfoService getInfoService() {
        return infoService;
    }
    @Autowired
    public void setInfoService(InfoService infoService) {
        this.infoService = infoService;
    }
    /**
     * 查询info
     * @param name1
     * @param request
     * @return
     */
    @RequestMapping(value = "getInfo", method = RequestMethod.GET)
    public String getInfo(String name1, HttpServletRequest request) {
//        Logger log = Logger.getLogger(Log4jImpl.class);
//        log.error("Logg4j日志已经初始化。get");
//        List<InfoEntity> info = infoService.getInfo(name1);
//        for(int i = 0 ; i < info.size(); i++){
//            System.out.println(info.get(i).getName());
//        }
        //System.out.println(info.size());
        InfoEntity info = infoService.getInfo(name1);
        request.setAttribute("info", info);
        request.setAttribute("msg", "查询成功");
        return "result";
    }

    /**
     * 增加info
     * @param name1
     * @param request
     * @return
     */
    @RequestMapping(value = "saveInfo", method = RequestMethod.POST)
    public String saveInfo(String name1, String tel, HttpServletRequest request) {
//        Logger log = Logger.getLogger(Log4jImpl.class);
//        log.error("Logg4j日志已经初始化。save");
        InfoEntity info = new InfoEntity();
        info.setName(name1);
        info.setTel(tel);
        infoService.saveInfo(info);
        request.setAttribute("info", info);
        request.setAttribute("msg", "添加成功");
        return "result";
    }
}
