package org.bridgelabz;

import java.util.Random;

public class Wagemonth {
    public static void main(String[] args) {
        int parttime=1;
        int fulltime=2;
        int totalsalary=0;
        int empRatePerHr=20;
        int NumofWorkingDays=20;


        for (int day=1; day<=NumofWorkingDays; day++){

            //double empcheck = Math.floor(Math.random() * 10) % 2;

            Random random=new Random();
                    int epmcheck=random.nextInt(3);


            switch  (epmcheck) {
                case fulltime:
                    int empHrs = 8;
                    break;
                case parttime:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;

                int salary = empHrs * empRatePerHr;//dailywage

                totalsalary = totalsalary + salary;//monthly
            }
            }
        }
}


