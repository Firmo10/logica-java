package orientacaoobjeto.matriz.Matriz;

import java.util.Scanner;

/*
Fazer um programa para ler dois números inteiros positivos M e N, depois ler uma
matriz de M linhas e N colunas contendo números inteiros. Em seguida, mostrar na
tela a matriz lida conforme exemplo.

Entrada             |       Saída
2 3                         6 3 10
6 3 10                      8 12 5
8 12 5
 */
public class Ex01Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt(); // mesma coisa que i = linha
        int n = scanner.nextInt(); // mesma coisa que j = coluna

        int[][] matriz= new int[m][n];

        // entrada de valores
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();

            }
        }

        // impressao de valores
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }

        scanner.close();
    }
}
