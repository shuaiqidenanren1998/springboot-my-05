package com.qf.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.dao.StudentDao;
import com.qf.pojo.Student;
import com.qf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {

//        QueryWrapper<Object> queryWrapper = new QueryWrapper<>();

        return studentDao.selectList(null);
    }
}
