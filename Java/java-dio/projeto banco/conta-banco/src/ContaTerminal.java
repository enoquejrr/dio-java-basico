import java.math.BigDecimal;
import java.util.Scanner;

public class  ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo:");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.print("Olá " + nome + "sua agência é " + agencia + "a sua conta é " + numeroConta + "e o saldo saldo é de R$" + saldo);

        scanner.close();
    }

}
