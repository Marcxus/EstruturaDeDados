import java.util.Scanner;

import static java.lang.Math.abs;

public class oMaior {

        public static void main(String[] args) {

            int K, L, M;

            Scanner sc = new Scanner(System.in);


            System.out.println("informe o primeiro numero");
            K = sc.nextInt();
            System.out.println("informe o segundo numero");
            L = sc.nextInt();
            System.out.println("informe o terceiro numero");
            M = sc.nextInt();

            int maiorKL = (K+L+Math.abs(K-L))/2;
            int maiorLM = (maiorKL + M + Math.abs(maiorKL - M)) / 2;

            System.out.println(maiorLM + " eh o maior");


        }

    }