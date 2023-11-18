package org.practice.app.chapter.dsa.arrays;

import java.util.*;

/*
*
* "Compare Triplets" is a common coding problem that often appears in programming competitions and interviews.
* It involves comparing two sets of three integer values and determining a score based on the comparison.
* Typically, it is used to compare the performance or attributes of two individuals or teams in a competition or contest.
*
* Problem Description:
* Alice and Bob each created a list of three integers representing their scores in three different categories.
* You need to compare these scores and determine the winner based on the
*
* */
public class CompareTriplets {
    public static void main(String[] args) {
        System.out.println("rates  : "+compareTriplets(Arrays.asList(5,6,7), Arrays.asList(3,7,10)));
    }

    public static List<Integer> compareTriplets(List<Integer> teamA, List<Integer> teamB) {
        List<Integer> scoreList = new ArrayList<>();
         // set I - teamAScore[0] - fast run , teamAScore[1] - high jump , teamAScore[2] - swimming
        //set II - teamBScore[0] , teamBScore[1] , teamBScore[2]
        if (teamA.isEmpty() || teamB.isEmpty()) {
            return Collections.emptyList();
        }
        for (int i = 0; i < 3; i++) {
            if (teamA.get(i) > teamB.get(i)) {
                //Point receives teamA
                scoreList.add(1);
            }
            else if (teamA.get(i) < teamB.get(i)) {
                //Point receives teamB
                scoreList.add(1);
            }
        }
        return scoreList;
    }

}
