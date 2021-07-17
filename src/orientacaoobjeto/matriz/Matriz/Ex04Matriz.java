package orientacaoobjeto.matriz.Matriz;

import java.util.Scanner;
/*
Fazer um programa para ler um número inteiro N e uma matriz quadrada de ordem N
contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade
de valores negativos da matriz.
Exemplo:
Entrada 			Saída
3				5 -3 10
				15 8 2
				7 9 -4
DIAGONAL PRINCIPAL:
5 8 -4
QUANTIDADE DE NEGATIVOS = 2
 */

public class Ex04Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();

            }
        }
        System.out.println("DIAGONAL PRINCIPAL: ");
        for (int i= 0; i<n; i++){
            System.out.print(matriz[i][i] + " ");

        }

        int contador = 0;
        for (int i = 0; i<n; i++){
            for (int j=0; j<n; j++){
                if (matriz[i][j]<0){
                    contador++;
                }
            }
        }
        System.out.printf("QUANTIDADE DE NEGATIVOS = %d%n", contador);

        scanner.close();
    }
}

