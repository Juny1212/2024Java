package ex05;

public class Anonymous {

    //RemoteController tv = new TV();
    RemoteController tv = new RemoteController() {

        @Override
        public void TurnOn() {

        }

        @Override
        public void TurnOff() {

        }
    };
}
