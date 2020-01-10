package com.neb.springboot.configruation.hikari;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Copyright: Copyright (c) 2019  zteits
 *
 * @ClassName: HikariAutoConfiguration
 * @Description:
 * @version: v1.0.0
 * @author: niueb
 * @date: 2020/1/10 16:59
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/1/10       niueb           v1.0.0               创建
 */
//@Configuration
//@ConfigurationProperties(prefix="spring.datasource")
public class HikariAutoConfiguration {

    //@Bean(name = "dataSource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

}
