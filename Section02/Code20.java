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
            System.exit(1);
        }

        bubbleSort();

        for (int i = 0; i < n; i++)
            System.out.println(name[i] + ": " + number[i]);
    }

    static void bubbleSort() {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //compareTo 사용법 알아보기
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
