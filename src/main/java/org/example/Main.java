package org.example;

public class Main {
    public static void main(String[] args) {
        
        CalculatorFactory calculatorFactory =new CalculatorFactory();
        Calculator calculator = calculatorFactory.getInstance("Basic");
        calculator.makeCalculations();
    }
}