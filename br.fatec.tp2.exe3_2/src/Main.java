import java.util.ArrayList;

public class Main {
    public static void main(String[]params){
        ArrayList<Pessoa> lista=new ArrayList<Pessoa>();
        Trabalhador t1=new Trabalhador("jorge",2000.0);
        Trabalhador t2=new Trabalhador("jose",5600.0);
        Estudante e1=new Estudante("luiz",23);
        Estudante e2=new Estudante("tatiane",21);
        lista.add(t1);
        lista.add(t2);
        lista.add(e1);
        lista.add(e2);
        for(Pessoa p:lista){
            p.reportar();
        }
    }

}