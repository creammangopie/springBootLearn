package com.neb.springboot;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
@SpringBootTest(classes = ApplicationStart.class)
public class TsOrgTest {
    /*@Autowired
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
    }*/
}
