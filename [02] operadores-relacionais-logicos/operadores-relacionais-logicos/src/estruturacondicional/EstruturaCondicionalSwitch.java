package estruturacondicional;
import java.util.Scanner;

public class EstruturaCondicionalSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int day = scan.nextInt();

        // Usando if-else
//        if (day < 1 || day > 7) {
//            System.out.println("Número inválido. Digite de 1 a 7.");
//        } else {
//            System.out.print("Com if-else: ");
//            if (day == 1) {
//                System.out.println("Domingo");
//            } else if (day == 2) {
//                System.out.println("Segunda-feira");
//            } else if (day == 3) {
//                System.out.println("Terça-feira");
//            } else if (day == 4) {
//                System.out.println("Quarta-feira");
//            } else if (day == 5) {
//                System.out.println("Quinta-feira");
//            } else if (day == 6) {
//                System.out.println("Sexta-feira");
//            } else {
//                System.out.println("Sábado");
//            }
//        }

        // Usando switch-case

        System.out.print("Com switch-case: ");
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Digite de 1 a 7.");
        }

    }
}
