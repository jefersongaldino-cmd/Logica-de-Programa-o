import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) throws Exception {
        
        Scanner lerNotas = new Scanner(System.in);        
        int[] notas = new int[5];

        System.out.println("Digite 5 notas: ");

        for(int i = 0; i < notas.length; i++){
            notas[i] = lerNotas.nextInt();  
        }

        PassouNaoPassouMedia(lerNotas, notas);

        for(int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }

        lerNotas.close();
    }

    public static void PassouNaoPassouMedia(Scanner lerNotas, int[] notas) {
        int aprovados = 0;
        int reprovados = 0;
        int soma = 0;

        for(int i = 0; i < notas.length; i++){
            if(notas[i] < 7){
                reprovados++;
            }
            else
            {
                aprovados++;
            }
        }

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        int media = soma / notas.length;

        System.out.println("Media: " + media);
        System.out.println("Aprovados: " + aprovados + "\nReprovados: " + reprovados);   
    }
}



