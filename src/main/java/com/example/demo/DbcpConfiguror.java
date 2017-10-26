package com.example.demo;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 
 *  create the datasource using dbcp
 * 
 * @author sparrow
 *
 */

@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
@MapperScan("com.example.demo.db.persistence")
public class DbcpConfiguror {
	
	JdbcProperties jdbcProperties;
	
	
	
	
	public DbcpConfiguror(JdbcProperties jdbcProperties) {
		super();
		this.jdbcProperties = jdbcProperties;
	}




	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(jdbcProperties.getDriverClassName());
		ds.setUrl(jdbcProperties.getUrl());
		ds.setUsername(jdbcProperties.getUser());
		ds.setPassword(jdbcProperties.getPassword());
		
		return ds;
		
	}
	

}
