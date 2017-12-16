package ru.vachok.life;



import java.util.Calendar;
import java.util.Scanner;



public class Main {


    public static void main( String... args ) {
        String today = Calendar.getInstance().getTime().toString();
        System.out.println(today);
        System.out.println("Введите имя:");
        String s = new Scanner(System.in).nextLine();
        ru.vachok.life.Persons.Person.main(s);
    }
}
// at 14.12.2017 (14:26)