package AulasJava.Matheus.Aula5_ProgramaçãoOrientadaPOO.Getters_E_Setters;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome ("felipe Junior");
        felipe.setIdade (12);
        
        System.out.println("O Aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
        // RESULTADO NO CONSOLE 
        // O aluno felipe tem 8 anos.
    } 
}    

