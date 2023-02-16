package org.example;

public class CalculatorFactory {

    public Calculator getInstance(String type){
        switch(type){
            case "Basic":
                return new BasicCalculator();
            case "Scientific":
                return new ScientificCalculator();
            case "Programmer":
                return new ProgrammerCalculator();
            default:
                return null;
        }

    }
}
