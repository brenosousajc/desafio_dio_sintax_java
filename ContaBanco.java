package conta_banco;

import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		int numero_conta;
		String agencia;
		String nome_cliente;
		double saldo = 237.48;
		
		System.out.println("Bem-vindo ao banco! Digite seu nome completo.");
		nome_cliente = scan.nextLine();
		System.out.println("Digite o número da sua Agência.");
		agencia = scan.nextLine();
		System.out.println("Digite o número da sua conta.");
		numero_conta = scan.nextInt();
		
		System.out.println("Olá, " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero_conta + " e seu saldo R$" + saldo + " já está disponível para saque." );
		
	
		
		
		
		
		
		
		
		
	}

}
