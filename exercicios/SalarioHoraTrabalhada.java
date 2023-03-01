package exercicios;

import java.util.Scanner;

public class SalarioHoraTrabalhada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quando você ganha por hora:");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas trabalha no mês:");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Ir: " + ir);
        System.out.println("Total descontos: " + totalDescontos);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
