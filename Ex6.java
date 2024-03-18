import java.util.Random;
import java.util.Scanner;

public class Ex6 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        int menor, maior;
        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        int numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é " + numeroSorteado + " e ele é par.");
        } else {
            System.out.println("O número sorteado é " + numeroSorteado + " e ele é ímpar.");
        }
    }
}
