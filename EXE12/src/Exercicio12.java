import java.util.Scanner;
public class Exercicio12 {
public static void main(String[] args) {
    Scanner banana = new Scanner(System.in);
    int[][] numeros = new int[4][4];
    int soma01 = 0;
    int soma02 = 0;

    for (int i = 0; i < 4; i++) {
        for (int r = 0; r < 4; r++) {
            System.out.printf("Elemento [%d][%d]: ", i, r);
            numeros[i][r] = banana.nextInt();

            System.out.printf("%4d ", numeros[i][r]);

            if (i == r) {
                soma01 += numeros[i][r];
            }

            if (i + r == 3) {
                soma02 += numeros[i][r];
            }
        }
        System.out.println();
    }

    System.out.println("\nSoma da diagonal primario: " + soma01);
    System.out.println("Soma da diagonal secundario: " + soma02);

    banana.close();
}
}


