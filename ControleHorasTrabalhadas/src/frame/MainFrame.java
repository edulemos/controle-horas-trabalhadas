package frame;

import dao.RegistroDAO;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.Parametrizacao;
import model.Registro;
import util.Convert;
import util.GeraRelatorio;
import util.OpenBrowser;
import util.Valida;

public class MainFrame extends javax.swing.JFrame {

    private Date data = null;
    private String entrada = "";
    private String saidaAlmoco = "";
    private String voltaAlmoco = "";
    private String saida = "";
    private String horaExtra = "";
    private String saidas = "";
    private String erros = "";
    private String id = "";
    private Valida validate = new Valida();
    private Convert converte = new Convert();
    private OpenBrowser o = new OpenBrowser();
    private List lista = new ArrayList();
    private Registro registro = new Registro();
    private Integer trabalhadoMes = 0;
    private Integer calculadoMes = 0;     
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public MainFrame() {
        
        initComponents();
        jDate_data.setDate(new java.util.Date());
        setParameter();
        preencher_jtable();
        alinhaCampos();
        avisoBackup();
        recarregarAtual(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label_data = new javax.swing.JLabel();
        jDate_ate = new com.toedter.calendar.JDateChooser();
        jDate_de = new com.toedter.calendar.JDateChooser();
        jDate_data = new com.toedter.calendar.JDateChooser();
        jDate_data.getDateEditor().addPropertyChangeListener(
            new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent e) {
                    if ("date".equals(e.getPropertyName())) {

                        jTextField_hora_entrada.setText("");
                        jTextFiel_saida_almoco.setText("");
                        jTextField_volta_almoco.setText("");
                        jTextField_hora_saida.setText("");
                        jTextField_hora_extra.setText("");
                        jTextField_hora_saidas.setText("");
                        jTextField_trabalhado.setText("");
                        jTextField_calculado.setText("");

                    }
                }
            });
            this.add(jDate_data);
            button_ok = new javax.swing.JButton();
            label_de = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            label_entrada2 = new javax.swing.JLabel();
            field_trabalhado_mes = new javax.swing.JTextField();
            field_calculado_mes = new javax.swing.JTextField();
            label_entrada4 = new javax.swing.JLabel();
            label_de1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            label_entrada = new javax.swing.JLabel();
            jTextField_hora_entrada = new javax.swing.JTextField();
            label_entrada1 = new javax.swing.JLabel();
            jTextFiel_saida_almoco = new javax.swing.JTextField();
            label_entrada5 = new javax.swing.JLabel();
            jTextField_volta_almoco = new javax.swing.JTextField();
            label_entrada6 = new javax.swing.JLabel();
            jTextField_hora_saida = new javax.swing.JTextField();
            label_entrada7 = new javax.swing.JLabel();
            jTextField_hora_extra = new javax.swing.JTextField();
            label_entrada8 = new javax.swing.JLabel();
            jTextField_hora_saidas = new javax.swing.JTextField();
            label_entrada9 = new javax.swing.JLabel();
            jTextField_trabalhado = new javax.swing.JTextField();
            label_entrada10 = new javax.swing.JLabel();
            jTextField_calculado = new javax.swing.JTextField();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("CONTROLE DE HORÁRIO");
            setFocusable(false);
            setResizable(false);
            getContentPane().setLayout(null);

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                    "id", "Data", "Entrada", "S.Alm", "V.Alm", "Saída", "H.Extra", "Saídas", "Trab", "Calc"
                }
            ));
            jTable1.setOpaque(false);
            jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTable1MouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTable1);

            getContentPane().add(jScrollPane1);
            jScrollPane1.setBounds(10, 130, 420, 330);

            label_data.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_data.setText("DATA");
            getContentPane().add(label_data);
            label_data.setBounds(10, 2, 85, 15);

            jDate_ate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jDate_ate.setDateFormatString(" dd/MM/yyyy");
            jDate_ate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            getContentPane().add(jDate_ate);
            jDate_ate.setBounds(150, 475, 90, 20);

            jDate_de.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jDate_de.setDateFormatString(" dd/MM/yyyy");
            jDate_de.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            getContentPane().add(jDate_de);
            jDate_de.setBounds(60, 475, 90, 20);

            jDate_data.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jDate_data.setDateFormatString(" dd/MM/yyyy");
            jDate_data.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            getContentPane().add(jDate_data);
            jDate_data.setBounds(10, 15, 80, 20);

            button_ok.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            button_ok.setText("OK");
            button_ok.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button_okActionPerformed(evt);
                }
            });
            getContentPane().add(button_ok);
            button_ok.setBounds(10, 474, 48, 20);

            label_de.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_de.setText("ATE");
            label_de.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(label_de);
            label_de.setBounds(150, 462, 30, 12);

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(153, 153, 153));
            jLabel1.setText("CONTROLE DE HORÁRIO");
            jLabel1.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jLabel1);
            jLabel1.setBounds(110, 10, 230, 20);

            label_entrada2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada2.setText("CALCULADO");
            label_entrada2.setRequestFocusEnabled(false);
            label_entrada2.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(label_entrada2);
            label_entrada2.setBounds(335, 462, 70, 12);

            field_trabalhado_mes.setEditable(false);
            field_trabalhado_mes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            field_trabalhado_mes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            field_trabalhado_mes.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(field_trabalhado_mes);
            field_trabalhado_mes.setBounds(240, 475, 90, 20);

            field_calculado_mes.setEditable(false);
            field_calculado_mes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            field_calculado_mes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            field_calculado_mes.setRequestFocusEnabled(false);
            getContentPane().add(field_calculado_mes);
            field_calculado_mes.setBounds(335, 475, 90, 20);

            label_entrada4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada4.setText("TRABALHADO");
            label_entrada4.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(label_entrada4);
            label_entrada4.setBounds(240, 462, 80, 10);

            label_de1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_de1.setText("DE");
            label_de1.setRequestFocusEnabled(false);
            label_de1.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(label_de1);
            label_de1.setBounds(60, 462, 20, 12);

            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 51, 255));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_icon.gif"))); // NOI18N
            jLabel2.setRequestFocusEnabled(false);
            jLabel2.setVerifyInputWhenFocusTarget(false);
            jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel2MouseClicked(evt);
                }
            });
            getContentPane().add(jLabel2);
            jLabel2.setBounds(400, 10, 30, 20);

            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/relatorio.gif"))); // NOI18N
            jLabel6.setRequestFocusEnabled(false);
            jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel6MouseClicked(evt);
                }
            });
            getContentPane().add(jLabel6);
            jLabel6.setBounds(370, 10, 90, 20);

            label_entrada.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada.setText("ENTRADA");
            label_entrada.setOpaque(true);
            getContentPane().add(label_entrada);
            label_entrada.setBounds(10, 45, 85, 15);

            jTextField_hora_entrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTextField_hora_entrada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jTextField_hora_entrada.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTextField_hora_entradaMouseClicked(evt);
                }
            });
            getContentPane().add(jTextField_hora_entrada);
            jTextField_hora_entrada.setBounds(10, 60, 100, 25);

            label_entrada1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada1.setText("SAIDA ALMOÇO");
            label_entrada1.setOpaque(true);
            label_entrada1.setRequestFocusEnabled(false);
            getContentPane().add(label_entrada1);
            label_entrada1.setBounds(115, 45, 85, 15);

            jTextFiel_saida_almoco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTextFiel_saida_almoco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jTextFiel_saida_almoco.setRequestFocusEnabled(false);
            jTextFiel_saida_almoco.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTextFiel_saida_almocoMouseClicked(evt);
                }
            });
            getContentPane().add(jTextFiel_saida_almoco);
            jTextFiel_saida_almoco.setBounds(115, 60, 100, 25);

            label_entrada5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada5.setText("VOLTA ALMOÇO");
            label_entrada5.setOpaque(true);
            getContentPane().add(label_entrada5);
            label_entrada5.setBounds(220, 45, 85, 15);

            jTextField_volta_almoco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTextField_volta_almoco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jTextField_volta_almoco.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTextField_volta_almocoMouseClicked(evt);
                }
            });
            getContentPane().add(jTextField_volta_almoco);
            jTextField_volta_almoco.setBounds(220, 60, 100, 25);

            label_entrada6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada6.setText("SAIDA");
            label_entrada6.setOpaque(true);
            label_entrada6.setPreferredSize(null);
            label_entrada6.setRequestFocusEnabled(false);
            getContentPane().add(label_entrada6);
            label_entrada6.setBounds(325, 45, 85, 15);

            jTextField_hora_saida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTextField_hora_saida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jTextField_hora_saida.setPreferredSize(null);
            jTextField_hora_saida.setRequestFocusEnabled(false);
            jTextField_hora_saida.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTextField_hora_saidaMouseClicked(evt);
                }
            });
            getContentPane().add(jTextField_hora_saida);
            jTextField_hora_saida.setBounds(325, 60, 100, 25);

            label_entrada7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada7.setText("HORA EXTRA");
            label_entrada7.setOpaque(true);
            getContentPane().add(label_entrada7);
            label_entrada7.setBounds(10, 85, 85, 15);

            jTextField_hora_extra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTextField_hora_extra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jTextField_hora_extra.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTextField_hora_extraMouseClicked(evt);
                }
            });
            getContentPane().add(jTextField_hora_extra);
            jTextField_hora_extra.setBounds(10, 100, 100, 25);

            label_entrada8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada8.setText("HORAS SAIDAS");
            label_entrada8.setOpaque(true);
            label_entrada8.setRequestFocusEnabled(false);
            getContentPane().add(label_entrada8);
            label_entrada8.setBounds(115, 85, 85, 15);

            jTextField_hora_saidas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTextField_hora_saidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jTextField_hora_saidas.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTextField_hora_saidasMouseClicked(evt);
                }
            });
            getContentPane().add(jTextField_hora_saidas);
            jTextField_hora_saidas.setBounds(115, 100, 100, 25);

            label_entrada9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada9.setText("TRABALHADO");
            label_entrada9.setOpaque(true);
            getContentPane().add(label_entrada9);
            label_entrada9.setBounds(220, 85, 85, 15);

            jTextField_trabalhado.setEditable(false);
            jTextField_trabalhado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTextField_trabalhado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            getContentPane().add(jTextField_trabalhado);
            jTextField_trabalhado.setBounds(220, 100, 100, 25);

            label_entrada10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada10.setText("CALCULADO");
            label_entrada10.setOpaque(true);
            label_entrada10.setPreferredSize(null);
            label_entrada10.setRequestFocusEnabled(false);
            getContentPane().add(label_entrada10);
            label_entrada10.setBounds(325, 85, 85, 15);

            jTextField_calculado.setEditable(false);
            jTextField_calculado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTextField_calculado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jTextField_calculado.setPreferredSize(null);
            jTextField_calculado.setRequestFocusEnabled(false);
            getContentPane().add(jTextField_calculado);
            jTextField_calculado.setBounds(325, 100, 100, 25);

            setSize(new java.awt.Dimension(444, 528));
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    
    public void gravar(){
        data = jDate_data.getDate();
        entrada = jTextField_hora_entrada.getText();
        saidaAlmoco = jTextFiel_saida_almoco.getText();
        voltaAlmoco = jTextField_volta_almoco.getText();
        saida = jTextField_hora_saida.getText();
        horaExtra = jTextField_hora_extra.getText();
        saidas = jTextField_hora_saidas.getText();

        erros = validate.validaFields(data, entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);

        String msg = "";
                
        if ("".equals(erros)) {

            if (null != id && !"".equals(id)) {
                msg = "CONFIRMA EDIÇÃO\n REGISTRO " + sdf.format(data);
                int opcao_escolhida = JOptionPane.showConfirmDialog(null, msg, "Confirmação", JOptionPane.YES_NO_OPTION);
                if (opcao_escolhida == JOptionPane.YES_OPTION) {
                    dao().editar(converte.strToObj(new Integer(id), data, entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas, data));
                }
            } else {
                try {
                    if (!dao().verificaDuplicado(converte.dataSql(data))) {
                        msg = "CONFIRMA GRAVAÇÃO \n REGISTRO " + sdf.format(data);
                        int opcao_escolhida = JOptionPane.showConfirmDialog(null, msg, "Confirmação", JOptionPane.YES_NO_OPTION);
                        if (opcao_escolhida == JOptionPane.YES_OPTION) {
                            dao().save(converte.strToObj(null, data, entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas, data));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Data já Cadastrada!");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            preencher_jtable();
            recarregarAtual(0);
        } else {
            JOptionPane.showMessageDialog(null, erros);
        }
    }
    
    private void button_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_okActionPerformed
        erros = validate.validaDatas(jDate_de.getDate(), jDate_ate.getDate());
        if ("".equals(erros)) {
            preencher_jtable();
            updateParametr();
        } else {
            JOptionPane.showMessageDialog(null, erros);
        }
    }//GEN-LAST:event_button_okActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linhasum = jTable1.getRowCount();
        int linha = jTable1.getSelectedRow();

        if (linhasum >= 1) {
            try {
                this.id = jTable1.getValueAt(linha, 0).toString();
                jDate_data.setDate(sdf.parse(jTable1.getValueAt(linha, 1).toString()));
                jTextField_hora_entrada.setText(jTable1.getValueAt(linha, 2).toString());                
                jTextFiel_saida_almoco.setText(jTable1.getValueAt(linha, 3).toString());                
                jTextField_volta_almoco.setText(jTable1.getValueAt(linha, 4).toString());
                jTextField_hora_saida.setText(jTable1.getValueAt(linha, 5).toString());                
                jTextField_hora_extra.setText(jTable1.getValueAt(linha, 6).toString());
                jTextField_hora_saidas.setText(jTable1.getValueAt(linha, 7).toString());
                jTextField_trabalhado.setText(jTable1.getValueAt(linha, 8).toString());                
                jTextField_calculado.setText(jTable1.getValueAt(linha, 9).toString());                 

            } catch (ParseException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            alinhaCampos();

        }    }//GEN-LAST:event_jTable1MouseClicked

    public void limpar(){
         this.id = "";     
            jDate_data.setDate(new java.util.Date());
            jTextField_hora_entrada.setText("");
            jTextFiel_saida_almoco.setText("");                
            jTextField_volta_almoco.setText("");
            jTextField_hora_saida.setText("");               
            jTextField_hora_extra.setText("");
            jTextField_hora_saidas.setText("");
            jTextField_trabalhado.setText("");              
            jTextField_calculado.setText("");
    }
    
    public void deletar(){
        try {
            if (null != id && !"".equals(id)) {
                String excluir = "Confirma a exclusão do registro de " + sdf.format(jDate_data.getDate()) + "!";
                int opcao_escolhida = JOptionPane.showConfirmDialog(null, excluir, "exclusão", JOptionPane.YES_NO_OPTION);
                if (opcao_escolhida == JOptionPane.YES_OPTION) {
                    dao().delete(new Integer(id));
                    preencher_jtable();
                    limpar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum Registro Selecionado!");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir " + e);
        }
    }
    
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        o.openURL("https://code.google.com/p/controle-horas-trabalhadas/downloads/list");
        }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new GeraRelatorio().relatorio(jDate_de.getDate(), jDate_ate.getDate());
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jTextFiel_saida_almocoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFiel_saida_almocoMouseClicked
       new NumPad(this,2).setVisible(true);
    }//GEN-LAST:event_jTextFiel_saida_almocoMouseClicked

    private void jTextField_volta_almocoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_volta_almocoMouseClicked
       new NumPad(this,3).setVisible(true);
    }//GEN-LAST:event_jTextField_volta_almocoMouseClicked

    private void jTextField_hora_saidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_hora_saidaMouseClicked
       new NumPad(this,4).setVisible(true);
    }//GEN-LAST:event_jTextField_hora_saidaMouseClicked

    private void jTextField_hora_extraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_hora_extraMouseClicked
       new NumPad(this,5).setVisible(true);
    }//GEN-LAST:event_jTextField_hora_extraMouseClicked

    private void jTextField_hora_saidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_hora_saidasMouseClicked
       new NumPad(this,6).setVisible(true);
    }//GEN-LAST:event_jTextField_hora_saidasMouseClicked

    private void jTextField_hora_entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_hora_entradaMouseClicked
       new NumPad(this,1).setVisible(true);
    }//GEN-LAST:event_jTextField_hora_entradaMouseClicked

    private void preencher_jtable() {

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);

        JTableHeader titulos = jTable1.getTableHeader();

        titulos.setFont(new Font("Dialog", Font.BOLD, 10));

        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);

        jTable1.getColumnModel().getColumn(1).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centralizado);

        jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(centralizado);

        jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(centralizado);

        jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(centralizado);

        jTable1.getColumnModel().getColumn(5).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(centralizado);

        jTable1.getColumnModel().getColumn(6).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(6).setCellRenderer(centralizado);

        jTable1.getColumnModel().getColumn(7).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(7).setCellRenderer(centralizado);

        jTable1.getColumnModel().getColumn(8).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(8).setCellRenderer(centralizado);

        jTable1.getColumnModel().getColumn(9).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(9).setCellRenderer(centralizado);


        try {
            lista = dao().getLista(converte.dataSql(jDate_de.getDate()), converte.dataSql(jDate_ate.getDate()));

            trabalhadoMes = 0;
            calculadoMes = 0;

            if (!lista.isEmpty()) {

                for (int i = 0; i < lista.size(); i++) {
                    registro = (Registro) lista.get(i);

                    trabalhadoMes += registro.getTotalTrabalhado();
                    calculadoMes += registro.getTotalCalculado();

                    modelo.addRow(new Object[]{
                        registro.getId(),
                        sdf.format(registro.getData()),
                        converte.minToHoraStr(registro.getEntrada()),
                        converte.minToHoraStr(registro.getSaidaAlmoco()),
                        converte.minToHoraStr(registro.getVoltaAlmoco()),
                        converte.minToHoraStr(registro.getSaida()),
                        converte.minToHoraStr(registro.getHoraExtra()),
                        converte.minToHoraStr(registro.getSaidas()),
                        converte.minToHoraStr(registro.getTotalTrabalhado()),
                        converte.minToHoraStr(registro.getTotalCalculado()),});
                }
            } else {
                modelo.setNumRows(0);
            }
            field_trabalhado_mes.setText(converte.minToHoraStr(trabalhadoMes));
            field_calculado_mes.setText(converte.minToHoraStr(calculadoMes));

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro ao listar Jtable" + erro);
        }
    }

    public void alinhaCampos() {
        
        field_calculado_mes.setHorizontalAlignment(field_calculado_mes.CENTER);        
        field_trabalhado_mes.setHorizontalAlignment(field_trabalhado_mes.CENTER);      
        jTextField_hora_entrada.setHorizontalAlignment(field_calculado_mes.CENTER);
        jTextFiel_saida_almoco.setHorizontalAlignment(field_calculado_mes.CENTER); 
        jTextField_volta_almoco.setHorizontalAlignment(field_calculado_mes.CENTER);
        jTextField_hora_saida.setHorizontalAlignment(field_calculado_mes.CENTER);
        jTextField_hora_extra.setHorizontalAlignment(field_calculado_mes.CENTER);
        jTextField_hora_saidas.setHorizontalAlignment(field_calculado_mes.CENTER);
        jTextField_trabalhado.setHorizontalAlignment(field_calculado_mes.CENTER);
        jTextField_calculado.setHorizontalAlignment(field_calculado_mes.CENTER);
            
    }

    public void setParameter() {
        try {
            Map<String, String> mapa = dao().getPrm();
            String dataIniPrm = mapa.get("inicio");
            String dataFimPrm = mapa.get("fim");
            Date dataini = sdf.parse(dataIniPrm);
            Date datafim = sdf.parse(dataFimPrm);
            jDate_de.setDate(dataini);
            jDate_ate.setDate(datafim);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void updateParametr() {
        try {
            String dataIniFrm = sdf.format(jDate_de.getDate().getTime());
            String dataFimFrm = sdf.format(jDate_ate.getDate().getTime());
            Parametrizacao param1 = new Parametrizacao();
            param1.setParametro("inicio");
            param1.setValor(dataIniFrm);
            dao().updatePrm(param1);
            Parametrizacao param2 = new Parametrizacao();
            param2.setParametro("fim");
            param2.setValor(dataFimFrm);
            dao().updatePrm(param2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void avisoBackup() {
        Date dataDeHoje = new Date();
        if (1 == dataDeHoje.getDate() && (0 != dataDeHoje.getDay() && 6 != dataDeHoje.getDay())) {
            JOptionPane.showMessageDialog(null, "       LEMBRETE DE BACKUP \n Para fazer o backup dos dados\n salve a pasta db que se encontra\n dentro do diretorio de instalação.");
        } else if (2 == dataDeHoje.getDate() && (0 != dataDeHoje.getDay() && 6 != dataDeHoje.getDay())) {
            JOptionPane.showMessageDialog(null, "       LEMBRETE DE BACKUP \n Para fazer o backup dos dados\n salve a pasta db que se encontra\n dentro do diretorio de instalação.");
        } else if (3 == dataDeHoje.getDate() && (0 != dataDeHoje.getDay() && 6 != dataDeHoje.getDay())) {
            JOptionPane.showMessageDialog(null, "       LEMBRETE DE BACKUP \n Para fazer o backup dos dados\n salve a pasta db que se encontra\n dentro do diretorio de instalação.");
        }
    }

    private RegistroDAO dao() {
        RegistroDAO dao = new RegistroDAO();
        return dao;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_ok;
    private javax.swing.JTextField field_calculado_mes;
    private javax.swing.JTextField field_trabalhado_mes;
    private com.toedter.calendar.JDateChooser jDate_ate;
    private com.toedter.calendar.JDateChooser jDate_data;
    private com.toedter.calendar.JDateChooser jDate_de;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextFiel_saida_almoco;
    private javax.swing.JTextField jTextField_calculado;
    public javax.swing.JTextField jTextField_hora_entrada;
    public javax.swing.JTextField jTextField_hora_extra;
    public javax.swing.JTextField jTextField_hora_saida;
    public javax.swing.JTextField jTextField_hora_saidas;
    private javax.swing.JTextField jTextField_trabalhado;
    public javax.swing.JTextField jTextField_volta_almoco;
    private javax.swing.JLabel label_data;
    private javax.swing.JLabel label_de;
    private javax.swing.JLabel label_de1;
    private javax.swing.JLabel label_entrada;
    private javax.swing.JLabel label_entrada1;
    private javax.swing.JLabel label_entrada10;
    private javax.swing.JLabel label_entrada2;
    private javax.swing.JLabel label_entrada4;
    private javax.swing.JLabel label_entrada5;
    private javax.swing.JLabel label_entrada6;
    private javax.swing.JLabel label_entrada7;
    private javax.swing.JLabel label_entrada8;
    private javax.swing.JLabel label_entrada9;
    // End of variables declaration//GEN-END:variables

    private void recarregarAtual(int fl_date) {
        Registro registro1;
        if(fl_date == 1){
              registro1 = dao().getRegistroBydate(new java.sql.Date(new java.util.Date().getTime()));
        }else{
             registro1 = dao().getRegistro(this.id);
        }
        
        if (null != registro1) {

            jDate_data.setDate(registro.getData());
            jTextField_hora_entrada.setText(converte.minToHoraStr(registro1.getEntrada()));
            jTextFiel_saida_almoco.setText(converte.minToHoraStr(registro1.getSaidaAlmoco()));
            jTextField_volta_almoco.setText(converte.minToHoraStr(registro1.getVoltaAlmoco()));
            jTextField_hora_saida.setText(converte.minToHoraStr(registro1.getSaida()));
            jTextField_hora_extra.setText(converte.minToHoraStr(registro1.getHoraExtra()));
            jTextField_hora_saidas.setText(converte.minToHoraStr(registro1.getSaidas()));
            jTextField_trabalhado.setText(converte.minToHoraStr(registro1.getTotalTrabalhado()));
            jTextField_calculado.setText(converte.minToHoraStr(registro1.getTotalCalculado()));
        }
    }

   
}