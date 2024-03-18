import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AppExercicio9 {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> controle = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            // System.out.println("Linha " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                int numero = random.nextInt(99);
                if (!controle.contains(numero)) {
                    controle.add(numero);
                }
                System.out.printf("%3d ", numero);
            }
            System.out.println();
        }
    }
}
