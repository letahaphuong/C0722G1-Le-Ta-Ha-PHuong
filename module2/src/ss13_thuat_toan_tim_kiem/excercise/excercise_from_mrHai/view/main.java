package ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.view;

import ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.controller.PersonController;
import ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.controller.StudentController;
import ss13_thuat_toan_tim_kiem.excercise.excercise_from_mrHai.controller.TeacherController;

public class main {
    public static void main(String[] args) {
        PersonController.menuPerson();
        StudentController.menuStudent();
        TeacherController.menuTeacher();
    }
}
