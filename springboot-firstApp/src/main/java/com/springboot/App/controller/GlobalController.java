package com.springboot.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.springboot.App.service.GlobalService;


import pojopack.Article;

@Controller
public class GlobalController {
	
	 @Autowired
	    private GlobalService globalService;

	    @GetMapping("/global")
	    public String globalNews(Model model) {
	        Article[] articles = globalService.globalNews();
	        model.addAttribute("data", articles);
	        return "global";
	    }
	

}
