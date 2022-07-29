package org.bridgelabz;

import java.util.Random;

public class Emp {
    public static void main(String[] args) {

        int present=1;
        //double empcheck = Math.floor(Math.random() * 10) % 2;

        Random random=new Random();
        int empcheck= random.nextInt(2);
        if (empcheck == present){
            System.out.println("present");
        }
        else
            System.out.println("absent");

    }

}
