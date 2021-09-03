import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Integer> list, pares, impares;
        int num;

        list = new ArrayList<>();
        pares = new ArrayList<>();
        impares = new ArrayList<>();
        num = entrada.nextInt();


        for (int i = 0; i < num; i = i + 1)
            list.add(entrada.nextInt());

        for (Integer x : list) {
            if (x % 2 == 0)
                pares.add(x);

            else

                impares.add(x);
        }

            Collections.sort(pares);
            Collections.sort(impares);
            Collections.reverse(impares);

            for (Integer a : pares)
                System.out.println(a);

            for (Integer b : impares)
                System.out.println(b);

            entrada.close();

        }
    }

