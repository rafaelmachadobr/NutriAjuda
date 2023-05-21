package view;

import controller.GerenciadorDados;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Alimento;
import model.Calculadora;
import model.Regiao;

public class Main extends javax.swing.JFrame {

    private javax.swing.JButton closeButton;

    public Main() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());

        TelaInicial telaInicial = new TelaInicial();
        TelaDados telaDados = new TelaDados();
        TelaResultado telaResultado = new TelaResultado();
        TelaAlimentosProduzidos telaAlimentosProduzidos = new TelaAlimentosProduzidos();
        
        GerenciadorDados gerenciadorDados = new GerenciadorDados();

        Regiao regiao = new Regiao();

        slide.setAnimate(5);
        slide.init(telaInicial, telaDados, telaResultado, telaAlimentosProduzidos);

        telaInicial.addEventContinuar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slide.show(1);
            }
        });

        telaDados.addEventContinuar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              try{
                    if (gerenciadorDados.camposVazios(telaDados.getRegiao(), 
                            telaDados.getQtdPessoas(), telaDados.getRenda()) &&
                            gerenciadorDados.validarRenda(telaDados.getRenda()) &&
                                gerenciadorDados.validarRegiao(telaDados.getRegiao().toLowerCase())
                            ) {
                        String regiaoFornecida = telaDados.getRegiao();
                        regiaoFornecida = regiaoFornecida.toLowerCase();
                        
                        double rendaFornecida = telaDados.getRenda();
                        
                        int qtdPessoas = telaDados.getQtdPessoas();
                        
                        regiao.setNome(telaDados.getRegiao());
                        Calculadora calculadora = new Calculadora(
                                telaDados.getRenda(), telaDados.getQtdPessoas(), regiao);
                        slide.show(2);
                        calculadora.adicionarAlimentos();

                        StringBuilder resultado = new StringBuilder();
                        
                        resultado.append("<html>Segue a lista de alimentos recomendáveis para você comprar nesse mes:<br><br>");
                        for (Alimento alimento : regiao.getAlimentosDisponiveis()) {
                            resultado.append(alimento.getQuantidade()).append(" - ").append(alimento.getNome()).append("<br>");
                        }
                        resultado.append("</html>");

                        telaResultado.setResultado(resultado.toString());
                    } 
              } catch (Exception exception) {
                  JOptionPane.showMessageDialog(null, "Ops!, ocorreu um erro.");
              }

            }
        });
        
        telaResultado.addEventContinuar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slide.show(3);
            }
        });
        
        telaAlimentosProduzidos.addEventVoltar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(null, """
                                                                   Tem certeza que deseja voltar para a tela de in\u00edcio?
                                                                   Quaisquer altera\u00e7\u00f5es n\u00e3o salvas ser\u00e3o perdidas.""", "Confirmação de Volta", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    slide.show(0);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradiente1 = new swing.PanelGradiente();
        panelBorder1 = new swing.PanelBorder();
        slide = new swing.PanelSlide();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelGradiente1.setColorPrimario(new java.awt.Color(146, 223, 251));
        panelGradiente1.setColorSecundario(new java.awt.Color(12, 137, 163));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        slide.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        panelBorder1.setLayer(slide, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGradiente1.setLayer(panelBorder1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
        panelGradiente1.setLayout(panelGradiente1Layout);
        panelGradiente1Layout.setHorizontalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panelGradiente1Layout.setVerticalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.PanelBorder panelBorder1;
    private swing.PanelGradiente panelGradiente1;
    private swing.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
