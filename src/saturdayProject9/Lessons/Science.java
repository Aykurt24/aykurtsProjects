package saturdayProject9.Lessons;

import saturdayProject9.Student.StudentClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Science extends LessonClass {
    private ArrayList<String> topicList;

    public Science(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList = new ArrayList<>(Arrays.asList("Animal Habitats",
                "Ball Launcher Challenge",
                "Balloon Car", "Bending Plant Roots with Gravity",
                "Birthday Season Weather Report"));
        return topicList;
    }
// dogan
}