public class SalarioLiquido {

    public double aliquota = 0.0;
    public double deducao = 0.0;
    public double teto = 7087.22;

    public double calc(double salarioBruto) {
        if (salarioBruto < 1212.01) {
            this.aliquota = 0.075;
        } else if (salarioBruto < 2427.36) {
            this.aliquota = 0.09;
            this.deducao = 18.18;
        } else if (salarioBruto < 3641.04) {
            this.aliquota = 0.12;
            this.deducao = 91.0;
        } else if (salarioBruto < teto) {   
            this.aliquota = 0.14;
            this.deducao = 163.82;
        } else {
            this.aliquota = 0.14;
            this.deducao = 163.82 + (salarioBruto - teto)*aliquota;
        }
        double desconto = (salarioBruto * aliquota) - deducao;
        double salarioLiquido = salarioBruto - desconto;
        System.out.println("##########################");
        System.out.println("   CALCULADORA DE INSS");
        System.out.println("##########################");
        System.out.printf("Salário Bruto ....: %.2f\n", salarioBruto);
        System.out.printf("Alíquota INSS ...: %.2f\n", 100 * aliquota);
        System.out.printf("Desconto INSS ....: %.2f\n", desconto);
        System.out.printf("Salário Líquido ....: %.2f\n", salarioLiquido);
        System.out.println("##########################");

        return salarioLiquido;
    }
}
