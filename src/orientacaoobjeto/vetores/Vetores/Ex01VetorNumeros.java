package orientacaoobjeto.vetores.Vetores;

import java.util.Scanner;

/*
Fazer um programa para ler um numero inteiro positivo N,
depois ler N numeros quaisquer e armazenalos em um vetor.
Em seguida, mostrar na tela todos os elementos do vetor
 */

public class Ex01VetorNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho para o vetor");
        int tamanho = scanner.nextInt();


        if (tamanho>0){
            int[] numeros = new int[tamanho];
            for (int i = 0; i<tamanho; i++){
                numeros[i] = scanner.nextInt();

            }
            for (int i = 0; i<tamanho; i++) {
                System.out.println(numeros[i]);
            }

        }else{
            System.out.println("O tamanho digitado precisa ser um valor positivo");
        }




        scanner.close();
    }
}
