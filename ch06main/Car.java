package ch06main;

public class Car {

    String company;
    String model;

    int maxSpeed = 100;
    int speed = 0;

    Car(String com, String mo, int max, int sp){
        company = com;
        model = mo;
        maxSpeed = max;
        speed = sp;
    }

    Car() {
        company = "";
        model = "";
        maxSpeed = 100;
        speed = 0;

    }

    Void ShowInfo(){

        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Speed: " + speed);

        return null;
    }

}
