import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            System.out.println("Erro: O segundo parametro deve ser maior que o primeiro");
        }
    }

    public static class ParametrosInvalidosException extends Exception {}

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int  contagem = parametroDois - parametroUm;
            for(int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo número " + (i + 1));
            }
        }
    }
}