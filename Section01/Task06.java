package Section01;/*
사용자로부터 하나의 양의 정수 n을 입력받는다. n보다 크거나 같으면서 가장 작은 2의 거듭제곱수를
찾아서 출력하는 프로그램을 작성하라. 예를들어 n=12이면 출력은 2의4승=16이다
*/

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = 2;
        int n = kb.nextInt();
        kb.close();
        while (true) {
            if (num <= n)
                num *= 2;
            else
                break;
        }
        System.out.println(num);
    }
}
