package core.basics;

import java.util.Arrays;
import java.util.Random;

public class ArraysSecond {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
