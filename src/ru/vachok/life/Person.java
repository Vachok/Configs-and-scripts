package ru.vachok.life;



import ru.vachok.life.Persons.Barchuk;
import ru.vachok.life.Persons.Vachok;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static ru.vachok.life.Main.nameChara;



public class Person extends Thread {

    public void run() {

        long todayLong = new Date().getTime();
        System.out.println("Сегодня - " + todayLong + " мсек от рождества Юниксова...");
        Thread vachok = new Vachok();
        Thread barchi = new Barchuk();
        synchronized (this) {
            if (nameChara.equals("Vachok")) synchronized (this) {
                vachok.run();
                vachok.setName("Vachok-THR");
            }
            if (nameChara.equals("Barchuk")) {
                barchi.start();
                vachok.setName("Barchuk-THR");
            } else Person.getAge();
        }
        boolean err = System.err.checkError();
        System.out.print(err);
    }


    private static int getAge() {
        System.out.print("Введите ваш год рождения:");
        Scanner enteredAge = new Scanner(System.in);
        int yearBirthEntered = enteredAge.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = year - yearBirthEntered;
        if (age < 100) {
            System.out.println(Calendar.getInstance().getTime());
        } else {
            System.out.println("ой, не пизди!");
            System.exit(age);
        }
        if (age > 0) {
            System.out.println("Ваш возраст = " + age);
        } else {
            System.out.println("ой, не пизди!");
            System.exit(age);
        }
        return age;
    }
}


// at 14.12.2017 (14:42)