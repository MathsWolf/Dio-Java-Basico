package AulasJava.Matheus.Aula1_SintaxeJava;

public class maisOperadores {
    public static void main (String[] args){

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 < numero2){ 
            System.out.println("a nossa condição é verdadeira!");
        }

        boolean simNao = numero1  == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1  != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);


        String nomeUm = "Matheus";
        String nomeDois = new String("Matheus");

        System.out.println(nomeUm == nomeDois); 
        // compara valores, utilizando o new String ( teria guardado na memoria 2 valores diferentes ) e gera o false.
        System.out.println(nomeUm.equals(nomeDois)); // Compara Objetos, no caso melhor utilizado e faz a comparação correta dando True






    }
}   
