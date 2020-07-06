/*
함수 사용하는 문제
 */
package Section02;

import java.util.Scanner;

public class Code16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter two integers and press Enter.");

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        int result = power(a, b);
        System.out.println("The result is " + result);
        keyboard.close();
    }
//public 과 static는 무슨 역할일까?
    public static int power(int n, int m) {
        int result = 1;
        for (int i = 0; i < m; i++)
            result *= n;
        return result;
    }
}
