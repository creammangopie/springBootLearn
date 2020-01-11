package com.neb.springboot;

import com.neb.springboot.model.TsOp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Copyright: Copyright (c) 2017  zteits
 *
 * @ClassName: TsAreaDaoTest.java
 * @Description:
 * @version: v1.0.0
 * @author: wangfs
 * @date: 2020-01-10 21:36
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2020-01-10     wangfs              v1.0.0               创建
 */
@SpringBootTest(classes = ApplicationStart.class)
public class TsAreaDaoTest {
    @Autowired
    private com.neb.springboot.mapper.TsOpMapper TsOpMapper;
    @Test
    public void test(){
        TsOp tsOp = TsOpMapper.selectById(10000);
        System.out.println(tsOp.toString());
    }
}
