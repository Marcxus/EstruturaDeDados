import java.io.IOException;
import java.util.Scanner;

/*
Um treinador de voleibol gostaria de manter estatísticas sobre sua equipe. A cada jogo,
seu auxiliar anota quantas tentativas de saques, bloqueios e ataques cada um de seus jogadores fez,
bem como quantos desses saques, bloqueios e ataques tiveram sucesso (resultaram em pontos).
Seu programa deve mostrar qual o percentual de saques, bloqueios e ataques do time todos tiveram sucesso.

Entrada
A entrada é dada pelo número de jogadores N (1 ≤ N ≤ 100), seguido pelo nome de cada um dos jogadores.
Abaixo do nome de cada jogador, seguem duas linhas com três inteiros cada.
Na primeira linha S, B e A (0 ≤ S,B,A ≤ 10000) representam a quantidade de tentativas de saques,
bloqueios e ataques e na segunda linha, S1, B1 e A1 (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) com o número de saques,
bloqueios e ataques deste jogador que tiveram sucesso.

Saída
A saída deve conter o percentual total de saques, bloqueios e ataques do time todos que resultaram em pontos,
conforme mostrado no exemplo.
 */

public class Voleibol {

    public static void main(String[] args) throws IOException {

        double saqueUM, saqueDois, saqueTres, ataqueUm, ataqueDois, ataqueTres, bloqueioUm, bloqueioDois, bloqueioTres;
        int i;
        String nomeJogadores = "";

        Scanner entrada = new Scanner(System.in);

        int n = Integer.parseInt(entrada.next());

        saqueUM=0.0; ataqueUm=0.0; bloqueioTres=0.0; saqueDois=0; bloqueioUm=0; ataqueDois=0; saqueTres=0; bloqueioDois=0; ataqueTres=0;

        for (i=0 ; i<n ; i++){

            nomeJogadores = entrada.next();
            saqueDois += entrada.nextDouble();
            bloqueioUm += entrada.nextDouble();
            ataqueDois += entrada.nextDouble();
            saqueTres += entrada.nextDouble();
            bloqueioDois += entrada.nextDouble();
            ataqueTres += entrada.nextDouble();

        }

        saqueUM = saqueTres * 100.00 / saqueDois;
        bloqueioTres = bloqueioDois * 100.00 / bloqueioUm;
        ataqueUm = ataqueTres * 100.00 / ataqueDois;

        System.out.printf("Pontos de Saque: %.2f %%.\n",saqueUM);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n",bloqueioTres);
        System.out.printf("Pontos de Ataque: %.2f %%.\n",ataqueUm);

    }
}
