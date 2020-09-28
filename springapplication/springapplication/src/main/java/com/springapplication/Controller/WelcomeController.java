package com.springapplication.Controller;


import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	//private static final Logger logger = Logger.

	public WelcomeController() {
		//logger.info("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("onClick")
	public String onClick() {
		//logger.info("Invoked onClick");
		System.out.println("Invoked onClick");
		return "Welcome.jsp";
	}

	@RequestMapping("welcome")
	public String WelcomeMessage(String from, String message, String to, Model model) {
		try {
			//logger.info("Invoked welcome page and redirecting to DisplayMessage.jsp");
			System.out.println("Invoked welcome page and redirecting to DisplayMessage.jsp");

			model.addAttribute("from", from);
			model.addAttribute("message", message);
			model.addAttribute("to", to);
		} catch (Exception e) {
			//logger.error("Exception in welcome controller " + e);
		}
		return "Display.jsp";
	}

}
