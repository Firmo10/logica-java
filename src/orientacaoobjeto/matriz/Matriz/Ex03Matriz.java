package orientacaoobjeto.matriz.Matriz;

public class Ex03Matriz {
    public static void main(String[] args) {
        int m = 5;


        int[][] matriz = new int[5][5];

        for (int i = 0; i < m; i++) {
            matriz[3][i] = 10;
        }
        for (int i = 0; i < m; i++) {
            matriz[i][4] = 10 * i;
            matriz[i][i] = 50;
            System.out.println(matriz[i][i]);

        }

    }
}
