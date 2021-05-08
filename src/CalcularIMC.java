import java.util.Locale;
import java.util.Scanner;

public class CalcularIMC {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

        // *** ENTRADA DE DADOS ***
        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        // *** PROCESSAMENTO ***
        double valorImc = peso / (altura * altura);

        // *** SAIDA DE DADOS ***

        System.out.printf("%.2f%n", valorImc);
    }
}
