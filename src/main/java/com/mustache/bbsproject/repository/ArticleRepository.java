package com.mustache.bbsproject.repository;

import com.mustache.bbsproject.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
