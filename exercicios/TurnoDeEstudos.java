package exercicios;

import java.util.Scanner;

public class TurnoDeEstudos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno em que você estuda: ");
        String turno = scan.next();

        switch (turno) {
            case "m":
            case "M":
                System.out.println("Bom dia!");
                break;
            case "v":
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "n":
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valo inválido!");

        }

    }
}
