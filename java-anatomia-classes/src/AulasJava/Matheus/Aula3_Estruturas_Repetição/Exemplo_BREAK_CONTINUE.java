package AulasJava.Matheus.Aula3_Estruturas_Repetição;

public class Exemplo_BREAK_CONTINUE {
    public static void main(String[] args){

        for(int numero = 1; numero<=5; numero++){
            if(numero == 3)
                break; // se subistituir pelo continue ele executa até o final

            System.out.println(numero);
        
        }
    }
    
}
