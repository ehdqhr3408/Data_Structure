package Section01;/*
사용자로부터 n개의 정수를 받아서 그 중 최대값에서 최소값을 뺀 값을 계산해
출력하는 프로그램을 작성하라. 입력형식은 3번과 동일하다.
*/

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int data [] = new int [n];

        for(int i=0;i<n;i++)
            data[i] = kb.nextInt();
    }
}
