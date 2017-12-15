package ru.vachok.life;



import java.io.File;
import java.io.IOException;
import java.util.*;



class Persons {

   public static void main(String args) {
      long todayLong = new Date().getTime();
      System.out.println("Сегодня - " + todayLong + " мсек от рождества Юниксова...");
      System.out.print("Введите ваш год рождения:");
      Scanner enteredAge = new Scanner(System.in);
      int yearBirthEntered = enteredAge.nextInt();
      int age = getAge(yearBirthEntered);
      if (age < 100) { System.out.println(Calendar.getInstance().getTime());
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
      Scanner enterName = new Scanner(System.in);
      String eName = enterName.nextLine();
      if (eName.equals("Vachok")) {
         ru.vachok.life.Vachok.main(eName);
      } else {
         boolean err = System.err.checkError();
         System.out.print(err);
      }
   }


      private static int getAge ( int yearBirthEntered ){
         int year = Calendar.getInstance().get(Calendar.YEAR);
         return year - yearBirthEntered;
      }
   }

// at 14.12.2017 (14:42)