package com.neb.springboot.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neb.springboot.dao.TsOrgDao;
import com.neb.springboot.mapper.sys.TsOrgMapper;
import com.neb.springboot.model.sys.TsOrg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Copyright: Copyright (c) 2017  zteits
 *
 * @ClassName: TsOrgDaoImpl.java
 * @Description:
 * @version: v1.0.0
 * @author: wangfs
 * @date: 2020-01-11 01:11
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2020-01-11     wangfs              v1.0.0               创建
 */
@Component
public class TsOrgDaoImpl implements TsOrgDao {

    @Autowired
    private TsOrgMapper tsOrgMapper;

    /**
     * 通过主键查询组织对象
     * @Auther: wangfs
     * @param
     * @return
     */
    @Override
    public TsOrg selectTsOrgById(Long id) {
        return tsOrgMapper.selectById(id);
    }

    /**
     * 通过父类 ID 查询list
     * @Auther: wangfs
     * @param
     * @return
     */
    @Override
    public List<TsOrg> selectTsOrgByParent(Long id) {
        QueryWrapper<TsOrg> queryWrapper = new QueryWrapper<TsOrg>();
        queryWrapper.lambda().eq(TsOrg::getDataState, 1)
                .eq(TsOrg::getParentId, id);
        return tsOrgMapper.selectList(queryWrapper);
    }
}
