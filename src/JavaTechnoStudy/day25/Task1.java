package JavaTechnoStudy.day25;

import java.util.HashMap;

public class Task1 {
    // Write a Java program to associate
    // the specified value with the specified key in a HashMap.

    public static void main(String[] args) {
        //      username, password
        HashMap<String, String> login = new HashMap<>();
        login.put("fetih", "123qweasd");
        login.put("dos", "645hjQWE%^*");
        login.put("technostudy", "2eG04M2oa20iL");

        HashMap<String, String> secondMap = copyMap(login); //  HashMap<String, String> secondMap = new HashMap(login);
        System.out.println("login: " + login);
        removeAll(login);
        System.out.println("login: " + login);
        printLogin(secondMap); //System.out.println("second:" + secondMap);
        getSize(secondMap); // int sizeOfMap = secondMap.keySet().size();
        removeAll(secondMap);

//        printLogin(login);
//        removeAll(login);
//        printLogin(login);
    }

    // create method that print you map
    private static void printLogin(HashMap<String, String> login) {
        System.out.println("Second Map: " + login);
    }

    // create method that return size of your map
    public static int getSize(HashMap<String, String> map) {
        map.keySet().size();// gives size of keys in map
        System.out.println("Size of Map " + map.keySet().size());
        return map.size();
    }

    // create method to remove all of the mappings/entries from a map
    public static void removeAll(HashMap<String, String> map) {
        // 1. way
        map.clear();// removes everything from map
        System.out.println(map);

        // 2. way
//        Set<String> keys = new HashSet<>(map.keySet());
//        for(String key : keys) {
//            map.remove(key);
//        }
    }

    // create method to copy all of the mappings
    // from the specified map to another map
    public static HashMap<String, String> copyMap(HashMap<String, String> map) {
        // 1. way
        HashMap<String, String> result = new HashMap<>(map);

        // 2. way
        // HashMap<String, String> result = new HashMap<>();
        // result.putAll(map);

        return result;
    }
}

