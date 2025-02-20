package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String system;
    @Lob
    private String attributes;
    @ManyToOne
    private UserModel owner;

    public UserModel(String name, String system, String attributes, UserModel owner) {
        this.name = name;
        this.system = system;
        this.attributes = attributes;
        this.owner = owner;
    }

}
