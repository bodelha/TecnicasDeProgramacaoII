
import java.util.Scanner;

public class App1a6 {

    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            // 4. Crie um programa que receba um número inteiro n e leia n valores do
            // teclado e compute quantos destes valores são negativos
            System.out.println("Insira a quantidade total de números a serem avaliados");
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
            // 6. Salário líquido após desconto do INSS
            System.out.println("Insira o salário bruto");
            SalarioLiquido calculadora = new SalarioLiquido();
            double salario = myObj.nextDouble();
            calculadora.calc(salario);
            // 8. Operações em amostras
            int[] numerosX = {2,7,4,3,2};
            int[] numerosY = {1,2,3,6,5};
            System.out.println("Insira código da operação(1 a 3)");
            int codigo = myObj.nextInt();
            int resultado = Somatorios.main(numerosX, numerosY, codigo);
            System.out.printf("O resultado é %d", resultado);
            // 9. Comparação CDBs:
            System.out.println("Insira valor da selic [exemplo:6,75]");
            double selic = myObj.nextDouble();
            System.out.println("Insira valor do capital");
            double capital = myObj.nextDouble();
            ComparadorCDB.main(selic, capital);




        }
    }
}
