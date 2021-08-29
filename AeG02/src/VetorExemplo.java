//Implementação Vetores e Matrizes - Grupo 1

import java.util.Scanner;
import java.util.Random;

public class VetorExemplo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 1 para o primeiro exemplo ou 2 para o segundo");

        int esc = scan.nextInt();

        switch (esc) {
            case 1:
                primeiroExemplo();
                break;
            case 2:
                segundoExemplo();
                break;
        }
    }


    
    public static void primeiroExemplo() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite quantos numeros aleatorios de 0 a 100 voce quer obter");
        int tamanho = scan.nextInt();
        
        int[] vetorInteiros = new int[tamanho];
        
        Random ale = new Random();
        
        System.out.println("Foram estes os numeros gerados!\n");
        
        for (int i = 0; i < vetorInteiros.length; i++) {
            vetorInteiros[i] = ale.nextInt(100);
            System.out.println(vetorInteiros[i]);
        }
        
        System.out.println("\nOs numero ordenados ficaram assim!\n");
        
        ordena(vetorInteiros);
        
        printa(vetorInteiros);
    }
    
    public static void segundoExemplo() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do array!");
        
        int tamanho = scan.nextInt();
        
        int[] vetorInteiros = new int[tamanho];
        
        load(vetorInteiros);
        
        int index;
        int value;
        
        while(true) {
            System.out.println("Digite o indice que você quer atribuir valor");
            
            scan = new Scanner(System.in);
            
            index = scan.nextInt();
            
            System.out.println("Digite o valor que quer atribuir (que não seja 0)");
            
            scan = new Scanner(System.in);
            
            value = scan.nextInt();
            
            System.out.println("");
            
            vetorInteiros[index] = value;
            
            printa(vetorInteiros);
        }
    }
    
    public static void load(int[] vetorInteiros) {
        for (int i = 0; i < vetorInteiros.length; i++) {
            vetorInteiros[i] = 0;
        }
    }
    
    public static void ordena(int[] vetorInteiros) {
        int swap = 0;
        for (int i = 0; i < vetorInteiros.length; i++) {
            for (int j = 0; j < vetorInteiros.length - i - 1; j++) {
                if (vetorInteiros[j] > vetorInteiros[j + 1]) {
                    swap = vetorInteiros[j];
                    vetorInteiros[j] = vetorInteiros[j + 1];
                    vetorInteiros[j + 1] = swap;
                }
            }
        }
    }
    
    public static void printa(int[] vetorInteiros) {
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println(vetorInteiros[i]);
        }
    }
}
