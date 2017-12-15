package ru.vachok.life;



import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class Main {
   public static void main(String[] args) {
      String today = Calendar.getInstance().getTime().toString();
      System.out.println(today);
      Persons.main(today);
   }
}
// at 14.12.2017 (14:26)