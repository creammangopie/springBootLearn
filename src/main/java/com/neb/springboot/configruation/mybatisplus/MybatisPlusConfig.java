package com.neb.springboot.configruation.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Copyright: Copyright (c) 2017  zteits
 *
 * @ClassName: MybatisPlusConfig.java
 * @Description:
 * @version: v1.0.0
 * @author: wangfs
 * @date: 2020-01-10 22:15
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2020-01-10     wangfs              v1.0.0               创建
 */

@EnableTransactionManagement
@Configuration
@MapperScan("com.neb.springboot.mapper")
public class MybatisPlusConfig {

    /**
     * 3.x版本不在需要 注解 @TableLogic 对应字段
     * 逻辑删除

     @Bean public ISqlInjector sqlInjector() {
     return new LogicSqlInjector();
     }*/

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
     * SQL执行效率插件 设置 dev test 环境开启
     */
    /*@Bean
    @Profile({"dev", "test"})
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        performanceInterceptor.setFormat(true);
        performanceInterceptor.setMaxTime(100);
        performanceInterceptor.setWriteInLog(true);
        return performanceInterceptor;
    }*/

    /**
     * 乐观锁插件
     * # 主要适用场景
     * 意图：当要更新一条记录的时候，希望这条记录没有被别人更新
     * <p>
     * 乐观锁实现方式：
     * <p>
     * 取出记录时，获取当前version
     * 更新时，带上这个version
     * 执行更新时， set version = newVersion where version = oldVersion
     * 如果version不对，就更新失败
     *
     * @return
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}

