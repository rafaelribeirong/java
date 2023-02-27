package exercicios;

import java.util.Scanner;

public class NotasBimestres {

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Informe suas 4 notas do Bimestre: ");

    System.out.println("Primeira nota: ");
    double primeira = scan.nextDouble();

    System.out.println("Segunda nota: ");
    double segunda = scan.nextDouble();

    System.out.println("Terceira nota: ");
    double terceira = scan.nextDouble();

    System.out.println("Quarta nota: ");
    double quarta = scan.nextDouble();

    double total = (primeira + segunda + terceira + quarta) / 4 ;

    System.out.println("Sua nota final foi: " + total);





    
    }
}
