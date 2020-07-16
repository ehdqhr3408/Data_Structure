package Section01;/*
사용자로부터 n개의 정수를 입력받아 배열에 저장한 후 짝수 인덱스에 저장된 수는 그대로 두고
홀수 인덱스에 저장된 수들은 오름차순으로 정렬하여 출력하는 프로그램을 작성하라.
예를 들어 입력된 정수들이 1 7 4 12 5 10 9 7이라면 출력은 1 7 4 7 5 10 9 12이다.
*/

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++)
            data[i] = kb.nextInt();

        kb.close();

        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j < i; j += 2) {
                if (data[j] > data[j + 2]) {
                    int temp = data[j];
                    data[j] = data[j + 2];
                    data[j + 2] = temp;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(data[k] + " ");
        }
    }
}
