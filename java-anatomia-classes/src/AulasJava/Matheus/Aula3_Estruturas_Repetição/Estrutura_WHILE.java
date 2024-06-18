package AulasJava.Matheus.Aula3_Estruturas_Repetição;
import java.util.concurrent.ThreadLocalRandom;

// Estrutura do controle de fluxo WHILE:
public class Estrutura_WHILE {
    public static void main(String[] args){
        double mesada = 50.0;
        int contador = 0;

        while (mesada > 0 ) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
            
            System.out.println(contador + " Doce do valor: " + valorDoce + " Adicionado no carrinho.");
            mesada = mesada - valorDoce;
            contador ++;
        }
        System.out.println("Mesada:"+ mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
