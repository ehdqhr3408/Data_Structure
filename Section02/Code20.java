package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {
    static String[] name;
    static String[] number;
    static int n = 0;

    public static void main(String[] args) {
        name = new String[1000];
        number = new String[1000];

        try {
            Scanner inFile = new Scanner(new File("input.txt"));
            while (inFile.hasNext()) {
                name[n] = inFile.next();
                number[n] = inFile.next();
                n++;
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No data file exitsts.");
            //return 을 해도 프로그램이 종료되나, 명시적으로 보이기 위해 exit사용하는 것 확실히 알기
            System.exit(1);
        }

        bubbleSort();

        for (int i = 0; i < n; i++)
            System.out.println(name[i] + ": " + number[i]);
    }

    static void bubbleSort() {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                // compareTo() 메소드는 A > B = 1 , A = B = 0 (A.equals(B)는 True, False 로 반환.), A < B = -1 반환함
                // notion 등록 완료
                if (name[j].compareTo(name[j + 1]) > 0) {
                    String tmp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tmp;

                    tmp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = tmp;
                }
            }
        }
    }
}
