package br.com.mns.resultatec.milerp.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

	@RequestMapping("/")
	public String irLogin() {
		return "index";
	}
}
