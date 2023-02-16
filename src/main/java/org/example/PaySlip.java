package org.example;

public class PaySlip {
    private int basic;
    private int hra;
    private int da;

    private int medicalAllowance;

    private int specialAllowance;

    private int lunchAllowance;

    public PaySlip(int basic, int hra, int da, int medicalAllowance, int specialAllowance,int lunchAllowance) {
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.medicalAllowance = medicalAllowance;
        this.specialAllowance = specialAllowance;
        this.lunchAllowance = lunchAllowance;
    }
    

    @Override
    public String toString() {
        return "PaySlip{" +
                "basic=" + basic +
                ", hra=" + hra +
                ", da=" + da +
                ", medicalAllowance=" + medicalAllowance +
                ", specialAllowance=" + specialAllowance +
                ", lunchAllowance=" + lunchAllowance +
                '}';
    }
}
