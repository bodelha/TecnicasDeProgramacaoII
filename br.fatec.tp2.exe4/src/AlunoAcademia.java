public class AlunoAcademia {
    private Double identificador;
    private String nome;
    private Integer idade;
    private Double peso;
    private Double altura;

    public AlunoAcademia() {
    }

    public AlunoAcademia(String nome, Integer idade, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Double getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Double identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void exibir() {
        System.out.println("ID: " + getIdentificador());
        System.out.println("NOME: " + getNome());
        System.out.println("IDADE: " + getIdade());
        System.out.println("PESO: " + getPeso());
        System.out.println("ALTURA: " + getAltura());
    }

    public double calcularIMC(){
        return peso/(altura*altura);
    }

}
