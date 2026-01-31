import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        // Calculo de potência sem Math.pow

        Scanner scan = new Scanner(System.in);

        int base, expoente, resultado;

        do {
            System.out.print("Digite a base (min: 0): ");
            base = scan.nextInt();
        } while (base < 0);

        do {
            System.out.print("Digite o expoente (min: 0): ");
            expoente = scan.nextInt();
        } while (expoente < 0);

        resultado = 1;
        while (expoente > 0) {
            resultado = base * resultado;
            expoente--;
        }
        System.out.println("Resultado: " + resultado);

        scan.close();
    }
}
