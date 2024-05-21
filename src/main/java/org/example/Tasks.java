package org.example;

import java.util.Scanner;

public class Tasks {
   public void palindrome(String str){
//      String str = "tenet";
      String rev = "";
      String org_str = str;
        for(int i=str.length()-1; i>=0 ;i--){
            rev = rev + str.charAt(i);
        }
        if(org_str.equals(rev)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }

    }
    public void factorialNumber(){
      int num=10;
      long factorial = 1;
       for(int i=1;i<=num;i++){
           factorial =factorial*i;
       }
       System.out.println(factorial);
    }
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
