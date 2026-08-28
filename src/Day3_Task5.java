import java.util.Arrays;

public class Day3_Task5 {
    public static void main(String[] args){
        int[] arr = {14, 65, 26, 52, 39};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arrCopy.length - 1; i++) {
        for (int j = i + 1; j < arrCopy.length; j++) {
            if (arrCopy[i] > arrCopy[j]) {
                int temp = arrCopy[i];
                arrCopy[i] = arrCopy[j];
                arrCopy[j] = temp;
            }
        }
    }
        System.out.println("Sorted array in ascending order: ");
        for (int num : arrCopy) {
        System.out.print(num + " ");
    }
}
}

