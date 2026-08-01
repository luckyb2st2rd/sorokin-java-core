package core.basics;

import java.util.Arrays;
import java.util.Random;

public class ArraysSorokin {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        arr[3] = 67;
        System.out.print(Arrays.toString(arr));
    }
}
