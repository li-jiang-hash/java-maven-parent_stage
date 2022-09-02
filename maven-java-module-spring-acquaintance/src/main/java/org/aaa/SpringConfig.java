package org.aaa;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * @Author:江Sir
 * @Date:02 2022/09/02 14:35
 * @description: Exercise
 * @Version 1.0.0
 */
@Configuration
@ComponentScan("org.aaa")
@Import(DataSourceConfig.class)
public class SpringConfig {
    @Bean("queryRunner")
    public QueryRunner getQueryRunner(@Autowired DataSource dataSource) {
        return new QueryRunner(dataSource);
    }
}
