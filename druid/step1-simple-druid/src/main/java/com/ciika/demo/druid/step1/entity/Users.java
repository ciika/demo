package com.ciika.demo.druid.step1.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Users)表实体类
 *
 * @author makejava
 * @since 2021-03-11 17:09:21
 */
@SuppressWarnings("serial")
public class Users extends Model<Users> {

    private Long userId;

    private String userName;

    private Integer userAge;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.userId;
    }
}