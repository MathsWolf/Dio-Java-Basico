package AulasJava.Matheus.Aula2_Estruturas_Condicionais;

public class Condição_Ternarias {
    public static void main(String[] args){

        int nota = 5;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado."; // Uma otimização das condicionais, ? == Se (if) e o : == Senão (else)
        // ou seja a variavel resultado vai receber "Aprovado" se a nota for >= 7 e senão for vai receber a string "Reprovado."

        System.out.println(resultado);

        String segundoResultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Recuperação." : "Reprovado";

        System.out.println(segundoResultado);


    }
    
}
