package com.qf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.lang.NonNullApi;

@Data
@TableName("t_stu")
public class Student {

    @TableId(type = IdType.AUTO)
    @TableField("sid")
    private Integer sid;
    @TableField("sname")
    private String name;

}
