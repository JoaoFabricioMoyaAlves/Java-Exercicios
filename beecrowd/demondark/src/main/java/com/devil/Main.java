package com.devil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        Scanner sc = new Scanner(System.in);

        double valor, result;

        System.out.println("\n Digite o valor que sera cobrado o tributo em (US$): ");

        valor = sc.nextDouble();

        if (valor <= 50) {
            result = valor + cal.porcentagem(valor, 20);
            System.out.println("\n O valor com a somatoria do tributo e de: US$" + result + " ");
        } else {
            result = valor + cal.porcentagem(valor, 60);
            result = result + 20;
            System.out.println("\n O valor com a somatoria do tributo e de: US$" + result + " ");
        }

    }

}
