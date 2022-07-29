package org.bridgelabz;

public class Uc_6 {
    public static void main(String[] args) {
        int PartTime = 1;
        int FullTime = 2;
        int maxRateInMonth = 100;
        int empRatePerHr = 20;
        int numOfWorkingDays = 20;

        int totalEmpHr = 0;
        int totalWorkingDays = 0;

        while (totalEmpHr < maxRateInMonth &&
                totalWorkingDays < numOfWorkingDays) {

            totalWorkingDays++;
            double empcheck = Math.floor(Math.random() * 10) % 2;
            switch (empcheck) {
                case FullTime:
                    int empHrs = 8;
                    break;
                case PartTime:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;

                totalEmpHr = totalEmpHr + empHrs;
            }

            int totalSalary = totalEmpHr * empRatePerHr;
        }


    }
}