package org.bridgelabz;

import java.util.Random;

public class Dailywage {
    public static void main(String[] args) {
        int present=1;
        int EmpratePerHr=20;
        int empHrs=8;
        int salary=empHrs+EmpratePerHr;
        //double empcheck = Math.floor(Math.random() * 10) % 2;

        Random random=new Random();
        int empcheck= random.nextInt(2);

        if (present == empcheck){
            System.out.println("Total"+salary);
        }
        else
            System.out.println("0");
    }

}
