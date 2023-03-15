package ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.model;

public class Teacher extends Person{
    private String Specialize;

    public Teacher(String specialize) {
        Specialize = specialize;
    }

    public Teacher(String id, String name, String birthday, Boolean sex, String specialize) {
        super(id, name, birthday, sex);
        Specialize = specialize;
    }
    public Teacher(){}

    public String getSpecialize() {
        return Specialize;
    }

    public void setSpecialize(String specialize) {
        Specialize = specialize;
    }

    @Override
    public String toString() {
        if (getSex().equals(true)){
            return "Teacher{" +
                    " Mã Giáo Viên: "+
                    getId()+
                    ", Tên Giáo Viên: "+
                    getName()+
                    ", Ngày tháng năm sinh: "+
                    getBirthday()+
                    ", Giới tính: "+
                    "Nam"+
                    ", Chuyên Môn='" + Specialize + '\'' +
                    '}';
        }else if (getSex().equals(false)){
            return "Teacher{" +
                    " Mã Giáo Viên: "+
                    getId()+
                    ", Tên Giáo Viên: "+
                    getName()+
                    ", Ngày tháng năm sinh: "+
                    getBirthday()+
                    ", Giới tính: "+
                    "Nữ"+
                    ", Chuyên môn='" + Specialize + '\'' +
                    '}';
        }
        else {
            return "Chưa Nhập giới tính!";
        }
    }
}
