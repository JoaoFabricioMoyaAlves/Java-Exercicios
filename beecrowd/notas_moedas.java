package nostas_moedas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, cem, cinquenta, vinte, dez, cinco, dois, m100, m50, m25, m10, m05, m01;

        valor = (int) (sc.nextDouble() * 100 + 0.5); // Multiplica por 100 e arredonda

        cem = valor / 10000;
        valor %= 10000;

        cinquenta = valor / 5000;
        valor %= 5000;

        vinte = valor / 2000;
        valor %= 2000;

        dez = valor / 1000;
        valor %= 1000;

        cinco = valor / 500;
        valor %= 500;

        dois = valor / 200;
        valor %= 200;

        m100 = valor / 100;
        valor %= 100;

        m50 = valor / 50;
        valor %= 50;

        m25 = valor / 25;
        valor %= 25;

        m10 = valor / 10;
        valor %= 10;

        m05 = valor / 5;
        valor %= 5;

        m01 = valor;

        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinquenta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m100 + " moeda(s) de R$ 1.00");
        System.out.println(m50 + " moeda(s) de R$ 0.50");
        System.out.println(m25 + " moeda(s) de R$ 0.25");
        System.out.println(m10 + " moeda(s) de R$ 0.10");
        System.out.println(m05 + " moeda(s) de R$ 0.05");
        System.out.println(m01 + " moeda(s) de R$ 0.01");

        sc.close();
    }
}
