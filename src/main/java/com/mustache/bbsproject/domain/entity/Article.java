package com.mustache.bbsproject.domain.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class Article {
    @Id // import할때 주의 클래스명에 오류뜨면 다시 import해야함
    @GeneratedValue
    private Long id;

    private String title;
    private String contents;

    public Article(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}


