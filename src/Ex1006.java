/*
Leia três valores (variáveis A, B e C), que são as três notas do aluno.
Em seguida, calcule a média, considerando que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
Considere que cada nota pode ir de 0 a 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores de pontos flutuantes com um dígito após o ponto decimal.

Resultado
Imprima a mensagem "MEDIA" (média em português) e a média do aluno conforme exemplo a seguir,
com um espaço em branco antes e depois do sinal de igual.

Amostras de entrada	                Amostras de saída
5.0                                 MEDIA = 6.3
6.0
7.0

5.0                                 MEDIA = 9.0
10.0
10.0

10,0                               MEDIA = 7,5
10,0
5,0


 */


import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double media = ((A * 2.0 + B * 3.0 + C * 5.0) / 10);

        System.out.printf("MEDIA = %.1f", media);


        scanner.close();








    }
}
