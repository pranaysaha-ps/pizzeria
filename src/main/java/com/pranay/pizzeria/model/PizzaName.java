package com.pranay.pizzeria.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class PizzaName {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column
    public String name;
}
