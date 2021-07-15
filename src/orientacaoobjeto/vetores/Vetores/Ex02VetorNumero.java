package orientacaoobjeto.vetores.Vetores;

import java.util.Scanner;

/*
  Faça um programa que leia N números inteiros e armazene-os
  em um vetor. Em seguida, mostrar na tela todos os números
  negativos lidos.
  Exemplo:

        Entrada             | Saida
        6                   |  -2
        8 -2 9 10 -3 -7     | -3
                            | -7
 */
public class Ex02VetorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho para o vetor");
        int tamanho = scanner.nextInt();

        if (tamanho > 0) {
            int[] numeros = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                numeros[i] = scanner.nextInt();
            }
            for (int i = 0; i < tamanho; i++) {
                if (numeros[i] < 0) {
                    System.out.println(numeros[i]);
                }
            }
        } else {
            System.out.println("O tamanho digitado precisa ser um valor positivo");
        }
        scanner.close();
    }
}
