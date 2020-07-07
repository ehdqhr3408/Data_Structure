/*
사용자로부터 n개의 정수를 입력받은 후 오름차순으로 정렬하여 출력하는 코드이다.
버블sort
 */
package Section02;

import java.util.Scanner;

public class Code18 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++)
            data[i] = kb.nextInt();
        kb.close();

        bubbleSort(n, data);

        System.out.println("Sorted data: ");
        for (int i = 0; i < n; i++)
            System.out.println(data[i]);
    }

    static void bubbleSort(int n, int[] data) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    /*따라서 이렇게 하면 정렬이 되지 않는다.
                    swap(data[j], data[j+1]);*/
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }
//이렇게 swap을 만들면 안에서 a, b 는 잘 바뀌나 그게 원래 데이터에는 영향을 주지 않는다. 값에 의한 호출
    /*static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }*/
}

