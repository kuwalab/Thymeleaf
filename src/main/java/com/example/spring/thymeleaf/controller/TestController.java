package com.example.spring.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.spring.thymeleaf.model.SmartPhone;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	String list(Model model) {
		List<SmartPhone> smartPhoneList = new ArrayList<>();
		smartPhoneList.add(new SmartPhone("Galaxy S", "512MB", "16GB",
				"800x480"));
		smartPhoneList
				.add(new SmartPhone("Nexus S", "512MB", "16GB", "800x480"));
		smartPhoneList.add(new SmartPhone("Galaxy Nexus", "1GB", "16GB",
				"1280x720"));
		smartPhoneList.add(new SmartPhone("Galaxy NoteⅡ", "2GB", "32GB",
				"1280x720"));
		smartPhoneList
				.add(new SmartPhone("Nexus 5", "2GB", "16GB", "1920x1080"));

		model.addAttribute("smartPhoneList", smartPhoneList);

		return "test/list";
	}
}
