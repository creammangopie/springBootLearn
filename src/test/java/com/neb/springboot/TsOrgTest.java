package com.neb.springboot;

import com.alibaba.fastjson.JSONObject;
import com.neb.springboot.dao.TsOrgDao;
import com.neb.springboot.model.sys.TsOrg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Copyright: Copyright (c) 2017  zteits
 *
 * @ClassName: TsOrgTest.java
 * @Description:
 * @version: v1.0.0
 * @author: wangfs
 * @date: 2020-01-11 01:19
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2020-01-11     wangfs              v1.0.0               创建
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStart.class)
public class TsOrgTest {
    @Autowired
    private TsOrgDao tsOrgDao;


    @Test
    public void selectTsOrgById(){
        TsOrg tsOrg = tsOrgDao.selectTsOrgById(10001L);
        System.out.println(JSONObject.toJSON(tsOrg));
    }

    @Test
    public void selectTsOrgByParent(){
        List<TsOrg> list = tsOrgDao.selectTsOrgByParent(10001L);
        System.out.println(JSONObject.toJSON(list));
    }
}
