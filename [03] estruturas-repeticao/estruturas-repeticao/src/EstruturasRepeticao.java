import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args) {

        menuImc();

    }

    public static void menuImc() {
        Scanner sc = new Scanner(System.in);

        int decisaoUsuario = 1;
        do {
            System.out.println("Você deseja calcular o IMC?\nPara sim, digite 1;\nPara não, digite 2.");

            decisaoUsuario = sc.nextInt();

            if(decisaoUsuario == 1){
                calculoImc();
            } else if (decisaoUsuario != 2) {
                decisaoUsuario = 1;
                System.out.println("Você digitou uma opção inválida!\n\n");
                continue;
            } else {
                System.out.println("Encerrando programa.");
            }
        } while(decisaoUsuario == 1);
        sc.close();
    }

    public static void calculoImc() {
        System.out.println("Bem-vindo(a) ao cálculo de IMC.\n");
        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.print("Para sair, digite 0; \n\nDigite seu peso: ");
            double peso = scan.nextDouble();

            if(peso <= 0){
                break;
            }

            System.out.print("Digite sua altura: ");
            double altura = scan.nextDouble();


            if(altura <= 0){
                break;
            }

            double imc = peso / (altura * altura);
            String resultadoImc = "";
            if (imc < 22) {
                resultadoImc = "abaixo do peso.";
            } else if (imc >= 22 && imc < 27) {
                resultadoImc = "com peso normal.";
            } else if (imc >= 27 && imc < 29.99 ) {
                resultadoImc = "com sobrepeso";
            } else {
                resultadoImc = "obeso";
            }
            System.out.println("Seu IMC é: " + imc + ". Você está " + resultadoImc);

        }

        System.out.println("Você saiu.");
    }

    public static void forCrescente() {

        System.out.print("Digite o número máximo a ser contato desde o zero: ");
        Scanner scan = new Scanner(System.in);
        int numeroMaximo = scan.nextInt();

        scan.close();

        System.out.println("FOR CRESCENTE:\n");

        if (numeroMaximo > 0) {
            for(int n1 = 0; n1 <= numeroMaximo; n1++) {
                System.out.println("O contador está em: " + n1);
            }
            System.out.println();
        } else {
            System.out.println("Número inválido! Você digitou um número menor que 1.");
        }
    }

    public static void forDecrescente() {

        System.out.print("Digite o número inicial para contar até chegar à um: ");
        Scanner scan = new Scanner(System.in);
        int numeroInicial = scan.nextInt();

        scan.close();

        System.out.println("FOR DECRESCENTE:\n");

        if(numeroInicial > 0) {
            for(int n1 = 100; n1 >= numeroInicial; n1--) {
                System.out.println("O contador está em: " + n1);
            }
            System.out.println();
        } else {
            System.out.println("Número inválido! Você digitou um número menor que 1.");
        }
    }
}
