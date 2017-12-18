package ru.vachok.life;



import global.Weather;

import java.util.Calendar;
import java.util.Scanner;



public class Main extends Thread {

    public static String nameChara;


    public static void main( String... args ) throws InterruptedException {
        Thread weather = new Weather();
        String today = Calendar.getInstance().getTime().toString();
        weather.start();
        sleep(150);
        System.out.println(today);
        System.out.println("Введите имя:");
        nameChara = new Scanner(System.in).nextLine();
        Thread person = new Person();
        person.run();
        person.setName("persons-thr");
    }

    }

// at 14.12.2017 (14:26)