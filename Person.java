package com.company.entities;

public class Person {
    private String name ;
    private int age;
    private String sex ;
    private String numberPhone ;

    public Person(String name,int age,String sex,String numberPhone){
        this.name = name;
        this.age=age;
        this.sex=sex;
        this.numberPhone=numberPhone;
    }

    public void setName(String personName){
        name=personName;
    }
    public String getName(){
        return name;
    }

    public void setAge(int personAge){
        age=personAge;
    }
    public int getAge(){
        return age;
    }
    public void setSex(String personSex){
        sex=personSex;
    }
    public String getSex(){
        return sex;
    }
    public void setNumberPhone(String personNumberPhone){
        name=personNumberPhone;
    }
    public String getNumberPhone(){
        return numberPhone;
    }

}

