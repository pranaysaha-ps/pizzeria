package com.pranay.pizzeria.model;

import com.pranay.pizzeria.model.enums.PizzaCategory;
import com.pranay.pizzeria.model.enums.PizzaSize;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity(name = "pizza")
@NoArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column
    public String name;

    @Column
    @Enumerated
    public PizzaCategory vegNonVeg;

    @Column
    @Enumerated
    public PizzaSize size;

    @Column
    public Double price;

    @OneToOne
    public Offers offer;

}
