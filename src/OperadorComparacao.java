public class OperadorComparacao {

    public static void main(String[] args){

        //MENOR QUE
        boolean menorQue = 5<10;
        System.out.println("MENOR QUE " + menorQue);

        //MAIOR QUE
        boolean maiorQue = 5>10;
        System.out.println("MAIOR QUE " + maiorQue);


        //NENOR OU IGUAL A QUE
        boolean menorOuIgual = 5<=10;
        System.out.println("MENOR OU IGUAL " + menorOuIgual);

        //MAIOR OU IGUAL A QUE
        boolean maiorOuIgual = 5>=10;
        System.out.println("MAIOR OU IGUAL " + maiorOuIgual);

        //IGUALDADE
        boolean igualdade = 5 == 10;
        System.out.println("IGUAL " + igualdade);

        //DIFERENTE
        boolean diferenca = 5 != 10;
        System.out.println("DIFERENTE " + diferenca);

        System.out.println("-----------------------------------");


        int x = 5;
        boolean Y = x > 0;
        boolean Z = x == 3;
        boolean A = 10 <= 30;
        boolean B =  x != 2;

        System.out.println(Y);
        System.out.println(Z);
        System.out.println(A);
        System.out.println(B);

        System.out.println("--------------OPERADORES LOGICOS--- AND ou E-------------");

        System.out.println((x <= 20) && (x == 10));

        System.out.println(x > 0 && x != 3);

        System.out.println(x<=20 && x == 10 &&  x !=3);


        System.out.println("--------------OPERADORES LOGICOS--- OR ou OU-------------");

        System.out.println((x <= 20) || (x == 10));

        System.out.println(x > 0 || x != 3);

        System.out.println(x<=20 || x == 10 &&  x !=3);

        System.out.println("--------------OPERADORES LOGICOS--- NOT ou NÃO-------------");

        !(x == 10)
        !(x>=2)







    }
}
