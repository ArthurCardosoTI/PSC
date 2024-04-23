import java.util.Scanner;

public class Ativ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, soma, subtracao, multiplicacao;
    
        System.out.print("Digite o primeiro numero: ");
            num1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
            num2 = scanner.nextDouble();
    
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
    
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        scanner.close();
    }
}