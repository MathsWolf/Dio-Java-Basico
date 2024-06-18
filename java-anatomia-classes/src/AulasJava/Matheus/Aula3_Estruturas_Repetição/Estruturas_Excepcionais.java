package AulasJava.Matheus.Aula3_Estruturas_Repetição;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

// Estruturas Excepcionais TRY/CATCH

// Exemplo \/
public class Estruturas_Excepcionais {
    public static void main (String[] args){
        try { // tente executar tudo que está no bloco.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário 
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " "+ sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        
        }
        catch(InputMismatchException e ){ // se der erro de MismatchExecption caia nessa mensagem \/:
            System.err.println("Os campos idade e altura precisam ser numéricos."); // no lugar do out pode ser usado o err também, nessa parte do catch.

        }

    }
    
}
