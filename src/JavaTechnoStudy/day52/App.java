package JavaTechnoStudy.day52;

public class App {

    public static void main(String[] args) {
        StringSet set1 = new SimpleStringSet();
        set1.add("s");
        set1.add("A");
        set1.add("3");
        //set1.add("s");
        System.out.println(set1);

        StringSet sortedSet1 = new SortedStringSet();
        sortedSet1.add("A");
        sortedSet1.add("Z");
        sortedSet1.add("C");
        //sortedSet1.add("Z");
        System.out.println(sortedSet1);

    }

}

