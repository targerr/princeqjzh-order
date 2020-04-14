package edu.virgil.docker.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import lombok.Data;

/**
 * @author virgil.Wang
 * @date 2019/8/2 11:25
 */
@Data
@TableName("user")
public class User {

    @TableId
    private Long id;
    private String username;
    private String password;
    private Date updateDate;
    private Date createDate;

}
