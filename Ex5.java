import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o símbolo da operação (+, -, *, / ou ^):");
        char operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                double soma = num1 + num2;
                System.out.println("O resultado da operação é " + soma);
                break;
            case '-':
                double subtracao = num1 - num2;
                System.out.println("O resultado da operação é " + subtracao);
                break;
            case '*':
                double multiplicacao = num1 * num2;
                System.out.println("O resultado da operação é " + multiplicacao);
                break;
            case '/':
                if (num2 != 0) {
                    double divisao = num1 / num2;
                    System.out.println("O resultado da operação é " + divisao);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            case '^':
                double potencia = Math.pow(num1, num2);
                System.out.println("O resultado da operação é " + potencia);
                break;
            default:
                System.out.println("Símbolo da operação é inválido.");
                break;
        }
    }
}
