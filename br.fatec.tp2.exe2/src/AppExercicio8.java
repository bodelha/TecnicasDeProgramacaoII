import java.util.Random;

public class AppExercicio8 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[][] matriz = gerarMatriz(10, 10);

        System.out.println(calcularSomaDiagonalPrincipal(matriz));
    }

    private static int[][] gerarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int item = random.nextInt(99);
                matriz[i][j] = item;
                System.out.printf("%2d   ", item);
            }
            System.out.println();
        }
        return matriz;
    }

    private static int calcularSomaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }
}