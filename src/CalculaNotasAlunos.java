import java.util.Locale;
import java.util.Scanner;

public class CalculaNotasAlunos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite a nota 1");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a nota 2");
        double n2 = scanner.nextShort();

        double notaFinal = (n1 + n2);

        System.out.printf("%.2f%n", notaFinal);

        if (notaFinal < 60.0){
            System.out.println("Reprovado");
        }

        scanner.close();

    }
}
