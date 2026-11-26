import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Linhas -> funcionários (3) | Colunas -> dias (4)
        int[][] matriz = new int[3][4];

        // Leitura da matriz (3 linhas x 4 colunas)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int numColunas = matriz[0].length;
        int maiorTotalDia = 0;
        int diaMaisVendeu = 0;

        System.out.println();

        // Percorre coluna por coluna (cada coluna j é um dia)
        for (int j = 0; j < numColunas; j++) {
            int somaColuna = 0; // Zera a soma a cada novo dia

            // Percorre linha por linha dentro do dia j (cada linha i é um funcionário)
            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j];
            }

            System.out.println("Dia " + (j + 1) + ": " + somaColuna);

            if (somaColuna > maiorTotalDia) {
                maiorTotalDia = somaColuna;
                diaMaisVendeu = j + 1;
            }
        }

        System.out.println("Maior total: Dia " + diaMaisVendeu + " (" + maiorTotalDia + ")");

        sc.close();
    }
}

