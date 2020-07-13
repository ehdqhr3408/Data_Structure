package Section01;/*
사용자로부터 n개의 정수를 입력받은 후 그 중 서로 다르면서 차이가 가장 작은 두 수를 찾아 출력하는
프로그램을 작성하라. 입력형식은 먼저 n의 값이 주어지고 이어서 n개의 정수들이 주어진다. 예를 들어
n=5이고 정수들이 8, 1, 6, 9, 6이라면 이 중 서로 다르면서 차이가 최소인 두 수는 8과 9이다.
*/

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int data[] = new int[n];
        for (int i = 0; i < n; i++)
            data[i] = kb.nextInt();
        kb.close();

        int a = 0, b = 0;
        int min = Math.abs(data[0] - data[1]);
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (data[j] != data[k] && Math.abs(data[j] - data[k]) < min) {
                    min = Math.abs(data[j] - data[k]);
                    a = j;
                    b = k;
                }
            }
        }
        System.out.println(a + " " + b);
    }
}
