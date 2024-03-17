import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class AppExercicio4 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        Vector<Integer> vetor = gerarVetorDeInteiros(10);

        System.out.println("Insira um valor inteiro para ser comparado aos do vetor");
        int valorReferencia = scanner.nextInt();

        System.out.println(filtroMaiores(vetor, valorReferencia));
        System.out.println(contarMenores(vetor, valorReferencia));
        System.out.println(contarOcorrencias(vetor, valorReferencia));
    }

    public static Vector<Integer> gerarVetorDeInteiros(int quantidade) {
        Vector<Integer> vetorDeInteiros = new Vector<Integer>();
        for (int i = 0; i < quantidade; i++) {
            int inteiro = random.nextInt(quantidade * 10);
            vetorDeInteiros.add(inteiro);
            System.out.print(inteiro + " ");
        }
        System.out.println("\n---------------");
        return vetorDeInteiros;
    }

    private static Vector<Integer> filtroMaiores(Vector<Integer> vetor, int referencia) {
        Vector<Integer> resultado = new Vector<Integer>();
        for (int inteiro : vetor) {
            if (inteiro > referencia) {
                resultado.add(inteiro);
            }
        }
        return resultado;
    }

    private static int contarMenores(Vector<Integer> vetor, int referencia){
        int contador = 0;
        for (Integer inteiro : vetor) {
            if (inteiro < referencia) {
                contador++;
            }
        }
        return contador;
    }

    private static int contarOcorrencias(Vector<Integer> vetor, int referencia){
        int contador = 0;
        for (Integer inteiro : vetor) {
            if (inteiro == referencia) {
                contador++;
            }
        }
        return contador;
    }

}
