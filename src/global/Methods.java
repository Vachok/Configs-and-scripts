package global;



import ru.vachok.life.Main;
import ru.vachok.life.Persons.Barchuk;
import ru.vachok.life.Persons.Vachok;

import java.io.*;
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


    public static void stringToFile() throws IOException, InterruptedException {
        File names = new File("Res\\names");
        FileWriter fileWriter = new FileWriter(names);
        if (names.canWrite()) {
            FileReader fileReader = new FileReader(names);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Date today = new Date();
            String s = Main.nameChara + ";" + today;
            bufferedWriter.close();
            while (bufferedReader.readLine() != null) bufferedWriter.write(s);
            bufferedWriter.close();
        } else {
            System.err.print("file block!");
        }
        System.out.wait(1000);
    }
}





//16.12.2017(17:41)by{Vachok}