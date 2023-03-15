package ss10_collection_framework_1.excercise.ex2_mvc_form_mr_haitt.tempalte.model;

public class Person {
    private String id;
    private String name;
    private String birthday;
    private Boolean sex;

    public Person() {
    }

    public Person(String id, String name, String birthday, Boolean sex) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }


}
