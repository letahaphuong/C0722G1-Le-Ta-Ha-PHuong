package ss13_thuat_toan_tim_kiem.excercise.binary_search_length;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingSortLength {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.nextLine();
        LinkedList<Character> maxList = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> linkedList = new LinkedList<>();
            linkedList.add(str.charAt(i));
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j) > linkedList.getLast()) {

                    linkedList.add(str.charAt(j));
                }else{
                    break;
                }
            }
            if (linkedList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(linkedList);
            }
            linkedList.clear();
        }
        for (Character character : maxList) {
            System.out.print(character);
        }
        System.out.println();
    }
}
//abcabcdgabxy
//abcabcgabmnsxy