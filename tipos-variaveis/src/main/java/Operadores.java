public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        concatenacao = 1 + "1" + 1 + 1;
        concatenacao = "1" + 1 + 1 + 1;
        concatenacao = "1" + (1+1+1);

        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        numero = + numero * -1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        numero--;
        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);

        //Operador ternario
        int a, b;
        a=6;
        b=6;

        String resultado = a==b ? "verdadeiro":"falso";

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println(simNao);

        if(numero1 < numero2){
            System.out.println("Nossa condicao é verdadeira");
        }

        simNao = numero1 != numero2;
        System.out.println(simNao);

        simNao = numero1 > numero2;
        System.out.println(simNao);

        String nomeUm = "Murilo";
        String nomeDois = new String("Murilo");

        System.out.println(nomeUm.equals(nomeDois));

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condicoes sao verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condicoes sao verdadeiras");
        }


    }
}
