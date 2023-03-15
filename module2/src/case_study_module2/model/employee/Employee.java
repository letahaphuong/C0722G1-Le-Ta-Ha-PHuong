package case_study_module2.model.employee;

import case_study_module2.model.person.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee extends Person {
    private String idEmployee;
    private String level;//Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và sau đại học
    private String position;//Vị trí sẽ lưu trữ các thông tin: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
    private int salary;

    public Employee() {

    }

    public Employee(String idEmployee, String level, String position, int salary) {
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String idEmployee, String name, LocalDate birth, String gender, String idCard, String phoneNumber, String email, String level, String position, int salary) {
        super(name, birth, gender, idCard, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }


    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "Employee = {Id Employee='" + idEmployee + '\'' +
                        super.toString() +
                        "| Level='" + level + '\'' +
                        "| Position='" + position + '\'' +
                        "| Salary=" + salary +
                        '}';
    }

    public String getInfoEmployee() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String birth = getBirth().format(dateTimeFormatter);
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", getIdEmployee(), getName(), birth, getGender(),
                getIdCard(), getPhoneNumber(), getEmail(), getLevel(), getPosition(), getSalary());
    }
}
