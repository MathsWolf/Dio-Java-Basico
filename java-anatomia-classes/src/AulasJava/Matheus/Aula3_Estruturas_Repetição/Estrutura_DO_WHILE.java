package AulasJava.Matheus.Aula3_Estruturas_Repetição;
import java.util.Random;
// O DO-WHILE permite que seja executado pelomenos 1 vez mesmo se a condição for False.
public class Estrutura_DO_WHILE {
    public static void main(String[] args){
        System.out.println("Discando... ");

        do 
        { // executado repetida vezes até alguem atender
            System.out.println("Telefone tocando");
        }
        while (tocando());
            System.out.println("Alô!!!");

    }
    private static boolean tocando() { // Método:
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return ! atendeu;
    }
}
