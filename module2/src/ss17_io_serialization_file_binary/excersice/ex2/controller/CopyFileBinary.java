package ss17_io_serialization_file_binary.excersice.ex2.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileBinary implements Serializable {
    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");


        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream("src\\ss17_io_serialization_file_binary\\excersice\\ex2\\data\\source.dat");
            ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
            objectOutputStream1.writeObject(stringList);
            objectOutputStream1.close();
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("src\\ss17_io_serialization_file_binary\\excersice\\ex2\\data\\source.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            stringList = (List<String>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (ClassNotFoundException | IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try {
            File targetFile = new File("src\\ss17_io_serialization_file_binary\\excersice\\ex2\\data\\target.dat");
            FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(stringList);
            for (String s : stringList) {
                System.out.println(s);
            }
            objectOutputStream.close();
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}