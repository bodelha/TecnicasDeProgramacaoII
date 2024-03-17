import java.util.ArrayList;
import java.util.Random;

public class AppExercicio2 {


    private static final Random random = new Random();

    public static void main(String[] args) {

        ArrayList<Integer> conjunto1 = gerarConjuntoAleatorio(10);
        ArrayList<Integer> conjunto2 = gerarConjuntoAleatorio(10);

        ArrayList<Integer> elementosComuns = encontrarElementosComuns(conjunto1, conjunto2);

        System.out.println("Elementos comuns:");
        for (int elemento : elementosComuns) {
            System.out.print(elemento + " ");
        }
        System.out.println("\n---------------");
    }

    public static ArrayList<Integer> gerarConjuntoAleatorio(int quantidade) {
        ArrayList<Integer> conjunto = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            int elemento = random.nextInt(quantidade*10);
            conjunto.add(elemento);
            System.out.print(elemento + " ");
        }
        System.out.println();
        return conjunto;
    }

    private static ArrayList<Integer> encontrarElementosComuns(ArrayList<Integer> conjunto1, ArrayList<Integer> conjunto2) {
        ArrayList<Integer> elementosComuns = new ArrayList<>();
        for (int elemento1 : conjunto1) {
            for (int elemento2 : conjunto2) {
                if (elemento1 == elemento2) {
                    elementosComuns.add(elemento1);
                }
            }
        }
        return elementosComuns;
    }
}
