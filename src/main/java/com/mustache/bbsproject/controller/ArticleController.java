package com.mustache.bbsproject.controller;

import com.mustache.bbsproject.domain.dto.ArticleDto;
import com.mustache.bbsproject.domain.entity.Article;
import com.mustache.bbsproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
@Slf4j
public class ArticleController {

    private final ArticleRepository articleRepository;
    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping(value = "/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping(value = "/posts")
    public String createArticle(ArticleDto form) { // 일단 form으로 설정함
        log.info(form.toString()); // 콘솔에 로그 찍히게 하기
        Article article = form.toEntity();
        articleRepository.save(article);
        return "";
    }
}
