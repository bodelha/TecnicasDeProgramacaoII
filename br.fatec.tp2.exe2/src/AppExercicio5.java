import java.util.Vector;

public class AppExercicio5 {

    public static void main(String[] args) {

        System.out.println("Conjunto 1:");
        Vector<Integer> conjunto1 = AppExercicio4.gerarVetorDeInteiros(5);

        System.out.println("Conjunto 2:");
        Vector<Integer> conjunto2 = AppExercicio4.gerarVetorDeInteiros(5);

        int produtoEscalar = produtoEscalar(conjunto1, conjunto2);

        System.out.printf("Produto escalar: %d\n", produtoEscalar);
    }

    private static int produtoEscalar(Vector<Integer> conjunto1, Vector<Integer> conjunto2) {
        int produtoEscalar = 0;
        for (int i = 0; i < conjunto1.size(); i++) {
            produtoEscalar += conjunto1.get(i) * conjunto2.get(i);
        }
        return produtoEscalar;
    }
}
