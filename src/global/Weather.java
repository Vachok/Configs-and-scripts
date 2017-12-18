package global;



public class Weather {

import ru.vachok.life.Main;



    public class Weather extends Thread {

        @Override
        public void run() {
            Thread.currentThread().setName("Weather");
            Thread.currentThread().checkAccess();
            boolean alive = Main.currentThread().isAlive();
            while (alive) {
                long f = 0;
                f++;
            }
            System.out.println("Weather nested");
        }
    }
}




//18.12.2017(22:31)by{Vachok}