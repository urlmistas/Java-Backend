import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        //Tentar acertar senha até acabar as tentativas (3)

        Scanner scan = new Scanner(System.in);
        String senhaCorreta = "java21";
        String senhaDigitada;
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scan.nextLine();

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Acesso liberado!");
                return;
            } else {
                tentativasRestantes--;
                System.out.println(tentativasRestantes > 0 ? "Senha incorreta! Tentativas restantes: " + tentativasRestantes : "Acesso negado!");
            }
        }

        scan.close();
    }
}
