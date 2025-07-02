import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        int number = scanner.nextInt();

        boolean keepVerify = true;

        while (keepVerify) {
            System.out.println("Informe um número para verificação:");
            int toVerify = scanner.nextInt();

            if (toVerify < number) {
                System.out.printf("Informe um número maior que %d\n", number);
                continue;
            }

            int result = toVerify % number;
            keepVerify = result != 0;

            System.out.printf("%d %% %d = %d\n", toVerify, number, result);
        }

        scanner.close();
    }
}
