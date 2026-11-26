
import java.util.Scanner;
public class Exercicio03 {public static void main(String[] args) {

Scanner banana = new Scanner(System.in);

double[] salarios = new double[5];

for (int i = 0; i < 5; i++) {
System.out.print("Digite o salário: " + (i + 1) + ": R$ ");
salarios[i] = banana.nextDouble();
}

for (int i = 0; i < 5; i++) {
if (salarios[i] < 2000) {
salarios[i] = salarios[i] * 1.10;
}
}
System.out.println("\nSalários atualizados:");

for (int i = 0; i < 5; i++) {
System.out.printf("Funcionário %d: R$ %.2f%n", (i + 1), salarios[i]);
}

banana.close();
}
}


