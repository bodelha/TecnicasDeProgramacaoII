import java.util.Scanner;

public class AppExercicio10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double volume = volume(1);

        if (volume == 4.1888) {
            System.out.println("Volume foi adequadamente calculado");
        }

        System.out.println("Insira valor para raio");
        double raio = scanner.nextDouble();
        volume(raio);
    }

    public static double volume(double raio) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.printf("Raio:  %.4f\nVolume: %.4f\n", raio, volume);
        return volume;
    }

}
