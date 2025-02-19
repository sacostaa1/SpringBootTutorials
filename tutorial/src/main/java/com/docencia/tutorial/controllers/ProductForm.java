package com.docencia.tutorial.controllers;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.DecimalMin;



public class ProductForm {

    @NotEmpty(message = "The product name is required")
    private String name;

    @NotNull(message = "The price is required")
    @DecimalMin(value = "0.01", message = "Price must be greater than zero")
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}