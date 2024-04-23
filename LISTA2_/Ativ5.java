import java.util.Scanner;

public class Ativ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total, passagemAlemanha, passagemPortugal, passagemItalia;
        int pessoas;
        
        System.out.print("Preço para Alemanha: ");
            passagemAlemanha = scanner.nextDouble();
        System.out.print("Preço para Portugal: ");
            passagemPortugal = scanner.nextDouble();
        System.out.print("Preço para a Itália: ");
            passagemItalia = scanner.nextDouble();
        System.out.print("Digite a quantidade de pessoas que irão para a viagem: ");
            pessoas = scanner.nextInt();
        
        total = (passagemAlemanha + passagemPortugal + passagemItalia) * (pessoas);
        
        System.out.println("O valor total da viagem é: R$" + total);
        scanner.close();
    }
}