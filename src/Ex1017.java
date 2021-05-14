/*
O Joãozinho quer calcular e mostrar a quantidade de litros de combustível gasto em uma viagem,
usando um carro que faz 12 Km / L. Para isso, ele gostaria que você o ajudasse por meio de um programa simples.
Para realizar o cálculo, é necessário ler o tempo gasto (em horas) e a mesma velocidade média (km / h).
Desta forma, você pode obter a distância e, em seguida, calcular quantos litros seriam necessários.
Mostre o valor com três casas decimais após o ponto.

Entrada
O arquivo de entrada contém dois inteiros.
O primeiro é o tempo gasto na viagem (em horas). O segundo é a velocidade média durante a viagem (em Km / h).

Resultado
Imprime quantos litros seriam necessários para fazer esta viagem, com três dígitos após o ponto.

Amostra de entrada	                  Amostra de saída
10                                    70.833
85

2                                     15.333
92

22                                    122.833
67

 */


import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int L = 12;

        System.out.println("Escreva o tempo gasto");
        int tempoGasto = scanner.nextInt();
        System.out.println("Escreva a sua Velocidade média");
        int velocidadeMedia = scanner.nextInt();

        double distancia = (tempoGasto * velocidadeMedia);
        double litrosGastos = (distancia / L);

        System.out.printf("%.3f", litrosGastos);


        scanner.close();



    }

}
