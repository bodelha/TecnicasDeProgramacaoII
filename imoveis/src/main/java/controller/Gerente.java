package controller;

import java.util.ArrayList;

import model.Imovel;

public class Gerente {
    private ArrayList<Imovel> imoveis;

    public Gerente() {
        this.imoveis = new ArrayList<>();
    }
    
    public void cadastro( Imovel imovel){
        imoveis.add(imovel);
        System.out.println("Imóvel cadastrado com sucesso!");
    }

    public String listar (){
        return imoveis.toString();
    }

    public String consulta(Integer matricula){
        for (Imovel imovel : imoveis) {
            if (imovel.matricula == matricula) {
                return imovel.toString();                
            }
        }
        System.out.println("Matricula não encontrada");
        return "Matricula não encontrada";
    }

    public void remove(Integer matricula){
        ArrayList<Imovel> result = new ArrayList<Imovel>();
        for (Imovel imovel : imoveis) {
            if (imovel.matricula == matricula) {
                continue;
            }else{
                result.add(imovel);
            }
        }
        this.imoveis = result;
    }

}
