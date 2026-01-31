import java.util.Scanner;

public class Pratique3 {
    public static void main(String[] args) {

        // Iniciando as variáveis e o scanner
        Scanner scan = new Scanner(System.in);
        int escolhaUsuario;
        String fraseUsuario;

        // Laço Do-While para verificar se o usuário saiu do programa, se não, repete
        do {

            // Menu de opções
            System.out.println("Opcão 1: Continuar\nOpção 2: Sair");
            System.out.print("Digite sua escolha: ");
            escolhaUsuario = scan.nextInt();

            // Solicitando uma frase para o usuário
            if (escolhaUsuario == 1) {
                System.out.println();
                System.out.print("Por favor, digite uma frase: ");
                scan.nextLine();

                // Imprimindo a frase para o usuário
                fraseUsuario = scan.nextLine();
                System.out.println("Você digitou: " + fraseUsuario);
                System.out.println();

            // Se o usuário escolher sair do programa
            } else if (escolhaUsuario == 2) {
                System.out.println();
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");

            // Se o usuário não selecionar 1 ou 2
            } else {
                System.out.println();
                System.out.println("Opção inválida!");
            }

        // Só sai do loop se o usuário escolher sair
        } while (escolhaUsuario != 2);

        // Fechando o scanner
        scan.close();
    }
}
