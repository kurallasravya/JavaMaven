package org.example;

public class ReverseANumber {
    public void number(){
        int num = 12341;
        int rev=0;
        int org_num = num;
        while(num!=0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        if(org_num==rev){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
