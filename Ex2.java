import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        System.out.println("Digite o valor pago:");
        double valorPago = scanner.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
            return;
        }

        double troco = valorPago - valorCompra;
        int[] notas = {50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = new int[6];

        for (int i = 0; i < 6; i++) {
            if (troco >= notas[i]) {
                quantidadeNotas[i] = (int) (troco / notas[i]);
                troco -= quantidadeNotas[i] * notas[i];
            }
        }

        System.out.println("O troco será dado em:");
        for (int i = 0; i < 6; i++) {
            if (quantidadeNotas[i] != 0) {
                System.out.println(quantidadeNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
            }
        }
    }
}