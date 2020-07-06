package Section01;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args){
        String str = "Hello";
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please type a string: ");
        //.next() 는 str = Hello World 여도 공백 앞자리 까지만 인식해서 Hello 만 받아들인다.
        input = keyboard.next();
        //문자열은 str == input 으로 비교할 수 없다.
        if(str.equals(input)){
            System.out.println("strings match! :-)");
        }
        else{
            System.out.println("strings do not match! :-(");
        }
        keyboard.close();

    }
}
