import java.util.Random;

public class Exercicio3 {

    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] arrW = gerarVetorAleatorio(10);
        int[] arrK = gerarVetorAleatorio(10);

        int acumulador = 0;
        for (int i = 0; i < arrW.length; i++) {
            acumulador += arrW[i] + arrK[i]*(9-i);
        }
        System.out.println(acumulador);
    }

    
    public static int[] gerarVetorAleatorio(int quantidade) {
        int[] conjunto = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            int elemento = random.nextInt(quantidade*10);
            conjunto[i] = elemento;
            System.out.print(elemento + " ");
        }
        System.out.println();
        return conjunto;
    }
}
