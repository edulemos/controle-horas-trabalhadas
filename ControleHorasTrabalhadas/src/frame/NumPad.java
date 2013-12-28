/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author desjava
 */
public class NumPad extends javax.swing.JFrame {

    MainFrame mainFrame;
    int numButton;
  
    
    public NumPad(MainFrame mainframe, int tipoPrm) {
        initComponents();
        this.mainFrame = mainframe;
        this.numButton = tipoPrm;
        setInitBold();
    }

    private NumPad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonH1 = new javax.swing.JButton();
        jButtonH2 = new javax.swing.JButton();
        jButtonH3 = new javax.swing.JButton();
        jButtonH4 = new javax.swing.JButton();
        jButtonH5 = new javax.swing.JButton();
        jButtonH6 = new javax.swing.JButton();
        jButtonH7 = new javax.swing.JButton();
        jButtonH8 = new javax.swing.JButton();
        jButtonH9 = new javax.swing.JButton();
        jButtonH00 = new javax.swing.JButton();
        jButton_gravar = new javax.swing.JButton();
        jButton_saida = new javax.swing.JButton();
        jButton_volta_alm = new javax.swing.JButton();
        jButton_saida_alm = new javax.swing.JButton();
        jButton_entrada = new javax.swing.JButton();
        jButton_deletar = new javax.swing.JButton();
        jButton_fechar = new javax.swing.JButton();
        jButton_saidas = new javax.swing.JButton();
        jButton_hora_extra = new javax.swing.JButton();
        jButton_limpar_campo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NUM PAD");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        getContentPane().setLayout(null);

