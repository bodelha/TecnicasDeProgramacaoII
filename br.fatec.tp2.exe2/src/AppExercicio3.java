import java.util.ArrayList;

public class AppExercicio3 {

    public static void main(String[] args) {
        ArrayList<Integer> vetor = AppExercicio2.gerarConjuntoAleatorio(100);

        int maior = 0;
        int menor = 1000;
        int pares = 0;
        int soma = 0;

        for (int valor : vetor) {
            if (valor > maior) {
                maior = valor;
            } else if (valor < menor) {
                menor = valor;
            }
            if (valor % 2 == 0) {
                pares++;
            }
            soma += valor;
        }

        double media = (double) soma / vetor.size();
        double porcentagemPares = ((double) pares / vetor.size()) * 100;

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.printf("são pares: %.2f%%\n", porcentagemPares);
        System.out.printf("media: %.2f\n", media);
    }
}
