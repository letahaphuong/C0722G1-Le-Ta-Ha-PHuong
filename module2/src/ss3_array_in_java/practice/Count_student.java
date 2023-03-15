package ss3_array_in_java.practice;

import java.util.Scanner;

public class Count_student {
    public static void main(String[] args) {
        int[]arr;
        int size;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size=Integer.parseInt(sc.nextLine());
            if (size>30){
                System.out.print("Size should not exceed 30");
            }
        }while (size>30);
        arr=new int[size];
        int i=0;
        while (i<arr.length){
            System.out.print("Enter a mark for student"+(i+1)+" : ");
            arr[i]=Integer.parseInt(sc.nextLine());
            i++;
        }
        int count =0;
        String text="";
        System.out.print("List of mark: ");
        for (int j = 0; j <arr.length ; j++) {
            System.out.print(arr[j]+"\t");
            if (arr[j]>=5 && arr[j]<=10){
                text+=arr[j];
                count++;
            }
        }
        System.out.print("\n The number of student pass the exam í :"+count+text);
    }
}
