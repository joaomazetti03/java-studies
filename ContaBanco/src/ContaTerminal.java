import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //atributos
        String agencia;
        String nomeCliente;
        int numero;
        double saldo;

        //coletar dados do terminal
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do Cliente: ");
        nomeCliente = input.nextLine();

        System.out.print("Digite a agência do Cliente: ");
        agencia = input.nextLine();

        System.out.print("Digite o numero do Cliente: ");
        numero = input.nextInt();

        System.out.print("Digite o saldo do Cliente: ");
        saldo = input.nextDouble();

        //saída
        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
