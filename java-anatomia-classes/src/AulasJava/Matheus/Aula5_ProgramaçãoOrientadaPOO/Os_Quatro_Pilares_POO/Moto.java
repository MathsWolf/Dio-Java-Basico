package AulasJava.Matheus.Aula5_ProgramaçãoOrientadaPOO.Os_Quatro_Pilares_POO;


public class Moto extends Veiculo { // Utilizando o extends para herdar a classe Veiculo.
    public void ligar(){
        System.out.println("MOTO LIGADA"); // Aqui temos a abstração e o polimorfimos trabalhando junto, executando
        // um mesmo metodo porém de maneiras diferentes.
    }
}
