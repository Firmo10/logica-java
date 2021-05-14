/*
Leia quatro valores inteiros chamados A, B, C e D. Calcule e imprima a diferença dos produtos A e B pelo produto de C e D (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Resultado
Imprima DIFERENCA (DIFFERENCE em português) com todas as letras maiúsculas, conforme exemplo a seguir, com um espaço em branco antes e depois do sinal de igual.

Amostras de entrada	                    Amostras de saída
5                                       DIFERENCA = -26
6
7
8

0                                       DIFERENCA = -56
0
7
8

5                                       DIFERENCA = 86
6
-7
8
 */

import java.util.Scanner;
public class Ex1007 {
    public static void main(String[] args) {


    Scanner scanner =  new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int D = scanner.nextInt();

    int diferenca = (A * B - C * D);
        System.out.printf("DIFERENCA = %d", diferenca);
    scanner.close();
    }
}
