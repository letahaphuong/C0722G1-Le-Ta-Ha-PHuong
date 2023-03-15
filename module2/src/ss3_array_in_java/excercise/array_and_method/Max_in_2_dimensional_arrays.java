package ss3_array_in_java.excercise.array_and_method;

import java.util.Scanner;

public class Max_in_2_dimensional_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Enter column: ");
        int column = Integer.parseInt(sc.nextLine());
        int[][] array = new int[row][column];
        System.out.println("Enter element in arrays: ");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                array[i][j]=Integer.parseInt(sc.nextLine());
            }
        }
        int max = array[0][0];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if (array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.printf("Phần tử lớn nhất trong mảng là : %d",max);
    }
}
