package com.neb.springboot.service.account;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neb.springboot.domain.account.User;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author niueb
 * @since 2020-01-20
 */
public interface UserService {

    User queryUserInfoById(Long i);
}
