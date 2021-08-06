import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Main {

    public void process() throws NumberFormatException, IOException {

        Scanner entrada = new Scanner(System.in);

        int numeroFuncionarios = entrada.nextInt();
        int numeroClientes = entrada.nextInt();

        Queue<Funcionario> queue = new PriorityQueue<>();
        int[] tempoFuncionarios = new int[numeroFuncionarios];
        int[] numItensClientes = new int[numeroClientes];

        for (int i = 0; i < numeroFuncionarios; i++) {
            tempoFuncionarios[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeroFuncionarios; i++) {
            queue.add(new Funcionario(i, 0));
        }

        for (int i = 0; i < numeroClientes; i++) {
            numItensClientes[i] = entrada.nextInt();
        }

        for (int i = 0; i < numeroClientes; i++) {
            Funcionario f = queue.poll();
            int currId = f.id;
            int currTempo = f.tempo;
            int tempoDessaCompra = numItensClientes[i]*tempoFuncionarios[currId];
            queue.add(new Funcionario(currId, currTempo+tempoDessaCompra));
        }

        int maxTempo = -1;
        while (queue.size() > 0) {
            Funcionario f = queue.poll();
            maxTempo = Math.max(f.tempo, maxTempo);
        }

        System.out.println(maxTempo);

        return;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Main m = new Main();
        m.process();

        System.exit(0);
    }
}

class Funcionario implements Comparable<Funcionario> {
    int id;
    int tempo;

    public Funcionario(int id, int tempo) {
        this.id = id;
        this.tempo = tempo;
    }

    public int compareTo(Funcionario f) {
        if (this.tempo-f.tempo == 0) {
            return this.id-f.id;
        }
        return this.tempo-f.tempo;
    }
}
