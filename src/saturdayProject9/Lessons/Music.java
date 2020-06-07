package saturdayProject9.Lessons;

import saturdayProject9.Student.StudentClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Music extends LessonClass {
    private ArrayList<String> topicList;

    public Music(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList = new ArrayList<>(Arrays.asList("Peacemaking Skills for Little Kids",
                "Learning Through Literature",
                "Creative Conflict Solving", "Creating Peace, Building Community",
                "WinWin!"));
        return topicList;
    }

}