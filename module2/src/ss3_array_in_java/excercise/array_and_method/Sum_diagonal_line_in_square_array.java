package ss3_array_in_java.excercise.array_and_method;

import java.util.Scanner;

public class Sum_diagonal_line_in_square_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row: ");
        int row=Integer.parseInt(sc.nextLine());
        System.out.print("Enter column: ");
        int column=Integer.parseInt(sc.nextLine());
        System.out.println("Enter element in arrays: ");

        int [][] array=new int[row][column];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                array[i][j]=Integer.parseInt(sc.nextLine());
            }
        }

//        int[][] array = {
//                {1, 2, 3},
//                {1, 2, 3},
//                {1, 2, 3}
//        };
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][i];
        }
        System.out.print("Tổng đường chéo bắt đầu từ [0] : "+total+"\n");

    }
}
