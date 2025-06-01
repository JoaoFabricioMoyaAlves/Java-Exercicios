package omaior;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

      int A, B, C;
      A = sc.nextInt();
      B = sc.nextInt();
      C = sc.nextInt();
      
      int maiorAB = (A+B + Math.abs(A-B))/2;

      if(maiorAB > C){
            System.out.println(maiorAB+" eh o maior");
      }else{
        System.out.println(C+" eh o maior");
      }
    }
}