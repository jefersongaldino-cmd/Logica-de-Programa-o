import java.util.Scanner;
public class Exercicio09 {
public static void main(String[] args) {

Scanner banana = new Scanner(System.in);

String alunos[] = new String[3];
double matriz[][] = new double[3][2];
double somaLinha[] = new double[3];

for (int i = 0; i < 3; i++) {

System.out.println("Digite o nome do aluno: ");
alunos[i] = banana.next();

System.out.println("Digite a 1 nota: ");
matriz[i][0] = banana.nextDouble();

System.out.println("Digite a 2 nota: ");
matriz[i][1] = banana.nextDouble();

double soma = 0;

for (int j = 0; j < matriz[i].length; j++) {
soma += matriz[i][j];
}

somaLinha[i] = soma;
}

System.out.println("\nResultado:");

for (int i = 0; i < 3; i++) {

System.out.println("Aluno: " + alunos[i]);

System.out.println("Nota 1: " + matriz[i][0]);

System.out.println("Nota 2: " + matriz[i][1]);

System.out.println("Soma das notas: " + somaLinha[i]);

System.out.println("----------------");
}

banana.close();
}
}
