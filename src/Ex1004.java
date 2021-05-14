/*
Leia dois valores inteiros. Em seguida, calcule o produto entre eles e armazene o resultado em uma variável chamada PROD.
Imprima o resultado como no exemplo abaixo. Não se esqueça de imprimir o final da linha após o resultado,
caso contrário, você receberá “Erro de apresentação” .

Entrada
O arquivo de entrada contém 2 números inteiros.

Resultado
Imprima a mensagem "PROD" e PROD de acordo com o exemplo a seguir, com um espaço em branco antes e depois do sinal de igual.

Amostras de entrada	                         Amostras de saída
3                                            PROD = 27
9

-30                                          PROD = -300
10

0                                            PROD = 0
9

 */
import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int PROD = (A*B);
        System.out.printf("PROD = " + PROD);

        scanner.close();

    }
}
