package com.company;

import com.company.details.Engine;
import com.company.entities.Person;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args){
        Driver driver1 = new Driver("Vasya",25,"man","38097111111","25 years");
        Engine engine1 = new Engine(3000,"Torbo");
        Engine engine2 = new Engine(1000,"Ferik");
        Car car = new Car("BMW","x7",12.1,"Drivver G1","Basical");
        System.out.println(car.toString()+engine2.toString());
        Lorry lorry = new Lorry("Gazel","112",34441.4, driver1.getName(), "V6","Super weight");
       System.out.println(lorry+engine2.toString());
       SportCar sportCar = new SportCar("Ferari","f8",4444.4, driver1.getName(), "V12",300);
        System.out.println(sportCar.toString()+engine1.toString());
        sportCar.stop();
        sportCar.start();
        lorry.stop();
        lorry.start();
    }
}
