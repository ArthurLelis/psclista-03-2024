import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scan.nextInt();

        int maior = defineMaior(num1, num2, num3);
        int menor = defineMenor(num1, num2, num3);
        double media = defineMedia(num1, num2, num3);

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);
    }

    private static int defineMaior(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    private static int defineMenor(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    private static double defineMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}