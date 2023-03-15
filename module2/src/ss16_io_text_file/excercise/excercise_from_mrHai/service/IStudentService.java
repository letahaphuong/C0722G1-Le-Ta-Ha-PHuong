package ss16_io_text_file.excercise.excercise_from_mrHai.service;

import ss16_io_text_file.excercise.excercise_from_mrHai.util.FormatException;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException, FormatException;
    void displayAllStudent() throws IOException;
    void removeStudent() throws IOException;
//    void findStudentNameOrID();

    void findStudentName() throws FileNotFoundException;

    void findStudentID() throws FileNotFoundException;

    void sortName() throws IOException;
}
