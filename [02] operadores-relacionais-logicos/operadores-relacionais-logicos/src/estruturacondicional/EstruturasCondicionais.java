package estruturacondicional;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        // if (se), else if (se não, se), else (se não)

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");

        int idade = scan.nextInt();

        if (idade <= 10) {
            System.out.println("Criança");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else if (idade > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idade invalida!");
        }

        scan.close();

        System.out.println("-------- Fim do código --------");
    }
}
