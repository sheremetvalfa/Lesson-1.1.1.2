package com.company.professions;


import com.company.entities.Person;

public class Driver extends Person  {
       private String experience;
       public void setExperience(String driverAge) {
       experience = driverAge;
       }
       public Driver(String name,int age,String sex,String numberPhone,String experience){
              super(name, age, sex, numberPhone);
              this.experience = experience;
       }
       public String getExperience(){
              return experience;
       }


}
