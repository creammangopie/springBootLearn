package com.neb.springboot.dao.account.impl;

import com.neb.springboot.domain.account.User;
import com.neb.springboot.mapper.account.UserMapper;
import com.neb.springboot.dao.account.UserDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户表 数据实现类
 * </p>
 *
 * @author niueb
 * @since 2020-01-20
 */
@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserInfoById(Long i) {
        return userMapper.selectById(i);
    }
}
