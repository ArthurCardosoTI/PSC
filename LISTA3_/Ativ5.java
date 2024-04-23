import java.util.Scanner;

public class Ativ5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, resultado;
        char caractere;

        System.out.print("Digite o primeiro número: ");
            numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
            numero2 = scanner.nextDouble();
        System.out.println("Digite a operação que voce deseja fazer: ");
            caractere = scanner.next().charAt(0);

        switch (caractere) {
            case '+':
                resultado = numero1 + numero2;
                    System.out.println("Resultado da soma de: " + numero1 + " + " + numero2 + ": " + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                    System.out.println("Resultado da subtracao de: " + numero1 + " - " + numero2 + ": " + resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                    System.out.println("Resultado da multiplicão de: " + numero1 + " * " + numero2 + ": " + resultado);
                break;

            case '/':
                resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão de: " + numero1 + " / " + numero2 + ": " + resultado);
                break;

            case '^':
                resultado = (double) Math.pow(numero1, numero2);
                 System.out.println("O numero: " + numero1 + " , elevado a: " + numero2 + ": " + resultado);
                break;

            default:
                System.out.println("Operação inválida.");
        }
        scanner.close();
    }
}