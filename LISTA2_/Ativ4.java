import java.util.Scanner;

public class Ativ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoLitro, litrosVenda, precoTotal;
            
        System.out.print("Preço da gasolina é: ");
            precoLitro = scanner.nextDouble();
        System.out.print("Litros vendidos: ");
            litrosVenda = scanner.nextDouble();
            
        precoTotal = precoLitro * litrosVenda;
            
        System.out.println("Valor a ser pago será R$" + precoTotal);
        scanner.close();
    }
}