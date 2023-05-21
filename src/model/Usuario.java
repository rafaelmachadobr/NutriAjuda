package model;

public class Usuario {
    
    private double renda;
    private Integer qtd_pessoas;
    private String regiao;

    public Usuario() {
    }

    public Usuario(double renda, Integer qtd_pessoas, String regiao) {
        this.renda = renda;
        this.qtd_pessoas = qtd_pessoas;
        this.regiao = regiao;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public Integer getQtd_pessoas() {
        return qtd_pessoas;
    }

    public void setQtd_pessoas(Integer qtd_pessoas) {
        this.qtd_pessoas = qtd_pessoas;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    
}
