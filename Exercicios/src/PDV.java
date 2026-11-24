
import java.util.Scanner;

public class PDV {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] nums = new int[10];

        lerDados(ler, nums);
        mostrarNumeros(nums);
        verifParImparSoma(nums);

        ler.close();
    }

public static void lerDados(Scanner ler, int[] nums) {
    
    System.out.println("Digite dez números inteiros: ");

    for(int i = 0; i < 10; i ++){
        nums[i] = ler.nextInt();
    }
}

public static void mostrarNumeros(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

public static void verifParImparSoma(int[] nums) {

    int pares = 0;
    int impares = 0;
    int soma = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]  == 0) 
            {
            // é zero, não faz nada
            }
            else if (nums[i] % 2 == 0)
            {
                pares++;           // resto 0 → par
            }
            else 
            {
                impares++;         // resto diferente de 0 → ímpar
            }
            soma += nums[i];       // acumula o valor na soma
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Soma: " + soma);
    }
}
