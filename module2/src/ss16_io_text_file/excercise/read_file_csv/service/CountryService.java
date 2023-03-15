package ss16_io_text_file.excercise.read_file_csv.service;

import ss16_io_text_file.excercise.read_file_csv.model.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryService {
    public static List<Country> readFile(String filePath) {
        List<Country> countryList = new ArrayList<>();
        try {
            File file = new File("src\\ss16_io_text_file\\excercise\\read_file_csv\\data\\test.txt");
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                System.out.println("file không tồn tại!");
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] info;
            Country country;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                country = new Country();
                country.setId(Integer.parseInt(info[0]));
                country.setCode(info[1]);
                country.setName(info[2]);
                countryList.add(country);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return countryList;
    }

    public static void infoCountry(List<Country> countryList) {
        for (Country country : countryList) {
            System.out.println(country.getId() + " : " + country.getName());
        }
    }
}
