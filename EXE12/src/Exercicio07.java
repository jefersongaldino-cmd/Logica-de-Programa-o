
import java.util.Scanner;

public class Exercicio07 {
public static void main(String[] args) {

Scanner banana = new Scanner(System.in);

int[] numeros = new int[10];
int[] novoVetor = new int[10];
int quantidade = 0;

for (int i = 0; i < 10; i++) {
System.out.print("Digite um número: ");
numeros[i] = banana.nextInt();

boolean repetido = false;

for (int j = 0; j < quantidade; j++) {
if (numeros[i] == novoVetor[j]) {
    repetido = true;
break;
}
}

if (!repetido) {
novoVetor[quantidade] = numeros[i];
quantidade++;
}
}

System.out.println("\nVetor original:");
for (int i = 0; i < 10; i++) {
System.out.print(numeros[i] + " ");
}

System.out.println("\nVetor sem repetidos:");
for (int i = 0; i < quantidade; i++) {
System.out.print(novoVetor[i] + " ");
}

System.out.println("\nValores removidos: " + (10 - quantidade));

banana.close();
}
}
