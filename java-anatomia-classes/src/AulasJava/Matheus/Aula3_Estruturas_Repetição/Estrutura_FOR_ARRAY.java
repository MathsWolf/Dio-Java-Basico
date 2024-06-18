package AulasJava.Matheus.Aula3_Estruturas_Repetição;

public class Estrutura_FOR_ARRAY {
    public static void main(String[] args){
        // Oque é um ARRAY = Um conjunto de elementos de um tipo correspondente \/ um ARRAY DE STRINGS:
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        //em arrays o indice inicia sem ZERO

        for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}

