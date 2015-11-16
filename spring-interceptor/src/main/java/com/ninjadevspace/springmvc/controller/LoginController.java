package com.ninjadevspace.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ninjadevspace.springmvc.dao.UserDAO;
import com.ninjadevspace.springmvc.model.User;

@Controller
public class LoginController {

	@Autowired
	private UserDAO dao;

	@RequestMapping("/login")
	public String loginForm() {
		return "login";
	}

	@RequestMapping("/doLogin")
	public String doLogin(User usuario, HttpSession session) {
		if (dao.existUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "redirect:admin-painel";
		} else {
			return "redirect:login";
		}
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}
}
