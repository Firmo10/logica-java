package orientacaoobjeto.vetores.Vetores;

public class Vetores {
    // EXTRUTURA MAIS COMPLEXA
    // HOMOGENEA
    // TAMANHO FIXO

    public static void main(String[] args) {
        String[] nomes  = new String[3];

        nomes[0] = "Noiva do Chuck";
        nomes[1] = "Tio do Zap";
        nomes[2] = "Alicio mal comportado";

        for (int i = 0; i<3; i++){
            System.out.println("Qual nome tem a posicao " + i + " -> " + nomes[i]);
        }
    }

}
