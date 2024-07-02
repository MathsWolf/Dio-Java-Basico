package AulasJava.Matheus.Aula5_ProgramaçãoOrientadaPOO.Enum;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.CEARA;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaisculo());
        System.out.println(eb.getIbge());
    }

}
