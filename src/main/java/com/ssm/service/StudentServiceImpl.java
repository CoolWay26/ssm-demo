package com.ssm.service;

import com.ssm.entity.StudentDo;
import com.ssm.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;

    @Override
    public List<StudentDo> getAllStudent() {
        return studentMapper.getAllStudent();
    }
}
