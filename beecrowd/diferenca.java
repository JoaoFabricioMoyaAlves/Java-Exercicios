package diferenca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int A,B,C,D;
       Scanner sc = new Scanner(System.in);
       A = sc.nextInt();
       B = sc.nextInt();
       C = sc.nextInt();
       D = sc.nextInt();

       int DIFERENCA = (A * B - C * D);
       System.out.println("DIFERENCA = "+DIFERENCA);
    }
}