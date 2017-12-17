package global;



import ru.vachok.life.Persons.Barchuk;
import ru.vachok.life.Persons.Vachok;

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
            s = "не найду себя...";
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
}





//16.12.2017(17:41)by{Vachok}