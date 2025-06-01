package com.banco;

public class Conta {
    String titular;
    int id_banco;
    double saldo = 0;


    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }



    public void transferir(Conta destino, double valor){
        if (valor > 0 && valor <= saldo) {
            sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para " + getTitular() + " realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada!");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular() {
       return  titular;
    }

 

}
