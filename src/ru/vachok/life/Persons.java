package ru.vachok.life;



import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class Persons {
   public static void main(String[] args) {
      long todayLong = new Date().getTime();
      System.out.println("Сегодня - "+todayLong+" мсек от рождества Юниксова...");
      System.out.print("Введите ваш год рождения:");
      Scanner enteredAge = new Scanner(System.in);
      int yearBirthEntered = enteredAge.nextInt();
      int age = getAge(yearBirthEntered);
      if(age < 100) { }
      else {
         System.out.println("ой, не пизди!");
         System.exit(age);
      }
      if(age > 0) { System.out.println("Ваш возраст = "+age); }
      else {
         System.out.println("ой, не пизди!");
         System.exit(age);
      }
      Scanner enterName = new Scanner(System.in);
      String name = enterName.nextLine();
      if(name.equals("Vachok")) { ru.vachok.life.Vachok.main(name); }
      else { System.exit(11); }
   }
   private static int getAge(int yearBirthEntered) {
      int year = Calendar.getInstance().get(Calendar.YEAR);
      return year-yearBirthEntered;
   }
}

// at 14.12.2017 (14:42)