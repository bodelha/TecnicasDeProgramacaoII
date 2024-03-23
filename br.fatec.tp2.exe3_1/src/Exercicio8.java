import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] acertos = Exercicio3.gerarVetorAleatorio(11);

            double media = calcularMedia(acertos);
            double[] discrepancias = calcularDiscrepancias(acertos, media);
            double[] quadrados = calcularQuadrados(discrepancias);
            double variancia = calcularVariancia(quadrados);

            System.out.println("\n**Resultados:**");
            System.out.println("Média de acertos: " + String.format("%.2f", media));
            System.out.println("Discrepâncias:");
            for (int i = 0; i < 11; i++) {
                System.out.printf("Jogador %2d: %3d  %+.2f   %2.2f\n", i + 1, acertos[i], discrepancias[i], quadrados[i]);
            }
            System.out.println("\nVariância: " + String.format("%.2f", variancia));
        }
    }

    private static double calcularMedia(int[] valores) {
        double soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    private static double[] calcularDiscrepancias(int[] acertos, double media) {
        double[] discrepancias = new double[acertos.length];
        for (int i = 0; i < acertos.length; i++) {
            discrepancias[i] = (acertos[i] - media) / media;
        }
        return discrepancias;
    }

    public static double[] calcularQuadrados(double[] discrepancias) {
        double[] quadrados = new double[discrepancias.length];
        for (int i = 0; i < discrepancias.length; i++) {
            quadrados[i] = discrepancias[i] * discrepancias[i];
        }
        return quadrados;
    }

    private static double calcularVariancia(double[] quadrados) {
        double somaQuadrados = 0;
        for (double quadrado : quadrados) {
            somaQuadrados += quadrado;
        }
        return somaQuadrados / (quadrados.length - 1);
    }
}
