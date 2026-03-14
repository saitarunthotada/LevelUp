package Day1;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCheck {
    public static void duplicate(int[] a){
        int count = 0;
        for(int i=0;i<a.length;i++){
            for (int j = i+1;j< a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>2){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
    public static void duplicateCheckWithSet(int[] a){
        Set<Integer> set = new HashSet<>();
        for(int n : a){
            if(set.contains(n)){
                System.out.println(true);
                return;
            }
            set.add(n);
        }
        System.out.println(false);
    }
}
