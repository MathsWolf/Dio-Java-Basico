// A Estrutura condicional possibilita a escolha de um grupo de ações e comportamentos a serem executadas quando determinadas condições
// são ou não satisfeitas.  A estrutura condicional pode ser Simples ou Composta.
 
package AulasJava.Matheus.Aula2_Estruturas_Condicionais;

public class Condicionais_Simples {
    public static void main(String [] args){

        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        
        System.out.println("Novo saldo: " + saldo);

    }
    
}
