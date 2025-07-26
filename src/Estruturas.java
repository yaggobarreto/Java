import java.util.Scanner;

public class Estruturas {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        for (;;){
            System.out.println("Digite um nome");
            var name = scanner.next();

            if (name.equalsIgnoreCase("Exit")) break;

            System.out.println(name);
        }
    }

}

        



