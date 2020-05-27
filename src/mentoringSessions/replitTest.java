package mentoringSessions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class replitTest {

    public static HashSet<String> removing(LinkedHashSet<String> linkedSet, String str1, String str2) {
        linkedSet = new LinkedHashSet<>(Arrays.asList("Germany", "France", "USA"));
        str1 = "Germany";
        str2 = "USA";
        LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add(str1);
        list.add(str2);
        linkedSet.removeAll(list);
        HashSet<String> hashSet = new HashSet<>(linkedSet);
        System.out.println(hashSet);
        return hashSet;
    }


    public static void main(String[] args) {
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>(Arrays.asList("Germany", "France", "USA"));
        String str1 = "Germany";
        String str2 = "USA";
        removing(linkedSet, str1, str2);
    }
}