package esfera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double pi = 3.14159, R;
       Scanner sc = new Scanner(System.in);
       R = sc.nextDouble();
     
       double volume = (4/3.0) * pi * (R * R * R);
       System.out.printf("VOLUME = %.3f\n",volume);
}

}