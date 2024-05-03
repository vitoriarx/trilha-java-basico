package contabanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da agência: ");
        int numAgencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome da agencia: ");
        String agenciaBancaria = scanner.nextLine();
        

        scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String clienteNome = scanner.nextLine();
        

        System.out.println("Digite o saldo: ");
        double valorSaldo = scanner.nextDouble();

        System.out.println("--------Conta---------");
        System.out.println("Olá " + clienteNome + " obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBancaria + ", conta " + numAgencia + " e seu saldo R$" + valorSaldo + " já está disponível para saque.");
    }
    
}
