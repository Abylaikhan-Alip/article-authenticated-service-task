package edu.epam.fop.spring.boot.dbsecurity.model;

import jakarta.persistence.*;

@Entity(name = "articles")
public class Article {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private String text;
}
