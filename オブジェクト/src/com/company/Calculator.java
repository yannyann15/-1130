package com.company;

public class Calculator {
 double tax;


    public void setTax(final double tax){
        this.tax = tax;
    }

    public int calc(final int price){
    return (int)((1+tax)*price);
    }


}
