public class Day4_Task5 {
    public static void main(String[] args){
        int[] arr = {17, 28, 10, 73, 34};
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);
    }
}
