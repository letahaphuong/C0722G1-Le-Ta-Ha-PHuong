package ss16_io_text_file.pracitice.pra1;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {


    public void readFileText(String filePath) throws IOException {
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int sum=0;
            while ((line=bufferedReader.readLine()) !=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng = "+sum);
        }catch (Exception e){
            System.err.println("File không tồn tại or nội dung lỗi");
        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
