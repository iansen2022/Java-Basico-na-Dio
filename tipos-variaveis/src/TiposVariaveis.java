public class TiposVariaveis {
    public static void main(String[] args) {
        //estudar variáveis tipos primitivos
        //estudar a class string que representa texto na aplicação
        //String meuNome "Samuel Iansen";

        System.out.println("Hello, World!");

        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);

    }
}
