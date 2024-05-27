import java.util.Scanner;

public class contabancária {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        System.out.println("Escreva o nome do cliente: ");
        String nome = scanner.nextLine();
        String conta = "Corrente";
        System.out.println("Qual o valor inicial da sua conta " + nome);
        double saldoInicial = scanner.nextDouble();

        System.out.printf("""
                ***************************************
                
                Dados do cliente:
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: %.2f
                
                ***************************************
                """, nome, conta, saldoInicial);

        String menu = """
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                """;

        while (escolha != 4) {
            System.out.println(menu);
            System.out.print("Escolha uma opção: \n");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Saldo: " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Qual o valor a ser recebido?");
                    double valorRecebido = scanner.nextDouble();
                    saldoInicial += valorRecebido;
                    System.out.println("Seu saldo atual é de " + saldoInicial);
                    break;
                case 3:
                    System.out.println("Qual o valor que voce deseija transferir?");
                    double valorTransferir = scanner.nextDouble();
                    if (valorTransferir > saldoInicial) {
                        System.out.println("Não há dinheiro suficiente na conta ");
                    } else {
                        saldoInicial -= valorTransferir;
                        System.out.println("Seu saldo atual é de " + saldoInicial);
                    }
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}



