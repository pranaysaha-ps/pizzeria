package com.pranay.pizzeria.controller;
import com.pranay.pizzeria.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/pizza")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllInventory(){
        return new ResponseEntity(inventoryService.findAll(), HttpStatus.OK);
    }
}
