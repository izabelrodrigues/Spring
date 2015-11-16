package com.ninjadevspace.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("/admin-painel")
	public String viewPainel() {
		return "admin/admin-painel";
	}
}
