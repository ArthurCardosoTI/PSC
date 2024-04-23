import java.util.Scanner;

public class Ativ2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorCompra, valorPago, troco;
        int quantidade;
        int[] notas = {50, 20, 10, 5, 2, 1};

        System.out.print("Valor da compra: ");
            valorCompra = scanner.nextDouble();
        System.out.print("Valor pago: ");
            valorPago = scanner.nextDouble();

        troco = valorPago - valorCompra;
        if (troco < 0) {
            System.out.println("Valor pago é insuficiente.");
        }

        for (int nota : notas) {
            quantidade = (int) (troco / nota);
                if (quantidade > 0) {
                    System.out.println("Entregar " + quantidade + " nota(s) de R$ " + nota);
                        troco %= nota;
                }
            }
        if (troco > 0) {
            System.out.println("Troco exato não foi possível.");
        } else {
            System.out.println("Troco fdado com sucesso.");
        }
        scanner.close();
    }
}