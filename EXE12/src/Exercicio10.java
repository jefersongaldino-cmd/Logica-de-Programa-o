import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        // Leitura da matriz (3 linhas x 4 colunas)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Impressão da matriz formatada
        System.out.println("\nMatriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        int totalGeral = 0;
        int linhaMaior = 0;
        int colunaMaior = 0;

        // Total de cada funcionário, total geral e busca da maior venda
            // esse for anda linha por linha (cada funcionário)
        for (int i = 0; i < matriz.length; i++) {
            // zera o acumulador daquele funcionário específico antes de somar as 4 vendas dele
            int totalFunc = 0;

            // dentro da linha "i" anda coluna por coluna (cada venda)
            for (int j = 0; j < matriz[i].length; j++) {
                // soma a venda no total do funcionário atual
                totalFunc += matriz[i][j];

                // verifica se essa venda é maior que a maior já registrada, se for, guarda a posição (i e j).
                if (matriz[i][j] > matriz[linhaMaior][colunaMaior]) {
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }

            System.out.println("Funcionário " + (i + 1) + ": " + totalFunc);
            totalGeral += totalFunc;
        }

        System.out.println("Total geral: " + totalGeral);
        System.out.println("Maior venda: " + matriz[linhaMaior][colunaMaior]);

        sc.close();
    }
}


