public class Exercicio2 {

    public static void main(String[] args) {
        // a) O que vai ser impresso quando o método main é chamado? Justifique.
        // "Before: 0 After: 1 Flap Flap: 0"
        // Só na linah 13 é que refereceCount será incrementado, então antes temvalor 0
        // e depois 1. Como em nenhum momento ser inicializa ou altera o valor de a, ele
        // assume valor zero. Fica tudo colado pelo uso de print e não println
        // b) refereceCount é um atributo de classe. Logo só um local em memoria será
        // ocupado. Já a variavel a é atributo de objeto, logo haverá um espaço
        // reservado por instancia. Como temos 10 bird e 5 nightingale, e nightingale
        // herda de bird, serão 15 instancia de a.

    }

}
