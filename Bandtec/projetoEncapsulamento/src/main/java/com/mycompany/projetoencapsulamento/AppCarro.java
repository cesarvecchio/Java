/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoencapsulamento;

/**
 *
 * @author Aluno
 */
public class AppCarro extends javax.swing.JFrame {
    Carro carro1 = new Carro();
    Carro carro2 = new Carro();
    /**
     * Creates new form AppCarro
     */
    public AppCarro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLigar1 = new javax.swing.JButton();
        btnAcelerar1 = new javax.swing.JButton();
        btnFrear1 = new javax.swing.JButton();
        btnDesligar1 = new javax.swing.JButton();
        btnLigar2 = new javax.swing.JButton();
        btnAcelerar2 = new javax.swing.JButton();
        btnFrear2 = new javax.swing.JButton();
        btnDesligar2 = new javax.swing.JButton();
        prgVelocidadeAtual = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        lblStatusCarro1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblStatusCarro2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblVelocidadeAtual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnLigar1.setText("Ligar");
        btnLigar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigar1ActionPerformed(evt);
            }
        });

        btnAcelerar1.setText("Acelerar");
        btnAcelerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcelerar1ActionPerformed(evt);
            }
        });

        btnFrear1.setText("Frear");
        btnFrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrear1ActionPerformed(evt);
            }
        });

        btnDesligar1.setText("Desligar");
        btnDesligar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesligar1ActionPerformed(evt);
            }
        });

        btnLigar2.setText("Ligar");
        btnLigar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigar2ActionPerformed(evt);
            }
        });

        btnAcelerar2.setText("Acelerar");
        btnAcelerar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcelerar2ActionPerformed(evt);
            }
        });

        btnFrear2.setText("Frear");
        btnFrear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrear2ActionPerformed(evt);
            }
        });

        btnDesligar2.setText("Desligar");
        btnDesligar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesligar2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Status do Carro: ");

        lblStatusCarro1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStatusCarro1.setForeground(new java.awt.Color(0, 255, 0));
        lblStatusCarro1.setText("Desligar");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Status do Carro: ");

        lblStatusCarro2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStatusCarro2.setForeground(new java.awt.Color(0, 255, 0));
        lblStatusCarro2.setText("Desligar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Velocidade Atual: ");

        lblVelocidadeAtual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblVelocidadeAtual.setForeground(new java.awt.Color(0, 255, 0));
        lblVelocidadeAtual.setText("0.00 km/h");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prgVelocidadeAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLigar1)
                                .addGap(18, 18, 18)
                                .addComponent(btnAcelerar1)
                                .addGap(18, 18, 18)
                                .addComponent(btnFrear1)
                                .addGap(18, 18, 18)
                                .addComponent(btnDesligar1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLigar2)
                                .addGap(18, 18, 18)
                                .addComponent(btnAcelerar2)
                                .addGap(18, 18, 18)
                                .addComponent(btnFrear2)
                                .addGap(18, 18, 18)
                                .addComponent(btnDesligar2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatusCarro1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatusCarro2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVelocidadeAtual)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLigar1)
                    .addComponent(btnAcelerar1)
                    .addComponent(btnFrear1)
                    .addComponent(btnDesligar1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblStatusCarro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblVelocidadeAtual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLigar2)
                    .addComponent(btnAcelerar2)
                    .addComponent(btnFrear2)
                    .addComponent(btnDesligar2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblStatusCarro2))
                .addGap(19, 19, 19)
                .addComponent(prgVelocidadeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigar1ActionPerformed
        carro1.ligar();
        lblStatusCarro1.setText("Ligado");
    }//GEN-LAST:event_btnLigar1ActionPerformed

    private void btnLigar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigar2ActionPerformed
        carro2.ligar();
        lblStatusCarro2.setText("Ligado");
    }//GEN-LAST:event_btnLigar2ActionPerformed

    private void btnAcelerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcelerar1ActionPerformed
        carro1.acelerar();
        lblVelocidadeAtual.setText(String.format("%.2f", carro1.getVelocidade()));
    }//GEN-LAST:event_btnAcelerar1ActionPerformed

    private void btnAcelerar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcelerar2ActionPerformed
        carro2.acelerar();
        prgVelocidadeAtual.setValue(carro2.getVelocidade().intValue());
        
    }//GEN-LAST:event_btnAcelerar2ActionPerformed

    private void btnFrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrear1ActionPerformed
        carro1.frear();
        lblVelocidadeAtual.setText(String.format("%.2f", carro1.getVelocidade()));
    }//GEN-LAST:event_btnFrear1ActionPerformed

    private void btnFrear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrear2ActionPerformed
        carro2.frear();
        prgVelocidadeAtual.setValue(carro1.getVelocidade().intValue());
    }//GEN-LAST:event_btnFrear2ActionPerformed

    private void btnDesligar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesligar1ActionPerformed
        carro1.desligar();
        lblStatusCarro1.setText("Desligado");
        lblVelocidadeAtual.setText(String.format("%.2f", carro1.getVelocidade()));
    }//GEN-LAST:event_btnDesligar1ActionPerformed

    private void btnDesligar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesligar2ActionPerformed
        carro2.desligar();
        lblStatusCarro2.setText("Desligado");
        prgVelocidadeAtual.setValue(carro1.getVelocidade().intValue());
    }//GEN-LAST:event_btnDesligar2ActionPerformed

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
            java.util.logging.Logger.getLogger(AppCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcelerar1;
    private javax.swing.JButton btnAcelerar2;
    private javax.swing.JButton btnDesligar1;
    private javax.swing.JButton btnDesligar2;
    private javax.swing.JButton btnFrear1;
    private javax.swing.JButton btnFrear2;
    private javax.swing.JButton btnLigar1;
    private javax.swing.JButton btnLigar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStatusCarro1;
    private javax.swing.JLabel lblStatusCarro2;
    private javax.swing.JLabel lblVelocidadeAtual;
    private javax.swing.JProgressBar prgVelocidadeAtual;
    // End of variables declaration//GEN-END:variables
}