package ss16_io_text_file.excercise.excercise_from_mrHai.model;

public class Student extends Person implements Comparable<Student> {
    private String nameClass;
    private double score;

    public Student(String nameClass, double score) {
        this.nameClass = nameClass;
        this.score = score;
    }

    public Student(String id, String name,
                   String birthday, Boolean sex,
                   String nameClass, double score) {
        super(id, name, birthday, sex);
        this.nameClass = nameClass;
        this.score = score;
    }

    public Student() {
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        if (getSex().equals(true)) {
            return "SINH VIÊN{" +
                    " Mã sinh viên: " +
                    getId() +
                    ", Tên Sinh Viên: " +
                    getName() +
                    ", Ngày tháng năm sinh: " +
                    getBirthday() +
                    ", Giới tính: " +
                    "Nam" +
                    ", Tên Lớp='" + nameClass + '\'' +
                    ", Điểm số=" + score +
                    '}';
        } else if (getSex().equals(false)) {
            return "SINH VIÊN{" +
                    " Mã sinh viên: " +
                    getId() +
                    ", Tên Sinh Viên: " +
                    getName() +
                    ", Ngày tháng năm sinh: " +
                    getBirthday() +
                    ", Giới tính: " +
                    "Nữ" +
                    ", Tên Lớp='" + nameClass + '\'' +
                    ", Điểm số=" + score +
                    '}';
        } else {
            return "Chưa nhập giới tính";
        }
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s",getId(),getName(),getBirthday(),getSex(),getNameClass(),getScore());
    }


    @Override
    public int compareTo(Student o) {
        if (this.getName().compareTo(o.getName()) != 0) {
            return getName().compareTo(o.getName());
        } else {
            return getId().compareTo(o.getId());
        }
    }
}

