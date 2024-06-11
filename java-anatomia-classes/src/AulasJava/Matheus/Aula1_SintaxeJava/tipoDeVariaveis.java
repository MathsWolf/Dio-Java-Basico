package AulasJava.Matheus.Aula1_SintaxeJava;

public class tipoDeVariaveis {
    public static void main(String[] args) {
        
        String meuNome = "Matheus Chagas";
        byte idade = 123;
        short ano = 2021;
        int cep = 29024120; // se começar com zero o sistema não aceita ( tem que usar string)
        long cpf = 98765432109L; // mesma situação do zero no cep ( e finaliza com o L para identificação que é long)
        float pi = 3.14F; // também finaliza com F ou f para identificação
        double salario = 1275.33; 

        System.out.println(meuNome + " " + idade + " " + ano + "\n" + cep + "\n" + cpf + "\n" + pi + "\n" + salario);


    }
}

