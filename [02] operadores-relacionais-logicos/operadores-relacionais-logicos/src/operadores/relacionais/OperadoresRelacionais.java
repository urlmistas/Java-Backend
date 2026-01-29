package operadores.relacionais;
import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        // Operadores relacionais
        // == (igual a), != (diferente de), > (maior que), < (menor que), >= (maior ou igual a), <= (menor ou igual a)

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        scan.close();

        int resultado = num1 * num2;

        System.out.println(resultado);
    }
}
