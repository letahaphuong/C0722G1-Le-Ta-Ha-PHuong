package ss14_sorting_algorithms.excercise.excercise_from_mrHai.model;

public class Teacher extends Person implements Comparable<Teacher> {
    private String Specialize;

    public Teacher(String specialize) {
        Specialize = specialize;
    }

    public Teacher(String id, String name, String birthday, Boolean sex, String specialize) {
        super(id, name, birthday, sex);
        Specialize = specialize;
    }

    public Teacher() {
    }

    public String getSpecialize() {
        return Specialize;
    }

    public void setSpecialize(String specialize) {
        Specialize = specialize;
    }

    @Override
    public String toString() {
        if (getSex().equals(true)) {
            return "Teacher{" +
                    " Mã Giáo Viên: " +
                    getId() +
                    ", Tên Giáo Viên: " +
                    getName() +
                    ", Ngày tháng năm sinh: " +
                    getBirthday() +
                    ", Giới tính: " +
                    "Nam" +
                    ", Chuyên Môn='" + Specialize + '\'' +
                    '}';
        } else if (getSex().equals(false)) {
            return "Teacher{" +
                    " Mã Giáo Viên: " +
                    getId() +
                    ", Tên Giáo Viên: " +
                    getName() +
                    ", Ngày tháng năm sinh: " +
                    getBirthday() +
                    ", Giới tính: " +
                    "Nữ" +
                    ", Chuyên môn='" + Specialize + '\'' +
                    '}';
        } else {
            return "Chưa Nhập giới tính!";
        }
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.getName().compareTo(o.getName()) != 0) {
            return this.getName().compareTo(o.getName());
        }
        return this.getId().compareTo(o.getId());

    }

}
