package gosto_combustivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int velocidade, horas, percurso;
      horas = sc.nextInt();
      velocidade = sc.nextInt();
     percurso = horas * velocidade;
     double litros = percurso/12.00;
     System.out.printf("%.3f\n",litros);




    }
}