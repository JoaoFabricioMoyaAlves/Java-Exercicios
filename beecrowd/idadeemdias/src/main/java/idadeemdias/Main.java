package idadeemdias;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade_em_dias, ano, mes, dias;
        Scanner sc = new Scanner(System.in);

        idade_em_dias = sc.nextInt();
        ano = idade_em_dias / 365;
        idade_em_dias = idade_em_dias % 365;
        mes = idade_em_dias / 30;
        idade_em_dias = idade_em_dias % 30;
        dias = idade_em_dias;
     System.out.println(ano+" ano(s)");
     System.out.println(mes+" mes(es)");
     System.out.println(dias+" dia(s)");
    }
}