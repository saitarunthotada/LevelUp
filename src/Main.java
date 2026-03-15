import Day1.DuplicateCheck;
import Day1.Sum;
import Day2.Anagram;
import Day2.IntersectionOfArrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,4,5,3,6,6,7};
        int[] numbers2 = {1,2,3,4,5,2,2};;
        int target = 5;
        String word1 = "listen";
        String word2 = "silent";
        Sum.sum(numbers1,target);
        Sum.sumWithHash(numbers1, target);
        DuplicateCheck.duplicate(numbers2);
        DuplicateCheck.duplicateCheckWithSet(numbers2);
        Anagram.anagramCheck(word1, word2);
        IntersectionOfArrays.intersection(numbers1, numbers2);
    }
}