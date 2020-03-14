package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        HashSet<String> names = new HashSet<>();
        names.add("Ayrat");
        names.add("Kolya");
        names.add("Marina");
        names.add("Marina");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String[] myArray = {};
        myArray = names.toArray(new String[names.size()]);

        Map<String,String> countries = new HashMap<>();
        countries.put("first","Russia");
        countries.put("third","USA");
        countries.put("second","Germany");
        countries.put("five","Finland");


        countries.get("five");

        Iterator<Map.Entry<String,String>> iterator1 = countries.entrySet().iterator();

        while(iterator1.hasNext()) {
            Map.Entry<String,String> pair = iterator1.next();
            String k = pair.getKey();
            String v = pair.getValue();
            System.out.println(k + " => " + v);
        }

        System.out.println(countries.containsKey("five"));
        System.out.println(countries.containsValue("USA"));

        Set<String> keys = countries.keySet();
        System.out.println(keys);

        ArrayList<String> values = new ArrayList<>(countries.values());
        System.out.println(values);


        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(13423,"Ayrat");
        map1.put(44564,"Marina");

        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(17423,"Kolya");
        map2.put(32322,"Jonny");
        map2.put(23255,"Alex");

        map1.putAll(map2);
        System.out.println(map1);







    }
}
