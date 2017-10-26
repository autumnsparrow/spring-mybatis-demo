package com.example.demo;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IAreaService;
import com.mysql.jdbc.util.Base64Decoder;


@SpringBootApplication
public class DemoAnnotationApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoAnnotationApplication.class, args);
	}
	
	
}
