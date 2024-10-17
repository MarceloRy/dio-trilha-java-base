import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //todo: conhecer e importar a classe Scanner

        // Exibir as  mensagens para o nosso usuário

        //Obter pela classe scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome completo");
        String nome = scanner.next();
        
        System.out.println("Digite o numero de sua agência");
        String agência = scanner.next();

        System.out.println("Digite o numero de sua conta");
        int numero = scanner.nextInt();
        

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, Sr." + nome + "," + "obrigado por criar uma conta em nosso banco," );
        System.out.println("Sua agência é " + agência +",");
        System.out.println("conta " + numero + " e seu saldo 800 reais já está disponível para saque.");
    }
}
