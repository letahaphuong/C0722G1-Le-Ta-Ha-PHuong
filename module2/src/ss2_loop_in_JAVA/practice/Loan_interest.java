package ss2_loop_in_JAVA.practice;

import java.util.Scanner;

public class Loan_interest {
    // Tiền lãi cho vay;
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount: ");//Nhập số tiền đầu tư;
        money = sc.nextDouble();
        System.out.print("Enter number of months: ");//Nhập số tháng
        month = sc.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");//nhập lãi suất hàng năm theo %
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i =0;i<month;i++){
            totalInterest+=money*(interestRate/100)/12*month;
        }System.out.println("Total of interest: "+totalInterest);
    }
}
