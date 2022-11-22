package com.mustache.bbsproject.domain.dto;

import com.mustache.bbsproject.domain.entity.Article;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString // 콘솔에 로그 찍히게 하기
public class ArticleDto {
    private Long id;
    private String title;
    private String content;

    public ArticleDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Article toEntity() {
        return new Article(title, content);

    }
}