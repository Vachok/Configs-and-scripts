package ru.vachok.life.Persons;



public class Barchuk extends Thread {

    final static boolean isWoman = true;
    final static int height = 162;


    /**
     * @param args love - вызовет String bmH
     */
    public static void main( String args ) {
        if (args.contains("love")) {
            String bmH = "!!!!!!!!!!! Barchi's breakmyheat !!!!!!!!!";
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                System.err.println(bmH + bmH + bmH + i + "  " + "/" + Integer.MAX_VALUE);
            }

            System.out.println("My Name is " + args);
        }
    }
}




//16.12.2017(17:35)by{Vachok}