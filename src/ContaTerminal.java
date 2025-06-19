import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 

       
        System.out.println("Seja bem-vindo, informe o seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Informe o valor depositado: ");
        int infoValue = scanner.nextInt();

        
        System.out.println("Olá, " + name + "! O valor do depósito é " + infoValue + " reais.");

        
        scanner.close();
    }
}
