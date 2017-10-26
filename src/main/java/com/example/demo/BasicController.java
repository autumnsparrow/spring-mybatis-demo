package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IAreaService;

@RestController
public class BasicController {

	@Autowired
	IAreaService areaService;
	
	@RequestMapping(value="/")
	public String showAreaNames() {
		return "show: "+areaService.getAreaNames().toString();
	}
}
