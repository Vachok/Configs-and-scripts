package ru.vachok.life.eatery;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.err;


public class Drinks {

    public static void main( String[] args ) throws IOException {
        System.out.println(listDrinks());
        System.out.println("");
        System.out.println(myDrink("Red Bull"));
    }


    private static Set listDrinks() throws IOException {
        File drinks = new File("C:\\My_Proj\\Vachoks_Life\\Res\\drnk");
        if (drinks.isFile()) {
            System.out.print("+++");
        } else {
            err.println("ERROORRRR! NO FILE!");
            System.exit(100);
        }
        FileReader readDrnk = new FileReader(drinks);
        BufferedReader bufferedReader = new BufferedReader(readDrnk);
        Set collection = new HashSet();
        String drink = bufferedReader.readLine();
        collection.add(drink);
        return collection;
    }


    /**
     * @param queryName запрос напитка
     * @return имя
     *
     * @throws IOException если нет файла
     */
    public static String myDrink( String queryName ) throws IOException {
        Collection drinkName = listDrinks();
        String s = null;
        if (drinkName.contains(queryName)) {
            s = drinkName.toString();
        } else System.out.println("нету");
        return s;
    }
}




//15.12.2017(9:30)by{Vachok}