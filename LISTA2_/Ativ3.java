import java.util.Scanner;

public class Ativ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Bim1, Bim2, Bim3, Bim4;
        double media, soma;
        
        System.out.print("Digite a primeira nota: ");
            Bim1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
            Bim2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
            Bim3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
            Bim4 = scanner.nextDouble();

        soma = Bim1 + Bim2 + Bim3 + Bim4;
        media = soma / 4;
        
        
        System.out.println("Média do aluno é: " + media);
        scanner.close();
    }
}