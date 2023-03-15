package ss16_io_text_file.pracitice.pra2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception ignored) {
            System.err.println("File không tồn tại");
        }
        return number;
    }

    public void writeFile(String filePact, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePact, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất : " + max);
            bufferedWriter.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> number = readAndWriteFile.readFile("src\\ss16_io_text_file\\pracitice\\data\\scores.txt");
        int maxValue = findMax(number);
        readAndWriteFile.writeFile("src\\ss16_io_text_file\\pracitice\\data\\numbers.csv", maxValue);
    }
}
