package Section01;

public class Code06 {
    public static void main(String[] args) {

        int[] grades;

        grades = new int[5]; // 원래 c 언어 같은 경우 #define Max 5

        grades[0] = 100;
        grades[1] = 76;
        grades[2] = 92;
        grades[3] = 95;
        grades[4] = 14;

        // 배열은 자신의 길이를 알고있어 length를 쓴다.
        // c언어 같은 경우 grades.length 대신 i < Max
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }

    }
}
