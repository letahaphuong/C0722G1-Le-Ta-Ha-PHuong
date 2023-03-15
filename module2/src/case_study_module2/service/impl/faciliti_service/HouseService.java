package case_study_module2.service.impl.faciliti_service;

import case_study_module2.model.facility.House;
import case_study_module2.service.i_faciliti_service.IHouseService;
import case_study_module2.util.CheckControllerUtils;
import case_study_module2.util.CheckUtils;
import case_study_module2.util.FormatException;

import java.io.*;
import java.util.*;

public class HouseService implements IHouseService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<House, Integer> listHouse = new LinkedHashMap<>();

    public House infoHouse() {
        String id;
        while (true) {
            try {
                System.out.println("Enter ID House");
                id = scanner.nextLine();
                CheckUtils.checkIdFacility(id);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String serviceName;
        while (true) {
            try {
                System.out.println("Enter Service Name: ");
                serviceName = scanner.nextLine();
                CheckUtils.checkName(serviceName);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        double usableArea;
        while (true) {
            try {
                System.out.println("Enter Usable Area: ");
                usableArea = Double.parseDouble(scanner.nextLine());
                if (usableArea > 30) {
                    break;
                } else {
                    System.out.println("Area More Than 30,Pls Enter Again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Format Error,Try Again!");
            }

        }
        double rentalCost;
        while (true) {
            try {
                System.out.println("Enter Rental Cost: ");
                rentalCost = Double.parseDouble(scanner.nextLine());
                if (rentalCost > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Format Error,Try Again!");
            }

        }
        int maxPerson;
        while (true) {
            try {
                System.out.println("Enter Max Person Number: ");
                maxPerson = Integer.parseInt(scanner.nextLine());
                if (maxPerson > 0 && maxPerson < 20) {
                    break;
                } else {
                    System.out.println("Person Number More Than 0 And Less Than 20,Pls Try Again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Format Error,Try Again!");
            }

        }
        String rentalType = null;
        while (true) {
            System.out.println("Enter Rental Type:" +
                    "\n 1. Rent By Year!" +
                    "\n 2. Rent By Month!" +
                    "\n 3. Rent By Day!" +
                    "\n 4. Rent By Hours!");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    rentalType = "Rent By Year!";
                    break;
                case "2":
                    rentalType = "Rent By Month!";
                    break;
                case "3":
                    rentalType = "Rent By Day!";
                    break;
                case "4":
                    rentalType = "Rent By Hours!";
                    break;
                default:
                    System.out.println("Format Error, Pls Try Again!");
            }
            break;
        }


        String roomStandard;
        while (true) {
            try {
                System.out.println("Enter Room Standard(Suite / Deluxe / Superior / Standard): ");
                roomStandard = scanner.nextLine();
                CheckUtils.checkStandard(roomStandard);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }

        }

        int numberFloors;
        while (true) {
            try {
                System.out.println("Enter Room Floors");
                numberFloors = Integer.parseInt(scanner.nextLine());
                if (numberFloors > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Format Error,Pls Try Again");
            }

        }
        return new
                House(id, serviceName, usableArea, rentalCost, maxPerson, rentalType, roomStandard, numberFloors);
    }

    @Override
    public void display() {
        listHouse = readFile();
        Set<House> houses;
        houses = listHouse.keySet();
        for (House house : houses) {
            System.out.println(house.toString()+"Time used of booking: "+listHouse.get(house));

        }
    }

    @Override
    public void add() {
        listHouse = readFile();
        House house = this.infoHouse();
        listHouse.put(house, 0);
        System.out.println("Successfully added new!");
        writeFile(listHouse);

    }

    public Map<House, Integer> readFile() {
        Map<House, Integer> houseList = new LinkedHashMap<>();
        File file = new File("src\\case_study_module2\\data\\house\\house.csv");
        try {
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                System.out.println("File Not Found!");
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] info;
            House house;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                house = new House();
                house.setId(info[0]);
                house.setServiceName(info[1]);
                house.setUsableArea(Double.parseDouble(info[2]));
                house.setRentalCost(Double.parseDouble(info[3]));
                house.setMaxPerson(Integer.parseInt(info[4]));
                house.setRentalType(info[5]);
                house.setRoomStandard(info[6]);
                house.setNumberFloors(Integer.parseInt(info[7]));
                Integer value = Integer.parseInt(info[8]);
                houseList.put(house, value);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

    public void writeFile(Map<House, Integer> listHouse) {
        File file = new File("src\\case_study_module2\\data\\house\\house.csv");
        if (!file.exists()) {
            System.out.println("File is not exist");
        }

        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<House> houses;
            houses = listHouse.keySet();
            for (House house : houses) {
                bufferedWriter.write(house.getInfo(house) + "," + listHouse.get(house));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
