/*
1 ~ 100000 사이의 정수들 중 소수의 개수를 세어 출력하는 프로그램을 작성하라.
*/

public class Task01 {
    public static void main(String[] args) {

        int cnt = 0;
        for (int i = 2; i <= 100000; i++) {
            boolean isPrime = true;
//반복문 다시 짜봤는데도 안됨..
            for (int j = 2; i * i <= j && isPrime; j++) {
                if (i % j == 0)
                    isPrime = false;
            }
            if(isPrime) {
                cnt++;
            }
        }
        System.out.println("소수의 개수 : " + cnt);
    }
}
