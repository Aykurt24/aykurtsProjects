package JavaTechnoStudy.day42.Tasks.Task2;

import java.util.List;

public class School {

    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private int numberOfStaff;
    private List<Student> studentList;
    private int studentCapacity;


    public School(String name, String address, String phoneNumber, String email, int numberOfStaff, List<Student> studentList, int studentCapacity) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.numberOfStaff = numberOfStaff;
        this.studentList = studentList;
        this.studentCapacity = studentCapacity;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public void registration(Student student) {
        if (studentList.size() < getStudentCapacity()) {
            studentList.add(student);
        } else throw new RuntimeException("You exceed student limit, cant register more student");

    }


    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", numberOfStaff=" + numberOfStaff +
                ", studentList=" + studentList +
                ", studentCapacity=" + studentCapacity +
                '}';
    }
}
