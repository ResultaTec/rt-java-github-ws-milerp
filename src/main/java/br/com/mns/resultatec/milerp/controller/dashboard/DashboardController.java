package br.com.mns.resultatec.milerp.controller.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
	
	@RequestMapping("/dashboard")
	public String irHome() {
		return "dashboard";
	}

}
