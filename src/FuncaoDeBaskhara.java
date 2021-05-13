import java.util.Scanner;

public class FuncaoDeBaskhara {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite valor de A");
        double a = scanner.nextDouble();
        System.out.println("Digite valor de B");
        double b =  scanner.nextDouble();
        System.out.println("Digite valor de C");
        double c = scanner.nextDouble();


        double delta = Math.pow(b, 2.0) - 4*a*c;
        double x1 = (-b + Math.sqrt(delta) / (2.0 * a));
        double x2 = (-b - Math.sqrt(delta) / (2.0 * a));

        System.out.printf("O valor positivo sera: %.2f%n", x1);
        System.out.printf("O valor negativo sera: %.2f%n", x2);

        scanner.close();

    }
}
