import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[]args) {
     int[] numeros= new int[10];
      Scanner ler = new Scanner(System.in); 
      int soma = 0;
      int par = 0;
      int impar = 0;
        
        for (int i = 0; i <numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
              numeros[i] = ler.nextInt();}

        for (int i = 0; i < numeros.length; i++) {
            
        
             if (numeros[i]%2 == 0) {
                par++;
               
            } else {
               impar++;
            }
            soma+=numeros[i];
         }

         System.out.println("Par: "+par);
          System.out.println("Impar: "+impar);
          System.out.println("Soma: "+soma);
            ler.close();
        
    }
}


