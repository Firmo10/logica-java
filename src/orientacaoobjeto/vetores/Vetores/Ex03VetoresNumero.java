package orientacaoobjeto.vetores.Vetores;

import java.util.Locale;
import java.util.Scanner;
/*

        Faça um programa que leia N números reais e armazene-os em um vetor.
        Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor

        Entrada             |       Saída
        4                           8.0 4.0 10.0 14.0
        8.0 4.0 10.0 14.0           36.00
                                    9.00
         */

public class Ex03VetoresNumero {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho para o vetor");
        int tamanho = scanner.nextInt();
        double[] numeros = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = scanner.nextDouble();
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println();

        double soma = 0.0;
        for (int i = 0; i< tamanho; i++){
            soma = soma+numeros[i];
        }
        System.out.printf("%.2f%n", soma);
        System.out.println();

        double media = soma/tamanho;
        System.out.printf("%.2f%n",media);
        }
    }

