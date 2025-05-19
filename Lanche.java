import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double preco = 0;
        switch (codigo) {
            case 1:
                preco = 4;
                break;
            case 2:
                preco = 4.5;
                break;
            case 3:
                preco = 5;
                break;
            case 4:
                preco = 2;
                break;
            case 5:
                preco = 1.5;
                break;
            default:
                System.out.println("Código inválido");
                return;
        }
        double total = preco * quantidade;
        System.out.printf("Total: R$ %.2f\n", total);
        scanner.close();
    }

}