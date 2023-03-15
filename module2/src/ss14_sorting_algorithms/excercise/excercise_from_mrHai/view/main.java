package ss14_sorting_algorithms.excercise.excercise_from_mrHai.view;

import ss14_sorting_algorithms.excercise.excercise_from_mrHai.controller.PersonController;
import ss14_sorting_algorithms.excercise.excercise_from_mrHai.controller.StudentController;
import ss14_sorting_algorithms.excercise.excercise_from_mrHai.controller.TeacherController;

public class main {
    public static void main(String[] args) {
        PersonController.menuPerson();
        StudentController.menuStudent();
        TeacherController.menuTeacher();
    }
}
