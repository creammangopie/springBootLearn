package com.neb.springboot.biz.account;

import com.neb.springboot.domain.account.User;
import com.neb.springboot.dao.account.UserDao;
import com.neb.springboot.service.account.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author niueb
 * @since 2020-01-20
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User queryUserInfoById(Long i) {
        return userDao.queryUserInfoById(i);
    }
}
