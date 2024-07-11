public class TipoVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; //java nao armazena zero na esquerda
        long cpf = 98765432109L; //java nao armazena zero na esquerda
        float pi = 3.14F;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final double VALOR_DE_PI = 3.14; // Constante

    }

}
