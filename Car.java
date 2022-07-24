package com.company.vehicles;


import com.company.details.Engine;
import com.company.professions.Driver;

public class Car  {
    private String marks ;
    private String klass ;
    private double weight ;
    private String driverTip ;
    private String motor ;

    public Car(String marks,String klass,double weight,String driverAge,String motor){
        this.marks = marks;
        this.klass = klass;
        this.weight=weight;
        this.driverTip=driverAge;
        this.motor=motor;
    }

    public void start(){
    System.out.println("Go");
}
public void stop(){
    System.out.println("Stop");
}
public void ternRight(){
    System.out.println("Tern on Right");
}
public void ternLeft(){
    System.out.println("Tern on Left");
}

public void setMarks(String carMarks){
    marks=carMarks;
}
String getMarks(){
    return marks;
}


    @Override
    public String toString() {
        return "Car{" +
                "marks='" + getMarks() + '\'' +
                ", klass='" + klass + '\'' +
                ", weight=" + weight +
                ", driverTip='" + driverTip + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
