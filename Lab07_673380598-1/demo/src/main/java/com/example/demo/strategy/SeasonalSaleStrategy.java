package com.example.demo.strategy;

public class SeasonalSaleStrategy implements DiscountStrategy {
    @Override
    public Double calculate(Double price){
        return price*0.8;
    }
}
