import java.util.Scanner;

public class Pratique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dando boas vindas pro user (achei interessante)
        System.out.println("Boas-vindas ao sistema!");

        System.out.print("Por favor, digite seu nome: ");
        String nome = sc.next();

        // Adendo: Aqui optei por usar "isEmpty" porque a IDE sugeriu. Eu havia usado "nome.length() == 0",
        // porém ao passar o mouse por cima, a IDE disse que seria o mesmo que usar o "isEmpty".
        while (nome.isEmpty()) {
            System.out.print("Nome inválido. Digite algo: ");
            nome = sc.nextLine();
        }

        // Esse "hasNextInt" eu aprendi no De Olho no Erro que teve, aí fui testando pra ver como funcionava, gostei
        System.out.print("Agora, digite um número positivo aleatório: ");
        while(!sc.hasNextInt()) {
            System.out.print("Entrada inválida. Por favor, digite um número: ");
            sc.next();
        }

        int numeroPositivo = sc.nextInt();

        while (numeroPositivo <= 0) {
            System.out.print("Número inválido. Digite um número positivo: ");
            while (!sc.hasNextInt()) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
                sc.next();
            }
            numeroPositivo = sc.nextInt();
        }

        // Imprimindo os crescente
        System.out.println();
        System.out.println("--------------------------- CRESCENTE ---------------------------");
        if (numeroPositivo > 0) {
            System.out.println("Contagem crescente de 0 até o número digitado:\n");
            for(int n1 = 0; n1 <= numeroPositivo; n1++) {
                System.out.println("O contador está em: " + n1);
            }

            // Imprimindo os decrescentes também no mesmo if
            System.out.println();
            System.out.println("-------------------------- DECRESCENTE --------------------------");
            System.out.println("Contagem decrescente do número digitado até 0:\n");
            for(int n1 = numeroPositivo; n1 >= 0; n1--) {
                System.out.println("O contador está em: " + n1);
            }
        }

        // Imprimindo os nomes agora por último
        System.out.println();
        System.out.println("--------------------------- SEU NOME ---------------------------");
        if(nome.length() > 6) {
            for (int i = 1; i <= numeroPositivo; i++) {
                System.out.println("Seu nome " + nome + " foi exibido " + i + " vezes.");
            }
        } else {
            System.out.println("Seu nome " + nome + " será exibido apenas 1 vez por ter menos de 6 caracteres.");
        }

        // Fechando o scanner
        sc.close();
    }
}
