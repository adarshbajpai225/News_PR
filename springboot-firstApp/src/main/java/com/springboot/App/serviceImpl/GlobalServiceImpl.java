package com.springboot.App.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.springboot.App.service.GlobalService;

import pojopack.Article;
import pojopack.NewsResponse;

@Service  
public class GlobalServiceImpl  implements GlobalService {
	
       @Autowired
       private RestTemplate restTemplate;
       private static final String API_URL = "https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=622b1251082f4f54a01941b705790a9e&pageSize=99";
	   @Override																							
       public Article[] globalNews() {
	        String apiUrl = API_URL;
	        String response = restTemplate.getForObject(apiUrl, String.class);
	        Article[] newsResponse = new Gson().fromJson(response, NewsResponse.class).getArticles();
	         return newsResponse;
	        
	    }
	}
