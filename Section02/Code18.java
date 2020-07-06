/*
미리 쳐놓은 코드
 */
package Section02;

import java.util.Scanner;

public class Code18 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] data = new int [n];
        for(int i = 0;i<n;i++)
            data[i] = kb.nextInt();
        kb.close();
    }
}
