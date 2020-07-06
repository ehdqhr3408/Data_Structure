package Section01;

import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("push array length : ");
        int n = kb.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("push data [" + (i + 1) + "] : ");
            data[i] = kb.nextInt();
        }
        kb.close();
        int count = 0;
        /* 틀린 조건문 (1)
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (data[i] == data[j])
                    count++;
            }
        }
        => count가 0,0 1,1 이런식으로 세서 입력값이 1, 2, 3 이여도 3개가 카운트 된다.
        */

        /* 틀린 조건문 (2)
        1번 조건을 보완하여 if문에 i != j 조건을 달아주었다.
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && data[i] == data[j])
                    count++;
            }
        }
        => count가 0,0 1,1 이런식으로 세서 입력값이 1, 2, 3 이여도 3개가 카운트 된다.
        => 위의 문제는 해결되나, i,j j,i 이런식으로 중복계산이 되어 1쌍을 2번 카운트 한다.
        */
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[i] == data[j])
                    count++;
            }
        }
        System.out.println(count);
    }
}
