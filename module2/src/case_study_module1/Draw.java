package case_study_module1;

import java.util.Scanner;

class AlgorithmWeek1 {
    static Scanner scanner = new Scanner(System.in);

    public static String drawIsosceleTriangle() {
        String result = "";
        System.out.println("Nhập vào chiều cao:");
        int x = Integer.parseInt(scanner.nextLine());
        int left = x - 1;
        int right = x + 1;
        for (int i = 1; i <= x; i++) {

            result = getString(result, x, left, right, i);
            left--;
            right++;
        }
        left = 1;
        right = 2 * x - 2;
        for (int i = x - 1; i > 0; i--) {
            result = getString(result, x, left, right, i);
            left++;
            right--;
        }
        return result;
    }

    private static String getString(String result, int x, int left, int right, int i) {
        for (int j = 1; j <= left; j++) {
            result += " ";
        }
        for (int m = 1; m <= (2 * i) - 1; m++) {
            if (i == 1) continue;
            if (m == 1 || m == (2 * i) - 1) {
                result += i - 1;
            } else {
                result += " ";
            }
        }
        for (int n = right; n <= (2 * x) - 1; n++) {
            result += " ";
        }
        result += "\n";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(drawIsosceleTriangle());
    }
}