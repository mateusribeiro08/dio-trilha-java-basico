import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o número da sua conta: ");
    int numero = scanner.nextInt();
    System.out.println("Digite o número da sua agência: ");
    String agencia = scanner.next();
    System.out.println("Digite o seu saldo: ");
    double saldo = scanner.nextDouble();
    System.out.println("Digite o seu nome: ");
    String nome = scanner.next();


    String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque",nome, agencia, numero, saldo);
    

    System.out.println(mensagem);
    }
}
