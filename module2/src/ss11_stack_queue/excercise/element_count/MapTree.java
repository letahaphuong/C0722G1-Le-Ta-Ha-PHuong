package ss11_stack_queue.excercise.element_count;

import java.util.*;

public class MapTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin: ");
        String str = scanner.nextLine();
        str = str.toUpperCase();
        System.out.println(str);

        String[] str1 = str.split("");
        System.out.println(Arrays.toString(str1));

        Stack<String> temp = new Stack<>();
        for (int i = 0; i < str1.length; i++) {
            temp.push(str1[i]);
        }

        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < temp.size(); i++) {
            if (!map.containsKey(temp.get(i))) {
                map.put(temp.get(i), 1);
            } else {
                map.put(temp.get(i), map.get(temp.get(i)) + 1);
            }
        }
        System.out.println(map);
    }
}
