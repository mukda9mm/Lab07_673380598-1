package com.example.demo.strategy;

public class StudentDiscountStrategy implements DiscountStrategy {
     @Override
    public Double calculate(Double price){
        return price*0.9;
    }
}
