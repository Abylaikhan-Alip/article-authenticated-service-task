package edu.epam.fop.spring.boot.dbsecurity.model;

import jakarta.persistence.*;

@Entity(name = "roles")
public class Role {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "name")
    private String name;
}
