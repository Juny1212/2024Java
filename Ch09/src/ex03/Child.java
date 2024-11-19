package ex03;

public class Child extends Parent{

    int age = 10;

    public void ShowInfo() {
        System.out.println("제 이름은 " + name + " 입니다.");
        System.out.println("제 나이는 " + age + " 입니다.");
    }

}
