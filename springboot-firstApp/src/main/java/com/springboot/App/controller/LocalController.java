package com.springboot.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.springboot.App.service.LocalService;

import pojopack.Article;

@Controller
public class LocalController {
	
	    @Autowired
	    private LocalService localService;

	    @GetMapping("/india")
	    public String localNews(Model model) {
	        Article[] articles = localService.localNews();
	        model.addAttribute("data", articles);
	        return "local";
	        
	    }
	}



