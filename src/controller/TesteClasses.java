/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Alimento;
import model.Calculadora;
import model.Regiao;
import model.Usuario;

/**
 *
 * @author Aluno PROA
 */
public class TesteClasses {
    
    public static void main(String[] args) {
        
        Regiao regiao = new Regiao();
        
        Usuario usuario = new Usuario(700, 2, "Sul");
       
        regiao.setNome(usuario.getRegiao());
        
        Calculadora calculadora = new Calculadora(usuario.getRenda(), usuario.getQtd_pessoas(), regiao);
        
        calculadora.adicionarAlimentos();
        
        System.out.println(calculadora.getQtdPessoas());
        System.out.println("Alimentos disponíveis na região " + regiao.getNome() + ":");
        for (Alimento alimento : regiao.getAlimentosDisponiveis()) {
            System.out.println(alimento.getQuantidade() + " - " + alimento.getNome());
        }
    }
}
