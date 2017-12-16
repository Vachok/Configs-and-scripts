package ru.vachok.life.eatery;



import global.Methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.err;


public class Drinks {

    private static String queryName = Methods.drinkMe();


    public static void main( String[] args ) throws IOException {
        System.out.print("Он?");
        System.out.println(myDrink());
    }



    /**
     * @return имя
     *
     * @throws IOException если нет файла
     */
    private static String myDrink() throws IOException {
        Collection<String> drinkName = listDrinks();
        String s = null;
        if (drinkName.contains(queryName)) {
            s = drinkName.toString();
        } else System.out.println("нету");
        return s;
    }


    private static Set<String> listDrinks() throws IOException {
        File drinks = new File("C:\\My_Proj\\Vachoks_Life\\Res\\drnk");
        if (drinks.isFile()) {
            System.out.print("+++");
        } else {
            err.println("ERROORRRR! NO FILE!");
            System.exit(100);
        }
        FileReader readDrnk = new FileReader(drinks);
        String bufferedReader = new BufferedReader(readDrnk).readLine();
        Set<String> collection = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            collection.add(bufferedReader);
        }
        return collection;
    }
}




//15.12.2017(9:30)by{Vachok}