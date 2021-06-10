package estruturarepeticao.enquanto;

import javax.crypto.spec.PSource;

public class ex4 {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x * 3;
            System.out.print(y);
            x = x + 1;
        }
        System.out.println("Fim");
    }
}
