package case_study_module2.service;

import case_study_module2.util.NumberException;

import java.io.IOException;

public interface IService {
    void display() throws IOException;
    void add() throws IOException, NumberException;
}
