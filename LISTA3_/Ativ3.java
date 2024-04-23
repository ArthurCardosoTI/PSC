import java.util.Scanner;

public class Ativ3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, equação;
        
        System.out.println("Digite A:");
            a = scanner.nextDouble();
        System.out.println("Digite B:");
            b = scanner.nextDouble();
        System.out.println("Digite C:");
            c = scanner.nextDouble();

        delta = Math.pow(b, 2) - (4 * a * c);

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        }   else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau\" e deverá ser informado o valor da raiz real da equação");
            } else if (delta < 0) {
                    System.out.println("Esta equação não possui raízes reais");
            } else if (delta == 0) {
                    System.out.println("Esta equação possui duas raízes reais iguais.");
                    System.out.println("Valor da raiz: " + (-b / (2 * a)));
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Valores das raízes: " + raiz1 + " e " + raiz2);
            }
        equação = Math.pow(a, 2) + b + c;
            System.out.println("\nResultado da Equação: " + equação);
        scanner.close();
    }
}