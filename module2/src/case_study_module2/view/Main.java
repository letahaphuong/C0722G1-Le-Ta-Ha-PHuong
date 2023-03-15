package case_study_module2.view;

import case_study_module2.controller.FuramaController;
import case_study_module2.util.NumberException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, NumberException {
        FuramaController.displayMainMenu();
    }
}
