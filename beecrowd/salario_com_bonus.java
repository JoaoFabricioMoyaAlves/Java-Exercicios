package salario_com_bonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      String nome;
      double A,B;
      Scanner sc=new Scanner(System.in);
      nome = sc.nextLine();
      A = sc.nextDouble();
      B = sc.nextDouble();
      double total = A + B*0.15;
      System.out.printf("TOTAL = R$ %.2f\n",total);


    }
}