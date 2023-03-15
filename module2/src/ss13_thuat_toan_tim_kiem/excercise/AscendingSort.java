package ss13_thuat_toan_tim_kiem.excercise;

import java.util.LinkedList;

public class AscendingSort {
    public static void main(String[] args) {
        String str = "Welcome";
        LinkedList<Character> linkedList = new LinkedList<>();
        LinkedList<Character> maxList = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {

            linkedList.add(str.charAt(i));
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) > linkedList.getLast()) {

                    linkedList.add(str.charAt(j));
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
