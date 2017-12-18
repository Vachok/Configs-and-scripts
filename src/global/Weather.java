package global;



import ru.vachok.life.Persons.Vachok;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Weather extends Thread {

        @Override
        public void run() {
            Thread.currentThread().setName("Weather");
            Thread.currentThread().setPriority(1);
            System.out.println("Weather started!");
            Thread.currentThread().checkAccess();
            int thread = Vachok.activeCount();
            int i = 0;
            int a = 0;
            File lck = new File("lck.lck");
            try {
                FileWriter fileWriter = new FileWriter(lck);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(a);
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Weather stops..." + thread);
        }
    }




//18.12.2017(22:31)by{Vachok}