/*
Leia os valores de dois pontos flutuantes de precisão dupla A e B, correspondendo a duas notas do aluno.
Em seguida, calcule a média do aluno, considerando que a nota A tem peso 3,5 e a B tem peso 7,5.
Cada nota pode ser de zero a dez, sempre com um dígito após a vírgula.
Não se esqueça de imprimir o final da linha após o resultado, caso contrário, você receberá “Erro de apresentação”.
Não se esqueça do espaço antes e depois do sinal de igual.

Entrada
O arquivo de entrada contém valores de 2 pontos flutuantes com um dígito após o ponto decimal.

Resultado
Imprima a mensagem “MEDIA” (média em português) e a média do aluno conforme exemplo a seguir,
com 5 dígitos após o ponto e com espaço em branco antes e depois do sinal de igual.

Amostras de entrada	                Amostras de saída
5.0                                 MEDIA = 6.43182
7.1

0.0                                 MEDIA = 4.84091
7.1

10.0                                MEDIA = 10.00000
10.0

 */



import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double a = scanner.nextDouble();
        System.out.println("Digite a segunda nota");
        double b = scanner.nextDouble();

        double notaFinal = ((a * 3.5 + b * 7.5) / 11);

        System.out.printf("MEDIA = %.5f", notaFinal );



    }
}
