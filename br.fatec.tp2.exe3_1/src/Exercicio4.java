import java.util.TreeSet;

public class Exercicio4 {

    public static void main(String[] args) {
        int[] vetA = Exercicio3.gerarVetorAleatorio(20);
        int[] vetB = Exercicio3.gerarVetorAleatorio(20);

        TreeSet<Integer> vetC = new TreeSet<>();

        for (int i = 0; i < vetA.length; i++) {
            vetC.add(vetA[i]);
        }

        for (int i = 0; i < vetB.length; i++) {
            vetC.add(vetB[i]);
        }

        for (Integer elemento : vetC) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
