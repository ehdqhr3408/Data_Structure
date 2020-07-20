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
        int[] data = new int[n];
        //배열과 정렬을 사용해서 해볼생각.
        for (int i = 0; i < n; i++) {
            int tmp = kb.nextInt();
            int j = i - 1;
            while (j >= 0 && data[j] > tmp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = tmp;
        }
        kb.close();
        int ch = data[1] - data[0];
        int min = data[0];
        int max = data[0];
        for (int i = 0; i < n - 1; i++) {
            if (data[i + 1] - data[i] <= ch && data[i + 1] - data[i] != 0) {
                ch = data[i + 1] - data[i];
                min = data[i];
                max = data[i + 1];
            }
        }
        System.out.print(min + ", " + max);
    }
}
