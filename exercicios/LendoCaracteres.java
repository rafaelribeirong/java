package exercicios;

import java.util.Scanner;

public class LendoCaracteres {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Entre com o nome: ");
            nome = scan.next();

            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa no mínmo 3 caracteres! ");

            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com a idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser de 0 até 150!");

            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o salário: ");
            salario = scan.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0 !");

            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o sexo: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser F ou M!");

            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o estado cívil: ");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("Estado cívil precisa ser s, c, v, d!!");

            }
        } while (!infoValida);

        System.out.println("As seguintes informações foram coletadas:" );
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + idade);
        System.out.println("Nome: " + salario);
        System.out.println("Nome: " + sexo);
        System.out.println("Nome: " + estadoCivil);

    }
}
