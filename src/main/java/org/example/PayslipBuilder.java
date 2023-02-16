package org.example;

public class PayslipBuilder {
    private int basic;
    private int hra;
    private int da;

    private int medicalAllowance;

    private int specialAllowance;
    
    private int lunchAllowance;

    public PayslipBuilder setBasic(int basic) {
        this.basic = basic;
        return this;
    }

    public PayslipBuilder setHra(int hra) {
        this.hra = hra;
        return this;
    }

    public PayslipBuilder setDa(int da) {
        this.da = da;
        return this;
    }


    public PayslipBuilder setMedicalAllowance(int medicalAllowance) {
        this.medicalAllowance = medicalAllowance;
        return this;
    }

    public PayslipBuilder setSpecialAllowance(int specialAllowance) {
        this.specialAllowance = specialAllowance;
        return this;
    }

    public PayslipBuilder setLunchAllowance(int lunchAllowance) {
        this.lunchAllowance = lunchAllowance;
        return this;
    }

    public PayslipBuilder(int basic, int hra, int da) {
        this.basic = basic;
        this.hra = hra;
        this.da = da;
    }

    public PaySlip build(){
        return new PaySlip(basic,hra,da,specialAllowance,medicalAllowance, lunchAllowance);
    }
}
