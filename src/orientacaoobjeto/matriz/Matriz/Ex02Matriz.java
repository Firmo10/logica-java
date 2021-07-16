package orientacaoobjeto.matriz.Matriz;

public class Ex02Matriz {
    public static void main(String[] args) {

        int m = 2;
        int n = 4;
        int[][] matriz = new int[2][4];
        int x = 0;

        for (int i = 0; i <m; i++){
            x = x+i;
            for (int j = 0; j<n; j++){
                x = x+j;
                matriz[i][j] = x;
                System.out.println(matriz[i][j]);
            }

        }
    }
}
