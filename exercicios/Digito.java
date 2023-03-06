package exercicios;

import java.util.Scanner;

public class Digito {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com uma letra:(F ou M) ");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")) {
            System.out.println("F - Feminino");
        } 
        else if (input.equalsIgnoreCase("m")) {
            System.out.println("M - Masculino");
        } 
        else {
            System.out.println("Sexo inválido");

        }
    }
}
