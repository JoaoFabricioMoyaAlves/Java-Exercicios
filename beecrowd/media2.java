package com.media2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double A, B, C;
       Scanner sc = new Scanner(System.in);
       A=sc.nextDouble();
       B=sc.nextDouble();
       C=sc.nextDouble();
       A = A*0.2;
       B = B*0.3;
       C = C*0.5;
       double media = A+B+C;
       System.out.printf("MEDIA = %.1f\n",media);

    }


}