## Lista de Exercícios 01

1. O que é uma variável? Descreva como é feita a declaração de variável e explique em termos de memória sua relação.
> Variáveis são um artifício para armazenar valores para que sejam utilizados e/ou modificados posteriormente. Quando fazemos uma declaração de variável, um espaço em memória é dedicado à ela, e nele será armazenado seu valor. Em algumas linguagens (como C++) o espaço não varia durante a execução do código, de modo que informações como tipo ou comprimento precisam ser declaradas no início. 

2. Linguagens de programação podem ser compiladas e interpretadas explique o conceito de cada contexto ressaltando suas diferenças.Em relação à Linguagem Java,em qual desses contextos se encaixa?
> Linguagens compiladas são 'traduzidas' a linguagem de máquina num passo em etapa única para todo o código antes da execução. Já as interpretadas fazem isto gradualmente durante a execução uma linha por vez. A vantagem da compilação é ter uma validação prévia ampla. O Java é uma linguagem compilada a bytecode que será executado na JVM

3. Explique o que é:classe e objeto.Qual relação entre eles?
> Classes definem características e comportamentos comuns de um grupo de elementos de interesse, enquanto um objeto é a representação no mundo virtual de um desses elementos, com valores específicos. Objetos são criados a partir da instanciação de classes. 



## Lista de Exercícios 03

1. Detalhe o significado das variáveis *static* e descreva algumas diferenças com as variáveis de instância.

Variáveis do tipo *static* pertencem à classe e não a instâncias. Assim, todos os objetos/instancias compartilham o mesmo valor para ela pois não definem valores específicos. Alterar o valor da variavél em uma instancia altera para todas as outras.

2. Explique os conceitos de “abstração”,“encapsulamento” e “instância”. Enumere pelo menos 4 tipos de dados primitivos em Java.

Abstração é o ato necessário de simplificar a realidade para representá-la no ambiente virtual, identificando aspectos essenciais e desprezando os irrelevantes.

Encapsulamento se refere à entidades externas não terem conhecimento de detalhes de implementação de uma classe para poder utilizá-la. Torna o código mais modular e reutlizável.

Instância é um objeto criado a partir de um modelo contido numa classe. Cada instância tem valores específicos.

São tipos de dados primitivos *int*, *double*, *boolean*, *char*, *float*, *byte*, *short*, *long*

3. Dada a classe abaixo:

`public class Blue {}
{
    static int color;
    public static String NAME = "Blue";
    
    public Blue(int hue){...}
    
    public int getHue() {return hue;}
    
    public void setHue(int hue){...}
    
    public void makeItDarker(){...}
    
    void calculateHue(){...}
    
    private void makeHueDarker(int value){...}
}
`
a. Quais são as variáveis de classe?
Tanto color quanto NAME são variáveis de classe. 
b. Quais são os construtores?
Blue (int hue) é o contrutor.
c. Sem mudar o código que está escrito. Implemente o método setHue e a variável que ele necessita.
`
    public void setHue(int hue){
        this.color = hue;
    }
`
d. Sem mudar o código que está escrito. Implemente o construtor.
`
    public Blue(int hue){
        this.color = hue;
    }
`

