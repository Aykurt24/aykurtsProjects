package JavaTechnoStudy.day44.tasks.task1;

public class SchoolManagement {

    public static void main(String[] args) {
        School technoStudy = new School("TS", 1000);
        School art = new School("Art Lyceum", 50);

        //not the best way to assign school
        art.registerStudent(new Student("Samil", "OH 134", technoStudy, 5000));
        art.registerStudent(new Student("Yusuf", "Hazel 596", art, 4000));

        //better way to assign school
        art.registerEmployee(new Employee("Fetih", "High st 59", 90_000));
        art.registerEmployee(new Employee("Katya", "Mountain st 59", 100_000));


        System.out.println(art);


    }
}