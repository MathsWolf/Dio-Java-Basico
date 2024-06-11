package AulasJava.Matheus.Aula1_SintaxeJava;

public class criandoMetodo {

public static void main (String [] args){

    String primeiroNome = "Matheus";
    String segundoNome = "Chagas";

    String juntaNome = nomeCompleto(primeiroNome, segundoNome);

    System.out.println (juntaNome);
}




// Criando um Metodo:
public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}



}
