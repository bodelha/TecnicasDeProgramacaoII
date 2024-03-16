import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Venda> vendas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Venda %d:\n", i + 1);
            Venda venda = new Venda();

            System.out.print("Código do produto: ");
            venda.setCodigoProduto(scanner.nextInt());

            System.out.print("Valor unitário: ");
            venda.setValorUnitario(scanner.nextDouble());

            System.out.print("Quantidade: ");
            venda.setQuantidade(scanner.nextInt());

            venda.setValorTotal(venda.getValorUnitario() * venda.getQuantidade());

            vendas.add(venda);

            System.out.printf("Valor total da venda: R$ %.2f\n", venda.getValorTotal());
        }

        double valorMedio = calcularValorMedio(vendas);
        System.out.printf("Valor médio de venda: R$ %.2f\n", valorMedio);

        Venda vendaMaior = encontrarMaiorVenda(vendas);
        System.out.println("Produto com maior venda:");
        System.out.printf("Código: %d\n", vendaMaior.getCodigoProduto());
        System.out.printf("Quantidade: %d\n", vendaMaior.getQuantidade());
        System.out.printf("Valor total: R$ %.2f\n", vendaMaior.getValorTotal());

        Venda vendaMenor = encontrarMenorVenda(vendas);
        System.out.println("Produto com menor venda:");
        System.out.printf("Código: %d\n", vendaMenor.getCodigoProduto());
        System.out.printf("Quantidade: %d\n", vendaMenor.getQuantidade());
        System.out.printf("Valor total: R$ %.2f\n", vendaMenor.getValorTotal());

        double valorTotalVendido = calcularValorTotalVendido(vendas);
        System.out.printf("Valor total vendido: R$ %.2f\n", valorTotalVendido);

        int quantidadeTotalVendida = calcularQuantidadeTotalVendida(vendas);
        System.out.printf("Quantidade total de itens vendidos: %d\n", quantidadeTotalVendida);
    }

    private static double calcularValorMedio(ArrayList<Venda> vendas) {
        double somaValores = 0;
        for (Venda venda : vendas) {
            somaValores += venda.getValorTotal();
        }
        return somaValores / vendas.size();
    }

    private static Venda encontrarMaiorVenda(ArrayList<Venda> vendas) {
        Venda maiorVenda = vendas.get(0);
        for (Venda venda : vendas) {
            if (venda.getValorTotal() > maiorVenda.getValorTotal()) {
                maiorVenda = venda;
            }
        }
        return maiorVenda;
    }

    private static Venda encontrarMenorVenda(ArrayList<Venda> vendas) {
        Venda menorVenda = vendas.get(0);
        for (Venda venda : vendas) {
            if (venda.getValorTotal() < menorVenda.getValorTotal()) {
                menorVenda = venda;
            }
        }
        return menorVenda;
    }
    private static double calcularValorTotalVendido(ArrayList<Venda> vendas) {
        double valorTotalVendido = 0;
        for (Venda venda : vendas) {
            valorTotalVendido += venda.getValorTotal();
        }
        return valorTotalVendido;
    }
    private static int calcularQuantidadeTotalVendida(ArrayList<Venda> vendas) {
        int quantidadeTotalVendida = 0;
        for (Venda venda : vendas) {
            quantidadeTotalVendida += venda.getQuantidade();
        }
        return quantidadeTotalVendida;
    }
    
}