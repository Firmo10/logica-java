import org.w3c.dom.Text;

import java.util.Locale;
import java.util.Scanner;

public class TrabalhandoComTexto {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

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


        System.out.printf(" Oi, meu nome é %s e tenho %d anos, tenho %.2f de altura e peso %.2f kg", nomeCompleto, idade, altura, peso);




    }
}
