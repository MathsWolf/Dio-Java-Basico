// importando os metodos locale e scanner
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para nosso usuário
        //Obter pela classe Scanner os valores digitados no terminal
        System.out.println("Por favor, informe seu Nome completo: ");
        String nomeCliente = scanner.nextLine(); // utilizando o nextLine a variavel vai puxar todo conteudo até o envio ( após o enter)

        System.out.println("Agora digite o número da Agência: ");
        String agencia = scanner.next(); // já utilizando somente o next ele pega até a primeira divisão ( espaço ou caractere especial ) 

        System.out.println("Em seguida seu número de conta: ");
        int numeroDeConta = scanner.nextInt(); // já o nextInt é utilizado para números inteiros

        System.out.println("Por fim, me informe seu saldo: ");
        double saldo = scanner.nextDouble(); // o double para números de ponto flutuante

        //Exibir a mensagem da conta criada
        System.out.println("\nOlá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDeConta + 
                            " e seu saldo " + saldo + " já está disponivel para saque.");
    }
}
