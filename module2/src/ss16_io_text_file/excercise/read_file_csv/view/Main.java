package ss16_io_text_file.excercise.read_file_csv.view;

import ss16_io_text_file.excercise.read_file_csv.service.CountryService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CountryService.infoCountry(CountryService.readFile("src\\ss16_io_text_file\\excercise\\read_file_csv\\data\\test.txt"));
    }
}
