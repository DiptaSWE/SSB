package edu.daffodil.ssb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JournalController {
	@RequestMapping("/journal")
	public String showHome(){
		return "journal";
	}
}
