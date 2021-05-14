/*
Neste problema, a tarefa é ler o código de um produto 1, o número de unidades do produto 1,
o preço de uma unidade do produto 1, o código de um produto 2,
o número de unidades do produto 2 e o preço para uma unidade do produto 2.
Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados.
Em cada linha haverá 3 valores: dois inteiros e um valor flutuante com 2 dígitos após a vírgula decimal.

Resultado
O arquivo de saída deve ser uma mensagem como o exemplo a seguir, onde "Valor a pagar" significa Valor a pagar .
Lembre-se do espaço após ":" e após o símbolo "R $". O valor deve ser apresentado com 2 dígitos após o ponto.

Amostras de entrada	               Amostras de saída
12 1 5,30                          VALOR A PAGAR: R $ 15,50
16 2 5,10

13 2 15,30                         VALOR A PAGAR: R $ 51,40
161 4 5,20

1 1 15,10                          VALOR A PAGAR: R $ 30,20
2 1 15,10

 */

import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int codigoProduto1 = scanner.nextInt();
        double numeroUnidadesProduto1 = scanner.nextDouble();
        double precoUnidade1 = scanner.nextDouble();
        int codigoProduto2 = scanner.nextInt();
        double numeroUnidadesProduto2 = scanner.nextDouble();
        double precoUnidade2 = scanner.nextDouble();

        double valorPagar = (numeroUnidadesProduto1 * precoUnidade1) + (numeroUnidadesProduto2 * precoUnidade2);

        System.out.printf("VALOR A PAGAR: R $ %.2f", valorPagar);

        scanner.close();

    }

}
