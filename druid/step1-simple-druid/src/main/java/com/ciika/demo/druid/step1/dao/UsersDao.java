package com.ciika.demo.druid.step1.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ciika.demo.druid.step1.entity.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Users)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-11 17:09:21
 */
@Mapper
public interface UsersDao extends BaseMapper<Users> {

}