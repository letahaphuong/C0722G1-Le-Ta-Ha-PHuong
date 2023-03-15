package ss2_loop_in_JAVA.excercise;

public class Check_primes_2_100 {
    public static void main(String[] args) {
        int number = 2;
        int countPrimes = 0;
        for (int j=2;j<=100;j++){
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number);
                countPrimes++;
            }
            number++;
        }

    }
}
