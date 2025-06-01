package figurinha;

import java.util.Scanner;

public class Main {

    
    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        for (int i = 0; i < N; i++) {
            int F1 = sc.nextInt();
            int F2 = sc.nextInt();
            int resultado = calcularMDC(F1, F2);
            System.out.println(resultado);
        }

        sc.close();
    }
}
