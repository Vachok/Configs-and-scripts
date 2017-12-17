package ru.vachok.life.Persons;



public class Barchuk {

    final static boolean isWoman = true;
    final static int height = 162;


    /**
     * @param args love - вызовет String bmH
     */
    public static void main( String args ) {
        if (args.contains("love")) {
            String bmH = "!!!!!!!!!!! Barchi's breakmyheat !!!!!!!!!";
            for (int i = 0; i < 1000000000; i++) {
                System.err.println(bmH + bmH + bmH + i + "times...");
            }

            System.out.println("My Name is " + args);
        }
    }
}




//16.12.2017(17:35)by{Vachok}