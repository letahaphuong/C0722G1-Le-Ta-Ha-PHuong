package ss16_io_text_file.excercise.excercise_from_mrHai.service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;
    void displayAllTeacher() throws FileNotFoundException;
    void removeTeacher();
//    void findTeacherNameOrID();

    void findTeacherName();

    void findTeacherID();

    void sortTeacher();
}
