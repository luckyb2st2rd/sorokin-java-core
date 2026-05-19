package core.basics;

import java.util.StringJoiner;

public class FifthLesson {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(" ", "[", "]");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
            sj.add(String.valueOf(numbers[i]));
        }
        System.out.println(sj);

        StringJoiner sj1 = new StringJoiner(" ", "[", "]");
        numbers[0] = 1;
        for (int i = 0; i < numbers.length; i++) {
            sj1.add(String.valueOf(numbers[i]));
        }
        System.out.println("Массив после замены первого элемента: " + sj1);
    }
}
