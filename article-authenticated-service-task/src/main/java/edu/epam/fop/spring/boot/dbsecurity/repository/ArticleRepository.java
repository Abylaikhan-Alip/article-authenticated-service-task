package edu.epam.fop.spring.boot.dbsecurity.repository;

import edu.epam.fop.spring.boot.dbsecurity.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
