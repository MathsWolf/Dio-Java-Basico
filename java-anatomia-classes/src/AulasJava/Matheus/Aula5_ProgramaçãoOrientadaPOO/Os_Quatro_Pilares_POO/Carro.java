package AulasJava.Matheus.Aula5_ProgramaçãoOrientadaPOO.Os_Quatro_Pilares_POO;

public class Carro extends Veiculo {
    // Aqui Vemos o primeiro pilar que seria o Encapsulamento:
    // temos a primeira função que seria a Ligar e dentro dela colocamos as outras 2 funções para serem executadas.
    public void ligar () {
        confereCambio(); // assim para "ligar" o veiculo precisa ser conferido tanto o cambio quanto o combustivel
        confereCombustivel(); // "encapsulando" as duas funções (classes) dentro de outra sem precisar usa-las
        // no programa main.
        System.out.println("CARRO LIGADO");
    }
    public void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }
    public void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }
    }

