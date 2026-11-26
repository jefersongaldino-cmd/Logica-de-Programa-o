import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        int[] d = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva 5 números do vetor A: ");
        for(int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Escreva 5 números do vetor B: ");
        for(int i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++) {
            c[i] = a[i] + b[i];
            d[2 * i] = a[i];
            d[2 * i + 1] = b[i];
        }

        // print dos 4 vetores: 
        System.out.println("Vetor a: ");
        for(int i = 0; i < 5; i++) {
            System.err.print(a[i] + " ");
        }

        System.out.println("\nVetor b: ");
        for(int i = 0; i < 5; i++) {
            System.err.print(b[i] + " ");
        }

        System.out.println("\nVetor c: ");
        for(int i = 0; i < 5; i++) {
            System.err.print(c[i] + " ");
        }

        System.out.println("\nVetor d: ");
        for(int i = 0; i < 10; i++) {
            System.err.print(d[i] + " ");
        }

        sc.close();
    }
}