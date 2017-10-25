package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.IAreaService;

@RestController
@SpringBootApplication
@ImportResource("classpath*:META-INF/spring/applicationContext-jdbc.xml")
public class DemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	IAreaService areaService;
	
	@RequestMapping(value="/")
	public String showAreaNames() {
		return "show: "+areaService.getAreaNames().toString();
	}
}
