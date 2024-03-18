import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o indicador de operação (1, 2 ou 3):");
        int operacao = scanner.nextInt();

        System.out.println("Digite o raio do círculo ou esfera:");
        double raio = scanner.nextDouble();

        switch (operacao) {
            case 1:
                double perimetro = 2 * Math.PI * raio;
                System.out.println("O perímetro do círculo é " + perimetro);
                break;
            case 2:
                double area = Math.PI * raio * raio;
                System.out.println("A área do círculo é " + area);
                break;
            case 3:
                double volume = 4/3.0 * Math.PI * Math.pow(raio, 3);
                System.out.println("O volume da esfera é " + volume);
                break;
            default:
                System.out.println("Código da operação é inválido.");
                break;
        }
    }
}