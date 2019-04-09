package com.mmt.myblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmt.myblog.bean.Article;
import com.mmt.myblog.dao.ArticleMapper;

@Service
public class ArticleService {
	@Autowired
	ArticleMapper articleMapper;
	
	public List<Article> getArts(){
		return articleMapper.selectByExample(null);
	}
}
