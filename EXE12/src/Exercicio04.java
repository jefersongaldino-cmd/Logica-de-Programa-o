import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // correlacionar índice com os dias da semana
        String[] diasSemana = {"Domingo", "Segunda", "Terça", 
                               "Quarta", "Quinta", "Sexta", "Sábado"};

        float[] semanaTemp = new float[7];

        System.out.println("Digite a temperatura de cada dia da semana: ");
        for(int i = 0; i < semanaTemp.length; i++) {
            System.out.printf(diasSemana[i] + ": ");
            semanaTemp[i] = sc.nextFloat();    
        }

        float media = calcularMediaTemp(semanaTemp);
        int indiceMaior = maiorTemp(semanaTemp);

        System.out.printf("%nEntrada: ");
        for(int i = 0; i < semanaTemp.length; i++){
            System.out.printf("%.1f ", semanaTemp[i]);
        }
        System.out.printf("%n%nMédia da semana: %.1f °C%n", media);
        System.out.println("Dias acima da média:");
        diasAcimaMedia(diasSemana, semanaTemp, media);
        System.out.printf("Dia mais quente: %s (%.1f °C)%n", diasSemana[indiceMaior], semanaTemp[indiceMaior]);
        
        sc.close();
    } 

    public static float calcularMediaTemp(float[] semanaTemp) {
        float soma = 0;

        for(int i = 0; i < semanaTemp.length; i++){
           soma += semanaTemp[i];
        }

        // ao invés de criar a variavel "media" aqui, vou retornar um valor
        return (float) soma / semanaTemp.length;
    }

    public static void diasAcimaMedia (String[] diasSemana, float[] semanaTemp, float media) {
        for(int i = 0; i < semanaTemp.length; i++){
            if(media < semanaTemp[i]) {
                System.out.printf("  %s (%.1f °C)%n", diasSemana[i], semanaTemp[i]);
            }
        }
    }

    public static int maiorTemp (float[] semanaTemp) {
        int indiceMaior = 0;

        for(int i = 1; i < semanaTemp.length; i++){
            if(semanaTemp[i] > semanaTemp[indiceMaior]) {
                indiceMaior = i;
            }
        }
        return indiceMaior;
    }
}


