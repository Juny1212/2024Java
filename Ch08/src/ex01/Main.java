package ex01;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.SetData(50, 50);

        if(car.NeedChangeTire())
            System.out.println("타이어를 바꾸세요.");
        else
            System.out.println("계속 달리세요.");
    }
}
