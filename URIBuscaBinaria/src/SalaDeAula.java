import java.util.Scanner;

public class SalaDeAula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        if (N >= 86) {

            System.out.print("A\n");
        } else if (N >= 61 && N <= 85) {
            System.out.print("B\n");
        } else if (N >= 36 && N <= 60) {
            System.out.print("C\n");
        } else if (N >= 1 && N <= 35) {
            System.out.print("D\n");
        } else {
            System.out.print("E\n");
        }
    }
}
