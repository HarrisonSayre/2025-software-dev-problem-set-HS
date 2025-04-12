package org.example;

import java.util.HashMap;

public class Main {

    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Boolean> numList = new HashMap<Integer, Boolean>();

        for (int num: nums) {
            if(numList.containsKey(num)){
                return true;
            }
            numList.put(num, true);
        }
        return false;
    }

    public static void main(String[] args) {
        Main test = new Main();
        int[] testArray1 = {1,2,3};
        int[] testArray2 = {1,2,2,3};
        System.out.println(test.containsDuplicate(testArray1));
        System.out.println(test.containsDuplicate(testArray2));
    }
}