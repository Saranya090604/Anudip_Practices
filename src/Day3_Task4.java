import java.util.LinkedHashSet;
import java.util.Set;
public class Day3_Task4 {
    public static void main(String[] args) {
        int[] arr = {25, 55,75, 80, 45,};
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        System.out.println("Array after removing duplicates = " + uniqueSet);
    }
}
