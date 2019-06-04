import classes.DataBase;
import classes.Income;
import classes.Nacl;
import interfaces.Shopble;

import java.io.*;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        Shopble shop = new DataBase();
        Nacl nacl = new Income();

        System.out.println("Заполните накладную!");
        nacl.createNaclPerform(shop.toMap(), scanner.nextDouble());
    }
}


