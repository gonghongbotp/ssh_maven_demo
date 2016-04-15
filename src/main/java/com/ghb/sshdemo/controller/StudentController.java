package com.ghb.sshdemo.controller;

import com.ghb.sshdemo.entity.StudentEntity;
import com.ghb.sshdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2016/4/14.
 */
@Controller
@RequestMapping("/front/studentController")
public class StudentController {
    private StudentService studentService;

    public StudentService getStudentService() {
        return studentService;
    }

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * 查询student
     *
     * @param name
     * @param request
     * @return
     */
    @RequestMapping(value = "getStudent", method = RequestMethod.GET)
    public String getStudent(String name, HttpServletRequest request) {
        StudentEntity student = studentService.getStudent(name);
        request.setAttribute("student", student);
        request.setAttribute("msg", "查询成功");
        return "result";
    }

    /**
     * 增加student
     *
     * @param name
     * @param request
     * @return
     */
    @RequestMapping(value = "saveStudent", method = RequestMethod.POST)
    public String saveStudent(String name, HttpServletRequest request) {
        StudentEntity student = new StudentEntity();
        student.setName(name);
        studentService.saveStudent(student);
        request.setAttribute("student", student);
        request.setAttribute("msg", "添加成功");
        return "result";
    }



}