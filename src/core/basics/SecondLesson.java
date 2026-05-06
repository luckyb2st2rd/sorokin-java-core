package core.basics;

import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        int del = a / b;
        boolean biggest = a > b;
        boolean trust = (a + b) * 2 > a + b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(del);
        System.out.println(biggest);
        System.out.println(trust);
    }
}
