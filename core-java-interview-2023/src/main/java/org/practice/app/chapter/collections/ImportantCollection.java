package org.practice.app.chapter.collections;


import java.util.*;

public class ImportantCollection {
    public static void main(String[] args) {
        System.out.println("\nnameList collection(ArrayList) : ");
        //creating a name list
        Collection<String> c1 = new ArrayList<>();
        c1.add("Vinod");
        c1.add("Chintu");
        c1.add("Amisha");
        c1.add("Jagjit");
        c1.add("Amisha");
        System.out.println(c1);

        //Searching a food item's price
        System.out.println("\nfoods collection(HashMap) : ");
        Map<String, Integer> foods = new HashMap<>();
        foods.put("Chapati", 99);
        foods.put("Burger", 60);
        foods.put("Juice", 90);
        System.out.println(foods);
        System.out.println("\nChapati price : "+foods.get("Chapati"));

        //converting...collection to list
        System.out.println("\n====== Sorted Name List ======");
        List sortedNameList = new ArrayList(c1);
        Collections.sort(sortedNameList);
        System.out.println(sortedNameList);

        Collections.sort(sortedNameList, Collections.reverseOrder());

    }
}
