package org.example;

public class Main {
    public static void main(String[] args) {
        /*for required fields, created constructor for basic,hra and DA,so we must pass required values
        for optional fields like medicalAllowance,specialAllownace,lunchAllowance,we can set optionally.*/
        PaySlip paySlip = new PayslipBuilder(10,20,30).setMedicalAllowance(50).build();
        System.out.println(paySlip);
    }
}