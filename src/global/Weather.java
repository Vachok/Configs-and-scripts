package global;



public class Weather extends Thread {

        @Override
        public void run() {
            Thread.currentThread().setDaemon(true);
            Thread.currentThread().setName("Weather");
            Thread.currentThread().setPriority(1);
            System.out.println("Weather started!");
            int i = Integer.MAX_VALUE;
            long l = Long.MIN_VALUE;
            long r = l + i
            System.out.println("Weather stops..." + thread);
        }
    }




//18.12.2017(22:31)by{Vachok}