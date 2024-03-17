import java.util.Random;
import java.util.Vector;

public class AppExercicio6 {

    public static void main(String[] args) {
        Vector<Double> v = gerarVetorDeDouble(10);

        double m = calcularMedia(v);
        double desvioPadrao = calcularDesvioPadrao(v, m);

        System.out.printf("Média: %.2f\n", m);
        System.out.printf("Desvio padrão: %.2f\n", desvioPadrao);
    }

    private static Vector<Double> gerarVetorDeDouble(int quantidade) {
        Random random = new Random();
        Vector<Double> vetor = new Vector<Double>();
        for (int i = 0; i < quantidade; i++) {
            double numero = random.nextDouble() * 10;
            vetor.add(numero);
            System.out.print(numero + "  ");
        }
        System.out.println();
        return vetor;
    }

    private static double calcularMedia(Vector<Double> v) {
        double soma = 0;
        for (double valor : v) {
            soma += valor;
        }
        return soma / v.size();
    }

    private static double calcularDesvioPadrao(Vector<Double> v, double m) {
        double desvioPadrao = 0;
        for (double valor : v) {
            desvioPadrao += Math.pow(valor - m, 2);
        }
        return Math.sqrt(desvioPadrao / (v.size() - 1));
    }
}
