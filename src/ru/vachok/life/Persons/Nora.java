package ru.vachok.life.Persons;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;


class Nora {

    final boolean isDog = true;


    public static void main( String[] args ) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вес норы в кг? в формате 0,0\n");
        boolean wightDouble = scanner.hasNextDouble();
        if (wightDouble) {
            double wight = scanner.nextDouble();
            File nora_wght = new File("nora_wgt.csv");
            Date today = new Date();
            FileWriter fileWriter = new FileWriter(nora_wght , true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String s = ";" + wight + ";" + today;
            bufferedWriter.write(s);
            bufferedWriter.close();
        } else System.exit(111);
    }
}




//15.12.2017(17:43)by{Vachok}