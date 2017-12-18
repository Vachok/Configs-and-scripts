package ru.vachok.life.Persons;



import global.Methods;

import java.util.Date;
import java.util.List;


public class Vachok extends Thread {

    private static final int heigth = 175;
    @SuppressWarnings("deprecation")
    private static double birth = new Date(84 , 1 , 7 , 2 , 0).getTime();
    private static double curTime = new Date().getTime();
    private static double mSec = (curTime - birth);
    private static double dateBi = (mSec / 1000 / 60 / 60 / 24);
    private static double hoursBi = (mSec / 1000 / 60 / 60);
    private static String lifeTm = "пожил " + hoursBi + " часов...";
    double currentTime = new Date().getTime();
    List trash;


    public static String getLifeTm() {
        return lifeTm;
    }


    @Override
    public void run() {
        Thread barchi = new Barchuk();
        System.out.println(Vachok.lifeTm);
        System.out.println("Чего желаете?");
        String inP = Methods.inputStr();
        if (inP.equals("love")) {
            Barchuk.main(inP);
        }
        System.out.print(Methods.getClean(inP));
    }



    private static void getWeight() {
        System.out.print("Vachok, сколько кг ты весишь сегодня?\n");
        double weight = Methods.inputDbl();
        System.out.print(heigth + " рост\n" + weight + " вес");
        if (weight > 70) {
            String s = " !!пиздец!!";
            System.out.print(s);
            }
    }
}




//14.12.2017(20:32)by{Vachok}