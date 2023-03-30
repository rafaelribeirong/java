package exercicios;

import java.util.Scanner;

public class NotaValorValido {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {

            System.out.println("Digite uma nota: ");

            double nota = scan.nextDouble();   


        if (nota >= 0 && nota <=10){
            notaValida = true;
            System.out.println("Você digitou: " + nota);
         } else {
           
            System.out.println("Nota invalida digite novamente: ");

         }

        } while (!notaValida);

        
    }

    }
    

