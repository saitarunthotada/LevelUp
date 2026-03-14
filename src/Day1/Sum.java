package Day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sum {
    public static void sum(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println(Arrays.toString(new int[]{i, j}));
                    return;
                }
            }
        }
    }
    public static void sumWithHash(int[] a, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int findOfSum = target - a[i];
            Integer index = map.get(findOfSum);
            if(index!=null){
                System.out.println(Arrays.toString(new int[]{index, i}));
                return;
            }
            map.put(a[i],i);
        }
        System.out.println(Arrays.toString(new int[]{}));
    }
}
