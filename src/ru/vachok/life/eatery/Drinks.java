package ru.vachok.life.eatery;



import global.Methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.err;


class Drinks {

    private static final String queryName = Methods.inputStr();



    public static void main( String[] args ) throws IOException {

        Object[] napitki = myDrink();
    }


    /**
     * @return имя
     *
     * @throws IOException если нет файла
     */
    private static Object[] myDrink() throws IOException {
        Collection<String> nap = listDrinks();
        Object[] objects;
        objects = nap.toArray();
        if ((nap.contains(queryName))) {
            for (String s1 : nap) {
                if (s1.contains(queryName)) System.out.println(s1 + "\ntotal size " + nap.size());
            }
        } else {
            System.out.println("нету такого\nЕсть:" + nap);
            System.exit(111);
        }
        return objects;
    }


    private static Set<String> listDrinks() throws IOException {
        File drinks = new File("C:\\My_Proj\\Vachoks_Life\\Res\\drnk");
        if (!drinks.isFile()) {
            err.println("ERROORRRR! NO FILE!");
            System.exit(100);
        }
        FileReader readDrnk = new FileReader(drinks);
        BufferedReader bufferedReader = new BufferedReader(readDrnk);
        String bufferedString;
        Set<String> drnkS = new TreeSet<>();
        while ((bufferedString = bufferedReader.readLine()) != null) {
            drnkS.add(bufferedString);
        }
        return drnkS;
    }
}




//15.12.2017(9:30)by{Vachok}