/* 소수판별 프로그램 */

public class Code10 {
    public static void main(String[] args) {
        for (int n = 2; n <= 1000000; n++) {
            boolean isPrime = true;
            // 2, 3, ... n/2로 나누어보기 -> sqrt(n) => i * i  = n 으로 최적화 가능.
            for (int i = 2; i * i <= n && isPrime; i++) {
                if (n % i == 0)
                    isPrime = false;
            }
            if (isPrime)
                System.out.println(n);
        }
    }
}

