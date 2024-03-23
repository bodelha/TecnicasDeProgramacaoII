import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número para gerar a tabuada: ");
            int numero = scanner.nextInt();

            System.out.println("\nTabuada do " + numero + ":\n");

            System.out.println("Soma:");
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d + %d = %d\n", numero, i, numero + i);
            }

            System.out.println("\nMultiplicação:");
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", numero, i, numero * i);
            }
        }
    }
}
