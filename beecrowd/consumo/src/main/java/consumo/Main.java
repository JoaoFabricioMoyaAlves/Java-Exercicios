package consumo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int A;
       float B, media;
       A = sc.nextInt();
       sc.nextLine();
       B = sc.nextFloat();
       media = A/B;
       System.out.printf("%.3f km/l\n",media);
    }
}