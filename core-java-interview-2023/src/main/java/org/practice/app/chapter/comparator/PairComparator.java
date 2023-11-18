package org.practice.app.chapter.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PairComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair p1, Pair p2) {
        // Implement your custom comparison logic here
        // Return a negative value if o1 should come before o2
        // Return a positive value if o1 should come after o2
        // Return 0 if they are considered equal
//        if second attribute of two object is same then order them in decreasing value of first attribute.
        if(p2.getSecond()!=p1.getSecond()){
            return p2.getSecond() - p1.getSecond();
        }
        return p2.getFirst() - p1.getFirst();
    }

    public static void main(String[] args) {
        List<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair(10,20));
        pairs.add(new Pair(30,40));
        pairs.add(new Pair(50,20));
        System.out.println(pairs);
        Collections.sort(pairs, new PairComparator());
        System.out.println(pairs);
    }
}
