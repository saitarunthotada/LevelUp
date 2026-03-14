import Day1.DuplicateCheck;
import Day1.Sum;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,4,5};
        int[] numbers2 = {1,2,3,4,5,2,2};;
        int target = 5;

        Sum.sum(numbers1,target);
        Sum.sumWithHash(numbers1, target);
        DuplicateCheck.duplicate(numbers2);
        DuplicateCheck.duplicateCheckWithSet(numbers2);
    }
}