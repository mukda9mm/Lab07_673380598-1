package com.example.demo.strategy;

public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public Double calculate(Double price){
        return price;
    }
}
