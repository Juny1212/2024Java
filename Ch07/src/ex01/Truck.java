package ex01;

public class Truck extends Car{

    public  double speed;

    Truck(double speed) {

        super(0); //Car()
        this.speed = speed;
    }

    public void ShowSpeed() {
        System.out.println("Truck Speed : " + speed);
    }
}
