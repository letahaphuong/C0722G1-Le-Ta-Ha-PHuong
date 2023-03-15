package ss3_array_in_java.practice;

import java.util.Scanner;

public class Find_element_in_array {
    public static void main(String[] args) {
        String[] student = {"Huy", "Dung", "Duc", "Long", "Trung", "Sang", "Phuong"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i=0;i<student.length;i++){
            if (student[i].equals(input_name)){
                System.out.println("Postion of the student in the list "+ input_name +" is: "+i);
                isExist=true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found"+input_name+"in the list");
        }
    }
}
