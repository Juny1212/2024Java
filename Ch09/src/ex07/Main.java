package ex07;

public class Main {

    public static void main(String[] args) {

        Main m = new Main();

        RemoteController rc = new TV();
        m.TestTV(rc);

    }

    void TestTV(RemoteController rc) {

        rc.TurnOn();
        rc.TurnOff();

    }

}
