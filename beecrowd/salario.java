package salario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int A,B;
      double C;
      Scanner sc = new Scanner(System.in);

      A = sc.nextInt();
      B = sc.nextInt();
      C = sc.nextDouble();
      double salario = C * B;
      System.out.println("NUMBER = "+A);
      System.out.printf("SALARY = U$ %.2f\n",salario);

    }
}