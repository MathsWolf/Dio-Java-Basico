package AulasJava.Matheus.Aula2;

public class tiposOperadores { 
    public static void main (String[] args){

        int numero = 5;
        System.out.println(-numero); // nega o valor ( tornando-o negativo)
        System.out.println(++numero); // incremento no valor em 1 unidade ( adiciona )
        System.out.println(--numero); // decremento no valor em 1 unidade ( retira )
        numero = -5;
        System.out.println(numero);
        System.out.println(numero * -1); // para retornar o valor para positivo o sinal de + não funciona pois é identificado como operador aritimetico.


        int a, b; // declarando duas variaveis
        a = 6; // declarando o valor de ambas.
        b = 6;
        String resultado = a == b ? "Verdadeiro" : "Falso"; // Usando String Para Retornar Texto, se for numerico usaria Int
        // Utilizando operador ternário para verificação de valores booleanos ( A==B ( A igual B) ?(se for) :(se não) )
        System.out.println(resultado);


        
    }
}
