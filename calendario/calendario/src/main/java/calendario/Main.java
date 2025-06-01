package calendario;

import java.util.Scanner;

/* Crie uma classe chamada Calendario e dentro dela, um método chamado converteMes(int mes).

Esse método deve se comportar da seguinte forma:
Ao receber um valor (11, por exemplo) deve retornar o nome “Novembro”.

Deve haver mais dois métodos:
◦ 1) converteDataParaTexto(int dia, int mes, int ano) que recebe uma entrada como (12,10,2021) e retorna: Doze de Outubro de dois
mil e vinte e um
◦ 2) converteDataParaNumero(String dia) que recebe um valor como “trinta e um” e converte para número (31)
IMPORTANTE: É CLARO que as exceções devem ser tratadas;
Fazer modelagem, cardinalidade e implementar */

public class Main {
    public static void main(String[] args) {
        System.out.println(" Hello world! ");
        Scanner sc = new Scanner(System.in);
        Calendario cl = new Calendario();
        int dia;

        System.out.println("entre com o dia em valor numerico para conversao: ");
        dia = sc.nextInt();
        System.out.println("dia convertido e: " + cl.converteDias(dia));

    }
}