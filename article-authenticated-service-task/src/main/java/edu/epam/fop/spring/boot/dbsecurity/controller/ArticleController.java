package edu.epam.fop.spring.boot.dbsecurity.controller;

import edu.epam.fop.spring.boot.dbsecurity.model.Article;
import edu.epam.fop.spring.boot.dbsecurity.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleRepository articleRepository;

    @GetMapping("/{title}")
    public ResponseEntity<String> getTitle(@PathVariable(name = "title") String title) {
        var article = articleRepository.findByTitle(title);
        if (article == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(title + " title not found");
        }
        return ResponseEntity.ok(article.getText());
    }

    @PostMapping("/{title}")
    public ResponseEntity<Article> createArticle(@RequestBody Article article) {
        var savedArticle = articleRepository.save(article);
        return ResponseEntity.ok(article);
    }

    @PutMapping("/{title}")
    public ResponseEntity<Article> editArticle(@RequestBody Article article) {
        var savedArticle = articleRepository.save(article);
        return ResponseEntity.ok(article);
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<Void> deleteArticle(@PathVariable(name = "title") String title) {
        var article = articleRepository.findByTitle(title);
        if (article == null) {
            return ResponseEntity.notFound()
                    .build();
        }
        articleRepository.delete(article);
        return ResponseEntity.ok().build();
    }
}
