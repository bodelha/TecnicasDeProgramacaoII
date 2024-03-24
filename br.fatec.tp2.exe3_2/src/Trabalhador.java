class Trabalhador extends Pessoa{
    double salario;

    public Trabalhador(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public void reportar() {
        super.reportar();
        System.out.printf(" Salário: %.2f\n", this.salario);
    }

    
}
