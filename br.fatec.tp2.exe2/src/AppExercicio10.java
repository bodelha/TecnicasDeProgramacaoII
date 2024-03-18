import java.util.Scanner;

public class AppExercicio10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Insira valor para raio (raio=1 deve retornar 4,1888)");
        double raio = scanner.nextDouble();
        calcularVolume(raio);
    }

    public static double calcularVolume(double raio) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.printf("Raio:  %.4f\nVolume: %.4f\n", raio, volume);
        return volume;
    }

}
