package exercicios;

import java.util.Scanner;

public class NotasParciais {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua primeira nota");
        double nota1 = scan.nextDouble();

        System.out.println("Digite sua segunda nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com distinção!");
        } else if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }

}
