package Section01;

public class Code07 {
    public static void main(String[] args) {

        int[] grades;

        // 알면 좋은 것!
        // 배열의 크기는 c언어의 경우 상수만 지원한다. 하지만 자바는 변수도 지원함.
        // ex) Scanner kb = new Scanner(System.in);
        // ex) int n = kb.nextInt();
        // ex) int [] array = new int [n];
        grades = new int[5];

        grades[0] = 100;
        grades[1] = 76;
        grades[2] = 92;
        grades[3] = 95;
        grades[4] = 14;

        int i = 0;

        while (i < grades.length) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
            i++;
        }

    }
}
