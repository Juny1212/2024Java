package ex01;

public class Main {

    public static void main(String[] args) {

        //Car car = new Car(100);
        //System.out.println("Speed : " + car.speed);

        Truck truck = new Truck(80);
        //truck.ShowSpeed();
        //System.out.println("Speed : " + truck.speed); //hiding, 부모의 speed를 숨김.

        Car car = truck;
        car.ShowSpeed();
        System.out.println("Speed : " + car.speed);

    }
}