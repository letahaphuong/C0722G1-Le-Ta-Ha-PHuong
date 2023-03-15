package ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.view;

import ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.controller.PersonController;
import ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.controller.StudentController;
import ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.controller.TeacherController;

public class main {
    public static void main(String[] args) {
        PersonController.menuPerson();
        StudentController.menuStudent();
        TeacherController.menuTeacher();
    }
}
