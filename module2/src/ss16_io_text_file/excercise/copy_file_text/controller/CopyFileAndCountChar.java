package ss16_io_text_file.excercise.copy_file_text.controller;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileAndCountChar {
    public static void main(String[] args) {
        List<Character> chars = new ArrayList<>();
        try {
            File inFile = new File("src\\ss16_io_text_file\\excercise\\copy_file_text\\data\\test.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            FileWriter writer = new FileWriter("src\\ss16_io_text_file\\excercise\\copy_file_text\\data\\output.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\n");
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != 0) {
                        chars.add(line.charAt(i));
                    }

                }
            }
            for (Character character : chars) {
                System.out.print(character);
            }
            System.out.println();
            System.out.println("Tổng số ký tự là: " + chars.size());
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("File không tồn tại.");
        }

    }
}