public class OperadoresRelacionais{
    public static void main(String[] args) {

        String nome1 = "samuel";
        String nome2 = new String ("samuel");
        System.out.println(nome1.equals(nome2));    //equals compra conteúdos
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("A nossa condição é Verdadeira");
        }

        System.out.println("Numero Um é igual a Numero Dois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero Um é diferente a Numero Dois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero Um é maior a Numero Dois? " + simNao);

    }
}
