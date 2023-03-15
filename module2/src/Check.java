import java.io.CharArrayReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Check {
    private static Object LocalTime;

//        Scanner obj = new Scanner(System.in);

//                int i = obj.nextInt();
//                int j = obj.nextInt();
////        int i =Integer.parseInt(obj.nextLine());
////        int j =Integer.parseInt(obj.nextLine());
//                System.out.println("sum of numbers input by user");
//                System.out.println(i + j);

    public static void main(String[] args) {
        String obj  = "abcdefgh";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 1, 4);
        int i;
        int j;
        try
        {
            while((i = input1.read()) == (j = input2.read()))
            {
                System.out.print((char)i);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

