package com.company.vehicles;

public class SportCar extends Car {
    private int topSpeed;
    public SportCar(String marks,String klass,double weight,String driverTip,String motor,int topSpeed){
        super(marks,klass,weight,driverTip,motor);
        this.topSpeed = topSpeed;
    }
    public void stop(){
        System.out.println("Stop SportCar");
    }
    public void start(){
        System.out.println("Go SportCar");
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "topSpeed=" + topSpeed +
                '}'+super.toString();
    }
}

