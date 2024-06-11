package AulasJava.Matheus.Aula1_SintaxeJava;
// os nomes das Classes sempre vao ter as primeiras letras em Maiúsculo.
public class ClassesEmJava {
public static void main (String [] args){
    
    System.out.print ("Hello World!\n"); // ( \n ) dentro da string para quebrar a linha.

    // Estrutura usada para declarar uma variavel em Java
    // Tipo nomeBemDefinido = Atribuição ( Opicional em alguns casos )
    // Exemplos:
    // TIPO nomeVariavel = Valor/Atribuição
        String meuNome = "Matheus";
        int idade = 27;
        double minhaAltura = 1.70;
        boolean verdadeira = true; // true or false
        System.out.print("Meu Nome: "+ meuNome + "\n" +
        "Minha Idade: "+ idade + "\n" + 
        "Minha Altura: " + minhaAltura + "\n" +
        "Verdade?: " + verdadeira + "\n");


    // se a Variavel vem Totalmente em maiúsculo ela ja implicita que é de valor imutavel.
    final String BR = "Brasil"; // ( final ) é uma palavra reservada para garantir que a variavel nunca mude o valor.
    System.out.print ("Valor da variavel BR é " + BR + "\n");

    // se a variavel tiver nome composto seguir a nomeclatura camelCase que tem a inicial da segunda palavra em maiúsculo.
    String nomeBicicleta = "Caloi \n";
    System.out.print (nomeBicicleta);








}

    
}
