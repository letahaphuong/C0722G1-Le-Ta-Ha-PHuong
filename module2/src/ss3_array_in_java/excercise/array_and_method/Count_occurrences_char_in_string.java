package ss3_array_in_java.excercise.array_and_method;

import java.util.Scanner;

public class Count_occurrences_char_in_string {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = "aabbccaa";
        System.out.print("Enter char to check: ");
        char c = sc.nextLine().charAt(0);


        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (c == str.charAt(i)){
                count++;
            }
        }

        System.out.printf("Ký tự %s xuất hiện : %d lần",c,count);
    }
}
