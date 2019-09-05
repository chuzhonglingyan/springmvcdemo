package com.yuntian.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import javax.sql.DataSource;
import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

/**
 * @Auther: yuntian
 * @Date: 2019/9/1 0001 22:26
 * @Description:
 */
@Configuration
@ImportResource("classpath:properties-config.xml")
public class DataSouceConfig {

    /**
     * PropertyPlaceholderConfigurer会修改jdbc的元数据信息（<bean/>定义）
     * jdbc.properties中db.driverClassName对应的值xxx替换${jdbc.driverClassName}
     * @Value 初始化属性的值
     */
    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;



    /**
     * 就创建一个连接池,每次访问数据库都从连接池里面取出连接
     *
     * @return
     */
    @Bean
    public DataSource emDataSource() {
        return  new EmbeddedDatabaseBuilder()
                .generateUniqueName(true)
                .setType(H2)
                .setScriptEncoding("UTF-8")
                .ignoreFailedDrops(true)
                .addScript("classpath:in-db/schema-h2.sql")
                .addScripts("classpath:in-db/data-h2.sql")
                .build();
    }



    /**
     * 就创建一个连接池,每次访问数据库都从连接池里面取出连接
     *
     * @return
     */
    @Bean
    public DruidDataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }


    @Bean
    public JdbcOperations jdbcTemplate() {
        return new JdbcTemplate(emDataSource());
    }

}
