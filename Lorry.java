package com.company.vehicles;

public class Lorry extends Car{
    private String weightSuper;
    public Lorry(String marks, String klass, double weight,String driverTip, String motor,String weightSuper){
        super(marks,klass,weight,driverTip,motor);
        this.weightSuper=weightSuper;

}
    public void stop(){
        System.out.println("Stop LorryCar");
    }
    public void start(){
        System.out.println("Go LorryCar");
    }
    @Override
    public String toString() {
        return "Lorry{" +
                "weightSuper='" + weightSuper + '\'' +
                '}'+super.toString();
    }
}
