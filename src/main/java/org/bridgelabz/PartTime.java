package org.bridgelabz;

import java.util.Random;

public class PartTime {

    public static void main(String[] args) {
        int parttime=1;
        int fulltime=2;
        int MaxRateInMonth=100;
        int empRatePerHr=20;
        int NumofWorkingDays=20;

        int TotalempHr=0;
        int TotalWorkingDays=0;

        while (TotalempHr < MaxRateInMonth &&
                TotalWorkingDays < NumofWorkingDays){
            TotalWorkingDays++;
            //double empcheck = Math.floor(Math.random() * 10) % 2;
            Random random =new Random();
            int empcheck=random.nextInt(3);

            switch (empcheck) {
                case fulltime :
                    System.out.println("empHrs"+8);
                    break;
                case parttime:
                    System.out.println("empHrs"+4);
                    break;
                default:
                    System.out.println(0);
            }
            int empHrs=0;
            TotalempHr=TotalempHr+empHrs;
        }
    }
}
