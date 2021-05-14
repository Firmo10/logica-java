/*
Escreva um programa que leia o número do funcionário,
o número de horas trabalhadas em um mês e o valor que ele recebeu por hora.
Imprima o número do funcionário e o salário que receberá no final do mês, com duas casas decimais.

Não se esqueça de imprimir o final da linha após o resultado, caso contrário você receberá “Erro de apresentação”.
Não se esqueça do espaço antes e depois do sinal de igual e depois do U $.
Entrada
O arquivo de entrada contém 2 números inteiros e 1 valor de ponto flutuante, representando o número,
a quantidade de horas trabalhadas e a quantidade que o funcionário recebe por hora trabalhada.

Resultado
Imprima o número e o salário do funcionário, conforme o exemplo dado,
com um espaço em branco antes e depois do sinal de igual.

Amostras de entrada	                       Amostras de saída
25                                         NÚMERO = 25
100                                        SALÁRIO = U $ 550,00
5,50

1                                          NÚMERO = 1
200                                        SALÁRIO = U $ 4100,00
20,50

6                                          NÚMERO = 6
145                                        SALÁRIO = U $ 2.254,75
15,55


 */

import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int numeroFuncionario = scanner.nextInt();
        double valorHorasMes = scanner.nextDouble();
        double valorPorHora = scanner.nextDouble();
        double SALARIO = (valorHorasMes*valorPorHora);

        System.out.printf("NÚMERO = %d%n", numeroFuncionario);
        System.out.printf("SALÁRIO = U $ %.2f", SALARIO);

        scanner.close();
    }
}
