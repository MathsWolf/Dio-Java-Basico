package AulasJava.Matheus.Aula2_Estruturas_Condicionais;

public class SwitchCase {
    public static void main(String[] args){
        // Assim seria uma tentativa com as condicionais ja apresentadas:
        String sigla = "p";

        if (sigla == "P")
            System.out.println("Pequeno");
        
        else if(sigla == "M")
            System.out.println("Médio");
        
        else if(sigla == "G")
           System.out.println("Grande");
        
        else
            System.out.println("Indefinido.");


        // Assim temos um outro exemplo utilizando o SwitchCase: 

        String siglaDois = "G";

        switch(siglaDois) { // Aqui ele vai ir testando os casos

            case "P":{
                System.out.println("Pequeno");
                break;
                }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:{ // caso não enquadre em nenhum dos casos a cima o caso usado sempre será o default:
                System.out.println("Indefinido!");
            }


        }
        
        }
    
}
