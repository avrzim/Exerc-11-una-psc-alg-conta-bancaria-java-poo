import java.util.Scanner;

public class Atividade02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int numeroConta, opcao;
        double saldo, depositar, sacar;

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite o número da conta: ");
        numeroConta = input.nextInt();
        System.out.println("Digite o saldo inicial da conta: ");
        saldo = input.nextDouble();

        do{
            System.out.println("1-Depositar valor");
            System.out.println("2-Sacar valor");
            System.out.println("3-Obter saldo disponível");
            System.out.println("4-para sair");
            System.out.print("Digite sua escolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do seu depósito: ");
                    depositar = input.nextDouble();
                    Deposito deposito = new Deposito(saldo, depositar);
                    deposito.depositado();
                    saldo += depositar;
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    sacar = input.nextDouble();
                    if (sacar > 5000) {
                        System.out.println("Valor do saque acima do permitido.");
                    }else if (sacar > saldo) {
                        System.out.println("Saldo insuficiente para realizar a operação.");
                    }else{
                        Saque saque = new Saque(saldo, sacar);
                        saque.sacado();
                        saldo -= sacar;
                    }
                    break;
                case 3:
                    System.out.println("Seu saldo é de: " + saldo + "R$");
                    break;
                case 4:
                    System.out.println("Você saiu!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }while(opcao != 4);
        input.close();
    }
}