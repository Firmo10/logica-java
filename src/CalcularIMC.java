import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class CalcularIMC {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // *** ENTRADA DE DADOS ***
        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        // *** PROCESSAMENTO ***
        double valorImc = peso / (altura * altura);


        if (valorImc < 18.5) {
            System.out.println("Magreza");
        } else if (valorImc >= 18.5 && valorImc <= 24.9) {
            System.out.println("Normal");
        } if (valorImc >= 24.9 && valorImc < 30) {
            System.out.println("Sobrepeso");
        }else if (valorImc > 30){
            System.out.println("Obesidade");

        }
    }
}
