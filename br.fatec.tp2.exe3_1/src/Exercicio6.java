
public class Exercicio6 {

    public static double calculateT(int[] w, int[] j) {

        int maxW = Integer.MIN_VALUE;
        int minJ = Integer.MAX_VALUE;
        int sumW = 0;
        int sumJ = 0;

        for (int i = 0; i < w.length; i++) {
            maxW = Math.max(maxW, w[i]);
            minJ = Math.min(minJ, j[i]);
            sumW += w[i];
            sumJ += j[i];
        }

        double avgW = sumW / w.length;
        double avgJ = sumJ / j.length;

        return (maxW * (minJ + 1)) / (avgW + avgJ);
    }

    public static void main(String[] args) {
        int[] w = Exercicio3.gerarVetorAleatorio(100);
        int[] j = Exercicio3.gerarVetorAleatorio(100);

        double t = calculateT(w, j);
        System.out.println("t = " + t);
    }
}
