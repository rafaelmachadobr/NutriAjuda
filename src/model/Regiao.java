/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno PROA
 */
public class Regiao {
    
    private String nome;
    private List<Alimento> alimentosDisponiveis;

    public Regiao() {
        this.alimentosDisponiveis = new ArrayList<>();
    }

    public Regiao(String nome, List<Alimento> alimentosDisponiveis) {
        this.nome = nome;
        this.alimentosDisponiveis = new ArrayList<>(alimentosDisponiveis);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Alimento> getAlimentosDisponiveis() {
        return alimentosDisponiveis;
    }

    public void setAlimentosDisponiveis(List<Alimento> alimentosDisponiveis) {
        this.alimentosDisponiveis.addAll(alimentosDisponiveis);
    }
  

}
