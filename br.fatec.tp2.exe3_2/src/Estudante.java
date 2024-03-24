class Estudante extends Pessoa {
    int idade;

    public Estudante(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    @Override
    public void reportar() {
        super.reportar();
        System.out.printf(" Idade: %d\n", this.idade);
    }
}
