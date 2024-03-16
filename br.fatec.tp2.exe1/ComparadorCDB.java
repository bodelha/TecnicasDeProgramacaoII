public class ComparadorCDB {
    public static void main(double selic, double capital) {

        double rendimentoCDBPagueMais = 0;
        double taxaCDPBagueMais = 0.85 * selic * 0.01;
        for (int mes = 1; mes <= 12; mes++) {
            double rendimentoMensal = capital * taxaCDPBagueMais / 100;
            rendimentoCDBPagueMais += rendimentoMensal;
            capital += rendimentoMensal;

            System.out.printf("Mês %d:\n", mes);
            System.out.printf("Capital: R$ %.2f\n", capital);
            System.out.printf("Rendimento: R$ %.2f\n", rendimentoMensal);
        }

        double rendimentoCDBFuraBolso = 0;
        double taxaCDBFuraBolso = 0.93 * selic * 0.01;
        double impostoCDBFuraBolso = 0.06;
        for (int mes = 1; mes <= 12; mes++) {
            double rendimentoMensalBruto = capital * taxaCDBFuraBolso / 100;
            double impostoMensal = rendimentoMensalBruto * impostoCDBFuraBolso;
            double rendimentoMensalLiquido = rendimentoMensalBruto - impostoMensal;
            rendimentoCDBFuraBolso += rendimentoMensalLiquido;
            capital += rendimentoMensalLiquido;

            System.out.printf("Mês %d:\n", mes);
            System.out.printf("Capital: R$ %.2f\n", capital);
            System.out.printf("Rendimento Bruto: R$ %.2f\n", rendimentoMensalBruto);
            System.out.printf("Imposto: R$ %.2f\n", impostoMensal);
            System.out.printf("Rendimento Líquido: R$ %.2f\n", rendimentoMensalLiquido);
        }

        System.out.println("\n**Resumo dos Investimentos:**");
        System.out.printf("CDB Banco Pague Mais:\n");
        System.out.printf("Rendimento Total: R$ %.2f\n", rendimentoCDBPagueMais * 0.9);
        System.out.printf("CDB Fura Bolso:\n");
        System.out.printf("Rendimento Total: R$ %.2f\n", rendimentoCDBFuraBolso);

        if (rendimentoCDBPagueMais * 0.9 > rendimentoCDBFuraBolso) {
            System.out.println("**CDB Banco Pague Mais**");
        } else {
            System.out.println("**CDB Fura Bolso**");
        }
    }
}