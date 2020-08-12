package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends BaseMapper<Student> {
}
