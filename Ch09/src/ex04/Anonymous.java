package ex04;

public class Anonymous {

    Person person = new Person() {

        void work() {
            System.out.println("출근합니다.");
        }

        void wake() {
            System.out.println("아침 6시에 일어납니다.");
            work();
        }

    };
}
