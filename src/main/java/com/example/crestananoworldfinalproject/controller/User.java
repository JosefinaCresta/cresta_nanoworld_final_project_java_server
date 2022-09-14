package com.example.crestananoworldfinalproject.controller;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    private Integer userId;
    private String name;
}
