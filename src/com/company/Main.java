package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What's your name? ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        if(response.equals("Caleb")){
           System.out.println("Hey there Caleb ");
        }
        else{
            System.out.println("Who are you?");
        }
        //primitive types
        int xx = -3;
        double yy = 5.5;
        int x = (int) 6.6;
        double y = 5.0;
        int age = 10;
        boolean happy = false;
        char favoriteChar = 'a';
        //not a primitive type
        String name = "Karina";
        String myName = "Karina";
        ArrayList<String> list = new ArrayList<String>();
        if (x == 5){
            System.out.println("Hello");
        }else if(x == 10){
            System.out.println("What's up");
        }else if (x == 20){
            System.out.println("Hey there");
        }else
        {
            System.out.println("Eu sou uma merda (:");
        }
//        while (age < 20){
//            System.out.println(age);
//            age ++;
//        }
        for(int a = 12; a < 20; a++){
            System.out.println(a);
        }

//        System.out.println(name.equals(myName));
//        System.out.println(x);
//        System.out.println(y);
    }
}
