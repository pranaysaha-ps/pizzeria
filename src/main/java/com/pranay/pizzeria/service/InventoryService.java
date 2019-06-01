package com.pranay.pizzeria.service;

import com.pranay.pizzeria.model.Pizza;
import com.pranay.pizzeria.model.constants.Constant;
import com.pranay.pizzeria.repository.PizzaRepository;
import com.pranay.pizzeria.utils.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class InventoryService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public Map findAll(){
        log.info("========= Getting pizza menu =========");
        List<Pizza> pizzaList = pizzaRepository.findAll();
        return ResponseUtil.getSuccessResponseJsonWithData(pizzaList, Constant.SUCCESS);
    }

    //TODO: Add remaining operations out of CRUD operation - Create is implemented
}
