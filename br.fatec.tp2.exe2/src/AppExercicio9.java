import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AppExercicio9 {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> controle = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numero = random.nextInt(98) + 1;
                if (!controle.contains(numero)) {
                    controle.add(numero);
                }
                System.out.printf("%2d ", numero);
            }
            System.out.println();
        }
    }
}
