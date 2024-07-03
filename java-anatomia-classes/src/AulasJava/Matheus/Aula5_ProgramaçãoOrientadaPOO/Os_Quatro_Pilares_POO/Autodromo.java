package AulasJava.Matheus.Aula5_ProgramaçãoOrientadaPOO.Os_Quatro_Pilares_POO;
/*  Os quatro pilares da Programação Orientada a Objeto:
    1 - Pilar do Encapsulamento
    2 - Pilar da Herança
    3 - Pilar da Abstração
    4 - Pilar do Polimorfismo
*/
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("8769756"); // Aqui estamos utilizando do pilar da herança com a classe Veiculo.
        jeep.ligar(); // Aqui usamos o pilar do encapsulamento para manter os metodos intermos e executarem junto ao metodo ligar.

        Moto z400 = new Moto();
        z400.setChassi("4677584");
        z400.ligar(); 

        // Ao utilizar o metodo ligar estamos utilizando ambos os pilares abastração e polimorfismo
        // aonde um mesmo metodo é executado porém de maneiras diferentes dependendo do veiculo.
        Veiculo coringa = jeep;
        coringa.ligar();

    }
    
}
