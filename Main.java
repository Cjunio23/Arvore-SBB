package Item;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        Item item, pesquisa;
        int num, opcao;
        int max = 10000;
        System.out.println("Ordenado (0)\n"
                + "Aleatorios (1)");
        opcao = ler.nextInt();

        if (opcao == 0) {
            for (int j = 0; j < 10; j++) {//cria 9 árvores, de 1000 até 9000
                ArvoreSBB arvore = new ArvoreSBB();
                for (int i = 0; i < max; i++) {
                    item = new Item(i);
                    arvore.insere(item);
                }
                System.out.printf("Elementos: %d ", max);
                max = max + 10000;
                pesquisa = new Item(100001);
                long tempo = System.nanoTime();
                arvore.pesquisa(pesquisa);
                long tempo2 = System.nanoTime();
                System.out.printf("Comparacoes: %d ", arvore.comparacoes);
                System.out.printf("Tempo: %d\n", (tempo2 - tempo));
                arvore.comparacoes = 0;
            }
        }
        if (opcao == 1) {
            for (int j = 0; j < 10; j++) {
                ArvoreSBB arvore = new ArvoreSBB();
                Random vitor = new Random();
                for (int i = 0; i < max; i++) {
                    item = new Item(vitor.nextInt());
                    arvore.insere(item);
                }
                System.out.printf("Elementos: %d ", max);
                max = max + 10000;
                pesquisa = new Item(200001);
                long tempo = System.nanoTime();
                arvore.pesquisa(pesquisa);
                long tempo2 = System.nanoTime();
                System.out.printf("Comparacoes: %d ", arvore.comparacoes);
                System.out.printf("Tempo: %d\n", (tempo2 - tempo));
                arvore.comparacoes = 0;
            }
        }
    }
}