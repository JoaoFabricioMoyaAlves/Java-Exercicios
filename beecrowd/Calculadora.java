package com.devil;

public class Calculadora {

    public double soma(double V1, double V2) {
        return V1 + V2;
    }

    public double subtracao(double V1, double V2) {
        return V1 - V2;
    }

    public double multiplicacao(double V1, double V2) {
        return V1 * V2;
    }

    public double divisao(double V1, double V2) {
        return V1 / V2;
    }

    public double restoDivisao(double V1, double V2) {
        return V1 % V2;
    }

    public double porcentagem(double V1, double V2) {
        double p = V2 / 100;

        return V1 * p;
    }

}
