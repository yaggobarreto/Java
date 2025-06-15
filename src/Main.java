import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String name = scanner.nextLine();

        System.out.println("Informe o ano de nascimento");
        int birthYear = scanner.nextInt();

        // Pegar o ano atual usando a biblioteca
        int currentYear = LocalDate.now().getYear();

        // Calcular a idade
        int age = currentYear - birthYear;

        System.out.println("Olá, seja bem-vindo " + name + "! Sua idade é " + age + " anos.");


        scanner.close();
    }
}




