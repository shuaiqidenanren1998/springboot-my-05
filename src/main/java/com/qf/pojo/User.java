package com.qf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
@TableName("user")
@Api(tags = "用户操作")
public class User {

    @ApiModelProperty("编号")
//    @TableId(type = IdType.AUTO)
    @TableField("userId")
    private Integer user_id;
    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;
    @ApiModelProperty("密码")
    @TableField("password")
    private String password;
    @ApiModelProperty("地址")
    @TableField("address")
    private String address;
    @ApiModelProperty("电话")
    @TableField("phone")
    private String phone;


}
