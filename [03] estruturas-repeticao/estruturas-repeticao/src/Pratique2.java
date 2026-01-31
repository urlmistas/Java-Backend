import java.util.Scanner;

public class Pratique2 {
    public static void main(String[] args) {

        // Iniciando as variáveis e o scanner
        Scanner scan = new Scanner(System.in);
        int numeroInformado;

        // Solicitando o número para mostrar a tabuada
        System.out.print("Informe um número para exibir sua tabuada: ");
        numeroInformado = scan.nextInt();

        // Lógica da tabuada
        int index = 1;
        int end = 10;
        while (index <= end) {
            System.out.println(numeroInformado + " x " + index + " é: " + numeroInformado * index);
            index++;
        }

        // Encerrando o programa
        System.out.println("Fim da Execução!");

        // Fechando o scanner
        scan.close();
    }
}
