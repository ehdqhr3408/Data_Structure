package Section01;

import java.util.Scanner;

public class Code02 {

    public static void main(String[] args){
        int number = 123;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int input = keyboard.nextInt();

        if(input==number){
            System.out.print("Numbers match! :-)");
        }
        else{
            System.out.print("Numbers do not match! :-(");
        }

        keyboard.close();
    }
}
