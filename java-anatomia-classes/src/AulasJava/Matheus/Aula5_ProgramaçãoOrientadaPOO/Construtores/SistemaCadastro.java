package AulasJava.Matheus.Aula5_ProgramaçãoOrientadaPOO.Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        
        //criamos uma pessoa no sistema
        Pessoas marcos = new Pessoas("123.456.789-10", "Matheus Chagas"); 
        /*  Ao utilizar o construtor quandos vamos criar um novo objeto ele automaticamente
         solicita que seja passado os parametros informados na criação do construtor ( CPF e Nome ). */

        //Definimos o endereço de marcos:
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e cpf de marcos?
        //Imprimindo o marcos sem o nome e cpf
        System.out.println("Nome: " + marcos.getNome() + " / " + "CPF: "+marcos.getCpf());     
    }
}
