package ru.vachok.life;



import global.Methods;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;



public class Main {

    public static String nameChara;


    public static void main( String... args ) throws IOException {
        String today = Calendar.getInstance().getTime().toString();
        System.out.println(today);
        System.out.println("Введите имя:");
        nameChara = new Scanner(System.in).nextLine();
        ru.vachok.life.Persons.Person.main(nameChara);
        Methods.nameToFile();
    }
}
// at 14.12.2017 (14:26)