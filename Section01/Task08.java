package Section01;/*
사용자로부터 n개의 정수를 입력받아 크기순으로 정렬한 후 중복된 수를 제거하고 출력하는 프로그램을 작성하라.
입력 형식은 먼저 n의 값이 주어지고 이어서 n개의 정수들이 주어진다.
예를 들어 n=8이고 입력된 정수들이 4 7 4 12 4 10 9 7이었다면 출력은 4 7 9 10 12이다
*/

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];
        int [] fin = new int [n];
        //insert
        for (int i = 0; i < n; i++)
            data[i] = kb.nextInt();

        kb.close();
        //배열 정렬
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        //배열 출력, 중복값 제거(미완)
        for(int i = 0;i<n;i++){
            int temp = data[i];
            if(temp==data[i+1])
                continue;
            else
                fin[i]=data[temp];
        }
        for(int k = 0 ;k<n;k++){
            System.out.print(fin[k] + " ");
        }

    }
}
