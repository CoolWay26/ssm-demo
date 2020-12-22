package com.ssm.controller;


import com.ssm.entity.StudentDo;
import com.ssm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/student")
@Controller
public class StudentController {

    @Resource
    private StudentService studentService;


    @RequestMapping(value = "/getStudentList", method = RequestMethod.GET)
    @ResponseBody
    public List<StudentDo> getStudentList() {
        List<StudentDo> studentDoList = studentService.getAllStudent();
        for (StudentDo studentDo : studentDoList) {
            System.out.println(studentDo.getName() + "的岁数是" + studentDo.getAge());
        }
        return studentDoList;
    }

}
