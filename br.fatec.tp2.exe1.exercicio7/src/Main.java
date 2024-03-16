public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.nome = "João";
        a1.p1 = 7.0;
        a1.p2 = 4.0;

        System.out.printf("Dados a1:\nNome: %s\np1:%.2f\np2:%.2f\n", a1.nome, a1.p1, a1.p2);

        Aluno a2 = a1;
        a2.p1 = 8.0;
        a2.p2 = 7.0;

        System.out.printf("Notas a1:\np1:%.2f\np2:%.2f\n", a1.p1, a1.p2);
        System.out.printf("Notas a2:\np1:%.2f\np2:%.2f\n", a2.p1, a2.p2);

        /*
         * Os valores são iguais. Ao fazer a2=a1, teremos duas variáveis apontando
         * para o mesmo espaço na memória. Alterando o valor através de a2, o de
         * a1 também é alterado.
         */

    }
}
