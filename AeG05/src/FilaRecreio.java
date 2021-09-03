import java.util.Scanner;

public class FilaRecreio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Ncasos = 0, Malunos = 0, c, d, k, aux, qtd = 0;
        int vAntes = 0, vDepois = 0;
        boolean trocas;


        Ncasos = sc.nextInt();

        for (c = 0; c < Ncasos; c++) {
            qtd = 0;
            Malunos = sc.nextInt();

            for (d = 0; d < Malunos; d++) {
                vAntes = sc.nextInt();
                vDepois = vAntes;
            }

        }

        do {
            trocas = false;
            k = 0;
            while (k < Malunos - 1) {
                if (vDepois < vDepois) {
                    aux = vDepois;
                    vDepois = vDepois;
                    vDepois = aux;

                    trocas = true;
                }
                k++;
            }
        } while (trocas == true);


        for (d = 0; d < Malunos; d++) {
            if (vAntes == vDepois)
                qtd++;

        }

        System.out.println(qtd);
    }
}

