/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.JOptionPane;

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
                                new Alimento("Arroz Agulhinha 1kg", 300, 10.00, 5),
                                new Alimento("Feijão Carioca 1kg", 250, 8.00, 4),
                                new Alimento("Carne de Porco (1kg)", 200, 25.00, 2),
                                new Alimento("Frango Inteiro (1kg)", 180, 15.00, 2),
                                new Alimento("Linguiça Toscana (1kg)", 160, 18.00, 2),
                                new Alimento("Macarrão Espaguete 500g", 400, 5.00, 3),
                                new Alimento("Farinha de Milho (1kg)", 350, 3.50, 2),
                                new Alimento("Leite Integral 1L", 130, 6.00, 5),
                                new Alimento("Ovos Brancos (1 dúzia)", 150, 8.00, 3),
                                new Alimento("Pão Francês (1 unidade)", 70, 0.30, 100)
                        )
                );
            } else if (rendaDisponivel < 400) {
                regiaoUsuario.setAlimentosDisponiveis(
                        List.of(
                                new Alimento("Arroz Vermelho 1kg", 250, 12.00, 5),
                                new Alimento("Feijão Azuki 1kg", 350, 10.00, 5),
                                new Alimento("Carne de Ovelha (1kg)", 180, 30.00, 2),
                                new Alimento("Peixe Tainha (1kg)", 200, 25.00, 4),
                                new Alimento("Queijo Colonial (1kg)", 350, 20.00, 3),
                                new Alimento("Massa de Pastel (500g)", 400, 7.00, 8),
                                new Alimento("Aipim/Mandioca (1kg)", 300, 4.00, 10),
                                new Alimento("Leite de Cabra 1L", 120, 8.00, 8),
                                new Alimento("Mel de Abelha (500g)", 280, 15.00, 4),
                                new Alimento("Café Torrado e Moído (250g)", 180, 10.00, 6)
                        )
                );
            } else if (rendaDisponivel < 600) {
                regiaoUsuario.setAlimentosDisponiveis(
                        List.of(
                                new Alimento("Arroz Preto 1kg", 280, 15.00, 4),
                                new Alimento("Feijão Branco 1kg", 320, 8.00, 6),
                                new Alimento("Carne de Jacaré (1kg)", 150, 40.00, 2),
                                new Alimento("Peixe Linguado (1kg)", 190, 35.00, 4),
                                new Alimento("Queijo Serrano (1kg)", 380, 25.00, 3),
                                new Alimento("Massa de Lasanha (500g)", 400, 10.00, 6),
                                new Alimento("Abóbora Moranga (1kg)", 200, 3.50, 12),
                                new Alimento("Leite de Aveia 1L", 110, 9.00, 8),
                                new Alimento("Melado de Cana (500g)", 250, 12.00, 5),
                                new Alimento("Chimarrão Erva-Mate (1kg)", 100, 18.00, 3)
                        )
                );
            } else {
                regiaoUsuario.setAlimentosDisponiveis(
                        List.of(
                                new Alimento("Arroz Selvagem (1kg)", 300, 100.00, 1),
                                new Alimento("Salmão (1kg)", 200, 80.00, 2),
                                new Alimento("Queijo Roquefort (500g)", 400, 60.00, 1),
                                new Alimento("Picanha Argentina (1kg)", 180, 150.00, 1),
                                new Alimento("Frango Caipira (1kg)", 120, 50.00, 2),
                                new Alimento("Aspargos (500g)", 80, 40.00, 2),
                                new Alimento("Molho Pesto (200g)", 250, 30.00, 3),
                                new Alimento("Azeite de Trufa Branca (100ml)", 50, 250.00, 1),
                                new Alimento("Amêndoas (500g)", 550, 70.00, 1),
                                new Alimento("Quinoa Vermelha (1kg)", 350, 80.00, 1)
                        )
                );
            }
        } else if (regiaoUsuario.getNome().toLowerCase().equals("sudeste")) {
            if (rendaDisponivel < 200) {
                regiaoUsuario.setAlimentosDisponiveis(
                        List.of(
                                new Alimento("Arroz (5kg)", 100, 20.00, 1),
                                new Alimento("Feijão Carioca (2kg)", 150, 30.00, 1),
                                new Alimento("Macarrão Espaguete (500g)", 200, 5.00, 2),
                                new Alimento("Farinha de Mandioca (1kg)", 120, 8.00, 1),
                                new Alimento("Óleo de Soja (900ml)", 90, 6.00, 1),
                                new Alimento("Carne Bovina (1kg)", 180, 50.00, 1),
                                new Alimento("Peito de Frango (1kg)", 150, 20.00, 1),
                                new Alimento("Ovos (1 dúzia)", 100, 7.00, 1),
                                new Alimento("Tomate (1kg)", 80, 5.00, 1),
                                new Alimento("Cebola (1kg)", 70, 4.00, 1)
                        )
                );
            } else if (rendaDisponivel < 400) {
                regiaoUsuario.setAlimentosDisponiveis(
                        List.of(
                                new Alimento("Arroz Integral (1kg)", 150, 10.00, 2),
                                new Alimento("Feijão Preto (1kg)", 180, 15.00, 1),
                                new Alimento("Macarrão Fusilli (500g)", 200, 5.00, 3),
                                new Alimento("Farinha de Milho (500g)", 120, 4.00, 1),
                                new Alimento("Azeite de Oliva Extra Virgem (500ml)", 120, 20.00, 1),
                                new Alimento("Café em Pó (500g)", 50, 12.00, 1),
                                new Alimento("Carne Moída (500g)", 250, 12.00, 1),
                                new Alimento("Ovo Branco (dúzia)", 70, 8.00, 2),
                                new Alimento("Banana Prata (1kg)", 90, 4.00, 1),
                                new Alimento("Tomate (1kg)", 50, 5.00, 1)
                        )
                );
            } else if (rendaDisponivel < 600) {
                regiaoUsuario.setAlimentosDisponiveis(
                        List.of(
                                new Alimento("Arroz Parboilizado (5kg)", 200, 25.00, 1),
                                new Alimento("Feijão Carioca (1kg)", 180, 10.00, 2),
                                new Alimento("Macarrão Espaguete (500g)", 220, 7.00, 3),
                                new Alimento("Farinha de Trigo (1kg)", 150, 5.00, 1),
                                new Alimento("Óleo de Canola (900ml)", 120, 8.00, 1),
                                new Alimento("Leite Desnatado (1l)", 150, 3.50, 2),
                                new Alimento("Frango inteiro (1kg)", 200, 20.00, 1),
                                new Alimento("Ovo Vermelho (dúzia)", 70, 6.00, 2),
                                new Alimento("Banana Nanica (1kg)", 90, 3.00, 1),
                                new Alimento("Cenoura (1kg)", 50, 4.00, 1)
                        )
                );
            } else {
                regiaoUsuario.setAlimentosDisponiveis(
                        List.of(
                                new Alimento("Carne de Alcatra (1kg)", 220, 40.00, 1),
                                new Alimento("Peito de Frango (1kg)", 180, 25.00, 1),
                                new Alimento("Linguiça Toscana (500g)", 150, 15.00, 2),
                                new Alimento("Arroz Integral (5kg)", 200, 35.00, 1),
                                new Alimento("Feijão Preto (1kg)", 180, 12.00, 2),
                                new Alimento("Macarrão Penne (500g)", 220, 8.00, 3),
                                new Alimento("Azeite de Oliva Extra Virgem (500ml)", 120, 30.00, 1),
                                new Alimento("Leite Integral (1l)", 150, 4.00, 2),
                                new Alimento("Ovo Branco (dúzia)", 70, 7.00, 2),
                                new Alimento("Abóbora Moranga (1kg)", 90, 6.00, 2)
                        )
                );
            }
        } else if (regiaoUsuario.getNome().toLowerCase().equals("norte")) {
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
        } else if (regiaoUsuario.getNome().toLowerCase().equals("nordeste")) {
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
        } else if (regiaoUsuario.getNome().toLowerCase().equals("centro-oeste")) {
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
        } else {
            JOptionPane.showMessageDialog(null, "Região invalida!");
        }

    }

}
