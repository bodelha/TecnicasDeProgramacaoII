import java.util.Scanner;

public class QuantosNegativosEmNNumeros {

    public static int calc(int total) {
        Scanner myObj = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < total; i++) {
            System.out.printf("Insira o número %d de %d:\n", i+1, total);
            int number = myObj.nextInt();
            if (number < 0) {
                counter++;
            }
        }
        return counter;
    }

}
