package com.company.details;

public class Engine {
   private int power;
    private String manufacturer;


    public void setPower(int carPower){
        power=carPower;
    }
    public int getPower(){
        return power;
    }
    public void setManufacturer(String carManufacturer){
        manufacturer=carManufacturer;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public Engine(int enginPower, String EnginManufacturer){
        this.power=enginPower;
        this.manufacturer=EnginManufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

