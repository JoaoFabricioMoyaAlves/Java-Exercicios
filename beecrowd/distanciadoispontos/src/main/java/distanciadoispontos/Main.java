package distanciadoispontos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2, d1, d2;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        d1 =  (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
        d2 = Math.sqrt(d1);
        System.out.printf("%.4f\n",d2);

    }
}