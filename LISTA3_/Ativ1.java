import java.util.Scanner;

public class Ativ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, menor, maior, media;

        System.out.println("Digite tres numeros.");
        System.out.println("numero 1: ");
            num1 = scanner.nextDouble();
        System.out.println("numero 2: ");
            num2 = scanner.nextDouble();
        System.out.println("numero 3: ");
            num3 = scanner.nextDouble();

        media = (num1 + num2 + num3) / 3;
        maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média seria: " + media);
        scanner.close();
    }
}