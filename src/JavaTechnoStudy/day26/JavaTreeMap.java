package JavaTechnoStudy.day26;

import java.util.HashMap;
import java.util.TreeMap;

public class JavaTreeMap {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        System.out.println("HashMap: " + hashMap);

        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);// copy from map above
        System.out.println("TreeMap: " + treeMap);

        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(3, "Three");
        treeMap1.put(4, "Four");
        treeMap1.put(1, "One");
        System.out.println("Tree Map1 : " + treeMap1);

    }
}