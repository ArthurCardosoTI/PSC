import java.util.Random;
import java.util.Scanner;

public class Ativ6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num1, num2, menor, maior, numeroSorteado;

        System.out.print("Digite o primeiro número inteiro: ");
            num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
            num2 = scanner.nextInt();

        menor = Math.min(num1, num2);
        maior = Math.max(num1, num2);
        numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado: " + numeroSorteado);
        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }
        scanner.close();
    }
}