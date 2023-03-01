package exercicios;

import java.util.Scanner;

public class TemperaturaGraus {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double f = scan.nextDouble();


        double celsius = (5 * (f - 32) / 9);
        System.out.println("Convertendo sua temperatura para Celsius será: " + celsius);

    }

}
