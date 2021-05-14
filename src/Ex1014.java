/*
Calcule o consumo médio de um carro levando em consideração a distância total percorrida (em Km)
e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores:
um valor inteiro X representando a distância total (em Km)
e o segundo é um número de ponto flutuante Y  representando o total de combustível irradiado, com um dígito após o ponto decimal.

Resultado
Apresente um valor que represente o consumo médio de um carro
com 3 dígitos após a vírgula, seguido da mensagem “km / l”.

Amostra de entrada	                   Amostra de saída
500                                    14,286 km / l
35,0

2254                                   18,119 km / l
124,4

4554                                   9,802 km / l
464,6

 */



import java.util.Scanner;

public class Ex1014 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int km= scanner.nextInt();
        double litros = scanner.nextDouble();
        double kmPorLitro = km/litros;

        System.out.printf("%.3f km / l", kmPorLitro);


    }
}
