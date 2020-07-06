/*
함수를 사용해서 소수판단하기
 */
package Section02;

public class Code17 {
    public static void main(String[] args){
        for(int i = 2;i<=100000;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
    public static boolean isPrime(int k){
        //k<2조건을 안달면 1도 소수로 출력된다
        if(k<2)
            return false;
        for(int i=2;i*i<=k;i++)
            if(k%i==0)
                return false;
        return true;
    }
}
