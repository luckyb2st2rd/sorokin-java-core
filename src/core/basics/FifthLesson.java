package core.basics;

import java.util.Arrays;

public class FifthLesson {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        System.out.println(Arrays.toString(numbers));

        numbers[0] = 1;
        System.out.println("Массив после замены элемента: " + Arrays.toString(numbers));
    }
}
