/*
Leia dois valores inteiros, neste caso, as variáveis A e B. Em seguida, calcule a soma entre eles e atribua à variável SOMA . Escreva o valor desta variável.

Entrada
O arquivo de entrada contém 2 números inteiros.

Resultado
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois do sinal de igual seguido do valor correspondente à soma de A e B. Como todos os problemas, não se esqueça de imprimir o final da linha , caso contrário, você receberá "Erro de apresentação"

Amostras de entrada	                  Amostras de saída

30                                    SOMA = 40
10

-30                                   SOMA = -20
10

0                                     SOMA = 0
0



*/










import java.util.Scanner;
public class Ex1003 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int primeiroNumero = (int) scanner.nextDouble();
        System.out.println("Digite o segundo valor");
        int segundoNumero = (int) scanner.nextDouble();
        int resultado = primeiroNumero + segundoNumero;
        System.out.println("SOMA = " + resultado);

        System.out.println("Digite o primeiro valor");
        int terceirooNumero = (int) scanner.nextDouble();
        System.out.println("Digite o segundo valor");
        int quartoNumero = (int) scanner.nextDouble();
        int resultado1 = terceirooNumero + quartoNumero;
        System.out.println("SOMA = " + resultado1);

        System.out.println("Digite o primeiro valor");
        int quintoNumero = (int) scanner.nextDouble();
        System.out.println("Digite o segundo valor");
        int sextoNumero = (int) scanner.nextDouble();
        int resultado2 = quintoNumero + sextoNumero;
        System.out.println("SOMA = " + resultado2);

        scanner.close();
    }
}
