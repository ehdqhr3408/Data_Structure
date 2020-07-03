/*
1 ~ 100000 사이의 정수들 중에 가장 작은 50개의 소수를 찾아 그 합을 구하여 출력하는
프로그램을 작성하라. 만약 소수의 개수가 50개 미만이라면 모든 소수의 합을 출력하라.
*/

public class Task02 {
    public static void main(String[] args){
        int [] prime = new int [50];
        for(int i = 1; i<=100000;i++){
            boolean isPrime = true;
            for(int j = 2; i*i<=j&&isPrime;j++){
                if(i%j==0)
                    isPrime = false;
                }
            //여기부터 50개집어넣고 출력시키는거 해야함.
            if(isPrime){
                for(int k = 0;k<50;k++){
                    prime[k] = i;
                }

            }
        }
    }
}
