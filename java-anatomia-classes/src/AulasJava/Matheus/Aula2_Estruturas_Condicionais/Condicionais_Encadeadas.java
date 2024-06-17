package AulasJava.Matheus.Aula2_Estruturas_Condicionais;

public class Condicionais_Encadeadas {
    public static void main(String[] args){

        int nota = 10;
        String status = " ";

        if (nota >= 7)
            status ="Aprovado!";
        
        else if (nota >= 5 && nota < 7) // && = E ou seja se a condição foi uma E outra.
            status ="Prova de Recuperação";
            
        else
            status ="Reprovado.";
        

        System.out.println("Sua nota foi: "+ nota);
        System.out.println("Resultado: " + status);


    }
    
}
