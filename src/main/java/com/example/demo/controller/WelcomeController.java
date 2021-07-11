package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.text.html.parser.Entity;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome(@RequestParam(required=false, defaultValue="World", name="name") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	
}

class JSONObject{
	
}
