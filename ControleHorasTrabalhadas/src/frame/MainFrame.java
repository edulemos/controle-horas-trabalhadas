package frame;

import dao.RegistroDAO;
import java.awt.Font;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.Parametrizacao;
import model.Registro;
import util.Convert;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        label_entrada = new javax.swing.JLabel();
        label_entrada1 = new javax.swing.JLabel();
        label_saidaalmoco = new javax.swing.JLabel();
        label_voltaalmoco = new javax.swing.JLabel();
        label_saida = new javax.swing.JLabel();
        label_hextra = new javax.swing.JLabel();
        jDate_ate = new com.toedter.calendar.JDateChooser();
        label_data = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDate_de = new com.toedter.calendar.JDateChooser();
        jDate_data = new com.toedter.calendar.JDateChooser();
        button_ok = new javax.swing.JButton();
        label_de = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        field_trabalhado_dia = new javax.swing.JTextField();
        field_calculado_dia = new javax.swing.JTextField();
        label_saidas = new javax.swing.JLabel();
        label_entrada3 = new javax.swing.JLabel();
        label_entrada2 = new javax.swing.JLabel();
        field_trabalhado_mes = new javax.swing.JTextField();
        field_calculado_mes = new javax.swing.JTextField();
        label_entrada4 = new javax.swing.JLabel();
        label_de1 = new javax.swing.JLabel();
        field_saidas = new javax.swing.JFormattedTextField();
        field_horaextra = new javax.swing.JFormattedTextField();
        field_saida = new javax.swing.JFormattedTextField();
        field_entrada = new javax.swing.JFormattedTextField();
        field_saidaalmoco = new javax.swing.JFormattedTextField();
        field_voltaalmoco = new javax.swing.JFormattedTextField();
        button_gravar = new javax.swing.JButton();
        jButton_deletar = new javax.swing.JButton();
        button_limpar = new javax.swing.JButton();
        fiel_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROLE DE HORÁRIO");
        getContentPane().setLayout(null);

        label_entrada.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_entrada.setText("ENTRADA");
        getContentPane().add(label_entrada);
        label_entrada.setBounds(110, 40, 90, 20);

        label_entrada1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_entrada1.setText("CALCULADO");
        getContentPane().add(label_entrada1);
        label_entrada1.setBounds(210, 120, 90, 20);

        label_saidaalmoco.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_saidaalmoco.setText("S.ALMOÇO");
        getContentPane().add(label_saidaalmoco);
        label_saidaalmoco.setBounds(210, 40, 90, 20);

        label_voltaalmoco.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_voltaalmoco.setText("V.ALMOÇO");
        getContentPane().add(label_voltaalmoco);
        label_voltaalmoco.setBounds(110, 80, 90, 20);

        label_saida.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_saida.setText("SAÍDA");
        getContentPane().add(label_saida);
        label_saida.setBounds(210, 80, 90, 20);

        label_hextra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_hextra.setText("HORA EXTRA");
        getContentPane().add(label_hextra);
        label_hextra.setBounds(10, 80, 90, 20);

        jDate_ate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jDate_ate.setDateFormatString(" dd/MM/yyyy");
        jDate_ate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jDate_ate.setRequestFocusEnabled(false);
        getContentPane().add(jDate_ate);
        jDate_ate.setBounds(147, 405, 80, 20);

        label_data.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_data.setText("DATA");
        getContentPane().add(label_data);
        label_data.setBounds(10, 40, 90, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Data", "Entrada", "S.Almoço", "V.Almoço", "Saída", "H.extra", "Saídas", "Trabalhado", "Calculado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(6).setResizable(false);
        jTable1.getColumnModel().getColumn(7).setResizable(false);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 390, 220);

        jDate_de.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jDate_de.setDateFormatString(" dd/MM/yyyy");
        jDate_de.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(jDate_de);
        jDate_de.setBounds(64, 405, 80, 20);

        jDate_data.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jDate_data.setDateFormatString(" dd/MM/yyyy");
        jDate_data.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(jDate_data);
        jDate_data.setBounds(10, 60, 90, 20);

        button_ok.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        button_ok.setText("OK");
        button_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_okActionPerformed(evt);
            }
        });
        getContentPane().add(button_ok);
        button_ok.setBounds(10, 404, 50, 20);

        label_de.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_de.setText("ATE");
        label_de.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(label_de);
        label_de.setBounds(147, 392, 30, 12);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("        CONTROLE DE HORÁRIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 0, 290, 40);

        field_trabalhado_dia.setEditable(false);
        field_trabalhado_dia.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        field_trabalhado_dia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        field_trabalhado_dia.setRequestFocusEnabled(false);
        field_trabalhado_dia.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(field_trabalhado_dia);
        field_trabalhado_dia.setBounds(110, 140, 90, 20);

        field_calculado_dia.setEditable(false);
        field_calculado_dia.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        field_calculado_dia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        field_calculado_dia.setRequestFocusEnabled(false);
        field_calculado_dia.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(field_calculado_dia);
        field_calculado_dia.setBounds(210, 140, 90, 20);

        label_saidas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_saidas.setText("SAÍDAS");
        getContentPane().add(label_saidas);
        label_saidas.setBounds(10, 120, 90, 20);

        label_entrada3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_entrada3.setText("TRABALHADO");
        getContentPane().add(label_entrada3);
        label_entrada3.setBounds(110, 120, 90, 20);

        label_entrada2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_entrada2.setText("CALCULADO");
        getContentPane().add(label_entrada2);
        label_entrada2.setBounds(315, 392, 70, 12);

        field_trabalhado_mes.setEditable(false);
        field_trabalhado_mes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        field_trabalhado_mes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        field_trabalhado_mes.setRequestFocusEnabled(false);
        field_trabalhado_mes.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(field_trabalhado_mes);
        field_trabalhado_mes.setBounds(230, 405, 80, 20);

        field_calculado_mes.setEditable(false);
        field_calculado_mes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        field_calculado_mes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        field_calculado_mes.setRequestFocusEnabled(false);
        field_calculado_mes.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(field_calculado_mes);
        field_calculado_mes.setBounds(315, 405, 80, 20);

        label_entrada4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_entrada4.setText("TRABALHADO");
        getContentPane().add(label_entrada4);
        label_entrada4.setBounds(230, 392, 80, 12);

        label_de1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_de1.setText("DE");
        label_de1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(label_de1);
        label_de1.setBounds(64, 392, 20, 12);

        try {
            field_saidas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(field_saidas);
        field_saidas.setBounds(10, 140, 90, 20);

        try {
            field_horaextra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(field_horaextra);
        field_horaextra.setBounds(10, 100, 90, 20);

        try {
            field_saida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(field_saida);
        field_saida.setBounds(210, 100, 90, 20);

        try {
            field_entrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(field_entrada);
        field_entrada.setBounds(110, 60, 90, 20);

        try {
            field_saidaalmoco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(field_saidaalmoco);
        field_saidaalmoco.setBounds(210, 60, 90, 20);

        try {
            field_voltaalmoco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(field_voltaalmoco);
        field_voltaalmoco.setBounds(110, 100, 90, 20);

        button_gravar.setText("Gravar");
        button_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_gravarActionPerformed(evt);
            }
        });
        getContentPane().add(button_gravar);
        button_gravar.setBounds(310, 60, 90, 20);

        jButton_deletar.setText("Deletar");
        jButton_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_deletar);
        jButton_deletar.setBounds(310, 140, 90, 20);

        button_limpar.setText("Limpar");
        button_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_limparActionPerformed(evt);
            }
        });
        getContentPane().add(button_limpar);
        button_limpar.setBounds(310, 100, 90, 20);
        getContentPane().add(fiel_id);
        fiel_id.setBounds(330, 60, 0, 0);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-427)/2, (screenSize.height-469)/2, 427, 469);
    }// </editor-fold>//GEN-END:initComponents

    private void button_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_gravarActionPerformed
  
        RegistroDAO dao = new RegistroDAO();
        
        id = fiel_id.getText().trim();
        data = jDate_data.getDate();
        entrada = field_entrada.getText().trim();
        saidaAlmoco = field_saidaalmoco.getText().trim();
        voltaAlmoco = field_voltaalmoco.getText().trim();
        saida = field_saida.getText().trim();
        horaExtra = field_horaextra.getText().trim();
        saidas = field_saidas.getText().trim();

        erros = validate.validaFields(data, entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
        
        if ("".equals(erros)) {
            if (null != id && !"".equals(id)) {
                dao.editar(converte.strToObj(new Integer(id),data, entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas));
            } else {
                try {
                    dao.save(converte.strToObj(null,data, entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas));
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            preencher_jtable();
            button_limpar.doClick();
        } else {
            JOptionPane.showMessageDialog(null, erros);
        }

    }//GEN-LAST:event_button_gravarActionPerformed

    private void button_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_okActionPerformed
        erros = validate.validaDatas(jDate_de.getDate(), jDate_ate.getDate());
        if( "".equals(erros) ){
            preencher_jtable();
            updateParametr();
        }else{
            JOptionPane.showMessageDialog(null, erros);
        }                
    }//GEN-LAST:event_button_okActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linhasum = jTable1.getRowCount();
        int linha = jTable1.getSelectedRow();
        
        if (linhasum >= 1) {
            try {
                fiel_id.setText(jTable1.getValueAt(linha, 0).toString());
                jDate_data.setDate(sdf.parse(jTable1.getValueAt(linha, 1).toString()));
                field_entrada.setText(jTable1.getValueAt(linha, 2).toString());
                field_saidaalmoco.setText(jTable1.getValueAt(linha, 3).toString());
                field_voltaalmoco.setText(jTable1.getValueAt(linha, 4).toString());
                field_saida.setText(jTable1.getValueAt(linha, 5).toString());
                field_horaextra.setText(jTable1.getValueAt(linha, 6).toString());
                field_saidas.setText(jTable1.getValueAt(linha, 7).toString());
                field_trabalhado_dia.setText(jTable1.getValueAt(linha, 8).toString());
                field_calculado_dia.setText(jTable1.getValueAt(linha, 9).toString());                
            } catch (ParseException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            alinhaCampos();
            
        }    }//GEN-LAST:event_jTable1MouseClicked

    private void button_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_limparActionPerformed
        fiel_id.setText("");
        jDate_data.setDate(new java.util.Date());
        field_entrada.setText("");
        field_saidaalmoco.setText("");
        field_voltaalmoco.setText("");
        field_saida.setText("");
        field_horaextra.setText("");
        field_saidas.setText("");
        field_trabalhado_dia.setText("");
        field_calculado_dia.setText("");
    }//GEN-LAST:event_button_limparActionPerformed

    private void jButton_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletarActionPerformed
        try {
            String id = fiel_id.getText().trim();
            if (null != id && !"".equals(id)) {
                String excluir = "Confirma a exclusão do registro de " + sdf.format(jDate_data.getDate()) + "!";
                int opcao_escolhida = JOptionPane.showConfirmDialog(null, excluir, "exclusão", JOptionPane.YES_NO_OPTION);
                if (opcao_escolhida == JOptionPane.YES_OPTION) {
                    RegistroDAO dao = new RegistroDAO();
                    dao.delete(new Integer(fiel_id.getText().trim()));
                    preencher_jtable();
                    button_limpar.doClick();
                }                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir " + e);
        }
    }//GEN-LAST:event_jButton_deletarActionPerformed

      private void preencher_jtable() {      
          
        RegistroDAO dao = new RegistroDAO();  
          
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);

        JTableHeader titulos = jTable1.getTableHeader();

        titulos.setFont(new Font("Dialog", Font.BOLD, 10));

        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);  
          
        jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(6).setMinWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);   
        
        jTable1.getColumnModel().getColumn(7).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(7).setMinWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);   
        
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centralizado);     
        
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(15);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(centralizado);     
        
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(15);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(centralizado);     
        
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(15);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(centralizado);     
        
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(15);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(centralizado);     
        
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(15);
        jTable1.getColumnModel().getColumn(8).setCellRenderer(centralizado);     
        
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(15);
        jTable1.getColumnModel().getColumn(9).setCellRenderer(centralizado);     

        try{            
           lista = dao.getLista(converte.dataSql(jDate_de.getDate()), converte.dataSql(jDate_ate.getDate()));
           
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
                                converte.minToDateStr(registro.getEntrada()),
                                converte.minToDateStr(registro.getSaidaAlmoco()),
                                converte.minToDateStr(registro.getVoltaAlmoco()),
                                converte.minToDateStr(registro.getSaida()),
                                converte.minToDateStr(registro.getHoraExtra()),
                                converte.minToDateStr(registro.getSaidas()),
                                converte.minToDateStr(registro.getTotalTrabalhado()),
                                converte.minToDateStr(registro.getTotalCalculado()),
                    });
                }
               }else{
                modelo.setNumRows(0);
             }
            
            field_trabalhado_mes.setText(converte.minToDateStr(trabalhadoMes));
            field_calculado_mes.setText(converte.minToDateStr(calculadoMes));


        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro ao listar Jtable" + erro);
        }
    }     
      
     public void alinhaCampos() {                
        field_calculado_mes.setHorizontalAlignment(field_calculado_mes.CENTER);
        field_calculado_dia.setHorizontalAlignment(field_calculado_dia.CENTER);
        field_entrada.setHorizontalAlignment(field_entrada.CENTER);
        field_horaextra.setHorizontalAlignment(field_horaextra.CENTER);
        field_saida.setHorizontalAlignment(field_saida.CENTER);
        field_saidaalmoco.setHorizontalAlignment(field_saidaalmoco.CENTER);
        field_saidas.setHorizontalAlignment(field_saidas.CENTER);
        field_trabalhado_dia.setHorizontalAlignment(field_trabalhado_dia.CENTER);
        field_trabalhado_mes.setHorizontalAlignment(field_trabalhado_mes.CENTER);
        field_voltaalmoco.setHorizontalAlignment(field_voltaalmoco.CENTER);     
    } 
      
    public void setParameter() {
        RegistroDAO dao = new RegistroDAO();
        try {
            Map<String, String> mapa = dao.getPrm();
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
            RegistroDAO dao1 = new RegistroDAO();
            Parametrizacao param1 = new Parametrizacao();
            param1.setParametro("inicio");
            param1.setValor(dataIniFrm);
            dao1.updatePrm(param1);
            RegistroDAO dao2 = new RegistroDAO();
            Parametrizacao param2 = new Parametrizacao();
            param2.setParametro("fim");
            param2.setValor(dataFimFrm);
            dao2.updatePrm(param2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
                      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_gravar;
    private javax.swing.JButton button_limpar;
    private javax.swing.JButton button_ok;
    private javax.swing.JTextField fiel_id;
    private javax.swing.JTextField field_calculado_dia;
    private javax.swing.JTextField field_calculado_mes;
    private javax.swing.JFormattedTextField field_entrada;
    private javax.swing.JFormattedTextField field_horaextra;
    private javax.swing.JFormattedTextField field_saida;
    private javax.swing.JFormattedTextField field_saidaalmoco;
    private javax.swing.JFormattedTextField field_saidas;
    private javax.swing.JTextField field_trabalhado_dia;
    private javax.swing.JTextField field_trabalhado_mes;
    private javax.swing.JFormattedTextField field_voltaalmoco;
    private javax.swing.JButton jButton_deletar;
    private com.toedter.calendar.JDateChooser jDate_ate;
    private com.toedter.calendar.JDateChooser jDate_data;
    private com.toedter.calendar.JDateChooser jDate_de;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_data;
    private javax.swing.JLabel label_de;
    private javax.swing.JLabel label_de1;
    private javax.swing.JLabel label_entrada;
    private javax.swing.JLabel label_entrada1;
    private javax.swing.JLabel label_entrada2;
    private javax.swing.JLabel label_entrada3;
    private javax.swing.JLabel label_entrada4;
    private javax.swing.JLabel label_hextra;
    private javax.swing.JLabel label_saida;
    private javax.swing.JLabel label_saidaalmoco;
    private javax.swing.JLabel label_saidas;
    private javax.swing.JLabel label_voltaalmoco;
    // End of variables declaration//GEN-END:variables
}
