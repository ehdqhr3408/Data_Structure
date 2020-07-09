package Section01;/*
사용자로부터 하나의 양의 정수 n을 입력받는다. 그런 다음에 다음과 같이 n줄을 출력하는 프로그램을 작성하라.
ex) n=4일때
1
1 2
1 2 3
1 2 3 4
*/

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
