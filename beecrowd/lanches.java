package lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aux, qt;
        double valor_final = 0;

       
            aux = sc.nextInt();
            qt = sc.nextInt();
            

            switch (aux) {
                case 1:
                    valor_final = 4.00 * qt;
                    break;
                case 2:
                    valor_final = 4.50 * qt;
                    break;
                case 3:
                    valor_final = 5.00 * qt;
                    break;
                case 4:
                    valor_final = 2.00 * qt; 
                    break;
                case 5:
                    valor_final = 1.50 * qt;
                    break;
                default:
                    break;
            }
        

        System.out.printf("Total: R$ %.2f\n", valor_final);

    }
}