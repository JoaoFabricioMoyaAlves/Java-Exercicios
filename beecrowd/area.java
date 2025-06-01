package area;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

      double A, B, C, PI = 3.14159;
      A = sc.nextDouble();
      B = sc.nextDouble();
      C = sc.nextDouble();
      double aux = (A*C/2);
      System.out.printf("TRIANGULO: %.3f\n",aux);
       aux = (PI*(C*C));
      System.out.printf("CIRCULO: %.3f\n",aux);
       aux = ((A+B)*C/2);
      System.out.printf("TRAPEZIO: %.3f\n",aux);
      aux = B*B;
      System.out.printf("QUADRADO: %.3f\n",aux);
      aux = A*B;
      System.out.printf("RETANGULO: %.3f\n",aux);



    }
}