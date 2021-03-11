package com.ciika.demo.druid.step1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ciika.demo.druid.step1.dao.UsersDao;
import com.ciika.demo.druid.step1.entity.Users;
import com.ciika.demo.druid.step1.service.UsersService;
import org.springframework.stereotype.Service;

/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2021-03-11 17:09:21
 */
@Service("usersService")
public class UsersServiceImpl extends ServiceImpl<UsersDao, Users> implements UsersService {

}