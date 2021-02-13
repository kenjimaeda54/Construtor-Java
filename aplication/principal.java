package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.cliente;

public class principal {
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    cliente cliente;
	    System.out.print("Digite numero da conta  do cliente: ");
	    int conta = sc.nextInt();
	    sc.nextLine();//Ficar atento a esta linha em cima esta print,então precisa colcoar isto,se não fica junto
	    System.out.print("Digite o nome do clinte: ");
        String nome = sc.nextLine();
        System.out.print("Tem algum valor depositado (s/n)?");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
          System.out.print("Qual é o valor do deposito?");
          double inicioDeposito = sc.nextDouble();
          cliente = new cliente(nome,conta,inicioDeposito);	
          System.out.println(cliente);//para imprimir algo com mais de 1 argumento faça o toString
        }else {
          cliente = new cliente(nome,conta);
          System.out.println(cliente);//para imprimir algo com mais de 1 argumento faça o toString
        };
        System.out.print("Entre com um valor para deposito:");
        double deposito = sc.nextDouble();
        cliente.deposito(deposito);
        System.out.println("Conta atualizada:");
        System.out.println(cliente);
        System.out.print("Entre com um valor para saque:");
        double saque = sc.nextDouble();
        cliente.saque(saque);
        System.out.println("Conta atualizada");
        System.out.println(cliente);
        
	    
        sc.close();
	   
	}


}
