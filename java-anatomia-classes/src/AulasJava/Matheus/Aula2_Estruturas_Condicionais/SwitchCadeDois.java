/* Imagina que fomos requisitados a criar um sistema de plano telefonico aonde:
O sistema terá 03 planos: Basico(B), Midia(M) e Turbo (T)
Basico = 100 minutos de ligação
Midia = 100 minutos + whats e instragram
Turbo = 100 minutos + whats e insta + 5GB Youtube. */

package AulasJava.Matheus.Aula2_Estruturas_Condicionais;

public class SwitchCadeDois {
    public static void main(String[] args){
        // Utilizando as condicionais If e Else If teriamos o programa desta forma: 
        System.out.println("Executando com If/Else if: ");
        String plano = "M"; 

        if ( plano == "B"){
            System.out.println("100 Minutos de ligações");
        } else if(plano == "M"){
            System.out.println("100 Minutos de ligações");
            System.out.println("Whats e Instragram Grátis");
        } else if( plano == "T"){
            System.out.println("100 Minutos de ligações");
            System.out.println("Whats e Instragram Grátis");
            System.out.println("5GB no Youtube");
        }

        // Utilizando agora o SwitchCase para fazer a mesma função porém sem ter toda essa repetitividade nas condições:

        System.out.println("\nExecutando com SwitchCase: ");
        String planoDois = "T";

        switch(planoDois){
            case "T": {
                System.out.println("5GB no Youtube");
                /*   Lembrando que se não utilizado o break para interromper o programa, o programa executará a condição informada e os abaixo do mesmo.
                por isso utilizamos a ordem decrecente para somente ir incluindo nos planos. */
            }
            case "M": {
                System.out.println("Whats e Instragram Grátis");
            }
            case "B": {
                System.out.println("100 Minutos de ligações");
            }
        }
    } 
}
