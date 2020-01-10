package com.neb.springboot.dao;


import com.neb.springboot.model.sys.TsOrg;

import java.util.List;

/**
 * Copyright: Copyright (c) 2017  zteits
 *
 * @ClassName: TsOrgDao.java
 * @Description:
 * @version: v1.0.0
 * @author: wangfs
 * @date: 2020-01-11 01:10
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2020-01-11     wangfs              v1.0.0               创建
 */

public interface TsOrgDao {

    /**
     * 通过主键查询组织对象
     * @Auther: wangfs
     * @param
     * @return
     */
    TsOrg selectTsOrgById(Long id);

    /**
     * 通过父类 ID 查询list
     * @Auther: wangfs
     * @param
     * @return
     */
    List<TsOrg> selectTsOrgByParent(Long id);
}
