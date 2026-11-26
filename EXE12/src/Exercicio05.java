import java.util.Scanner;
public class Exercicio05 {
public static void main(String[] args) {

Scanner banana = new Scanner(System.in);

String[] nomes = new String[6];

for (int i = 0; i < 6; i++) {
System.out.print("Digite o " + (i + 1) + "º nome: ");
nomes[i] = banana.nextLine();
}

System.out.print("\nDigite o nome que deseja buscar: ");
String busca = banana.nextLine();

boolean encontrado = false;

for (int i = 0; i < 6; i++) {
if (nomes[i].equalsIgnoreCase(busca)) {
System.out.println("Nome encontrado na posição: " + i);
encontrado = true;
}
}

if (!encontrado) {
System.out.println("Nome não encontrado!");
}

banana.close();
}
}

