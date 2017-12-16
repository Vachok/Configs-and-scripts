package ru.vachok.life.eatery;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.err;


public class Drinks {

    public static void main( String[] args ) throws IOException {
        System.out.println(listDrinks());
    }


    private static Set listDrinks() throws IOException {
        File drinks = new File("C:\\My_Proj\\Vachoks_Life\\Res\\drnk");
        if (drinks.isFile()) {
            FileReader drnk = new FileReader(drinks);
        } else {
            err.println("ERROORRRR! NO FILE!");
            System.exit(100);
        }
        FileReader readDrnk = new FileReader(drinks);
        BufferedReader bufferedReader = new BufferedReader(readDrnk);
        Set collection = new HashSet();
        String drink = bufferedReader.readLine();
        int i = drink.hashCode();
        collection.add(drink);
//        System.out.println(drink);
        return collection;
    }


    @Override
    public boolean equals( Object obj ) {
        return super.equals(obj);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}




//15.12.2017(9:30)by{Vachok}