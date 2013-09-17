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

        jButtonH51 = new javax.swing.JButton();
        jButtonH1 = new javax.swing.JButton();
        jButtonH11 = new javax.swing.JButton();
        jButtonH21 = new javax.swing.JButton();
        jButtonH31 = new javax.swing.JButton();
        jButtonH41 = new javax.swing.JButton();
        jButtonH52 = new javax.swing.JButton();
        jButtonH42 = new javax.swing.JButton();
        jButtonH32 = new javax.swing.JButton();
        jButtonH22 = new javax.swing.JButton();
        jButtonH12 = new javax.swing.JButton();
        jButtonH2 = new javax.swing.JButton();
        jButtonH3 = new javax.swing.JButton();
        jButtonH13 = new javax.swing.JButton();
        jButtonH14 = new javax.swing.JButton();
        jButtonH4 = new javax.swing.JButton();
        jButtonH5 = new javax.swing.JButton();
        jButtonH15 = new javax.swing.JButton();
        jButtonH6 = new javax.swing.JButton();
        jButtonH16 = new javax.swing.JButton();
        jButtonH17 = new javax.swing.JButton();
        jButtonH7 = new javax.swing.JButton();
        jButtonH8 = new javax.swing.JButton();
        jButtonH18 = new javax.swing.JButton();
        jButtonH9 = new javax.swing.JButton();
        jButtonH19 = new javax.swing.JButton();
        jButtonH10 = new javax.swing.JButton();
        jButtonH23 = new javax.swing.JButton();
        jButtonH33 = new javax.swing.JButton();
        jButtonH43 = new javax.swing.JButton();
        jButtonH53 = new javax.swing.JButton();
        jButtonH54 = new javax.swing.JButton();
        jButtonH44 = new javax.swing.JButton();
        jButtonH34 = new javax.swing.JButton();
        jButtonH24 = new javax.swing.JButton();
        jButtonH25 = new javax.swing.JButton();
        jButtonH35 = new javax.swing.JButton();
        jButtonH45 = new javax.swing.JButton();
        jButtonH55 = new javax.swing.JButton();
        jButtonH56 = new javax.swing.JButton();
        jButtonH46 = new javax.swing.JButton();
        jButtonH36 = new javax.swing.JButton();
        jButtonH26 = new javax.swing.JButton();
        jButtonH27 = new javax.swing.JButton();
        jButtonH37 = new javax.swing.JButton();
        jButtonH47 = new javax.swing.JButton();
        jButtonH57 = new javax.swing.JButton();
        jButtonH58 = new javax.swing.JButton();
        jButtonH48 = new javax.swing.JButton();
        jButtonH38 = new javax.swing.JButton();
        jButtonH28 = new javax.swing.JButton();
        jButtonH29 = new javax.swing.JButton();
        jButtonH39 = new javax.swing.JButton();
        jButtonH49 = new javax.swing.JButton();
        jButtonH00 = new javax.swing.JButton();
        jButtonH50 = new javax.swing.JButton();
        jButtonH40 = new javax.swing.JButton();
        jButtonH20 = new javax.swing.JButton();
        jButtonH59 = new javax.swing.JButton();
        jButtonH30 = new javax.swing.JButton();
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

        jButtonH51.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH51.setText("51");
        jButtonH51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH51MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH51);
        jButtonH51.setBounds(0, 108, 45, 18);

        jButtonH1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH1.setText("01");
        jButtonH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH1MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH1);
        jButtonH1.setBounds(0, 18, 45, 18);

        jButtonH11.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH11.setText("11");
        jButtonH11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH11MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH11);
        jButtonH11.setBounds(0, 36, 45, 18);

        jButtonH21.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH21.setText("21");
        jButtonH21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH21MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH21);
        jButtonH21.setBounds(0, 54, 45, 18);

        jButtonH31.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH31.setText("31");
        jButtonH31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH31MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH31);
        jButtonH31.setBounds(0, 72, 45, 18);

        jButtonH41.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH41.setText("41");
        jButtonH41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH41MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH41);
        jButtonH41.setBounds(0, 90, 45, 18);

        jButtonH52.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH52.setText("52");
        jButtonH52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH52MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH52);
        jButtonH52.setBounds(45, 108, 45, 18);

        jButtonH42.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH42.setText("42");
        jButtonH42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH42MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH42);
        jButtonH42.setBounds(45, 90, 45, 18);

        jButtonH32.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH32.setText("32");
        jButtonH32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH32MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH32);
        jButtonH32.setBounds(45, 72, 45, 18);

        jButtonH22.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH22.setText("22");
        jButtonH22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH22MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH22);
        jButtonH22.setBounds(45, 54, 45, 18);

        jButtonH12.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH12.setText("12");
        jButtonH12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH12MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH12);
        jButtonH12.setBounds(45, 36, 45, 18);

        jButtonH2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH2.setText("02");
        jButtonH2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH2MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH2);
        jButtonH2.setBounds(45, 18, 45, 18);

        jButtonH3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH3.setText("03");
        jButtonH3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH3MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH3);
        jButtonH3.setBounds(90, 18, 45, 18);

        jButtonH13.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH13.setText("13");
        jButtonH13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH13MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH13);
        jButtonH13.setBounds(90, 36, 45, 18);

        jButtonH14.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH14.setText("14");
        jButtonH14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH14MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH14);
        jButtonH14.setBounds(135, 36, 45, 18);

        jButtonH4.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH4.setText("04");
        jButtonH4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH4MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH4);
        jButtonH4.setBounds(135, 18, 45, 18);

        jButtonH5.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH5.setText("05");
        jButtonH5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH5MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH5);
        jButtonH5.setBounds(180, 18, 45, 18);

        jButtonH15.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH15.setText("15");
        jButtonH15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH15MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH15);
        jButtonH15.setBounds(180, 36, 45, 18);

        jButtonH6.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH6.setText("06");
        jButtonH6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH6MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH6);
        jButtonH6.setBounds(225, 18, 45, 18);

        jButtonH16.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH16.setText("16");
        jButtonH16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH16MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH16);
        jButtonH16.setBounds(225, 36, 45, 18);

        jButtonH17.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH17.setText("17");
        jButtonH17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH17MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH17);
        jButtonH17.setBounds(270, 36, 45, 18);

        jButtonH7.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH7.setText("07");
        jButtonH7.setVerifyInputWhenFocusTarget(false);
        jButtonH7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH7MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH7);
        jButtonH7.setBounds(270, 18, 45, 18);

        jButtonH8.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH8.setText("08");
        jButtonH8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH8MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH8);
        jButtonH8.setBounds(315, 18, 45, 18);

        jButtonH18.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH18.setText("18");
        jButtonH18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH18MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH18);
        jButtonH18.setBounds(315, 36, 45, 18);

        jButtonH9.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH9.setText("09");
        jButtonH9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH9MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH9);
        jButtonH9.setBounds(360, 18, 45, 18);

        jButtonH19.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH19.setText("19");
        jButtonH19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH19MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH19);
        jButtonH19.setBounds(360, 36, 45, 18);

        jButtonH10.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH10.setText("10");
        jButtonH10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH10MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH10);
        jButtonH10.setBounds(405, 18, 45, 18);

        jButtonH23.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH23.setText("23");
        jButtonH23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH23MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH23);
        jButtonH23.setBounds(90, 54, 45, 18);

        jButtonH33.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH33.setText("33");
        jButtonH33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH33MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH33);
        jButtonH33.setBounds(90, 72, 45, 18);

        jButtonH43.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH43.setText("43");
        jButtonH43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH43MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH43);
        jButtonH43.setBounds(90, 90, 45, 18);

        jButtonH53.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH53.setText("53");
        jButtonH53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH53MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH53);
        jButtonH53.setBounds(90, 108, 45, 18);

        jButtonH54.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH54.setText("54");
        jButtonH54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH54MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH54);
        jButtonH54.setBounds(135, 108, 45, 18);

        jButtonH44.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH44.setText("44");
        jButtonH44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH44MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH44);
        jButtonH44.setBounds(135, 90, 45, 18);

        jButtonH34.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH34.setText("34");
        jButtonH34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH34MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH34);
        jButtonH34.setBounds(135, 72, 45, 18);

        jButtonH24.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH24.setText("24");
        jButtonH24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH24MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH24);
        jButtonH24.setBounds(135, 54, 45, 18);

        jButtonH25.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH25.setText("25");
        jButtonH25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH25MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH25);
        jButtonH25.setBounds(180, 54, 45, 18);

        jButtonH35.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH35.setText("35");
        jButtonH35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH35MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH35);
        jButtonH35.setBounds(180, 72, 45, 18);

        jButtonH45.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH45.setText("45");
        jButtonH45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH45MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH45);
        jButtonH45.setBounds(180, 90, 45, 18);

        jButtonH55.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH55.setText("55");
        jButtonH55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH55MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH55);
        jButtonH55.setBounds(180, 108, 45, 18);

        jButtonH56.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH56.setText("56");
        jButtonH56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH56MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH56);
        jButtonH56.setBounds(225, 108, 45, 18);

        jButtonH46.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH46.setText("46");
        jButtonH46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH46MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH46);
        jButtonH46.setBounds(225, 90, 45, 18);

        jButtonH36.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH36.setText("36");
        jButtonH36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH36MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH36);
        jButtonH36.setBounds(225, 72, 45, 18);

        jButtonH26.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH26.setText("26");
        jButtonH26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH26MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH26);
        jButtonH26.setBounds(225, 54, 45, 18);

        jButtonH27.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH27.setText("27");
        jButtonH27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH27MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH27);
        jButtonH27.setBounds(270, 54, 45, 18);

        jButtonH37.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH37.setText("37");
        jButtonH37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH37MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH37);
        jButtonH37.setBounds(270, 72, 45, 18);

        jButtonH47.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH47.setText("47");
        jButtonH47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH47MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH47);
        jButtonH47.setBounds(270, 90, 45, 18);

        jButtonH57.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH57.setText("57");
        jButtonH57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH57MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH57);
        jButtonH57.setBounds(270, 108, 45, 18);

        jButtonH58.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH58.setText("58");
        jButtonH58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH58MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH58);
        jButtonH58.setBounds(315, 108, 45, 18);

        jButtonH48.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH48.setText("48");
        jButtonH48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH48MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH48);
        jButtonH48.setBounds(315, 90, 45, 18);

        jButtonH38.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH38.setText("38");
        jButtonH38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH38MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH38);
        jButtonH38.setBounds(315, 72, 45, 18);

        jButtonH28.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH28.setText("28");
        jButtonH28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH28MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH28);
        jButtonH28.setBounds(315, 54, 45, 18);

        jButtonH29.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH29.setText("29");
        jButtonH29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH29MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH29);
        jButtonH29.setBounds(360, 54, 45, 18);

        jButtonH39.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH39.setText("39");
        jButtonH39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH39MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH39);
        jButtonH39.setBounds(360, 72, 45, 18);

        jButtonH49.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH49.setText("49");
        jButtonH49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH49MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH49);
        jButtonH49.setBounds(360, 90, 45, 18);

        jButtonH00.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH00.setText("00");
        jButtonH00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH00MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH00);
        jButtonH00.setBounds(405, 108, 45, 18);

        jButtonH50.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH50.setText("50");
        jButtonH50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH50MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH50);
        jButtonH50.setBounds(405, 90, 45, 18);

        jButtonH40.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH40.setText("40");
        jButtonH40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH40MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH40);
        jButtonH40.setBounds(405, 72, 45, 18);

        jButtonH20.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH20.setText("20");
        jButtonH20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH20MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH20);
        jButtonH20.setBounds(405, 36, 45, 18);

        jButtonH59.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH59.setText("59");
        jButtonH59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH59MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH59);
        jButtonH59.setBounds(360, 108, 45, 18);

        jButtonH30.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonH30.setText("30");
        jButtonH30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonH30MouseClicked(evt);
            }
        });
        getContentPane().add(jButtonH30);
        jButtonH30.setBounds(405, 54, 45, 18);

        jButton_gravar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton_gravar.setText("GRAVAR");
        jButton_gravar.setSelected(true);
        jButton_gravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_gravarMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_gravar);
        jButton_gravar.setBounds(360, 0, 90, 18);

        jButton_saida.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton_saida.setText("SAIDA");
        jButton_saida.setSelected(true);
        jButton_saida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_saidaMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_saida);
        jButton_saida.setBounds(270, 0, 90, 18);

        jButton_volta_alm.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton_volta_alm.setText("V. ALM");
        jButton_volta_alm.setSelected(true);
        jButton_volta_alm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_volta_almMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_volta_alm);
        jButton_volta_alm.setBounds(180, 0, 90, 18);

        jButton_saida_alm.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton_saida_alm.setText("S. ALM");
        jButton_saida_alm.setSelected(true);
        jButton_saida_alm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_saida_almMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_saida_alm);
        jButton_saida_alm.setBounds(90, 0, 90, 18);

        jButton_entrada.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton_entrada.setText("ENTRADA");
        jButton_entrada.setSelected(true);
        jButton_entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_entradaMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_entrada);
        jButton_entrada.setBounds(0, 0, 90, 18);

        jButton_deletar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton_deletar.setText("DELETAR");
        jButton_deletar.setSelected(true);
        jButton_deletar.setVerifyInputWhenFocusTarget(false);
        jButton_deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_deletarMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_deletar);
        jButton_deletar.setBounds(180, 126, 90, 18);

        jButton_fechar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton_fechar.setText("FECHAR");
        jButton_fechar.setSelected(true);
        jButton_fechar.setVerifyInputWhenFocusTarget(false);
        jButton_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_fecharMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_fechar);
        jButton_fechar.setBounds(360, 126, 90, 18);

        jButton_saidas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton_saidas.setText("SAIDAS");
        jButton_saidas.setSelected(true);
        jButton_saidas.setVerifyInputWhenFocusTarget(false);
        jButton_saidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_saidasMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_saidas);
        jButton_saidas.setBounds(90, 126, 90, 18);

        jButton_hora_extra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton_hora_extra.setText("H.EXTRA");
        jButton_hora_extra.setSelected(true);
        jButton_hora_extra.setVerifyInputWhenFocusTarget(false);
        jButton_hora_extra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_hora_extraMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_hora_extra);
        jButton_hora_extra.setBounds(0, 126, 90, 18);

        jButton_limpar_campo1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton_limpar_campo1.setText("LIMPAR");
        jButton_limpar_campo1.setSelected(true);
        jButton_limpar_campo1.setVerifyInputWhenFocusTarget(false);
        jButton_limpar_campo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_limpar_campo1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton_limpar_campo1);
        jButton_limpar_campo1.setBounds(270, 126, 90, 18);

        setSize(new java.awt.Dimension(465, 182));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonH1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH1MouseClicked
       setText("01");        
    }//GEN-LAST:event_jButtonH1MouseClicked

    private void jButtonH2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH2MouseClicked
        setText("02");        
    }//GEN-LAST:event_jButtonH2MouseClicked

    private void jButtonH3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH3MouseClicked
        setText("03");        
    }//GEN-LAST:event_jButtonH3MouseClicked

    private void jButtonH4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH4MouseClicked
        setText("04");        
    }//GEN-LAST:event_jButtonH4MouseClicked

    private void jButtonH5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH5MouseClicked
        setText("05");        
    }//GEN-LAST:event_jButtonH5MouseClicked

    private void jButtonH6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH6MouseClicked
        setText("06");        
    }//GEN-LAST:event_jButtonH6MouseClicked

    private void jButtonH7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH7MouseClicked
        setText("07");        
    }//GEN-LAST:event_jButtonH7MouseClicked

    private void jButtonH8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH8MouseClicked
        setText("08");        
    }//GEN-LAST:event_jButtonH8MouseClicked

    private void jButtonH9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH9MouseClicked
        setText("09");        
    }//GEN-LAST:event_jButtonH9MouseClicked

    private void jButtonH10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH10MouseClicked
        setText("10");        
    }//GEN-LAST:event_jButtonH10MouseClicked

    private void jButtonH11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH11MouseClicked
        setText("11");        
    }//GEN-LAST:event_jButtonH11MouseClicked

    private void jButtonH12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH12MouseClicked
        setText("12");        
    }//GEN-LAST:event_jButtonH12MouseClicked

    private void jButtonH13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH13MouseClicked
        setText("13");        
    }//GEN-LAST:event_jButtonH13MouseClicked

    private void jButtonH14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH14MouseClicked
        setText("14");        
    }//GEN-LAST:event_jButtonH14MouseClicked

    private void jButtonH15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH15MouseClicked
        setText("15");        
    }//GEN-LAST:event_jButtonH15MouseClicked

    private void jButtonH16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH16MouseClicked
        setText("16");        
    }//GEN-LAST:event_jButtonH16MouseClicked

    private void jButtonH17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH17MouseClicked
        setText("17");        
    }//GEN-LAST:event_jButtonH17MouseClicked

    private void jButtonH18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH18MouseClicked
        setText("18");        
    }//GEN-LAST:event_jButtonH18MouseClicked

    private void jButtonH19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH19MouseClicked
        setText("19");        
    }//GEN-LAST:event_jButtonH19MouseClicked

    private void jButtonH20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH20MouseClicked
        setText("20");        
    }//GEN-LAST:event_jButtonH20MouseClicked

    private void jButtonH21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH21MouseClicked
        setText("21");        
    }//GEN-LAST:event_jButtonH21MouseClicked

    private void jButtonH22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH22MouseClicked
        setText("22");        
    }//GEN-LAST:event_jButtonH22MouseClicked

    private void jButtonH23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH23MouseClicked
        setText("23");        
    }//GEN-LAST:event_jButtonH23MouseClicked

    private void jButtonH24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH24MouseClicked
        setText("24");        
    }//GEN-LAST:event_jButtonH24MouseClicked

    private void jButtonH25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH25MouseClicked
        setText("25");        
    }//GEN-LAST:event_jButtonH25MouseClicked

    private void jButtonH26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH26MouseClicked
        setText("26");        
    }//GEN-LAST:event_jButtonH26MouseClicked

    private void jButtonH27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH27MouseClicked
        setText("27");        
    }//GEN-LAST:event_jButtonH27MouseClicked

    private void jButtonH28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH28MouseClicked
        setText("28");        
    }//GEN-LAST:event_jButtonH28MouseClicked

    private void jButtonH29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH29MouseClicked
        setText("29");        
    }//GEN-LAST:event_jButtonH29MouseClicked

    private void jButtonH30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH30MouseClicked
        setText("30");        
    }//GEN-LAST:event_jButtonH30MouseClicked

    private void jButtonH31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH31MouseClicked
        setText("31");        
    }//GEN-LAST:event_jButtonH31MouseClicked

    private void jButtonH32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH32MouseClicked
        setText("32");        
    }//GEN-LAST:event_jButtonH32MouseClicked

    private void jButtonH33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH33MouseClicked
        setText("33");        
    }//GEN-LAST:event_jButtonH33MouseClicked

    private void jButtonH34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH34MouseClicked
        setText("34");        
    }//GEN-LAST:event_jButtonH34MouseClicked

    private void jButtonH35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH35MouseClicked
        setText("35");        
    }//GEN-LAST:event_jButtonH35MouseClicked

    private void jButtonH36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH36MouseClicked
        setText("36");        
    }//GEN-LAST:event_jButtonH36MouseClicked

    private void jButtonH37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH37MouseClicked
        setText("37");        
    }//GEN-LAST:event_jButtonH37MouseClicked

    private void jButtonH38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH38MouseClicked
        setText("38");        
    }//GEN-LAST:event_jButtonH38MouseClicked

    private void jButtonH39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH39MouseClicked
        setText("39");        
    }//GEN-LAST:event_jButtonH39MouseClicked

    private void jButtonH40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH40MouseClicked
        setText("40");        
    }//GEN-LAST:event_jButtonH40MouseClicked

    private void jButtonH41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH41MouseClicked
        setText("41");        
    }//GEN-LAST:event_jButtonH41MouseClicked

    private void jButtonH42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH42MouseClicked
        setText("42");        
    }//GEN-LAST:event_jButtonH42MouseClicked

    private void jButtonH43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH43MouseClicked
        setText("43");        
    }//GEN-LAST:event_jButtonH43MouseClicked

    private void jButtonH44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH44MouseClicked
        setText("44");        
    }//GEN-LAST:event_jButtonH44MouseClicked

    private void jButtonH45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH45MouseClicked
        setText("45");        
    }//GEN-LAST:event_jButtonH45MouseClicked

    private void jButtonH46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH46MouseClicked
        setText("46");        
    }//GEN-LAST:event_jButtonH46MouseClicked

    private void jButtonH47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH47MouseClicked
        setText("47");        
    }//GEN-LAST:event_jButtonH47MouseClicked

    private void jButtonH48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH48MouseClicked
        setText("48");        
    }//GEN-LAST:event_jButtonH48MouseClicked

    private void jButtonH49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH49MouseClicked
        setText("49");        
    }//GEN-LAST:event_jButtonH49MouseClicked

    private void jButtonH50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH50MouseClicked
        setText("50");        
    }//GEN-LAST:event_jButtonH50MouseClicked

    private void jButtonH51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH51MouseClicked
        setText("51");        
    }//GEN-LAST:event_jButtonH51MouseClicked

    private void jButtonH52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH52MouseClicked
        setText("52");        
    }//GEN-LAST:event_jButtonH52MouseClicked

    private void jButtonH53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH53MouseClicked
        setText("53");        
    }//GEN-LAST:event_jButtonH53MouseClicked

    private void jButtonH54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH54MouseClicked
        setText("54");        
    }//GEN-LAST:event_jButtonH54MouseClicked

    private void jButtonH55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH55MouseClicked
        setText("55");        
    }//GEN-LAST:event_jButtonH55MouseClicked

    private void jButtonH56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH56MouseClicked
        setText("56");        
    }//GEN-LAST:event_jButtonH56MouseClicked

    private void jButtonH57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH57MouseClicked
        setText("57");        
    }//GEN-LAST:event_jButtonH57MouseClicked

    private void jButtonH58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH58MouseClicked
        setText("58");        
    }//GEN-LAST:event_jButtonH58MouseClicked

    private void jButtonH59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH59MouseClicked
        setText("59");        
    }//GEN-LAST:event_jButtonH59MouseClicked

    private void jButtonH00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonH00MouseClicked
        setText("00");        
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
   
    private String getStr(String str, String valor) {

     int size;
        size = str.length();
     String ret = "";
     
     if(size == 0 || size > 3){
         Integer i = new Integer(valor);
         ret = i > 23 ? "" : valor + ":" ;
     }
     else
      if(size == 3){       
          ret = str+valor;   
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
    private javax.swing.JButton jButtonH10;
    private javax.swing.JButton jButtonH11;
    private javax.swing.JButton jButtonH12;
    private javax.swing.JButton jButtonH13;
    private javax.swing.JButton jButtonH14;
    private javax.swing.JButton jButtonH15;
    private javax.swing.JButton jButtonH16;
    private javax.swing.JButton jButtonH17;
    private javax.swing.JButton jButtonH18;
    private javax.swing.JButton jButtonH19;
    private javax.swing.JButton jButtonH2;
    private javax.swing.JButton jButtonH20;
    private javax.swing.JButton jButtonH21;
    private javax.swing.JButton jButtonH22;
    private javax.swing.JButton jButtonH23;
    private javax.swing.JButton jButtonH24;
    private javax.swing.JButton jButtonH25;
    private javax.swing.JButton jButtonH26;
    private javax.swing.JButton jButtonH27;
    private javax.swing.JButton jButtonH28;
    private javax.swing.JButton jButtonH29;
    private javax.swing.JButton jButtonH3;
    private javax.swing.JButton jButtonH30;
    private javax.swing.JButton jButtonH31;
    private javax.swing.JButton jButtonH32;
    private javax.swing.JButton jButtonH33;
    private javax.swing.JButton jButtonH34;
    private javax.swing.JButton jButtonH35;
    private javax.swing.JButton jButtonH36;
    private javax.swing.JButton jButtonH37;
    private javax.swing.JButton jButtonH38;
    private javax.swing.JButton jButtonH39;
    private javax.swing.JButton jButtonH4;
    private javax.swing.JButton jButtonH40;
    private javax.swing.JButton jButtonH41;
    private javax.swing.JButton jButtonH42;
    private javax.swing.JButton jButtonH43;
    private javax.swing.JButton jButtonH44;
    private javax.swing.JButton jButtonH45;
    private javax.swing.JButton jButtonH46;
    private javax.swing.JButton jButtonH47;
    private javax.swing.JButton jButtonH48;
    private javax.swing.JButton jButtonH49;
    private javax.swing.JButton jButtonH5;
    private javax.swing.JButton jButtonH50;
    private javax.swing.JButton jButtonH51;
    private javax.swing.JButton jButtonH52;
    private javax.swing.JButton jButtonH53;
    private javax.swing.JButton jButtonH54;
    private javax.swing.JButton jButtonH55;
    private javax.swing.JButton jButtonH56;
    private javax.swing.JButton jButtonH57;
    private javax.swing.JButton jButtonH58;
    private javax.swing.JButton jButtonH59;
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
