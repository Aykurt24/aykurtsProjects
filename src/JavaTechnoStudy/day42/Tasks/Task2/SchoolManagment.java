package JavaTechnoStudy.day42.Tasks.Task2;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagment {

    public static void main(String[] args) {


        School s1 = new School("Falcon", "413 Clifton st", "201 914 3023", "falcon@gmail.com", 45, getStudnets(), 5);
        School s2 = new School("Thecno", "314 Clifton st", "201 999 3023", "thecno@gmail.com", 35, getStudnets(), 10);
        School s3 = new School("Edep", "413 Falcon st", "201 890 3023", "edep@gmail.com", 25, getStudnets(), 34);


    }

    public static List<Student> getStudnets() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yakup", "Bulut"));
        students.add(new Student("Dogan", "Aykurt"));
        students.add(new Student("Ali", "Sakal"));
        return students;
    }


}
