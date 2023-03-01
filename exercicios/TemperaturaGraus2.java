package exercicios;

import java.util.Scanner;

public class TemperaturaGraus2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celcius: ");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;
        System.out.println("Convertendo sua temperatura para Celsius será: " + f);

    }

}
