import java.util.Scanner;

public class AppExercicio11_12_13_14 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // // Exercicio 11:
        System.out.println("Insira valor para horas");
        int horas = scanner.nextInt();
        System.out.println("Agora minutos");
        int minutos = scanner.nextInt();
        System.out.println("E por fim, segundos");
        int segundos = scanner.nextInt();
        System.out.println("Tempo total em segundos:");
        System.out.println(converterTempoParaSegundos(horas, minutos, segundos));

        // Exercicio 12:
        System.out.println("Insira base inteira");
        int base = scanner.nextInt();
        System.out.println("Insira expoente inteiro");
        int expoente = scanner.nextInt();
        System.out.printf("%d^%d = %d\n", base, expoente, calcularExponenciacao(base, expoente));

        // Exercicio 13:
        System.out.println("Insira número de linhas/exclamações");
        int linhas = scanner.nextInt();
        gerarLinhasComExclamacao(linhas);

        // Exercicio 14 :
        System.out.println("Insira altura do triangulo");
        int altura = scanner.nextInt();
        gerarTriangulo(altura);

    }

    private static int converterTempoParaSegundos(int horas, int minutos, int segundos) {
        int totalSegundosHoras = horas * 3600;
        int totalSegundosMinutos = minutos * 60;
        return totalSegundosHoras + totalSegundosMinutos + segundos;
    }

    private static int calcularExponenciacao(int x, int z) {
        int resultado = 1;
        for (int i = 0; i < z; i++) {
            resultado *= x;
        }
        return resultado;
    }

    private static void gerarLinhasComExclamacao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }

    private static void gerarTriangulo(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
