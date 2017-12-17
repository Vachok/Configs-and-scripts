package global;



import ru.vachok.life.Main;
import ru.vachok.life.Persons.Barchuk;
import ru.vachok.life.Persons.Vachok;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;


public class Methods {

    public static void main( String[] args ) {
        lookingFor("");
    }


    public static String inputStr() {
        System.out.println("\n");
        return new Scanner(System.in).nextLine();
    }


    public static void lookingFor( String s ) {
        if (s.isEmpty()) {
            s = "не найдёшь себя...";
            for (int i = 0; i < 2100000000; i++) {
                System.err.println(s + s + s + s + s + s + s + s + s + "Вот уже на " + "протяжении " + Vachok.getLifeTm());
            }
        }
        if (s.equals("exit")) System.exit(0);
        if (s.equals("love")) Barchuk.main(s);
    }


    public static double inputDbl() {
        System.out.println("\n");
        return new Scanner(System.in).nextDouble();
    }


    public static void nameToFile() throws IOException {
        File names = new File("Res\\names");
        FileWriter fileWriter = new FileWriter(names);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
        Date today = new Date();
        bufferedWriter.write(Main.nameChara + ";" + today);
        bufferedWriter.close();
    }
}





//16.12.2017(17:41)by{Vachok}