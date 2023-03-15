package ss1_Introduction_to_Java.exercise;

import java.util.Scanner;

public class Read_number_to_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số bạn cần đọc: ");
        int number = sc.nextInt();
        if (number < 10 && number >= 0) {
            String numberToWords;
            switch (number) {
                case 0:
                    numberToWords = "zero";
                    break;
                case 1:
                    numberToWords = "One";
                    break;
                case 2:
                    numberToWords = "Two";
                    break;
                case 3:
                    numberToWords = "Three";
                    break;
                case 4:
                    numberToWords = "Four";
                    break;
                case 5:
                    numberToWords = "Five";
                    break;
                case 6:
                    numberToWords = "Six";
                    break;
                case 7:
                    numberToWords = "Seven";
                    break;
                case 8:
                    numberToWords = "Eight";
                    break;
                case 9:
                    numberToWords = "Nine";
                    break;
                default:
                    numberToWords = " ";
            }
            if (!numberToWords.equals(" ")) {
                System.out.printf("The number '%d' to Words: %s !\n", number, numberToWords);
            } else {
                System.out.print("Invalid input!");
            }
        }
        if (number < 20 && number >= 10) {
            String numberToWords3;
            switch (number) {
                case 10:
                    numberToWords3 = "Ten";
                    break;
                case 11:
                    numberToWords3 = "Eleven";
                    break;
                case 12:
                    numberToWords3 = "Twelve";
                    break;
                case 13:
                    numberToWords3 = "Thirteen";
                    break;
                case 14:
                    numberToWords3 = "Fourteen";
                    break;
                case 15:
                    numberToWords3 = "Fifteen";
                    break;
                case 16:
                    numberToWords3 = "Sixteen";
                    break;
                case 17:
                    numberToWords3 = "Seventeen";
                    break;
                case 18:
                    numberToWords3 = "Eighteen";
                    break;
                case 19:
                    numberToWords3 = "Nineteen";
                    break;
                default:
                    numberToWords3 = " ";
            }
            if (!numberToWords3.equals(" ")) {
                System.out.printf("The number '%d' to Words: %s !\n", number, numberToWords3);
            } else {
                System.out.print("Invalid input!");
            }
        }
        if (number >= 20 && number < 1000) {
            int hundred = number / 100;
            int tens = number / 10 % 10;
            int ones = number % 10;
            String numberToWords;
            switch (hundred) {
                case 1:
                    numberToWords = "One hundred";
                    break;
                case 2:
                    numberToWords = "Two hundred";
                    break;
                case 3:
                    numberToWords = "Three hundred";
                    break;
                case 4:
                    numberToWords = "Four hundred";
                    break;
                case 5:
                    numberToWords = "Five hundred";
                    break;
                case 6:
                    numberToWords = "Six hundred";
                    break;
                case 7:
                    numberToWords = "Seven hundred";
                    break;
                case 8:
                    numberToWords = "Eight hundred";
                    break;
                case 9:
                    numberToWords = "Nine hundred";
                    break;
                default:
                    numberToWords = " ";
            }

            String numberToWords1;
            switch (tens) {
                case 0:
                    if (tens == 0) {
                        numberToWords1 = " ";
                        break;
                    } else {

                        numberToWords1 = " ";
                        break;
                    }
                case 1:
                    numberToWords1 = "Ten";
                    break;
                case 2:
                    numberToWords1 = "Twenty";
                    break;
                case 3:
                    numberToWords1 = "Thirty";
                    break;
                case 4:
                    numberToWords1 = "Forty";
                    break;
                case 5:
                    numberToWords1 = "Fifty";
                    break;
                case 6:
                    numberToWords1 = "Sixty";
                    break;
                case 7:
                    numberToWords1 = "Seventy";
                    break;
                case 8:
                    numberToWords1 = "Eighty";
                    break;
                case 9:
                    numberToWords1 = "Ninety";
                    break;
                default:
                    numberToWords1 = " ";
            }
            String numberToWords2;
            switch (ones) {
                case 0:
                    if (ones == 0) {
                        numberToWords2 = " ";
                        break;
                    } else {
                        numberToWords2 = " ";
                        break;
                    }
                case 1:
                    numberToWords2 = "One";
                    break;
                case 2:
                    numberToWords2 = "Two";
                    break;
                case 3:
                    numberToWords2 = "Three";
                    break;
                case 4:
                    numberToWords2 = "Four";
                    break;
                case 5:
                    numberToWords2 = "Five";
                    break;
                case 6:
                    numberToWords2 = "Six";
                    break;
                case 7:
                    numberToWords2 = "Seven";
                    break;
                case 8:
                    numberToWords2 = "Eight";
                    break;
                case 9:
                    numberToWords2 = "Nine";
                    break;
                default:
                    numberToWords2 = " ";
            }
            if (number<120 && number >110){
                switch (number){
                    case 111:
                        System.out.printf("The number '%d' to words: %s !",number,"One hundred Eleven");
                        break;
                    case 112:
                        System.out.printf("The number '%d' to words: %s !",number,"One hundred Twelve");
                        break;
                    case 113:
                        System.out.printf("The number '%d' to words: %s !",number,"One hundred Thirteen");
                        break;
                    case 114:
                        System.out.printf("The number '%d' to words: %s !",number,"One hundred Fourteen");
                        break;
                    case 115:
                        System.out.printf("The number '%d' to words: %s !",number,"One hundred Fifteen");
                        break;
                    case 116:
                        System.out.printf("The number '%d' to words: %s !",number,"One hundred Sixteen");
                        break;
                    case 117:
                        System.out.printf("The number '%d' to words: %s !",number,"One hundred Seventeen");
                        break;
                    case 118:
                        System.out.printf("The number '%d' to words: %s !",number,"One hundred Eighteen");
                        break;
                    case 119:
                        System.out.printf("The number '%d' to words: %s !",number,"One hundred Nineteen");
                        break;
                }
            }
            else if (!numberToWords.equals(" ") || !numberToWords1.equals(" ") || !numberToWords2.equals(" ")) {
                System.out.printf("The number '%d' to words: %s !", number, numberToWords + " " + numberToWords1 + " " + numberToWords2);
            } else {
                System.out.print("Invalid input!");
            }
        }
    }
}