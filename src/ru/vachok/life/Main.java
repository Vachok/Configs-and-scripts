package ru.vachok.life;



import global.Methods;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;



public class Main {

    public static String nameChara;


    public static void main( String... args ) throws IOException, InterruptedException {
        String today = Calendar.getInstance().getTime().toString();
        System.out.println(today);
        System.out.println("Введите имя:");
        nameChara = new Scanner(System.in).nextLine();
        Person.main(nameChara);
        Methods.stringToFile();
    }
}
// at 14.12.2017 (14:26)