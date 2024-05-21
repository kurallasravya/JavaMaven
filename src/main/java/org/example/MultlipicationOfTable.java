package org.example;

import java.util.Scanner;

public class MultlipicationOfTable {
    public void tables(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int number = sc.nextInt();

        System.out.println("Multiplication Table for " + number + ":");


        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }


        sc.close();
    }
    }

