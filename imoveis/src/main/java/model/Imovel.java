package model;

import java.util.ArrayList;

public class Imovel {

    public Integer matricula;
    private ArrayList<String> proprietarios;
    private tipoImovelEnum tipoImovel;
    private Double valorVenal;  
    private Double area;

    private enum tipoImovelEnum {
        CASA, APARTAMENTO, TERRENO;
    }

    public Imovel(Integer matricula, ArrayList<String> proprietarios, tipoImovelEnum tipoImovel, Double valorVenal,
            Double area) {
        this.matricula = matricula;
        this.proprietarios = proprietarios;
        this.tipoImovel = tipoImovel;
        this.valorVenal = valorVenal;
        this.area = area;
    }

    public void setProprietarios(ArrayList<String> proprietarios) {
        this.proprietarios = proprietarios;
    }

    public void setTipoImovel(tipoImovelEnum tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public void setValorVenal(Double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public void setArea(Double area) {
        this.area = area;
    };
    
}
