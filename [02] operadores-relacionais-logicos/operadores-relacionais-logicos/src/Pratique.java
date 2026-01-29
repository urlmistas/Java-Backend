import java.util.Scanner;

public class Pratique {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Digite um número inteiro: ");
        num1 = scanner.nextInt();
        System.out.print("Digite outro número inteiro: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num1 == num2) {
            System.out.println("Ambos são iguais!");
        } else {
            System.out.println("O maior número é: " + num2);
        }



        scanner.close();
    }
}
