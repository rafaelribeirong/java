package exercicios;

import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int valor1 = scan.nextInt();

        System.out.println("Digite outro numero:");
        int valor2 = scan.nextInt();

        if (valor1 > valor2) {
            System.out.println("O maior número é: " + valor1);
        } else if (valor2 > valor1){
            System.out.println("O maior valor é: " + valor2);
        } else 
        System.out.println("Os números são iguais!: ");

    }

}
