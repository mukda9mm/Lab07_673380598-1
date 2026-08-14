package com.example.demo.strategy;

public class DiscountContext {
    public DiscountStrategy disStra;

    public Double calcul(Double price,String discountType){
        switch (discountType) {
            case "STUDENT":
                disStra = new StudentDiscountStrategy();
                break;
            case "SEASONAL":
                disStra = new SeasonalSaleStrategy();
                break;
            case "NONE":
                disStra = new NoDiscountStrategy();
                break;
        
        }
        return disStra.calculate(price);
    }

 

    
}
