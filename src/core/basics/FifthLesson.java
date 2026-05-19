package core.basics;

public class FifthLesson {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        printArray(numbers);

        numbers[0] = 1;
        System.out.println("Массив после замены элемента");
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }
}
