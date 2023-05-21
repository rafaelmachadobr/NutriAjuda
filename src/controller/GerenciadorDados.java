/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno PROA
 */
public class GerenciadorDados {
    
        public boolean camposVazios(String regiao, int qtdPessoas, double renda) {
            String regiaoStr = String.valueOf(regiao);
            
            if (renda == -1) {
                JOptionPane.showMessageDialog(null, "Renda não pode estar vazia");
                return false;
            }

            if (regiaoStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Região não pode estar vazia");
                return false;
            }

            if (qtdPessoas == -1) {
                JOptionPane.showMessageDialog(null, "Quantidade de pessoas não pode estar vazia");
                return false;
            }

            return true;
     }

    public boolean validarRegiao(String regiaoFornecida) {
        if (regiaoFornecida.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Região não pode estar vazia");
            return false;
        }

        if (regiaoFornecida.equals("sul") || regiaoFornecida.equals("sudeste") || 
                    regiaoFornecida.equals("norte") || regiaoFornecida.equals("nordeste") || 
                    regiaoFornecida.equals("centro-oeste")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Região inválida");
            return false;
        }
    }
    
    public boolean validarRenda(double renda) {
        
        if (renda < 100) {
        JOptionPane.showMessageDialog(null, """
                                            Sinto muito, para participar desse programa \u00e9 necess\u00e1rio ter uma renda m\u00ednima para poder gerar listas.
                                            Entendo que isso possa ser uma dificuldade para voc\u00ea.
                                            No entanto, existem outras op\u00e7\u00f5es dispon\u00edveis que podem ajud\u00e1-lo a atender \u00e0s suas necessidades alimentares di\u00e1rias.
                                            Uma op\u00e7\u00e3o \u00e9 procurar uma rede do "Bom Prato", que oferece refei\u00e7\u00f5es balanceadas a pre\u00e7os acess\u00edveis para pessoas de baixa renda.
                                            Espero que essa informa\u00e7\u00e3o seja \u00fatil para voc\u00ea e desejo tudo de bom.""");
            return false;
        } else {
            return true;
        }
    }
}
