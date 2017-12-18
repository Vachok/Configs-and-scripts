package global;



import ru.vachok.life.Person;

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
            Thread thread = Person.currentThread();
            int i = 0;
            int a = 0;
            while (thread.isAlive()) a = i++;
            File lck = new File("lck.lck");
            try {
                FileWriter fileWriter = new FileWriter(lck);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(a);
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Weather stops...");
        }
    }




//18.12.2017(22:31)by{Vachok}