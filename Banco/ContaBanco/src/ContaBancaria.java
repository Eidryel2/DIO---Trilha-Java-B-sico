import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) throws Exception {
        double saldo = 0;
        double limite = 0;

        int numero = 0;
        String agencia = "";
        String titular = "";
        String resposta = "";

        // Inicializa o scanner
        Scanner scanner = new Scanner(System.in);

        // Pergunta se o usuário deseja criar uma conta
        while (!resposta.equalsIgnoreCase("Y") && !resposta.equalsIgnoreCase("N")) {
            System.out.println("Bem vindo. Gostaria de criar uma conta? (Y/N)");
            resposta = scanner.nextLine();
            
            if (!resposta.equalsIgnoreCase("Y") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("Por favor, responda apenas com 'Y' (sim) ou 'N' (não).");
            }
        }
        
        if (resposta.equalsIgnoreCase("Y")) {   
            System.out.println("Digite o numero da conta: ");
            numero = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha deixada pelo nextInt
            System.out.println("Digite a agencia: ");
            agencia = scanner.nextLine();
            System.out.println("Digite o nome do titular: ");
            titular = scanner.nextLine();
            System.out.println("Digite o saldo inicial: ");
            saldo = scanner.nextDouble();
            
            System.out.println("Conta criada com sucesso! \n");
            System.out.println("Numero da conta: " + numero);
            System.out.println("Agência: " + agencia);
            System.out.println("Titular: " + titular);
            System.out.println("Saldo inicial: " + saldo);
        } else {
            System.out.println("Sua resposta foi: " + resposta);
        }

        // Fecha o scanner
        scanner.close();
    }
}
