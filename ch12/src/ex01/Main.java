package ex01;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0; i<5; i++){

            toolkit.beep();
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e){}

        }

        for(int i=0; i<5; i++) {
            System.out.println("똥");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }

    }
}
