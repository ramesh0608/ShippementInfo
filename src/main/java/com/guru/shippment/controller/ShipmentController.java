package com.guru.shippment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shipment")
public class ShipmentController {

    @GetMapping("id/{id}")
    public String getShipmentById(@PathVariable("id") Integer id) {
        return "you entered shipment id " + id;
    }

    @GetMapping(value = "/welcome")
    public String getWelcomeMessage() {
        return "welcome to shipment info";
    }
}
