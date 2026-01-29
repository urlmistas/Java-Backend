import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, tudo bem? Vamos começar seu cadastro!");

        System.out.println("Primeiro, digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Agora, digite seu CPF (não é obrigatório usar pontuação): ");
        String cpf = scanner.nextLine();

        System.out.println("Digite seu estado civíl (Solteiro, Casado, etc): ");
        String estado = scanner.nextLine();

        System.out.println("Agora, digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura em CM (Ex.: 1,82): ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso em KG (Ex.: 86,5): ");
        double peso = scanner.nextDouble();

        scanner.close();

        System.out.println("Cadastro concluído! Seu nome é " + nome + ", seu CPF é " + cpf + ", sua idade é " + idade + ", sua altura é " + altura + ", seu peso é " + peso + " e seu estado cívil é " + estado);

    }
}