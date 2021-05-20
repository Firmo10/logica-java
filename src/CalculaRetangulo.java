import java.util.Locale;
import java.util.Scanner;

public class CalculaRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o valor da base");
        double base = scanner.nextDouble();
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = (2 * base) + (2 * altura);
        double diagonal = Math.sqrt((base * base) + (altura * altura));

        System.out.println("AREA = " + area);
        System.out.println("PERIMETRO = " + perimetro);
        System.out.println("DIAGONAL = " + diagonal);







        scanner.close();
    }
}
