package ru.vachok.life;



import java.util.Calendar;
import java.util.Scanner;



public class Main extends Thread {

    public static String nameChara;

    public static void main( String... args ) {
        String today = Calendar.getInstance().getTime().toString();
        System.out.println(today);
        System.out.println("Введите имя:");
        nameChara = new Scanner(System.in).nextLine();
        Thread person = new Person();
        person.run();
        person.setName("persons-thr");
    }

    }

// at 14.12.2017 (14:26)