        jButtonH1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonH1.setText("1");
        jButtonH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH1MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH1);
        jButtonH1.setBounds(0, 24, 85, 25);

        jButtonH2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonH2.setText("2");
        jButtonH2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH2MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH2);
        jButtonH2.setBounds(84, 24, 85, 25);

        jButtonH3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonH3.setText("3");
        jButtonH3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH3MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH3);
        jButtonH3.setBounds(168, 24, 85, 25);

        jButtonH4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonH4.setText("4");
        jButtonH4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH4MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH4);
        jButtonH4.setBounds(252, 24, 85, 25);

        jButtonH5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonH5.setText("5");
        jButtonH5.setSelected(true);
        jButtonH5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH5MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH5);
        jButtonH5.setBounds(336, 24, 85, 25);

        jButtonH6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonH6.setText("6");
        jButtonH6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH6MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH6);
        jButtonH6.setBounds(0, 48, 85, 25);

        jButtonH7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonH7.setText("7");
        jButtonH7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH7MouseClicked(evt);
            }
        });
        jButtonH7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonH7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonH7);
        jButtonH7.setBounds(84, 48, 85, 25);

        jButtonH8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonH8.setText("8");
        jButtonH8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH8MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH8);
        jButtonH8.setBounds(168, 48, 85, 25);

        jButtonH9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonH9.setText("9");
        jButtonH9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH9MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH9);
        jButtonH9.setBounds(252, 48, 85, 25);

        jButtonH00.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonH00.setText("0");
        jButtonH00.setSelected(true);
        jButtonH00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH00MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH00);
        jButtonH00.setBounds(336, 48, 85, 25);

        jButton_gravar.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton_gravar.setText("GRAVAR");
        jButton_gravar.setSelected(true);
        jButton_gravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_gravarMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_gravar);
        jButton_gravar.setBounds(336, 0, 85, 25);

        jButton_saida.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton_saida.setText("SAIDA");
        jButton_saida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_saidaMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_saida);
        jButton_saida.setBounds(252, 0, 85, 25);

        jButton_volta_alm.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton_volta_alm.setText("V. ALM");
        jButton_volta_alm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_volta_almMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_volta_alm);
        jButton_volta_alm.setBounds(168, 0, 85, 25);

        jButton_saida_alm.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton_saida_alm.setText("S. ALM");
        jButton_saida_alm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_saida_almMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_saida_alm);
        jButton_saida_alm.setBounds(84, 0, 85, 25);

        jButton_entrada.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton_entrada.setText("ENTRADA");
        jButton_entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_entradaMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_entrada);
        jButton_entrada.setBounds(0, 0, 85, 25);

        jButton_deletar.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton_deletar.setText("DELETAR");
        jButton_deletar.setSelected(true);
        jButton_deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_deletarMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_deletar);
        jButton_deletar.setBounds(168, 72, 85, 25);

        jButton_fechar.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton_fechar.setText("FECHAR");
        jButton_fechar.setSelected(true);
        jButton_fechar.setVerifyInputWhenFocusTarget(false);
        jButton_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_fecharMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_fechar);
        jButton_fechar.setBounds(336, 72, 85, 25);

        jButton_saidas.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton_saidas.setText("SAIDAS");
        jButton_saidas.setSelected(true);
        jButton_saidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_saidasMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_saidas);
        jButton_saidas.setBounds(84, 72, 85, 25);

        jButton_hora_extra.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton_hora_extra.setText("H.EXTRA");
        jButton_hora_extra.setSelected(true);
        jButton_hora_extra.setVerifyInputWhenFocusTarget(false);
        jButton_hora_extra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_hora_extraMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_hora_extra);
        jButton_hora_extra.setBounds(0, 72, 85, 25);

        jButton_limpar_campo1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButton_limpar_campo1.setText("LIMPAR");
        jButton_limpar_campo1.setSelected(true);
        jButton_limpar_campo1.setVerifyInputWhenFocusTarget(false);
        jButton_limpar_campo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_limpar_campo1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton_limpar_campo1);
        jButton_limpar_campo1.setBounds(252, 72, 85, 25);

        setSize(new java.awt.Dimension(436, 134));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonH1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH1MouseClicked
       setText("1");        
    }//GEN-LAST:event_jButtonH1MouseClicked

    private void jButtonH2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH2MouseClicked
        setText("2");        
    }//GEN-LAST:event_jButtonH2MouseClicked

    private void jButtonH3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH3MouseClicked
        setText("3");        
    }//GEN-LAST:event_jButtonH3MouseClicked

    private void jButtonH4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH4MouseClicked
        setText("4");        
    }//GEN-LAST:event_jButtonH4MouseClicked

    private void jButtonH5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH5MouseClicked
        setText("5");        
    }//GEN-LAST:event_jButtonH5MouseClicked

    private void jButtonH6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH6MouseClicked
        setText("6");        
    }//GEN-LAST:event_jButtonH6MouseClicked

    private void jButtonH7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH7MouseClicked
        setText("7");        
    }//GEN-LAST:event_jButtonH7MouseClicked

    private void jButtonH8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH8MouseClicked
        setText("8");        
    }//GEN-LAST:event_jButtonH8MouseClicked

    private void jButtonH9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH9MouseClicked
        setText("9");        
    }//GEN-LAST:event_jButtonH9MouseClicked

    private void jButtonH00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH00MouseClicked
        setText("0");        
    }//GEN-LAST:event_jButtonH00MouseClicked

    private void jButton_entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_entradaMouseClicked
        this.numButton = 1;
        boldFont(jButton_entrada);
        focusBlue(this.mainFrame.jTextField_hora_entrada);            
        fontNormal();
    }//GEN-LAST:event_jButton_entradaMouseClicked

    private void jButton_saida_almMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_saida_almMouseClicked
        this.numButton = 2;
        focusBlue(this.mainFrame.jTextFiel_saida_almoco);            
        boldFont(jButton_saida_alm);
        fontNormal();
    }//GEN-LAST:event_jButton_saida_almMouseClicked

    private void jButton_volta_almMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_volta_almMouseClicked
        this.numButton = 3;
        focusBlue(this.mainFrame.jTextField_volta_almoco);           
        boldFont(jButton_volta_alm);
        fontNormal();
    }//GEN-LAST:event_jButton_volta_almMouseClicked

    private void jButton_saidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_saidaMouseClicked
        this.numButton = 4;
        focusBlue(this.mainFrame.jTextField_hora_saida);            
        boldFont(jButton_saida);
        fontNormal();
    }//GEN-LAST:event_jButton_saidaMouseClicked

    private void jButton_gravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_gravarMouseClicked
        resetFonte();
        this.dispose();
        try {        
            this.mainFrame.gravar();
        } catch (SQLException ex) {
            Logger.getLogger(NumPad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_gravarMouseClicked

    private void jButton_deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_deletarMouseClicked
        resetFonte();
        this.dispose();
        this.mainFrame.deletar();        
    }//GEN-LAST:event_jButton_deletarMouseClicked

    private void jButton_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_fecharMouseClicked
        resetFonte();
        this.dispose();
    }//GEN-LAST:event_jButton_fecharMouseClicked

    private void jButton_saidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_saidasMouseClicked
        this.numButton = 6;
        boldFont(jButton_saidas);
        focusBlue(this.mainFrame.jTextField_hora_saidas);
        fontNormal();
    }//GEN-LAST:event_jButton_saidasMouseClicked

    private void jButton_hora_extraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_hora_extraMouseClicked
        this.numButton = 5;
        boldFont(jButton_hora_extra);
        focusBlue(this.mainFrame.jTextField_hora_extra);            
        fontNormal();
    }//GEN-LAST:event_jButton_hora_extraMouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
     resetFonte();   
     }//GEN-LAST:event_formWindowLostFocus

    private void jButton_limpar_campo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_limpar_campo1MouseClicked
  
        if (this.numButton == 1) {
            this.mainFrame.jTextField_hora_entrada.setText("");
        }
        if (this.numButton == 2) {
            this.mainFrame.jTextFiel_saida_almoco.setText("");
        }
        if (this.numButton == 3) {
            this.mainFrame.jTextField_volta_almoco.setText("");
        }
        if (this.numButton == 4) {
            this.mainFrame.jTextField_hora_saida.setText("");
        }
        if (this.numButton == 5) {
            this.mainFrame.jTextField_hora_extra.setText("");
        }
        if (this.numButton == 6) {
            this.mainFrame.jTextField_hora_saidas.setText("");
        }
        
    }//GEN-LAST:event_jButton_limpar_campo1MouseClicked

    private void jButtonH7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonH7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonH7ActionPerformed
    
   private void setText(String valor){
    
       String str = "";
       
       if (this.numButton == 1) {
           str = this.mainFrame.jTextField_hora_entrada.getText();
           this.mainFrame.jTextField_hora_entrada.setText(getStr(str,valor));
       }

       if (this.numButton == 2) {
           str = this.mainFrame.jTextFiel_saida_almoco.getText();
           this.mainFrame.jTextFiel_saida_almoco.setText(getStr(str,valor));
       }

       if (this.numButton == 3) {
           str = this.mainFrame.jTextField_volta_almoco.getText();
           this.mainFrame.jTextField_volta_almoco.setText(getStr(str,valor));
       }

       if (this.numButton == 4) {
           str = this.mainFrame.jTextField_hora_saida.getText();
           this.mainFrame.jTextField_hora_saida.setText(getStr(str,valor));
       }

       if (this.numButton == 5) {
           str = this.mainFrame.jTextField_hora_extra.getText();
           this.mainFrame.jTextField_hora_extra.setText(getStr(str,valor));
       }

       if (this.numButton == 6) {
           str = this.mainFrame.jTextField_hora_saidas.getText();
           this.mainFrame.jTextField_hora_saidas.setText(getStr(str,valor));
       }           
       
   }
   
    private String getStr(String valorCampo, String digitado) {

        int sizeCampo;
        sizeCampo = valorCampo.length();
        String ret = "";
        int intValue = 0;

        if (sizeCampo == 0) {
            
            intValue = new Integer(digitado);
            if (intValue > 5 ) {
                ret = "0" + digitado ;
            } else {
                ret = digitado;
            }
            
        } else if (sizeCampo == 1) {
            ret = valorCampo + digitado;
        } else if (sizeCampo == 2) {
            ret = valorCampo + ":" + digitado;
        } else if (sizeCampo == 4) {
            ret = valorCampo + digitado;
        } else if (sizeCampo == 5) {
            ret = digitado;
        }

        return ret;

    }
        
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
            java.util.logging.Logger.getLogger(NumPad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumPad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumPad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumPad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumPad().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonH00;
    private javax.swing.JButton jButtonH1;
    private javax.swing.JButton jButtonH2;
    private javax.swing.JButton jButtonH3;
    private javax.swing.JButton jButtonH4;
    private javax.swing.JButton jButtonH5;
    private javax.swing.JButton jButtonH6;
    private javax.swing.JButton jButtonH7;
    private javax.swing.JButton jButtonH8;
    private javax.swing.JButton jButtonH9;
    private javax.swing.JButton jButton_deletar;
    private javax.swing.JButton jButton_entrada;
    private javax.swing.JButton jButton_fechar;
    private javax.swing.JButton jButton_gravar;
    private javax.swing.JButton jButton_hora_extra;
    private javax.swing.JButton jButton_limpar_campo1;
    private javax.swing.JButton jButton_saida;
    private javax.swing.JButton jButton_saida_alm;
    private javax.swing.JButton jButton_saidas;
    private javax.swing.JButton jButton_volta_alm;
    // End of variables declaration//GEN-END:variables

    private void boldFont(JButton button) {    
        button.setFont(new java.awt.Font("Tahoma", 1, 10));    
    }
    
    private void focusBlue(JTextField field){
         field.setBackground(new java.awt.Color(204, 255, 255));
    }
    
    private void focusWhite(JTextField field){
         field.setBackground(new java.awt.Color(255, 255, 255));
    }
      
    
    // VOLTA A FONT PARA O PADRAO PARA OS NAO SELECINADOS
    private void fontNormal(){
         if (this.numButton != 1) {
            jButton_entrada.setFont(new java.awt.Font("Tahoma", 0, 10));
            focusWhite(this.mainFrame.jTextField_hora_entrada);
        }
        if (this.numButton != 2) {
            jButton_saida_alm.setFont(new java.awt.Font("Tahoma", 0, 10));
            focusWhite(this.mainFrame.jTextFiel_saida_almoco);
        }
        if (this.numButton != 3) {
            jButton_volta_alm.setFont(new java.awt.Font("Tahoma", 0, 10));
            focusWhite(this.mainFrame.jTextField_volta_almoco);
        }
        if (this.numButton != 4) {
            jButton_saida.setFont(new java.awt.Font("Tahoma", 0, 10));
            focusWhite(this.mainFrame.jTextField_hora_saida);
        }
        if (this.numButton != 5) {
            jButton_hora_extra.setFont(new java.awt.Font("Tahoma", 0, 10));
            focusWhite(this.mainFrame.jTextField_hora_extra);
        }
        if (this.numButton != 6) {
            jButton_saidas.setFont(new java.awt.Font("Tahoma", 0, 10));
            focusWhite(this.mainFrame.jTextField_hora_saidas);
        }
           
    }
    
    // RESETA FONTE TEXTFIELD AO SAIR NUMPAD
    public void resetFonte(){
        focusWhite(this.mainFrame.jTextField_hora_entrada);
        focusWhite(this.mainFrame.jTextFiel_saida_almoco);
        focusWhite(this.mainFrame.jTextField_volta_almoco);
        focusWhite(this.mainFrame.jTextField_hora_saida);
        focusWhite(this.mainFrame.jTextField_hora_extra);
        focusWhite(this.mainFrame.jTextField_hora_saidas);
    }
    
    //MARCA OS PADROES AO CARREGAR A TELA
    private void setInitBold() {
        if (this.numButton == 1) {
            jButton_entrada.setFont(new java.awt.Font("Tahoma", 1, 10));
            focusBlue(this.mainFrame.jTextField_hora_entrada);
        }
        if (this.numButton == 2) {
            jButton_saida_alm.setFont(new java.awt.Font("Tahoma", 1, 10));
            focusBlue(this.mainFrame.jTextFiel_saida_almoco);
        }
        if (this.numButton == 3) {
            jButton_volta_alm.setFont(new java.awt.Font("Tahoma", 1, 10));
            focusBlue(this.mainFrame.jTextField_volta_almoco);
        }
        if (this.numButton == 4) {
            jButton_saida.setFont(new java.awt.Font("Tahoma", 1, 10));
            focusBlue(this.mainFrame.jTextField_hora_saida);
        }
        if (this.numButton == 5) {
            jButton_hora_extra.setFont(new java.awt.Font("Tahoma", 1, 10));
            focusBlue(this.mainFrame.jTextField_hora_extra);
        }
        if (this.numButton == 6) {
            jButton_saidas.setFont(new java.awt.Font("Tahoma", 1, 10));
            focusBlue(this.mainFrame.jTextField_hora_saidas);
        }
    }
}
