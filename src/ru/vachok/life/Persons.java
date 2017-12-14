package ru.vachok.life;



import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class Persons {
   private int h;
   public static void main(String[] args) {
      long todayLong = new Date().getTime();
      System.out.println("Сегодня - "+todayLong+" мсек от рождества Юниксова...");
      System.out.print("Введите ваш год рождения:");
      Scanner enteredAge = new Scanner(System.in);
      int yearBirthEntered = enteredAge.nextInt();
      int age = getAge(yearBirthEntered);
      if(age < 100) { System.out.println("Ваш возраст = "+age); }
      else {
         System.out.println("ой, не пизди!");
         System.exit(age);
      }
      System.exit(0);
      if(age > 0) { System.out.println("Ваш возраст = "+age); }
      else {
         System.out.println("ой, не пизди!");
         System.exit(age);
      }
      System.exit(0);



   }
   private static int getAge(int yearBirthEntered) {
      int year = Calendar.getInstance().get(Calendar.YEAR);
      return year-yearBirthEntered;
   }

}

class Vachok {
   int age;
   int birthday;
}
// at 14.12.2017 (14:42)