
package com.mycompany.views;

import com.mycompany.controller.Consoles;
import javax.swing.JTextField;


public class EstatisticasConsolesView extends javax.swing.JFrame {
    Consoles consoles = new Consoles();
    
    public EstatisticasConsolesView() {
        initComponents();
        
        consoles.listaConsoles(this);
    }

    public JTextField getTxtConsolesMicrosoft() {
        return txtConsolesMicrosoft;
    }

    public JTextField getTxtConsolesNintendo() {
        return txtConsolesNintedo;
    }

    public JTextField getTxtConsolesOutros() {
        return txtConsolesOutros;
    }

    public JTextField getTxtConsolesSony() {
        return txtConsolesSony;
    }

    public JTextField getTxtPorcentoMicrosoft() {
        return txtPorcentoMicrosoft;
    }

    public JTextField getTxtPorcentoNintendo() {
        return txtPorcentoNitendo;
    }

    public JTextField getTxtPorcentoOutros() {
        return txtPorcentoOutros;
    }

    public JTextField getTxtPorcentoSony() {
        return txtPorcentoSony;
    }

    public JTextField getTxtQuantidadeConsoles() {
        return txtQuantidadeConsoles;
    }

    

    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidadeConsoles = new javax.swing.JTextField();
        txtConsolesMicrosoft = new javax.swing.JTextField();
        txtConsolesSony = new javax.swing.JTextField();
        txtConsolesNintedo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtConsolesOutros = new javax.swing.JTextField();
        txtPorcentoMicrosoft = new javax.swing.JTextField();
        txtPorcentoSony = new javax.swing.JTextField();
        txtPorcentoNitendo = new javax.swing.JTextField();
        txtPorcentoOutros = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Consoles cadastrados");

        jLabel2.setText("Consoles da Microsoft");

        jLabel3.setText("Consoles da Sony");

        jLabel4.setText("Consoles da Nintendo");

        txtQuantidadeConsoles.setEditable(false);
        txtQuantidadeConsoles.setBackground(new java.awt.Color(242, 242, 242));
        txtQuantidadeConsoles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuantidadeConsoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeConsolesActionPerformed(evt);
            }
        });

        txtConsolesMicrosoft.setEditable(false);
        txtConsolesMicrosoft.setBackground(new java.awt.Color(242, 242, 242));
        txtConsolesMicrosoft.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtConsolesSony.setEditable(false);
        txtConsolesSony.setBackground(new java.awt.Color(242, 242, 242));
        txtConsolesSony.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtConsolesNintedo.setEditable(false);
        txtConsolesNintedo.setBackground(new java.awt.Color(242, 242, 242));
        txtConsolesNintedo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("outros");

        txtConsolesOutros.setEditable(false);
        txtConsolesOutros.setBackground(new java.awt.Color(242, 242, 242));
        txtConsolesOutros.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPorcentoMicrosoft.setEditable(false);
        txtPorcentoMicrosoft.setBackground(new java.awt.Color(242, 242, 242));
        txtPorcentoMicrosoft.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPorcentoMicrosoft.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorcentoMicrosoft.setBorder(null);

        txtPorcentoSony.setEditable(false);
        txtPorcentoSony.setBackground(new java.awt.Color(242, 242, 242));
        txtPorcentoSony.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPorcentoSony.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorcentoSony.setBorder(null);

        txtPorcentoNitendo.setEditable(false);
        txtPorcentoNitendo.setBackground(new java.awt.Color(242, 242, 242));
        txtPorcentoNitendo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPorcentoNitendo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorcentoNitendo.setBorder(null);

        txtPorcentoOutros.setEditable(false);
        txtPorcentoOutros.setBackground(new java.awt.Color(242, 242, 242));
        txtPorcentoOutros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPorcentoOutros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorcentoOutros.setBorder(null);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsolesOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPorcentoOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidadeConsoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConsolesMicrosoft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPorcentoMicrosoft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConsolesSony, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPorcentoSony, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConsolesNintedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPorcentoNitendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtQuantidadeConsoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtConsolesMicrosoft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentoMicrosoft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtConsolesSony, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentoSony, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtConsolesNintedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentoNitendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtConsolesOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentoOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantidadeConsolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeConsolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeConsolesActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        MenuView menu = new MenuView();
        menu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstatisticasConsolesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstatisticasConsolesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstatisticasConsolesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstatisticasConsolesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstatisticasConsolesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtConsolesMicrosoft;
    private javax.swing.JTextField txtConsolesNintedo;
    private javax.swing.JTextField txtConsolesOutros;
    private javax.swing.JTextField txtConsolesSony;
    private javax.swing.JTextField txtPorcentoMicrosoft;
    private javax.swing.JTextField txtPorcentoNitendo;
    private javax.swing.JTextField txtPorcentoOutros;
    private javax.swing.JTextField txtPorcentoSony;
    private javax.swing.JTextField txtQuantidadeConsoles;
    // End of variables declaration//GEN-END:variables
}
