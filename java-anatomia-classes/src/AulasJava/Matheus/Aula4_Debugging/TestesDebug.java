package AulasJava.Matheus.Aula4_Debugging;

public class TestesDebug {
    public static void main (String[] args){
        System.out.println("Inicio do programa no método main.");
        a();
        System.out.println("Programa do método main finalizado!");
    }

    static void a() { // quando não tem o public antes do static o mesmo está omitido (o default é o public).
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b() {
        System.out.println("Entrou no método b.");
        for (int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c() {
        System.out.println("Entrou no método c.");
        Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}
