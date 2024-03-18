import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do coeficiente a:");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor do coeficiente b:");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor do coeficiente c:");
        double c = scanner.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
            return;
        } else if (a == 0 && b != 0) {
            double raiz = -c / b;
            System.out.println("Essa é uma equação de primeiro grau. A raiz da equação é " + raiz);
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Esta equação possui duas raízes reais iguais. As raízes são " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Esta equação possui duas raízes reais diferentes. As raízes são " + raiz1 + " e " + raiz2);
        }
    }
}