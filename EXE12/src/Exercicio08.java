import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.println("Digite os numeros da matriz: ["+i+"]["+j+"]:");
            matriz[i][j] = ler.nextInt();
        }
    }
    
    int maior= matriz[0][0] , menor = matriz [0][0];
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j]);
            if (matriz[i][j] > maior) maior = matriz[i][j];
               if (matriz[i][j] < menor) menor = matriz[i][j];
        }
        System.out.println();
    }
    System.out.println("Maior: " + maior + " | Menor: " + menor);

    ler.close();
    }
}

