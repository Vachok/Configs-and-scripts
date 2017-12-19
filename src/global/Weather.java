package global;



import ru.vachok.life.Main;
import ru.vachok.life.Person;
import ru.vachok.life.Persons.Barchuk;
import ru.vachok.life.Persons.Vachok;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Weather {

    public static void main() throws IOException {
        List list = new ArrayList();
        Thread.currentThread().setName("Weather");
        Thread.currentThread().setPriority(1);
        System.out.println("Weather started!");
        list.addAll(Vachok.getAllStackTraces().values());
        list.addAll(Main.getAllStackTraces().values());
        list.addAll(Barchuk.getAllStackTraces().values());
        list.addAll(Person.getAllStackTraces().values());
        File trace = new File("trace");
        FileWriter fileWriter = new FileWriter(trace);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(list.toString());
        bufferedWriter.close();
    }
}






//18.12.2017(22:31)by{Vachok}