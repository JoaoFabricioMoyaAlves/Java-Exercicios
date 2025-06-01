package com.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int aux;
       Scanner sc = new Scanner(System.in);
       Banco banco = new Banco();
       PessoaFisica pf = new PessoaFisica();
       PessoaJuridica pj = new PessoaJuridica();
       Conta conta = new Conta();
       Conta conta2 = new Conta();
       banco.id_banco = 1;
        System.out.println("voce quer criar uma conta PF(1) ou PJ(2)?");
        aux = sc.nextInt();
       if(aux == 1){
         
       
        System.out.println("insira o seu nome");
        pf.Nome = sc.nextLine();
        sc.nextLine();
        System.out.println("insira o seu cpf");
        pf.cpf = sc.nextInt();
        System.out.println("insira o seu numero de ocntato");
        pf.contato = sc.nextInt();
        pf.n_conta = 1;
       
        conta.titular = pf.Nome;
        conta.id_banco =1;
       
        conta2.titular = "Xaolim matador de porco";
       }else{
       
        System.out.println("insira o seu nome fantasia");
        pj.Nome = sc.nextLine();
        sc.nextLine();
        System.out.println("insira o seu cnpj");
        pj.cnpj = sc.nextInt();
        System.out.println("insira o seu numero de contato");
        pj.contato = sc.nextInt();
        pj.n_conta = 1;
        
        conta.titular = pj.Nome;
        conta.id_banco =1;
       
        conta2.titular = "joaozinho";
       }
         System.out.println("Agora deposite uma quantia de money");
         double money = sc.nextDouble();
        conta.depositar(money);
        System.out.println("valor inicial da sua conta: R$ "+conta.getSaldo()+" Saldo inicial da conta que recebera o dinheiro: R$ "+conta2.getSaldo());
        System.out.println("Agora entre com a quantia que sera transferida");
        money = sc.nextDouble();
        conta.transferir(conta2, money);
        System.out.println("novo valor da sua conta: R$ "+conta.getSaldo()+" novo Saldo da conta que recebeu o dinheiro: R$ "+conta2.getSaldo());
       



    }
}