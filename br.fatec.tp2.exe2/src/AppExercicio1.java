import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AppExercicio1 {

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            produtos.add(gerarProdutoAleatorio());
        }

        System.out.println("Insira código do produto. Caso queira todos digite 0");
        int codigo = (scanner.nextInt());
        listarProdutos(produtos, codigo);
    }

    private static void listarProdutos(ArrayList<Produto> produtos, int codigo) {
        if (codigo == 0) {
            for (Produto produto : produtos) {
                System.out.println("--------------------");
                System.out.printf("cod: %d\n", produto.getCodigo());
                System.out.printf("quantidade: %d\n", produto.getQuantidade());
                System.out.printf("compra: R$ %.2f\n", produto.getValorCompra());
                System.out.printf("venda: R$ %.2f\n", produto.getValorVenda());
            }
        } else {
            Produto produtoEncontrado = null;

            for (Produto produto : produtos) {
                if (produto.getCodigo() == codigo) {
                    produtoEncontrado = produto;
                    break;
                }
            }

            if (produtoEncontrado != null) {    
                System.out.println("--------------------");
                System.out.printf("quantidade: %d\n", produtoEncontrado.getQuantidade());
                System.out.printf("compra: R$ %.2f\n", produtoEncontrado.getValorCompra());
                System.out.printf("venda: R$ %.2f\n", produtoEncontrado.getValorVenda());
            } else {
                System.out.println("Produto com código " + codigo + " não encontrado!");
            }
        }
    }

    private static Produto gerarProdutoAleatorio() {
        int codigo = random.nextInt(1000) + 1;
        // System.out.println(codigo);
        int quantidade = random.nextInt(100) + 1;
        double valorCompra = random.nextDouble() * 100;
        double valorVenda = valorCompra * (1 + random.nextDouble() * 0.5);

        return new Produto(codigo, quantidade, valorCompra, valorVenda);
    }
}

