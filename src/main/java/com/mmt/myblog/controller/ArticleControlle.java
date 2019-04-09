package com.mmt.myblog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mmt.myblog.bean.Article;
import com.mmt.myblog.bean.Msg;
import com.mmt.myblog.service.ArticleService;

@Controller
public class ArticleControlle {
	@Autowired
	ArticleService articleService;
	
	@RequestMapping("/arts")
	@ResponseBody
	public Msg getArts(@RequestParam(value = "pn", defaultValue = "1") Integer pn){
		PageHelper.startPage(pn, 5);
		
		List<Article> as = articleService.getArts();
		
		PageInfo page = new PageInfo(as, 5);
		
		return new Msg().success().add("pageInfo",page);
		
	}
	
}
