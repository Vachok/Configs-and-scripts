package ru.vachok.life;



import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Vachok {

    public static void main( String args ) {
        double currentTime = new Date().getTime();
        double futureTime = new Date(17 , 12 , 14 , 22 , 26).getTime();
        for (int i = 0; i < 100000; i++) {
            double curTime = new Date().getTime();
            double birth = new Date(84 , 1 , 7 , 2 , 0).getTime();
            double mSec = (curTime - birth);
            double dateBi = (mSec / 1000 / 60 / 60 / 24);
            String myName = args;
            System.out.println(myName + " прожил " + dateBi + " days");
        }
    }
}




//14.12.2017(20:32)by{Vachok}