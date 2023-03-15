package case_study_module2.service.impl.faciliti_service;

import case_study_module2.model.facility.Villa;
import case_study_module2.service.i_faciliti_service.IVillaService;
import case_study_module2.util.CheckUtils;
import case_study_module2.util.FormatException;

import java.io.*;
import java.util.*;

public class VillaService implements IVillaService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Villa, Integer> listVilla = new LinkedHashMap<>();

    public Villa infoVilla() {
        String id;
        while (true) {
            try {
                System.out.println("Enter ID Villa: ");
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
                if (maxPerson >= 0 && maxPerson < 20) {
                    break;
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

        double swimmingPoolArea;
        while (true) {
            try {
                System.out.println("Enter Swimming Pool Area: ");
                swimmingPoolArea = Double.parseDouble(scanner.nextLine());
                if (swimmingPoolArea > 30) {
                    break;
                } else {
                    System.out.println("Area Swimming Less Than 30m2,Pls Enter Again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Format Error,Try Again");
            }
        }

        int numberFloors;
        while (true) {
            try {
                System.out.println("Enter Number Floor: ");
                numberFloors = Integer.parseInt(scanner.nextLine());
                if (numberFloors > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Format Error,Try Again!");
            }
        }

        return new Villa(id, serviceName, usableArea, rentalCost,
                maxPerson, rentalType, roomStandard, swimmingPoolArea,
                numberFloors);
    }

    @Override
    public void display() throws IOException {
        listVilla = readFile();
        Set<Villa> villas;
        villas = listVilla.keySet();
        for (Villa villa : villas) {
            System.out.println(villa.toString()+"Time of booking: "+listVilla.get(villa));
        }
    }

    @Override
    public void add() throws IOException {
        listVilla = readFile();
        Villa villa = this.infoVilla();
        listVilla.put(villa, 0);
        System.out.println("Successfully added new!");
        writeFile(listVilla);
    }

    public Map<Villa, Integer> readFile() throws IOException {
        Map<Villa, Integer> houseList = new LinkedHashMap<>();
        File file = new File("src\\case_study_module2\\data\\villa\\villa.csv");
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                System.out.println("File Not Found!");
            }
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] info;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                villa = new Villa();
                villa.setId(info[0]);
                villa.setServiceName(info[1]);
                villa.setUsableArea(Double.parseDouble(info[2]));
                villa.setRentalCost(Double.parseDouble(info[3]));
                villa.setMaxPerson(Integer.parseInt(info[4]));
                villa.setRentalType(info[5]);
                villa.setRoomStandard(info[6]);
                villa.setSwimmingPoolArea(Double.parseDouble(info[7]));
                villa.setNumberFloors(Integer.parseInt(info[8]));
                Integer value = Integer.parseInt(info[9]);
                houseList.put(villa, value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }

        return houseList;
    }

    public void writeFile(Map<Villa, Integer> roomsList) {
        File file = new File("src\\case_study_module2\\data\\villa\\villa.csv");
        if (!file.exists()) {
            System.out.println("File is not exist");
        }

        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<Villa> villas;
            villas = roomsList.keySet();
            for (Villa villa : villas) {
                bufferedWriter.write(villa.getInfo(villa) + "," + roomsList.get(villa));
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
