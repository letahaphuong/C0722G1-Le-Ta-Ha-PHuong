package case_study_module2.service.impl;

import case_study_module2.model.customer.Customer;
import case_study_module2.service.ICustomerService;
import case_study_module2.util.CheckUtils;
import case_study_module2.util.FormatException;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static List<Customer> customerList = new LinkedList<>();

    public Customer infoCustomer() {
        String id;
        while (true) {
            try {
                System.out.println("Enter ID Customer(CT-xxxx): ");
                id = scanner.nextLine();

                CheckUtils.checkIdCustomer(id);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String name;
        while (true) {
            try {
                System.out.println("Enter Name Customer: ");
                name = scanner.nextLine();
                CheckUtils.checkName(name);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }

        LocalDate birth;
        while (true) {
            try {
                System.out.println("Enter Birth Customer(dd/MM/yyyy): ");
                birth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
                CheckUtils.checkBirthCustomer(birth);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }


        }
        String address;
        while (true) {
            try {
                System.out.println("Enter Address Customer: ");
                address = scanner.nextLine();
                CheckUtils.checkAddress(address);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }


        }
        String gender;
        while (true) {
            try {
                System.out.println("Enter Gender Customer(male/female/other): ");
                gender = scanner.nextLine();
                CheckUtils.checkGender(gender);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }


        }
        String idCard;
        while (true) {
            try {
                System.out.println("Enter IdCard Customer(XXX XXX XXX): ");
                idCard = scanner.nextLine();
                CheckUtils.checkIDCard(idCard);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }


        }
        String phoneNumber;
        while (true) {
            try {
                System.out.println("Enter PhoneNumber Customer(0xxx xxx xxx): ");
                phoneNumber = scanner.nextLine();
                CheckUtils.checkPhone(phoneNumber);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String email;
        while (true) {
            try {
                System.out.println("Enter Email Customer: ");
                email = scanner.nextLine();
                CheckUtils.checkMail(email);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String typeGuest;
        while (true) {
            try {
                System.out.println("Enter Type Guest Customer(Diamond / Platinium / Gold / Silver / Member): " );
                typeGuest = scanner.nextLine();
                CheckUtils.checkTypeGuest(typeGuest);
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }


        }

        return new Customer(name, birth, gender, idCard, phoneNumber, email, id, typeGuest, address);
    }

    @Override
    public void editCustomer() throws IOException {
        customerList = readFile();
        if (!customerList.isEmpty()){
            System.out.println("Enter ID to Edit: ");
            String idFind = scanner.nextLine();
            for (int i = 0; i < customerList.size(); i++) {
                if (idFind.equals(customerList.get(i).getIdCustomer())) {
                    try {
                        System.out.println("Enter new Name: ");
                        String nameEdit = scanner.nextLine();
                        CheckUtils.checkName(nameEdit);
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        System.out.println("Enter new Birth(dd/MM/yyyy): ");
                        LocalDate birthEdit = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
                        CheckUtils.checkBirthCustomer(birthEdit);
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        System.out.println("Enter new Gender(male/female/other): ");
                        String genderEdit = scanner.nextLine();
                        CheckUtils.checkGender(genderEdit);
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        System.out.println("Enter new Address: ");
                        String addressEdit = scanner.nextLine();
                        CheckUtils.checkAddress(addressEdit);
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        System.out.println("Enter new ID Card(XXX XXX XXX): ");
                        String idCardEdit = scanner.nextLine();
                        CheckUtils.checkIDCard(idCardEdit);
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        System.out.println("Enter new Phone Number(0xxx xxx xxx): ");
                        String phoneNumberEdit = scanner.nextLine();
                        CheckUtils.checkPhone(phoneNumberEdit);
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        System.out.println("Enter new Email: ");
                        String emailEdit = scanner.nextLine();
                        CheckUtils.checkMail(emailEdit);
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                    try {
                        System.out.println("Enter new Type Guest Customer(Diamond / Platinium / Gold / Silver / Member): ");
                        String typeGuest=scanner.nextLine();
                        CheckUtils.checkTypeGuest(typeGuest);
                    }catch (FormatException e){
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Edit successfully!");
                    writerFile(customerList);
                    break;
                }
            }
        }
        else {
            System.out.println("Data Is Empty,Enter 1st Data!\n");
        }
    }

    @Override
    public void display() throws IOException {
        customerList = readFile();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() throws IOException {
        customerList = readFile();
        Customer customer = this.infoCustomer();
        customerList.add(customer);
        System.out.println("Successfully added new!");
        writerFile(customerList);
    }


    private List<Customer> readFile() throws IOException {
        BufferedReader bufferedReader = null;
        List<Customer> customerList1 = new LinkedList<>();
        try {
            File file = new File("src\\case_study_module2\\data\\customer\\customer.csv");
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                System.out.println("File not Found!");
            }
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] info;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                customer = new Customer();
                customer.setIdCustomer(info[0]);
                customer.setName(info[1]);
                customer.setBirth(LocalDate.parse(info[2], dateTimeFormatter));
                customer.setGender(info[3]);
                customer.setAddress(info[4]);
                customer.setIdCard(info[5]);
                customer.setPhoneNumber(info[6]);
                customer.setEmail(info[7]);
                customer.setTypeGuest(info[8]);
                customerList1.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        return customerList1;
    }

    private void writerFile(List<Customer> customerList2) throws IOException {
        File file = new File("src\\case_study_module2\\data\\customer\\customer.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer : customerList2) {
            bufferedWriter.write(customer.getInfoCustomer());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
