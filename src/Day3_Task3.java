public class Day3_Task3 {
    public static void main(String[] args){
        int[] arr = {10, 27, 30, 35, 20};
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even count = " + even + ", Odd count = " + odd);
    }
}
