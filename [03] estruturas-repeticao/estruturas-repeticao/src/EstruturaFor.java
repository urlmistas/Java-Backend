import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {

        // Cédulas: 100, 50, 20, 10, 5, 2

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor que deseja sacar (Min: R$2, Max: R$1000): ");
        int valorSaque = scan.nextInt();

        if (valorSaque < 2 || valorSaque > 1000 ||
                (valorSaque % 2 != 0 && valorSaque % 5 != 0)) {
            System.out.println("Valor de saque inválido! Não é possível sacar esse valor com as cédulas disponíveis.");
            return;
        }

        int nota = 100;

        System.out.println();

        for (int i = 0; i < 6; i++) {
            int quantidadeCedulas = valorSaque / nota;
            String textNotas = (quantidadeCedulas == 1) ? "nota" : "notas";
            if (quantidadeCedulas > 0) {
                System.out.println(quantidadeCedulas + " " + textNotas + " de R$" + nota );
                valorSaque = valorSaque % nota;
            }

            if (nota == 100) {
                nota = 50;
            } else if (nota == 50) {
                nota = 20;
            } else if (nota == 20) {
                nota = 10;
            } else if (nota == 10) {
                nota = 5;
            } else {
                nota = 2;
            }
        }

        scan.close();
    }
}
