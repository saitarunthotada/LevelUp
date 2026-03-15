package Day2;

import java.util.ArrayList;
import java.util.HashSet;


//Iterate through arr1 (length n) and through arr2 (length m) and add, contains, remove on average O(1)
//In the worst case, Storing every element of the first array in the HashSet.
//finding Common elements in both the arrays
public class IntersectionOfArrays {
    public static void intersection(int[] arr1, int[] arr2) {

        if (arr1.length > arr2.length) {
            intersection(arr2, arr1); // Swap to save space
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int value : arr1) {
            set.add(value);
        }

        for (int value : arr2) {
            if (set.contains(value)) {
                list.add(value);
                set.remove(value);
            }
        }
        System.out.println(list);
    }
}
