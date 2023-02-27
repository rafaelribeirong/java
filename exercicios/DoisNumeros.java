package exercicios;

import java.util.Scanner;

public class DoisNumeros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha dois números para serem somados ");
        
        System.out.println("Digite um número: ");
        int numero1 = scan.nextInt();
        
        System.out.println("Digite outro número: ");
        int numero2 = scan.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("A soma do seus números é: " + resultado);



    }

}
