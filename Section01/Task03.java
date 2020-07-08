package Section01;/*
사용자로부터 n개의 정수를 받아서 그 중 모든 짝수를 더한 값에서 모든 홀수를 뺀 값을 계산해
출력하는 프로그램을 작성하라. 입력 형식은 먼저 n개의 값이 주어지고 이어서 n개의 정수들이 주어진다.
예를 들어 n=5이고 입력 정수들이 8, 1, 6, 9, 12라면 답은 26-10=16이다.
*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int data [] = new int [n];
        int sum = 0;
        for(int i = 0; i<n;i++) {
            data[i] = kb.nextInt();
            if(data[i]%2==0)
                sum+=data[i];
            else
                sum-=data[i];
        }
        kb.close();
        System.out.println(sum);
    }
}
