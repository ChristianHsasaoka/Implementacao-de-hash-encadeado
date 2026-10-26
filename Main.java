import java.util.Random;

public class Main {
    // Cada No guarda um numero e o endereco do proximo No.
    static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    public static void main(String[] args) {
        No[] matriz = new No[100];
        int[] tamanhos = new int[100];
        int[] ultimosTres = new int[3];
        Random random = new Random(1090);
        int quantidadeColisoes = 0;

        // Insere 1000 numeros entre 0 e 100000 (inclusive).
        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(100001);
            int posicao = numero % 100;

            if (matriz[posicao] == null) {
                matriz[posicao] = new No(numero);
            } else {
                // Colisao: adiciona o novo No no FIM da lista.
                No atual = matriz[posicao];
                while (atual.proximo != null) {
                    atual = atual.proximo;
                }
                atual.proximo = new No(numero);

                // Guarda somente valores que entraram por colisao.
                ultimosTres[0] = ultimosTres[1];
                ultimosTres[1] = ultimosTres[2];
                ultimosTres[2] = numero;
                quantidadeColisoes++;
            }

            tamanhos[posicao]++;
        }

        int quantidadeListas = 0;
        int posicoesVazias = 0;
        int maiorPosicao = 0;

        for (int i = 0; i < 100; i++) {
            if (tamanhos[i] == 0) {
                posicoesVazias++;
            }
            if (tamanhos[i] >= 2) {
                quantidadeListas++;
            }
            if (tamanhos[i] > tamanhos[maiorPosicao]) {
                maiorPosicao = i;
            }
        }

        System.out.println("TABELA HASH - ENCADEAMENTO");
        System.out.println("Listas criadas por colisao: " + quantidadeListas);
        System.out.println("Posicoes vazias: " + posicoesVazias);
        System.out.println("Total de colisoes: " + quantidadeColisoes);
        System.out.println("Maior lista: posicao " + maiorPosicao
                + ", com " + tamanhos[maiorPosicao] + " elementos");
        System.out.print("Valores da maior lista: ");

        No atual = matriz[maiorPosicao];
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }

        System.out.println();
        System.out.println("Ultimos 3 valores inseridos por colisao: "
                + ultimosTres[0] + ", " + ultimosTres[1] + ", " + ultimosTres[2]);
    }
}
