package ss3_array_in_java.excercise.array_and_method;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_in_column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Enter column: ");
        int column = Integer.parseInt(sc.nextLine());
        int[][] array = new int[row][column];
        System.out.print("Enter element in array: \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i <row ; i++) {
            System.out.print(Arrays.toString(array[i]));
        }
        System.out.print("\nEnter column you want: ");
        int columnSum = Integer.parseInt(sc.nextLine());
        int total = 0;
        for (int j = 0; j < array.length; j++) {
            total += array[j][columnSum];

        }
        System.out.print("Sum for column " + column + " : " + total);

    }

}
