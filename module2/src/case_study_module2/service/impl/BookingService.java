package case_study_module2.service.impl;

import case_study_module2.model.booking.Booking;
import case_study_module2.model.facility.House;
import case_study_module2.model.facility.Room;
import case_study_module2.model.facility.Villa;
import case_study_module2.service.IBookingService;
import case_study_module2.service.ICustomerService;
import case_study_module2.service.i_faciliti_service.IHouseService;
import case_study_module2.service.i_faciliti_service.IRoomService;
import case_study_module2.service.i_faciliti_service.IVillaService;
import case_study_module2.service.impl.faciliti_service.HouseService;
import case_study_module2.service.impl.faciliti_service.RoomService;
import case_study_module2.service.impl.faciliti_service.VillaService;
import case_study_module2.util.CheckUtils;
import case_study_module2.util.FormatException;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingService implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static IBookingService iBookingService = new BookingService();
    private static BookingService bookingService = new BookingService();
    private static ICustomerService iCustomerService = new CustomerService();
    private static HouseService houseService = new HouseService();
    private static VillaService villaService = new VillaService();
    private static RoomService roomService = new RoomService();
    private static IHouseService iHouseService = new HouseService();
    private static IVillaService iVillaService = new VillaService();
    private static IRoomService iRoomService = new RoomService();
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static Set<Booking> listBooking = new TreeSet<>();
    private static CustomerService customerService = new CustomerService();


    public Booking infoBooking() throws IOException {
        String idBooking;
        while (true) {
            try {
                System.out.println("Enter Booking ID(BK-xxxx): ");
                idBooking = scanner.nextLine();
                CheckUtils.checkIdBooking(idBooking);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }

        }
        String idCustomer;
        while (true) {
            try {
                iCustomerService.display();
                System.out.println("Enter Id Customer(CT-xxxx): ");
                idCustomer = scanner.nextLine();
                CheckUtils.checkIdCustomer(idCustomer);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }

        }

        LocalDate beginDay;
        while (true) {
            try {
                System.out.println("Enter Begin Day: ");
                beginDay = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Format Error,Enter Again!");
            }

        }
        LocalDate endDay;
        while (true) {
            try {
                System.out.println("Enter End Day: ");
                endDay = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
                if (endDay.isAfter(beginDay)) {
                    break;
                } else {
                    System.out.println("End Day Must Be Greater Than Start Day!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Format Error,Enter Again!");
            }

        }
        String serviceType;
        while (true) {
            try {
                System.out.println("Enter Service Type( 3 Stars | 4 Stars | 5 Stars)");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "3":
                        serviceType = "3 Stars";
                        break;
                    case "4":
                        serviceType = "4 Stars";
                        break;
                    case "5":
                        serviceType = "5 Stars";
                        break;
                    default:
                        serviceType = null;
                        System.out.println("Format Error,Pls Try Again!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Format Error,Pls Try Again!");
            }

        }
        String serviceId;
        while (true) {
            try {
                iHouseService.display();
                iVillaService.display();
                iRoomService.display();
                System.out.println("Enter Service Id: ");
                serviceId = scanner.nextLine();
                CheckUtils.checkIdFacility(serviceId);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }

        }
        return new Booking(idBooking, idCustomer, beginDay, endDay, serviceId, serviceType);
    }

    @Override
    public void display() {
        Set<Booking> bookings;
        bookings = readFile();
        for (Booking booking : bookings) {
            System.out.println(booking);
        }

    }

    @Override
    public void add() throws IOException {
        listBooking = readFile();
        Booking booking = this.infoBooking();
        listBooking.add(booking);
        if (booking.getServiceId().contains("SVHO")) {
            Map<House, Integer> listHouse = houseService.readFile();
            Set<House> houses = listHouse.keySet();
            for (House house : houses) {
                if (booking.getServiceId().equals(house.getId())) {
                    listHouse.replace(house, listHouse.get(house) + 1);
                    break;
                }
            }
            houseService.writeFile(listHouse);

        } else if (booking.getServiceId().contains("SVVL")) {
            Map<Villa, Integer> listVilla = villaService.readFile();
            Set<Villa> villas = listVilla.keySet();
            for (Villa villa : villas) {
                if (booking.getServiceId().equals(villa.getId())) {
                    listVilla.replace(villa, listVilla.get(villa) + 1);
                    break;
                }
            }
            villaService.writeFile(listVilla);
        } else if (booking.getServiceId().contains("SVRO")) {
            Map<Room, Integer> listRoom = roomService.readFile();
            Set<Room> rooms = listRoom.keySet();
            for (Room room : rooms) {
                if (booking.getServiceId().equals(room.getId())) {
                    listRoom.replace(room, listRoom.get(room) + 1);
                    break;
                }
            }
            roomService.writeFile(listRoom);
        }
        System.out.println("Successfully added new!");
        writeFile(listBooking);

    }

    private Set<Booking> readFile() {
        Set<Booking> listBook = new LinkedHashSet<>();
        BufferedReader bufferedReader = null;
        try {
            File file = new File("src\\case_study_module2\\data\\booking\\booking.csv");
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                System.out.println("File Not Found!");
            }
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] info;
            Booking booking;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                booking = new Booking();
                booking.setIdBooking(info[0]);
                booking.setIdCustomer(info[1]);
                booking.setBeginDay(LocalDate.parse(info[2], dateTimeFormatter));
                booking.setEndDay(LocalDate.parse(info[3], dateTimeFormatter));
                booking.setServiceType(info[4]);
                booking.setServiceId(info[5]);
                listBook.add(booking);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listBook;
    }

    private void writeFile(Set<Booking> bookingList) {
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File("src\\case_study_module2\\data\\booking\\booking.csv");
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking booking : bookingList) {
                bufferedWriter.write(booking.getInfoBooking(booking));
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
