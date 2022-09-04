package com.Bridgelabz;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongNoRange {
    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println(" Welcome to Armstrong Number Between A Range.....");
        System.out.println("********************************************");
        /*
        Creating Two variables
        and Taking two inputs from user
         */
        int a , b ;
        System.out.println("Enter A Start no. = ");
        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
        System.out.println("Enter A End no. = ");
        b = sc.nextInt();
        System.out.println ("Following Are Armstrong No In A Given Range --->" );


        Range(a,b);
    }

    static void Range(int a,int b){
        for (int i =a ;  i <= b ; i++){
            int num = i;
            int  sum = 0;

            while(num > 0){
                int rem = num % 10;
                sum = sum + ( rem * rem * rem);
                num = num/10;
            }

            if ( sum == i){


                System.out.println(sum);
            }



        }


    }
}
