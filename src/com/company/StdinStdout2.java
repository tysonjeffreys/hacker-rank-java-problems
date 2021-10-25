package com.company;

import java.util.Scanner;
import java.io.*;

public class StdinStdout2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        //scan.useDelimiter("\\n");
        int i;
        double d;
        String s;
        //while (scan.hasNext()) {
            i = scan.nextInt();
            d = scan.nextDouble();
            scan.nextLine();
            s = scan.nextLine();


            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        //}
    }
}

