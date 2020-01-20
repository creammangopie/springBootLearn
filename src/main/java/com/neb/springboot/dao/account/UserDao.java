package com.neb.springboot.dao.account;

import com.neb.springboot.domain.account.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 数据层
 * </p>
 *
 * @author niueb
 * @since 2020-01-20
 */
public interface UserDao {

    User queryUserInfoById(Long i);
}
