package ru.vachok.life.Persons;



import global.Methods;

import java.util.Date;
import java.util.Scanner;

public class Vachok {

    public static void main( String args ) {
            double currentTime = new Date().getTime();
        System.out.println(currentTime);
                double curTime = new Date().getTime();
                @SuppressWarnings("deprecation") double birth = new Date(84 , 1 , 7 , 2 , 0).getTime();
                double mSec = (curTime - birth);
                double dateBi = (mSec / 1000 / 60 / 60 / 24);
                System.out.println(args + " прожил " + dateBi + " days");
            Scanner scanner = new Scanner(System.in);
        System.out.print("Vachok, сколько кг ты весишь сегодня?\n");
            int weight = scanner.nextInt();
            int heigth = 175;
        Methods.inputStr();
            System.out.print(heigth + " рост" + weight + " вес");
            if (weight > 70) {
                String s = "пиздец";
                System.out.print(s);
            }
        }
    }




//14.12.2017(20:32)by{Vachok}