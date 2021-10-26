package com.thecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@Controller
public class TheCodeJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCodeJavaApplication.class, args);
	}
	
	private Boolean isCorrectCode(String guess) {
		return guess.equals("EkkoLV18");
	}
	private String[] getCodes() {
		return new String[] {
			"Loyalty", "Courage", "Veracity", "Compassion", "Honor"
		};
	}
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	
	public String login() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	
	public String Attempt(@RequestParam(value="guess") String guess, 
			Model model, RedirectAttributes rAttributes) {
		if(isCorrectCode(guess)) {
			return "redirect:/success";
		}
		rAttributes.addFlashAttribute("error", "You must provide a right code");
		return "redirect:/";		
	}
	
	@RequestMapping("/success")
	
	public String Code(Model model) {
		model.addAttribute("codes", getCodes());
		return "success.jsp";
	
	}

}
