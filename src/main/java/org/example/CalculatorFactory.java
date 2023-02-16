package org.example;

public class CalculatorFactory {

    public Calculator getInstance(String type){
        if(type.equals("Basic"))
            return new Basic();
        else if(type.equals("Scientific"))
            return new Scientific();
        else
            return new programmer();

    }
}
