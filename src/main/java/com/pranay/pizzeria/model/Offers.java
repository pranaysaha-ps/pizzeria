package com.pranay.pizzeria.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity(name = "offers")
@NoArgsConstructor
public class Offers {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column
    public String offerDetails;

    @Column
    public Double percentage;

}
