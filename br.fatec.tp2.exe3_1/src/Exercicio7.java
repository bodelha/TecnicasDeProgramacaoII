import java.util.Random;
import java.lang.Math;

public class Exercicio7 {

    private static final Random random = new Random();

    public static double calcularDesvioPadrao(double[] j) {

        double soma = 0;
        double media = 0;

        for (double valor : j) {
            soma += valor;
        }

        media = soma / j.length;

        double variancia = 0;
        for (double valor : j) {
            variancia += Math.pow(valor - media, 2);
        }

        return Math.sqrt(variancia / (j.length - 1));
    }

    public static void main(String[] args) {
        double[] j = gerarVetorAleatorio(100);
        double desvioPadrao = calcularDesvioPadrao(j);
        System.out.println("Desvio padrão do vetor J: " + desvioPadrao);
    }

    public static double[] gerarVetorAleatorio(int quantidade) {
        double[] conjunto = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            double elemento = 100 * random.nextDouble();
            conjunto[i] = elemento;
            System.out.print(elemento + " ");
        }
        System.out.println();
        return conjunto;
    }
}
