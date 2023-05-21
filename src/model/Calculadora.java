/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Aluno PROA
 */
public class Calculadora {
    
    private double rendaDisponivel;
    private int qtdPessoas;
    private Regiao regiaoUsuario;
    

    public Calculadora() {
    }

    public Calculadora(double rendaDisponivel, int qtdPessoas, Regiao regiaoUsuario) {
        this.rendaDisponivel = rendaDisponivel;
        this.qtdPessoas = qtdPessoas;
        this.regiaoUsuario = regiaoUsuario;
    }

    public double getRendaDisponivel() {
        return rendaDisponivel;
    }

    public void setRendaDisponivel(double rendaDisponivel) {
        this.rendaDisponivel = rendaDisponivel;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public String getRegiaoUsuario() {
        return regiaoUsuario.getNome();
    }

    public void setRegiaoUsuario(Regiao regiaoUsuario) {
        this.regiaoUsuario = regiaoUsuario;
    }   

    public void adicionarAlimentos() {
    if (regiaoUsuario.getNome().toLowerCase().equals("sul")) {
        if (rendaDisponivel < 200) {
            regiaoUsuario.setAlimentosDisponiveis(
                List.of(
                    new Alimento("Achocolatado em Pó", 1, 5.99, 1),
                    new Alimento("Açúcar Refinado", 3, 7.99, 3),
                    new Alimento("Arroz Agulhinha Tipo 1", 2, 9.99, 2)
                )
            );
        } else if (rendaDisponivel < 400) {
            regiaoUsuario.setAlimentosDisponiveis(
                List.of(
                    new Alimento("Biscoito Recheado (Sabores)", 180, 2.99, 1),
                    new Alimento("Biscoito Cream Cracker", 100, 3.99, 1),
                    new Alimento("Café Torrado e Moído a Vácuo", 0, 6.99, 1)
                )
            );
        } else if (rendaDisponivel < 600) {
            regiaoUsuario.setAlimentosDisponiveis(
                List.of(
                    new Alimento("Farinha de Mandioca", 0, 2.99, 1),
                    new Alimento("Farinha de Trigo Especial", 0, 4.99, 1),
                    new Alimento("Feijão Carioca Tipo 1", 0, 7.99, 3)
                )
            );
        } else {
            regiaoUsuario.setAlimentosDisponiveis(
                List.of(
                    new Alimento("Fubá Mimoso", 0, 2.99, 1),
                    new Alimento("Goiabada", 0, 4.99, 1),
                    new Alimento("Macarrão com Ovos - Espaguete", 0, 3.99, 2)
                )
            );
        }
    } else if (regiaoUsuario.getNome().toLowerCase().equals("sudeste")) {
        if (rendaDisponivel < 200) {
            regiaoUsuario.setAlimentosDisponiveis(
                List.of(
                     new Alimento("Óleo de Soja", 0, 6.99, 3),
                    new Alimento("Polpa de Tomate", 0, 2.99, 1),
                    new Alimento("Feijão Carioca Tipo 1", 0, 7.99, 3)
                )
            );
        } else if (rendaDisponivel < 400) {
            regiaoUsuario.setAlimentosDisponiveis(
                List.of(
                    new Alimento("Achocolatado em Pó", 200, 5.99, 1),
                    new Alimento("Açúcar Refinado", 1000, 7.99, 4),
                    new Alimento("Arroz Agulhinha Tipo 1", 5000, 9.99, 2)
                )
            );
        } else if (rendaDisponivel < 600) {
            regiaoUsuario.setAlimentosDisponiveis(
                List.of(
                    new Alimento("Azeite de Oliva Extra Virgem", 500, 15.99, 1),
                    new Alimento("Bala Mastigável", 60, 1.99, 2),
                    new Alimento("Biscoito Cream Cracker", 200, 2.99, 2),
                    new Alimento("Biscoito Recheado (Sabores)", 123, 3.49, 2),
                        new Alimento("Azeite de Oliva Extra Virgem", 500, 15.99, 1),
                    new Alimento("Bala Mastigável", 60, 1.99, 2),
                    new Alimento("Biscoito Cream Cracker", 200, 2.99, 2),
                    new Alimento("Biscoito Recheado (Sabores)", 123, 3.49, 2),
                    new Alimento("Azeite de Oliva Extra Virgem", 500, 15.99, 1),
                    new Alimento("Bala Mastigável", 60, 1.99, 2),
                    new Alimento("Biscoito Cream Cracker", 200, 2.99, 2),
                    new Alimento("Biscoito Recheado (Sabores)", 123, 3.49, 2)
                )
            );
        } else {
            regiaoUsuario.setAlimentosDisponiveis(
                List.of(
                    new Alimento("Farinha de Mandioca Crua", 500, 2.99, 1),
                    new Alimento("Farinha de Trigo", 1000, 4.99, 1),
                    new Alimento("Feijão Carioca Tipo 1", 1000, 7.99, 3),
                    new Alimento("Fubá Mimoso", 500, 2.99, 1)
                )
            );
        }
    }
}

}
