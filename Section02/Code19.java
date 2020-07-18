package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner inFile = new Scanner(new File("input.txt"));
        String[] name = new String[1000];
        String[] number = new String[1000];
        int count = 0;
        while (inFile.hasNext()) {
            name[count] = inFile.next();
            number[count] = inFile.next();
            count++;
        }
        inFile.close();

        for (int i = 0; i < count; i++)
            System.out.println("Name: " + name[i] + ", Phone: " + number[i]);
    }
}
