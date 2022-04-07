package com.example.gest_proy_invest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.gest_proy_invest.entity.User;
import com.example.gest_proy_invest.repository.RoleRepository;
import com.example.gest_proy_invest.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired 
	UserService userService;
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("roles",roleRepository.findAll());
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}
	
	@GetMapping("/userForm")
	public String userForm(Model model) {
		return "user-form/user-view";
	}	

}
