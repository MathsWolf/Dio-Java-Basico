package AulasJava.Matheus.Aula3_Estruturas_Repetição;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploDe_Exceção {
    public static void main (String[] args){

        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("A1.75");
            System.out.println(valor);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }    
}
