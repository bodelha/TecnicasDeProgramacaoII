import java.util.Vector;

public class AppExercicio7 {

    public static void main(String[] args) {
        System.out.println("Vetor X: ");
        Vector<Integer> x = AppExercicio4.gerarVetorDeInteiros(5);
        System.out.println("Vetor Y: ");
        Vector<Integer> y = AppExercicio4.gerarVetorDeInteiros(5);

        System.out.println("Soma: " + somarVetores(x, y));
        System.out.println("Produto: " + multiplicarVetores(x, y));
        System.out.println("Diferença: " + diferencaVetores(x, y));
        System.out.println("Intersecção: " + intersecaoVetores(x, y));
        System.out.println("União: " + uniaoVetores(x, y));
    }

    private static Vector<Integer> somarVetores(Vector<Integer> x, Vector<Integer> y) {
        Vector<Integer> soma = new Vector<Integer>();
        for (int i = 0; i < x.size(); i++) {
            soma.add( x.get(i) + y.get(i));
        }
        return soma;
    }

    private static Vector<Integer> multiplicarVetores(Vector<Integer> x, Vector<Integer> y) {
        Vector<Integer> produto = new Vector<Integer>();
        for (int i = 0; i < x.size(); i++) {
            produto.add( x.get(i) * y.get(i));
        }
        return produto;
    }

    private static Vector<Integer> diferencaVetores(Vector<Integer> x, Vector<Integer> y) {
        Vector<Integer> diferenca = new Vector<Integer>();
        for (int valorX : x) {
            if (!existeEmVetor(valorX, y)) {
                diferenca.add(valorX);
            }
        }
        return diferenca;
    }

    private static boolean existeEmVetor(int valor, Vector<Integer> vetor) {
        for (int valorVetor : vetor) {
            if (valor == valorVetor) {
                return true;
            }
        }
        return false;
    }

    private static Vector<Integer> intersecaoVetores(Vector<Integer> x, Vector<Integer> y) {
        Vector<Integer> intersecao = new Vector<Integer>();
        for (int valorX : x) {
            if (existeEmVetor(valorX, y)) {
                intersecao.add(valorX);
            }
        }
        return intersecao;
    }

    private static Vector<Integer> uniaoVetores(Vector<Integer> x, Vector<Integer> y) {
        Vector<Integer> uniao = new Vector<Integer>();
        for (Integer valorX : x) {
            if (!existeEmVetor(valorX, uniao)) {
                uniao.add(valorX);
            }            
        }
        for (Integer valorY : y) {
            if (!existeEmVetor(valorY, uniao)) {
                uniao.add(valorY);
            }            
        }
        return uniao;
    }

}
