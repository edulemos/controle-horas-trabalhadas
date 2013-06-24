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
    private String horaCompensada = "";
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        label_calculado = new javax.swing.JLabel();
        label_saidaalmoco = new javax.swing.JLabel();
        label_voltaalmoco = new javax.swing.JLabel();
        label_saida = new javax.swing.JLabel();
        label_horaextra = new javax.swing.JLabel();
        jDate_ate = new com.toedter.calendar.JDateChooser();
        label_data = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDate_de = new com.toedter.calendar.JDateChooser();
        jDate_data = new com.toedter.calendar.JDateChooser();
        jDate_data.getDateEditor().addPropertyChangeListener(
            new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent e) {
                    if ("date".equals(e.getPropertyName())) {

                        field_id.setText("");
                        field_trabalhado_dia.setText("");
                        field_calculado_dia.setText("");

                        jCombo_horaEntrada.setSelectedItem("00");
                        jCombo_minutoEntrada.setSelectedItem("00");

                        jCombo_horaSaidaAlmoco.setSelectedItem("00");
                        jCombo_minutoSaidaAlmoco.setSelectedItem("00");

                        jCombo_horaVoltaAlmoco.setSelectedItem("00");
                        jCombo_minutoVoltaAlmoco.setSelectedItem("00");

                        jCombo_horaSaida.setSelectedItem("00");
                        jCombo_MinutoSaida.setSelectedItem("00");

                        jCombo_horaExtra.setSelectedItem("00");
                        jCombo_minutoExtra.setSelectedItem("00");

                        jCombo_horaCompensada.setSelectedItem("00");
                        jCombo_minutoCompensada.setSelectedItem("00");

                        jCombo_horaSaidas.setSelectedItem("00");
                        jCombo_minutoSaidas.setSelectedItem("00");

                    }
                }
            });
            this.add(jDate_data);
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
            field_id = new javax.swing.JTextField();
            jLabel2 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            label_compensada = new javax.swing.JLabel();
            label_entrada = new javax.swing.JLabel();
            jCombo_horaEntrada = new javax.swing.JComboBox();
            jCombo_minutoEntrada = new javax.swing.JComboBox();
            jl_ponto_ent2 = new javax.swing.JLabel();
            jCombo_horaSaidaAlmoco = new javax.swing.JComboBox();
            jCombo_minutoSaidaAlmoco = new javax.swing.JComboBox();
            jl_ponto_ent3 = new javax.swing.JLabel();
            jCombo_horaVoltaAlmoco = new javax.swing.JComboBox();
            jCombo_minutoVoltaAlmoco = new javax.swing.JComboBox();
            jl_ponto_ent4 = new javax.swing.JLabel();
            jCombo_horaSaida = new javax.swing.JComboBox();
            jCombo_MinutoSaida = new javax.swing.JComboBox();
            jl_ponto_ent5 = new javax.swing.JLabel();
            jCombo_horaExtra = new javax.swing.JComboBox();
            jCombo_minutoExtra = new javax.swing.JComboBox();
            jl_ponto_ent6 = new javax.swing.JLabel();
            jCombo_horaCompensada = new javax.swing.JComboBox();
            jCombo_minutoCompensada = new javax.swing.JComboBox();
            jl_ponto_ent7 = new javax.swing.JLabel();
            jCombo_horaSaidas = new javax.swing.JComboBox();
            jCombo_minutoSaidas = new javax.swing.JComboBox();
            jl_ponto_ent8 = new javax.swing.JLabel();
            jButton_deletar = new javax.swing.JButton();
            button_limpar = new javax.swing.JButton();
            button_gravar = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("CONTROLE DE HORÁRIO");
            setResizable(false);
            getContentPane().setLayout(null);

            label_calculado.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_calculado.setText("CALCULADO");
            getContentPane().add(label_calculado);
            label_calculado.setBounds(407, 85, 85, 15);

            label_saidaalmoco.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_saidaalmoco.setText("SAÍDA ALMOÇO");
            getContentPane().add(label_saidaalmoco);
            label_saidaalmoco.setBounds(205, 45, 85, 15);

            label_voltaalmoco.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_voltaalmoco.setText("VOLTA ALMOÇO");
            getContentPane().add(label_voltaalmoco);
            label_voltaalmoco.setBounds(306, 45, 85, 15);

            label_saida.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_saida.setText("SAÍDA");
            getContentPane().add(label_saida);
            label_saida.setBounds(407, 45, 85, 15);

            label_horaextra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_horaextra.setText("H. EXTRA APROV");
            label_horaextra.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(label_horaextra);
            label_horaextra.setBounds(10, 85, 85, 15);

            jDate_ate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jDate_ate.setDateFormatString(" dd/MM/yyyy");
            jDate_ate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jDate_ate.setRequestFocusEnabled(false);
            getContentPane().add(jDate_ate);
            jDate_ate.setBounds(200, 560, 90, 20);

            label_data.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_data.setText("DATA");
            getContentPane().add(label_data);
            label_data.setBounds(10, 45, 85, 15);

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                    "id", "Data", "Entrada", "S.Alm", "V.Alm", "Saída", "H.Extra", "H.Comp", "Saídas", "Trab", "Calc"
                }
            ));
            jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTable1MouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTable1);

            getContentPane().add(jScrollPane1);
            jScrollPane1.setBounds(10, 160, 490, 390);

            jDate_de.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jDate_de.setDateFormatString(" dd/MM/yyyy");
            jDate_de.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            getContentPane().add(jDate_de);
            jDate_de.setBounds(100, 560, 90, 20);

            jDate_data.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            jDate_data.setDateFormatString(" dd/MM/yyyy");
            jDate_data.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            getContentPane().add(jDate_data);
            jDate_data.setBounds(7, 60, 90, 20);

            button_ok.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            button_ok.setText("OK");
            button_ok.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button_okActionPerformed(evt);
                }
            });
            getContentPane().add(button_ok);
            button_ok.setBounds(10, 558, 80, 20);

            label_de.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_de.setText("ATE");
            label_de.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(label_de);
            label_de.setBounds(200, 550, 30, 12);

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(153, 153, 153));
            jLabel1.setText("        CONTROLE DE HORÁRIO");
            jLabel1.setRequestFocusEnabled(false);
            getContentPane().add(jLabel1);
            jLabel1.setBounds(100, 0, 290, 40);

            field_trabalhado_dia.setEditable(false);
            field_trabalhado_dia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            field_trabalhado_dia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            field_trabalhado_dia.setRequestFocusEnabled(false);
            field_trabalhado_dia.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(field_trabalhado_dia);
            field_trabalhado_dia.setBounds(306, 100, 90, 20);

            field_calculado_dia.setEditable(false);
            field_calculado_dia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            field_calculado_dia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            field_calculado_dia.setRequestFocusEnabled(false);
            field_calculado_dia.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(field_calculado_dia);
            field_calculado_dia.setBounds(407, 100, 90, 20);

            label_saidas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_saidas.setText("SAÍDAS");
            getContentPane().add(label_saidas);
            label_saidas.setBounds(206, 85, 85, 15);

            label_entrada3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada3.setText("TRABALHADO");
            getContentPane().add(label_entrada3);
            label_entrada3.setBounds(306, 85, 85, 15);

            label_entrada2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada2.setText("CALCULADO");
            getContentPane().add(label_entrada2);
            label_entrada2.setBounds(400, 550, 70, 12);

            field_trabalhado_mes.setEditable(false);
            field_trabalhado_mes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            field_trabalhado_mes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            field_trabalhado_mes.setRequestFocusEnabled(false);
            field_trabalhado_mes.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(field_trabalhado_mes);
            field_trabalhado_mes.setBounds(300, 560, 90, 20);

            field_calculado_mes.setEditable(false);
            field_calculado_mes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            field_calculado_mes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            field_calculado_mes.setRequestFocusEnabled(false);
            field_calculado_mes.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(field_calculado_mes);
            field_calculado_mes.setBounds(400, 560, 90, 20);

            label_entrada4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada4.setText("TRABALHADO");
            getContentPane().add(label_entrada4);
            label_entrada4.setBounds(300, 550, 80, 10);

            label_de1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_de1.setText("DE");
            label_de1.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(label_de1);
            label_de1.setBounds(100, 550, 20, 12);
            getContentPane().add(field_id);
            field_id.setBounds(200, 20, 1, 1);

            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 51, 255));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_icon.gif"))); // NOI18N
            jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel2MouseClicked(evt);
                }
            });
            getContentPane().add(jLabel2);
            jLabel2.setBounds(483, 1, 30, 20);

            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/relatorio.gif"))); // NOI18N
            jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel6MouseClicked(evt);
                }
            });
            getContentPane().add(jLabel6);
            jLabel6.setBounds(1, 2, 30, 20);

            label_compensada.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_compensada.setText("H. COMPENSADA");
            label_compensada.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(label_compensada);
            label_compensada.setBounds(106, 85, 85, 15);

            label_entrada.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            label_entrada.setText("ENTRADA");
            getContentPane().add(label_entrada);
            label_entrada.setBounds(106, 45, 85, 15);

            jCombo_horaEntrada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " ", " " }));
            jCombo_horaEntrada.setBorder(null);
            jCombo_horaEntrada.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_horaEntrada);
            jCombo_horaEntrada.setBounds(106, 60, 40, 20);

            jCombo_minutoEntrada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
            jCombo_minutoEntrada.setBorder(null);
            jCombo_minutoEntrada.setRequestFocusEnabled(false);
            jCombo_minutoEntrada.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_minutoEntrada);
            jCombo_minutoEntrada.setBounds(154, 60, 40, 20);

            jl_ponto_ent2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jl_ponto_ent2.setText(":");
            getContentPane().add(jl_ponto_ent2);
            jl_ponto_ent2.setBounds(148, 60, 10, 20);

            jCombo_horaSaidaAlmoco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " ", " " }));
            jCombo_horaSaidaAlmoco.setBorder(null);
            jCombo_horaSaidaAlmoco.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_horaSaidaAlmoco);
            jCombo_horaSaidaAlmoco.setBounds(206, 60, 40, 20);

            jCombo_minutoSaidaAlmoco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
            jCombo_minutoSaidaAlmoco.setBorder(null);
            jCombo_minutoSaidaAlmoco.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_minutoSaidaAlmoco);
            jCombo_minutoSaidaAlmoco.setBounds(254, 60, 40, 20);

            jl_ponto_ent3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jl_ponto_ent3.setText(":");
            getContentPane().add(jl_ponto_ent3);
            jl_ponto_ent3.setBounds(248, 60, 10, 20);

            jCombo_horaVoltaAlmoco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " ", " " }));
            jCombo_horaVoltaAlmoco.setBorder(null);
            jCombo_horaVoltaAlmoco.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_horaVoltaAlmoco);
            jCombo_horaVoltaAlmoco.setBounds(306, 60, 40, 20);

            jCombo_minutoVoltaAlmoco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
            jCombo_minutoVoltaAlmoco.setBorder(null);
            jCombo_minutoVoltaAlmoco.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_minutoVoltaAlmoco);
            jCombo_minutoVoltaAlmoco.setBounds(355, 60, 40, 20);

            jl_ponto_ent4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jl_ponto_ent4.setText(":");
            jl_ponto_ent4.setRequestFocusEnabled(false);
            getContentPane().add(jl_ponto_ent4);
            jl_ponto_ent4.setBounds(348, 60, 10, 20);

            jCombo_horaSaida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " ", " " }));
            jCombo_horaSaida.setBorder(null);
            jCombo_horaSaida.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_horaSaida);
            jCombo_horaSaida.setBounds(407, 60, 40, 20);

            jCombo_MinutoSaida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
            jCombo_MinutoSaida.setBorder(null);
            jCombo_MinutoSaida.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_MinutoSaida);
            jCombo_MinutoSaida.setBounds(455, 60, 40, 20);

            jl_ponto_ent5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jl_ponto_ent5.setText(":");
            getContentPane().add(jl_ponto_ent5);
            jl_ponto_ent5.setBounds(449, 60, 10, 20);

            jCombo_horaExtra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " ", " " }));
            jCombo_horaExtra.setBorder(null);
            jCombo_horaExtra.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_horaExtra);
            jCombo_horaExtra.setBounds(7, 100, 40, 20);

            jCombo_minutoExtra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
            jCombo_minutoExtra.setBorder(null);
            jCombo_minutoExtra.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_minutoExtra);
            jCombo_minutoExtra.setBounds(55, 100, 40, 20);

            jl_ponto_ent6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jl_ponto_ent6.setText(":");
            getContentPane().add(jl_ponto_ent6);
            jl_ponto_ent6.setBounds(49, 100, 20, 20);

            jCombo_horaCompensada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " ", " " }));
            jCombo_horaCompensada.setBorder(null);
            jCombo_horaCompensada.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_horaCompensada);
            jCombo_horaCompensada.setBounds(106, 100, 40, 20);

            jCombo_minutoCompensada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
            jCombo_minutoCompensada.setBorder(null);
            getContentPane().add(jCombo_minutoCompensada);
            jCombo_minutoCompensada.setBounds(154, 100, 40, 20);

            jl_ponto_ent7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jl_ponto_ent7.setText(":");
            jl_ponto_ent7.setRequestFocusEnabled(false);
            getContentPane().add(jl_ponto_ent7);
            jl_ponto_ent7.setBounds(148, 100, 10, 20);

            jCombo_horaSaidas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " ", " " }));
            jCombo_horaSaidas.setBorder(null);
            jCombo_horaSaidas.setVerifyInputWhenFocusTarget(false);
            getContentPane().add(jCombo_horaSaidas);
            jCombo_horaSaidas.setBounds(206, 100, 40, 20);

            jCombo_minutoSaidas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
            jCombo_minutoSaidas.setBorder(null);
            getContentPane().add(jCombo_minutoSaidas);
            jCombo_minutoSaidas.setBounds(254, 100, 40, 20);

            jl_ponto_ent8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jl_ponto_ent8.setText(":");
            getContentPane().add(jl_ponto_ent8);
            jl_ponto_ent8.setBounds(248, 100, 10, 20);

            jButton_deletar.setText("Deletar");
            jButton_deletar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton_deletarActionPerformed(evt);
                }
            });
            getContentPane().add(jButton_deletar);
            jButton_deletar.setBounds(343, 130, 150, 20);

            button_limpar.setText("Limpar");
            button_limpar.setSelected(true);
            button_limpar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button_limparActionPerformed(evt);
                }
            });
            getContentPane().add(button_limpar);
            button_limpar.setBounds(179, 130, 150, 20);

            button_gravar.setText("Gravar");
            button_gravar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button_gravarActionPerformed(evt);
                }
            });
            getContentPane().add(button_gravar);
            button_gravar.setBounds(13, 130, 150, 20);

            setSize(new java.awt.Dimension(515, 614));
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void button_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_gravarActionPerformed
        
        id = field_id.getText().trim();
        data = jDate_data.getDate();
        entrada = getHoraCombo(jCombo_horaEntrada, jCombo_minutoEntrada);
        saidaAlmoco = getHoraCombo(jCombo_horaSaidaAlmoco, jCombo_minutoSaidaAlmoco);
        voltaAlmoco = getHoraCombo(jCombo_horaVoltaAlmoco, jCombo_minutoVoltaAlmoco);
        saida = getHoraCombo(jCombo_horaSaida, jCombo_MinutoSaida);
        horaExtra = getHoraCombo(jCombo_horaExtra, jCombo_minutoExtra);
        horaCompensada = getHoraCombo(jCombo_horaCompensada, jCombo_minutoCompensada);
        saidas = getHoraCombo(jCombo_horaSaidas, jCombo_minutoSaidas);
       
        erros = validate.validaFields(data, entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, horaCompensada, saidas);        
        
        String msg = "Data: "+sdf.format(data) + "\n" + 
                     "Entrada: " + entrada + "\n" +
                     "Saída Almoço: " + saidaAlmoco + "\n" +
                     "Volta Almoco: " + voltaAlmoco + "\n" +
                     "Saida: " + saida + "\n" +
                     "Hora Extra: " + horaExtra + "\n" + 
                     "Hora Compensada: " + horaCompensada + "\n" + 
                     "Saídas: " + saidas;
        
        if ("".equals(erros)) {
            
            // marco o tipo de hora extra
            if(!"00:00".equals(horaCompensada)){
                horaExtra = horaCompensada+"C";
            }
            
            if (null != id && !"".equals(id)) {
                int opcao_escolhida = JOptionPane.showConfirmDialog(null,  msg, "Confirma Dados Editar Registro", JOptionPane.YES_NO_OPTION);
                if (opcao_escolhida == JOptionPane.YES_OPTION) {
                    dao().editar(converte.strToObj(new Integer(id), data, entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas, data));
                }
            } else {
                try {
                    if (!dao().verificaDuplicado(converte.dataSql(data))) {
                    int opcao_escolhida = JOptionPane.showConfirmDialog(null,  msg, "Confirma Dados Novo Registro", JOptionPane.YES_NO_OPTION);
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
                
                jDate_data.setDate(sdf.parse(jTable1.getValueAt(linha, 1).toString()));
                field_id.setText(jTable1.getValueAt(linha, 0).toString());
                
                jCombo_horaEntrada.setSelectedItem(jTable1.getValueAt(linha, 2).toString().split(":")[0]);
                jCombo_minutoEntrada.setSelectedItem(jTable1.getValueAt(linha, 2).toString().split(":")[1]);
                
                jCombo_horaSaidaAlmoco.setSelectedItem(jTable1.getValueAt(linha, 3).toString().split(":")[0]);
                jCombo_minutoSaidaAlmoco.setSelectedItem(jTable1.getValueAt(linha, 3).toString().split(":")[1]);
                
                jCombo_horaVoltaAlmoco.setSelectedItem(jTable1.getValueAt(linha, 4).toString().split(":")[0]);
                jCombo_minutoVoltaAlmoco.setSelectedItem(jTable1.getValueAt(linha, 4).toString().split(":")[1]);

                jCombo_horaSaida.setSelectedItem(jTable1.getValueAt(linha, 5).toString().split(":")[0]);
                jCombo_MinutoSaida.setSelectedItem(jTable1.getValueAt(linha, 5).toString().split(":")[1]);
                
                jCombo_horaExtra.setSelectedItem(jTable1.getValueAt(linha, 6).toString().split(":")[0]);
                jCombo_minutoExtra.setSelectedItem(jTable1.getValueAt(linha, 6).toString().split(":")[1]);
                
                jCombo_horaCompensada.setSelectedItem(jTable1.getValueAt(linha, 7).toString().split(":")[0]);
                jCombo_minutoCompensada.setSelectedItem(jTable1.getValueAt(linha, 7).toString().split(":")[1]);
                
                jCombo_horaSaidas.setSelectedItem(jTable1.getValueAt(linha, 8).toString().split(":")[0]);
                jCombo_minutoSaidas.setSelectedItem(jTable1.getValueAt(linha, 8).toString().split(":")[1]);
                
                field_trabalhado_dia.setText(jTable1.getValueAt(linha, 9).toString());                
                field_calculado_dia.setText(jTable1.getValueAt(linha, 10).toString());
                
            } catch (ParseException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            alinhaCampos();
            
        }    }//GEN-LAST:event_jTable1MouseClicked

    private void button_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_limparActionPerformed
        
        field_id.setText("");
        jDate_data.setDate(new java.util.Date());
        
        jCombo_horaEntrada.setSelectedItem("00");
        jCombo_minutoEntrada.setSelectedItem("00");
       
        jCombo_horaSaidaAlmoco.setSelectedItem("00");
        jCombo_minutoSaidaAlmoco.setSelectedItem("00");
        
        jCombo_horaVoltaAlmoco.setSelectedItem("00");
        jCombo_minutoVoltaAlmoco.setSelectedItem("00");
        
        jCombo_horaSaida.setSelectedItem("00");
        jCombo_MinutoSaida.setSelectedItem("00");
        
        jCombo_horaExtra.setSelectedItem("00");
        jCombo_minutoExtra.setSelectedItem("00");
        
        jCombo_horaCompensada.setSelectedItem("00");
        jCombo_minutoCompensada.setSelectedItem("00");
        
        jCombo_horaSaidas.setSelectedItem("00");
        jCombo_minutoSaidas.setSelectedItem("00");
                        
        field_trabalhado_dia.setText("");
        field_calculado_dia.setText("");
        
    }//GEN-LAST:event_button_limparActionPerformed

    private void jButton_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletarActionPerformed
        try {
            String id = field_id.getText().trim();
            if (null != id && !"".equals(id)) {
                String excluir = "Confirma a exclusão do registro de " + sdf.format(jDate_data.getDate()) + "!";
                int opcao_escolhida = JOptionPane.showConfirmDialog(null, excluir, "exclusão", JOptionPane.YES_NO_OPTION);
                if (opcao_escolhida == JOptionPane.YES_OPTION) {
                    dao().delete(new Integer(field_id.getText().trim()));
                    preencher_jtable();
                    button_limpar.doClick();
                }                
            }else{
                   JOptionPane.showMessageDialog(null, "Nenhum Registro Selecionado!");

            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir " + e);
        }
    }//GEN-LAST:event_jButton_deletarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
            o.openURL("https://code.google.com/p/controle-horas-trabalhadas/downloads/list");       
        }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new GeraRelatorio().relatorio(jDate_de.getDate(), jDate_ate.getDate());
    }//GEN-LAST:event_jLabel6MouseClicked

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
        
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(10).setCellRenderer(centralizado);     

        try{            
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
                                converte.minToHoraStr(registro.getHoraExtra() > 1500 ? 0 : registro.getHoraExtra()),
                                converte.minToHoraStr(registro.getHoraExtra() > 1500 ? registro.getHoraExtra() - 1500 : 0),
                                converte.minToHoraStr(registro.getSaidas()),
                                converte.minToHoraStr(registro.getTotalTrabalhado()),
                                converte.minToHoraStr(registro.getTotalCalculado()),
                    });
                }
               }else{
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
        field_calculado_dia.setHorizontalAlignment(field_calculado_dia.CENTER);
               field_trabalhado_dia.setHorizontalAlignment(field_trabalhado_dia.CENTER);
        field_trabalhado_mes.setHorizontalAlignment(field_trabalhado_mes.CENTER);
       
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
    private javax.swing.JButton button_gravar;
    private javax.swing.JButton button_limpar;
    private javax.swing.JButton button_ok;
    private javax.swing.JTextField field_calculado_dia;
    private javax.swing.JTextField field_calculado_mes;
    private javax.swing.JTextField field_id;
    private javax.swing.JTextField field_trabalhado_dia;
    private javax.swing.JTextField field_trabalhado_mes;
    private javax.swing.JButton jButton_deletar;
    private javax.swing.JComboBox jCombo_MinutoSaida;
    private javax.swing.JComboBox jCombo_horaCompensada;
    private javax.swing.JComboBox jCombo_horaEntrada;
    private javax.swing.JComboBox jCombo_horaExtra;
    private javax.swing.JComboBox jCombo_horaSaida;
    private javax.swing.JComboBox jCombo_horaSaidaAlmoco;
    private javax.swing.JComboBox jCombo_horaSaidas;
    private javax.swing.JComboBox jCombo_horaVoltaAlmoco;
    private javax.swing.JComboBox jCombo_minutoCompensada;
    private javax.swing.JComboBox jCombo_minutoEntrada;
    private javax.swing.JComboBox jCombo_minutoExtra;
    private javax.swing.JComboBox jCombo_minutoSaidaAlmoco;
    private javax.swing.JComboBox jCombo_minutoSaidas;
    private javax.swing.JComboBox jCombo_minutoVoltaAlmoco;
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
    private javax.swing.JLabel jl_ponto_ent2;
    private javax.swing.JLabel jl_ponto_ent3;
    private javax.swing.JLabel jl_ponto_ent4;
    private javax.swing.JLabel jl_ponto_ent5;
    private javax.swing.JLabel jl_ponto_ent6;
    private javax.swing.JLabel jl_ponto_ent7;
    private javax.swing.JLabel jl_ponto_ent8;
    private javax.swing.JLabel label_calculado;
    private javax.swing.JLabel label_compensada;
    private javax.swing.JLabel label_data;
    private javax.swing.JLabel label_de;
    private javax.swing.JLabel label_de1;
    private javax.swing.JLabel label_entrada;
    private javax.swing.JLabel label_entrada2;
    private javax.swing.JLabel label_entrada3;
    private javax.swing.JLabel label_entrada4;
    private javax.swing.JLabel label_horaextra;
    private javax.swing.JLabel label_saida;
    private javax.swing.JLabel label_saidaalmoco;
    private javax.swing.JLabel label_saidas;
    private javax.swing.JLabel label_voltaalmoco;
    // End of variables declaration//GEN-END:variables
 
    public String getHoraCombo(JComboBox comboHora, JComboBox comboMin){
        return (String)comboHora.getSelectedItem() + ":" +(String)comboMin.getSelectedItem();
    }
}