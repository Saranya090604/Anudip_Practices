public class Day3_Task2 {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 20};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest Element = " + max);
    }
}
