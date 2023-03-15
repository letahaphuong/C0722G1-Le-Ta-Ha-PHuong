package ss10_collection_framework_1.excercise.ex1_arraylist;

public class MyArrayListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Student s1 = new Student(1, "sang");
        Student s2 = new Student(2, "dat");
        Student s3 = new Student(3, "tan");
        Student s4 = new Student(4, "phuong");
        Student s5 = new Student(5, "quyen");
        Student s6 = new Student(5, "quyen");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();


        studentMyArrayList.add(s1);
        studentMyArrayList.add(s2);
        studentMyArrayList.add(s3);
        studentMyArrayList.add(s4);
        studentMyArrayList.add(s5, 2);
        studentMyArrayList.size();
        studentMyArrayList.remove(2);
//        System.out.println(studentMyArrayList.get(4).getName());
//        System.out.println(studentMyArrayList.size());
//        for (int i = 0; i < studentMyArrayList.size(); i++) {
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
//        System.out.println(studentMyArrayList.indexOf(s2));
//        System.out.println(studentMyArrayList.contains(s6));
        newMyArrayList = studentMyArrayList.clone();
        newMyArrayList.remove(3);

        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
    }
}
