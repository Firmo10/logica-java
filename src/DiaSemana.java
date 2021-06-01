public class DiaSemana {
    public static void main(String[] args) {
        int diaSemana = 7;

        if (diaSemana == 1) { //false
            System.out.println("Domingo");
        }else if (diaSemana == 2) { //false
            System.out.println("Segunda");
        }else if (diaSemana == 3) { //false
            System.out.println("Terça");
        }else {
            System.out.println("Dia nao encontrado");
        }

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("Terça");
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println("Sexta");
            case 7:
                System.out.println("Sabado");
        }
    }
}
