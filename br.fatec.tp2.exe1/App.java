
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 4. Crie um programa que receba um número inteiro n e leia n valores do
        // teclado e compute quantos destes valores são negativos
        System.out.println("Insira a quantidade total de números a serem avaliados");
        Scanner myObj = new Scanner(System.in);
        int totalNegativos = myObj.nextInt();
        int saoNegativos = QuantosNegativosEmNNumeros.calc(totalNegativos);
        System.out.printf("%d dos valores são negativos", saoNegativos); 
        // 5. Crie um programa que recebe um valor inteiro informado pelo usuário e
        // determina se esse valor é um número primo. Observe que os números primos são
        // aqueles que são divisíveis apenas por eles próprios e por 1.
        System.out.println("Insira um número para saber se é primo ou não");
        int numero = myObj.nextInt();
        boolean ePrimo = Primo.calc(numero);
        System.out.printf("%d é primo?\n %b", numero, ePrimo);
    }
}
