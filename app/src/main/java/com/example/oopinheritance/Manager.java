package com.example.oopinheritance;

public class Manager extends Employee{
    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    private double comission;
}
