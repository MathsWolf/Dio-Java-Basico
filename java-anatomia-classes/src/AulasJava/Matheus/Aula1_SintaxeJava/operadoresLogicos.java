package AulasJava.Matheus.Aula1_SintaxeJava;

public class operadoresLogicos {
    public static void main(String[] args){

        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){ // ( E == && )
            System.out.println("as duas condições são verdadeiras.");
        }

        if(condicao1 || condicao2){ // ( OU = || )
            System.out.println("uma das condições é verdadeira");
        }

        
        System.out.println("Fim!");
    }

}
