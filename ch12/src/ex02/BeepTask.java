package ex02;

import java.awt.*;

public class BeepTask implements Runnable {

    public void run() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0; i<5; i++){

            toolkit.beep();
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e){}

        }

    }
}
