import org.w3c.dom.Text;

import java.util.Scanner;

public class TrabalhandoComTexto {

    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        // *** ENTRADA DE DADOS ***
        System.out.println("Digite seu nome completo");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        // *** PROCESSAMENTO ***
        String valoresConcatenados = " Oi, meu nome é " + nomeCompleto +", tenho " + idade + " anos, minha altura é " + altura + " metro, e estou pesando " + peso + "Kg";

        // *** SAIDA DE DADOS ***

        System.out.println(valoresConcatenados);

    }
}
