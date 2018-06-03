package interfaceWindows;


import finite_automaton.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JList;
import regular_expression.RegularExpression;
import regular_grammar.*;
import transformation.Transformation;


public class MainWindow extends javax.swing.JFrame {

    Transformation transformation;
    RG_Algorithms rgalg;
    FA_algorithms faalg;
    public Map<String,RegularExpression> mapRE = new HashMap<>();
    public Map<String,RegularGrammar> mapRG = new HashMap<>();
    public Map<String,finite_automaton.FiniteAutomaton> mapFA = new HashMap<>();
    DefaultListModel model2 = new DefaultListModel();
    DefaultListModel model3 = new DefaultListModel();
    DefaultListModel model1 = new DefaultListModel();
    public MainWindow() {
        initComponents(); 
        transformation = new Transformation(this);
        rgalg = new RG_Algorithms();
        faalg = new FA_algorithms();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBExcluirAF = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListAF = new javax.swing.JList<>();
        jBVisualizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBIntersAF = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jBDifAF = new javax.swing.JButton();
        jCBAF1 = new javax.swing.JComboBox<>();
        jCBAF2 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBDetAF = new javax.swing.JButton();
        jBMinAF = new javax.swing.JButton();
        jBRevAF = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jBEnumAF = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jBRecAF = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLReconhecer = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jBAFtoGR = new javax.swing.JButton();
        jCBAF = new javax.swing.JComboBox<>();
        jSNum = new javax.swing.JSpinner();
        jTSentAF = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jCCompleto = new javax.swing.JCheckBox();
        jCSemInal = new javax.swing.JCheckBox();
        jCSemMort = new javax.swing.JCheckBox();
        jCDeterministico = new javax.swing.JCheckBox();
        jCUniao = new javax.swing.JCheckBox();
        jCComplem = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBGRtoAF = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jBIntersGR = new javax.swing.JButton();
        jBDifGR = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jCBGR1 = new javax.swing.JComboBox<>();
        jBRevGR = new javax.swing.JButton();
        jCBGR2 = new javax.swing.JComboBox<>();
        jCBGR3 = new javax.swing.JComboBox<>();
        jBUniaoGR = new javax.swing.JButton();
        jBConcGR = new javax.swing.JButton();
        jBFechoGR = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTANovaGR = new javax.swing.JTextArea();
        jTNomeGR = new javax.swing.JTextField();
        jBCriarGR1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTAEditarGR = new javax.swing.JTextArea();
        jBEditarGR = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListGR = new javax.swing.JList<>();
        jBExcluirGR = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jBRevER = new javax.swing.JButton();
        jBDeSimone = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jBIntersER = new javax.swing.JButton();
        jBDifER = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jCBER1 = new javax.swing.JComboBox<>();
        jCBER2 = new javax.swing.JComboBox<>();
        jCBER3 = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListER = new javax.swing.JList<>();
        jBExcluirER = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTANovaER = new javax.swing.JTextArea();
        jBCriarER = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAEditER = new javax.swing.JTextArea();
        jBEditarER = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setAlignmentX(1.0F);
        jTabbedPane1.setAlignmentY(1.0F);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1, 1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Lista de Autômatos");

        jBExcluirAF.setBackground(new java.awt.Color(204, 204, 204));
        jBExcluirAF.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jBExcluirAF.setText("Excluir");
        jBExcluirAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirAFActionPerformed(evt);
            }
        });

        jListAF.setFont(new java.awt.Font("Source Sans Pro", 0, 11)); // NOI18N
        jListAF.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListAFValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListAF);

        jBVisualizar.setBackground(new java.awt.Color(204, 204, 204));
        jBVisualizar.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jBVisualizar.setText("Visualizar");
        jBVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jBVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBExcluirAF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBExcluirAF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Operações Binárias");

        jLabel5.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel5.setText("Selecione os Autômatos:");

        jBIntersAF.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBIntersAF.setText("Intersecção");
        jBIntersAF.setPreferredSize(new java.awt.Dimension(100, 25));
        jBIntersAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIntersAFActionPerformed(evt);
            }
        });

        jBDifAF.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBDifAF.setText("Diferença");
        jBDifAF.setPreferredSize(new java.awt.Dimension(100, 25));
        jBDifAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDifAFActionPerformed(evt);
            }
        });

        jCBAF1.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCBAF1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCBAF2.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCBAF2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBDifAF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBIntersAF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCBAF1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBAF2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBAF1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBAF2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBIntersAF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBDifAF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Operações Unárias ");

        jLabel4.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel4.setText("Selecione o Autômato:");

        jBDetAF.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBDetAF.setText("Determinizar");
        jBDetAF.setMaximumSize(new java.awt.Dimension(100, 25));
        jBDetAF.setMinimumSize(new java.awt.Dimension(100, 25));
        jBDetAF.setPreferredSize(new java.awt.Dimension(100, 25));
        jBDetAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDetAFActionPerformed(evt);
            }
        });

        jBMinAF.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBMinAF.setText("Minimizar");
        jBMinAF.setPreferredSize(new java.awt.Dimension(100, 25));
        jBMinAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMinAFActionPerformed(evt);
            }
        });

        jBRevAF.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBRevAF.setText("Reverso");
        jBRevAF.setPreferredSize(new java.awt.Dimension(100, 25));
        jBRevAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRevAFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tamanho:");

        jBEnumAF.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBEnumAF.setText("Enumere");
        jBEnumAF.setPreferredSize(new java.awt.Dimension(100, 25));
        jBEnumAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnumAFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel7.setText("Sentença:");

        jBRecAF.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBRecAF.setText("Reconhecer");
        jBRecAF.setPreferredSize(new java.awt.Dimension(100, 25));
        jBRecAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRecAFActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel8.setText("Resultado:");

        jLReconhecer.setBackground(new java.awt.Color(255, 255, 255));
        jLReconhecer.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N

        jBAFtoGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBAFtoGR.setText("Conversão de AF para GR");
        jBAFtoGR.setPreferredSize(new java.awt.Dimension(100, 25));
        jBAFtoGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAFtoGRActionPerformed(evt);
            }
        });

        jCBAF.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCBAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAFActionPerformed(evt);
            }
        });

        jSNum.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jSNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jTSentAF.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLReconhecer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTSentAF, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDetAF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMinAF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRevAF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAFtoGR, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRecAF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSNum, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBEnumAF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBAF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBDetAF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMinAF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRevAF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAFtoGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEnumAF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTSentAF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBRecAF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLReconhecer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel9.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel9.setText("Selecione os AF Intermedários");

        jCCompleto.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCCompleto.setText("Completo");

        jCSemInal.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCSemInal.setText("Sem estados inalcançaveis");
        jCSemInal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSemInalActionPerformed(evt);
            }
        });

        jCSemMort.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCSemMort.setText("Sem estados mortos");
        jCSemMort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSemMortActionPerformed(evt);
            }
        });

        jCDeterministico.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCDeterministico.setText("Determinístico");
        jCDeterministico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCDeterministicoActionPerformed(evt);
            }
        });

        jCUniao.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCUniao.setText("União");

        jCComplem.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCComplem.setText("Complemento");

        jLabel10.setFont(new java.awt.Font("Source Sans Pro Light", 0, 12)); // NOI18N
        jLabel10.setText("(caso sejam gerados, serão salvos)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCComplem)
                    .addComponent(jCUniao)
                    .addComponent(jCDeterministico)
                    .addComponent(jCSemMort)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jCSemInal)
                    .addComponent(jCCompleto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jCCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCSemInal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCSemMort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCDeterministico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCUniao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCComplem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Autômatos Finitos", jPanel1);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Operações para AF");

        jLabel13.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel13.setText("Selecione a Gramática:");

        jBGRtoAF.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBGRtoAF.setText("Conversão de GR para AF");
        jBGRtoAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGRtoAFActionPerformed(evt);
            }
        });

        jBIntersGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBIntersGR.setText("Intersecção");
        jBIntersGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIntersGRActionPerformed(evt);
            }
        });

        jBDifGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBDifGR.setText("Diferença");
        jBDifGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDifGRActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel19.setText("Selecione as Gramáticas:");

        jCBGR1.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N

        jBRevGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBRevGR.setText("Reverso");
        jBRevGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRevGRActionPerformed(evt);
            }
        });

        jCBGR2.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N

        jCBGR3.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N

        jBUniaoGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBUniaoGR.setText("União");
        jBUniaoGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUniaoGRActionPerformed(evt);
            }
        });

        jBConcGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBConcGR.setText("Concatenação");
        jBConcGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConcGRActionPerformed(evt);
            }
        });

        jBFechoGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBFechoGR.setText("Fechamento");
        jBFechoGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFechoGRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBFechoGR, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                            .addComponent(jCBGR1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap()))
                    .addComponent(jBRevGR, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBGRtoAF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                    .addComponent(jLabel19)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBDifGR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBIntersGR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBGR2, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                        .addComponent(jCBGR3, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBConcGR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBUniaoGR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBGR1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBRevGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBGRtoAF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFechoGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jCBGR2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBGR3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBIntersGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBDifGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBUniaoGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBConcGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel17.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Crie uma nova GR");

        jLabel25.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel25.setText("Nome:");

        jTANovaGR.setColumns(20);
        jTANovaGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jTANovaGR.setRows(5);
        jTANovaGR.setText("S->aS|a");
        jScrollPane1.setViewportView(jTANovaGR);

        jTNomeGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N

        jBCriarGR1.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBCriarGR1.setText("Criar Gramática");
        jBCriarGR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCriarGR1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Altere uma GR");

        jTAEditarGR.setColumns(20);
        jTAEditarGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jTAEditarGR.setRows(5);
        jScrollPane5.setViewportView(jTAEditarGR);

        jBEditarGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBEditarGR.setText("Alterar Gramática");
        jBEditarGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarGRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(jTNomeGR, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3))
                    .addComponent(jSeparator8)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jBCriarGR1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jBEditarGR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTNomeGR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCriarGR1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEditarGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel23.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Lista de Gramáticas");

        jListGR.setFont(new java.awt.Font("Source Sans Pro", 0, 11)); // NOI18N
        jListGR.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListGRValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(jListGR);

        jBExcluirGR.setBackground(new java.awt.Color(204, 204, 204));
        jBExcluirGR.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jBExcluirGR.setText("Excluir");
        jBExcluirGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirGRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jBExcluirGR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExcluirGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gramáticas Regulares", jPanel2);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Operações para AF");

        jLabel16.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel16.setText("Selecione a Expressão:");

        jBRevER.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBRevER.setText("Reverso");
        jBRevER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRevERActionPerformed(evt);
            }
        });

        jBDeSimone.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBDeSimone.setText("DeSimone");
        jBDeSimone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeSimoneActionPerformed(evt);
            }
        });

        jBIntersER.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBIntersER.setText("Intersecção");
        jBIntersER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIntersERActionPerformed(evt);
            }
        });

        jBDifER.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBDifER.setText("Diferença");
        jBDifER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDifERActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel20.setText("Selecione as Expressões:");

        jCBER1.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N

        jCBER2.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCBER2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBER2ActionPerformed(evt);
            }
        });

        jCBER3.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCBER3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBER3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBER3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBDifER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBIntersER, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBDeSimone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBRevER, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCBER2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCBER1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBER1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRevER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBDeSimone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jCBER2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBER3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBIntersER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBDifER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel22.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Lista de Expressões");

        jListER.setFont(new java.awt.Font("Source Sans Pro", 0, 11)); // NOI18N
        jListER.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListERValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(jListER);

        jBExcluirER.setBackground(new java.awt.Color(204, 204, 204));
        jBExcluirER.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jBExcluirER.setText("Excluir");
        jBExcluirER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBExcluirER, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExcluirER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel27.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel27.setText("Crie uma nova ER");

        jTANovaER.setColumns(20);
        jTANovaER.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jTANovaER.setRows(5);
        jScrollPane3.setViewportView(jTANovaER);

        jBCriarER.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBCriarER.setText("Criar Expressão");
        jBCriarER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCriarERActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel28.setText("Altere uma ER ");

        jTAEditER.setColumns(20);
        jTAEditER.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jTAEditER.setRows(5);
        jScrollPane4.setViewportView(jTAEditER);

        jBEditarER.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBEditarER.setText("Alterar Expressão");
        jBEditarER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBEditarER, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBCriarER, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCriarER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEditarER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(293, 293, 293)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Expressões Regulares", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCSemInalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSemInalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSemInalActionPerformed

    private void jCSemMortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSemMortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSemMortActionPerformed

    private void jBRecAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRecAFActionPerformed
        try {
            String sentence = jTSentAF.getText();
            finite_automaton.FiniteAutomaton f1 =  mapFA.get(jCBAF.getItemAt(jCBAF.getSelectedIndex()));
            if(faalg.recognize(f1, sentence)){
                jLReconhecer.setText("Aceitou");
            } else {
                jLReconhecer.setText("Rejeitou");
            }
        } catch (Exception e) {
            System.out.println("erro");
        }
        
    }//GEN-LAST:event_jBRecAFActionPerformed

    
    private void jBGRtoAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGRtoAFActionPerformed
        RegularGrammar g1 = mapRG.get(jCBGR1.getItemAt(jCBGR1.getSelectedIndex()));
        transformation.RGtoAF(g1);
    }//GEN-LAST:event_jBGRtoAFActionPerformed

    private void jBExcluirAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirAFActionPerformed
        try {
            transformation.RemoveFiniteAutomaton(mapFA.get(jListAF.getSelectedValue()));
            mapFA.remove(jListAF.getSelectedValue()); 
        } catch (Exception e) {
            System.out.println("erro");
        }
        
    }//GEN-LAST:event_jBExcluirAFActionPerformed

    private void jBIntersAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIntersAFActionPerformed
        try {
            finite_automaton.FiniteAutomaton f1 = mapFA.get(jCBAF1.getItemAt(jCBAF1.getSelectedIndex()));
            finite_automaton.FiniteAutomaton f2 = mapFA.get(jCBAF2.getItemAt(jCBAF2.getSelectedIndex()));
            finite_automaton.FiniteAutomaton inters = faalg.intersection(f1, f2);
            if(jCComplem.isSelected()){
                transformation.addNewFiniteAutomaton(f1.getComplement());
                transformation.addNewFiniteAutomaton(f2.getComplement());
            }
            if(jCUniao.isSelected()){
                transformation.addNewFiniteAutomaton(inters.getUnion());
            }
            transformation.addNewFiniteAutomaton(inters);
        } catch (Exception e) {
            System.out.println("erro");
        }
    }//GEN-LAST:event_jBIntersAFActionPerformed
    
    private void jBCriarERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCriarERActionPerformed
        String[] e = jTANovaER.getText().split("\n");
        String exp = "";
        for(String s : e){
            exp = exp.concat(s);
        }
        exp = exp.replace(" ", "");
        if(!exp.equals("")){
            try {
                RegularExpression regex = new RegularExpression(exp);
                new Transformation(new MainWindow()).DeSimone(regex);
                transformation.addNewRegularExpression(regex);
                jTANovaER.setText("");
                atualiza();
            } catch (Exception exc) {
                System.out.println("erro");
            }
        }
        
        
    }//GEN-LAST:event_jBCriarERActionPerformed

    private void jBExcluirERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirERActionPerformed
        if(jCBER1.getItemCount() != 0 && !model1.isEmpty()){
            transformation.RemoveRegularExpression(mapRE.get(jListER.getSelectedValue()));
            mapRE.remove(jListER.getSelectedValue());
        } 
        
    }//GEN-LAST:event_jBExcluirERActionPerformed

    private void jBRevERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRevERActionPerformed
        try {
            RegularExpression e = mapRE.get(jCBER1.getItemAt(jCBER1.getSelectedIndex()));
            transformation.Reverse(e);
        } catch (Exception e) {
            System.out.println("erro");
        }
        
    }//GEN-LAST:event_jBRevERActionPerformed

    private void jBDeSimoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeSimoneActionPerformed
        try {
            RegularExpression e = mapRE.get(jCBER1.getItemAt(jCBER1.getSelectedIndex()));
            transformation.DeSimone(e);
        } catch (Exception e) {
            System.out.println("erro");
        }
        
    }//GEN-LAST:event_jBDeSimoneActionPerformed

    private void jBIntersERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIntersERActionPerformed
        try {
            RegularExpression e1 = mapRE.get(jCBER2.getItemAt(jCBER2.getSelectedIndex()));
            RegularExpression e2 = mapRE.get(jCBER3.getItemAt(jCBER3.getSelectedIndex()));
            transformation.Intersection(e1, e2);
        } catch (Exception e) {
            System.out.println("erro");
        }
        
    }//GEN-LAST:event_jBIntersERActionPerformed

    private void jBDifERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDifERActionPerformed
        try {
            RegularExpression e1 = mapRE.get(jCBER2.getItemAt(jCBER2.getSelectedIndex()));
            RegularExpression e2 = mapRE.get(jCBER3.getItemAt(jCBER3.getSelectedIndex()));
            transformation.Difference(e1, e2);
        } catch (Exception e) {
            System.out.println("erro");
        }
        
    }//GEN-LAST:event_jBDifERActionPerformed


    private void jCBER2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBER2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBER2ActionPerformed

    private void jCBER3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBER3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBER3ActionPerformed

    private void jBExcluirGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirGRActionPerformed
        try {
            transformation.RemoveRegularGrammar(mapRG.get(jListGR.getSelectedValue()));
            mapRG.remove(jListGR.getSelectedValue());
        } catch (Exception e) {
            System.out.println("erro aqui");
        }

    }//GEN-LAST:event_jBExcluirGRActionPerformed

    private void jBCriarGR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCriarGR1ActionPerformed
        RegularGrammar ga = new RegularGrammar();
        String name = jTNomeGR.getText();
        if("".equals(name)) return;
        ga.setName(name);
        if("".equals(jTANovaGR.getText())) return;
        String[] e = jTANovaGR.getText().split("\n");
        ga.setInitialSymbol(e[0].charAt(0)+"");
        for(String line: e){
            if(line.length() <= 3) return;
            char Nonterminal = line.charAt(0);
            if(line.charAt(1) == '-' && line.charAt(2) == '>'){
                int i = 3;
                while(i < line.length()){
                    char term = line.charAt(i);
                    if(i+1 == line.length() || line.charAt(i+1) == '|'){
                        ga.setProductions(""+Nonterminal, term+"");
                        i=i+2;
                    } else if (i+2 == line.length() || line.charAt(i+2) == '|'){
                        ga.setProductions(""+Nonterminal, term+""+line.charAt(i+1));
                        i=i+3;
                    } else{
                        System.out.println("erro");    
                    }
                }
            } else {
                return;
            }
        }
        Pattern nont = Pattern.compile("[a-z]");
        Pattern ter = Pattern.compile("[A-Z]");
        for(String s: ga.getProductions().keySet()){
            ArrayList<String> prod = ga.getProductions().get(s);
            if(!ter.matcher(s).matches())
                return;
            for(String produc : prod) {
                switch (produc.length()) {
                    case 2:
                        {
                            Matcher nonterm = nont.matcher(produc.charAt(0)+"");
                            Matcher term = ter.matcher(produc.charAt(1)+"");
                            if(!nonterm.matches() || (!term.matches() && produc.charAt(0) != '&')){
                                return;
                            }  
                            if(!ga.getProductions().keySet().contains(produc.charAt(1)+"")){
                                return;
                            } 
                            break;
                        }
                    case 1:
                        {
                            Matcher nonterm = nont.matcher(produc.charAt(0)+"");
                            if(!nonterm.matches() && produc.charAt(0) != '&'){
                                return;
                            }      
                            break;
                        }
                    default:
                        return;
                }
            }
        }
        jTNomeGR.setText("");
        jTANovaGR.setText("");
        transformation.addNewRegularGrammar(ga);
        //mapRG.put(ga.getName(), ga);
        
        
    }//GEN-LAST:event_jBCriarGR1ActionPerformed

    private void jBRevGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRevGRActionPerformed
        RegularGrammar g1 = mapRG.get(jCBGR1.getItemAt(jCBGR1.getSelectedIndex()));
        transformation.Reverse(g1);
    }//GEN-LAST:event_jBRevGRActionPerformed

    private void jBIntersGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIntersGRActionPerformed
        RegularGrammar g1 = mapRG.get(jCBGR2.getItemAt(jCBGR2.getSelectedIndex()));
        RegularGrammar g2 = mapRG.get(jCBGR3.getItemAt(jCBGR3.getSelectedIndex()));
        transformation.Intersection(g1, g2);
    }//GEN-LAST:event_jBIntersGRActionPerformed

    private void jBDifGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDifGRActionPerformed
        RegularGrammar g1 = mapRG.get(jCBGR2.getItemAt(jCBGR2.getSelectedIndex()));
        RegularGrammar g2 = mapRG.get(jCBGR3.getItemAt(jCBGR3.getSelectedIndex()));
        transformation.Difference(g1, g2);
    }//GEN-LAST:event_jBDifGRActionPerformed

    private void jBUniaoGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUniaoGRActionPerformed
        RegularGrammar g1 = mapRG.get(jCBGR2.getItemAt(jCBGR2.getSelectedIndex()));
        RegularGrammar g2 = mapRG.get(jCBGR3.getItemAt(jCBGR3.getSelectedIndex()));
        transformation.union(g1, g2);
    }//GEN-LAST:event_jBUniaoGRActionPerformed

    private void jBConcGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConcGRActionPerformed
        RegularGrammar g1 = mapRG.get(jCBGR2.getItemAt(jCBGR2.getSelectedIndex()));
        RegularGrammar g2 = mapRG.get(jCBGR3.getItemAt(jCBGR3.getSelectedIndex()));
        transformation.concatenation(g1, g2);
    }//GEN-LAST:event_jBConcGRActionPerformed

    private void jBFechoGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFechoGRActionPerformed
        RegularGrammar g1 = mapRG.get(jCBGR1.getItemAt(jCBGR1.getSelectedIndex()));
        transformation.closure(g1);
    }//GEN-LAST:event_jBFechoGRActionPerformed

    private void jBDetAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDetAFActionPerformed
        try {
            finite_automaton.FiniteAutomaton f1 = mapFA.get(jCBAF.getItemAt(jCBAF.getSelectedIndex()));
            finite_automaton.FiniteAutomaton determ = faalg.determinize(f1);
            transformation.addNewFiniteAutomaton(determ);
        } catch (Exception e) {
            System.out.println("erro");
        }
        
    }//GEN-LAST:event_jBDetAFActionPerformed

    private void jCBAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAFActionPerformed

    private void jBMinAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMinAFActionPerformed
        try {
            finite_automaton.FiniteAutomaton f1 = mapFA.get(jCBAF.getItemAt(jCBAF.getSelectedIndex()));
            faalg.minimize(f1);
            if(jCDeterministico.isSelected() && f1.getDeterministic() != null){
                transformation.addNewFiniteAutomaton(f1.getDeterministic());
            }
            if(jCSemInal.isSelected() && f1.getWithoutUnReac() != null){
                transformation.addNewFiniteAutomaton(f1.getWithoutUnReac());
            }
            if(jCSemMort.isSelected() && f1.getWithoutDead()!= null){
                transformation.addNewFiniteAutomaton(f1.getWithoutDead());
            }
            transformation.addNewFiniteAutomaton(f1.getMin());
        } catch (Exception e) {
            System.out.println("erro");
        }
        
    }//GEN-LAST:event_jBMinAFActionPerformed

    private void jBRevAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRevAFActionPerformed
        try {
            finite_automaton.FiniteAutomaton f1 = mapFA.get(jCBAF.getItemAt(jCBAF.getSelectedIndex()));
            transformation.addNewFiniteAutomaton(faalg.reverse(f1));
        } catch (Exception e) {
            System.out.println("erro");
        }
        
        
    }//GEN-LAST:event_jBRevAFActionPerformed

    private void jBAFtoGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAFtoGRActionPerformed
        try {
            finite_automaton.FiniteAutomaton f1 = mapFA.get(jCBAF.getItemAt(jCBAF.getSelectedIndex()));
            transformation.AFtoRG(f1);
        } catch (Exception e) {
            System.out.println("erro");
        }
        
    }//GEN-LAST:event_jBAFtoGRActionPerformed

    private void jBEditarERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarERActionPerformed
        String Selected = jListER.getSelectedValue();
        String[] e = jTAEditER.getText().split("\n");
        String exp = "";
        for(String s : e){
            exp = exp.concat(s);
        }
        exp = exp.replace(" ", "");
        if(!exp.equals("")){
            try {
                RegularExpression regex = new RegularExpression(exp);
                new Transformation(this).DeSimone(regex);
                
                transformation.addNewRegularExpression(regex);
                transformation.RemoveRegularExpression(mapRE.get(Selected));
                mapRE.remove(Selected);
                
            } catch (Exception exc) {
                System.out.println("erro");
            }
        }
    }//GEN-LAST:event_jBEditarERActionPerformed

    private void jListERValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListERValueChanged
        jTAEditER.setText(jListER.getSelectedValue());
    }//GEN-LAST:event_jListERValueChanged

    private void jBEditarGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarGRActionPerformed
        RegularGrammar ga = new RegularGrammar();
        String name = jListGR.getSelectedValue();
        if("".equals(name)) return;
        ga.setName(name);
        if("".equals(jTAEditarGR.getText())) return;
        String[] e = jTAEditarGR.getText().split("\n");
        ga.setInitialSymbol(e[0].charAt(0)+"");
        for(String line: e){
            if(line.length() <= 3) return;
            char Nonterminal = line.charAt(0);
            if(line.charAt(1) == '-' && line.charAt(2) == '>'){
                int i = 3;
                while(i < line.length()){
                    char term = line.charAt(i);
                    if(i+1 == line.length() || line.charAt(i+1) == '|'){
                        ga.setProductions(""+Nonterminal, term+"");
                        i=i+2;
                    } else if (i+2 == line.length() || line.charAt(i+2) == '|'){
                        ga.setProductions(""+Nonterminal, term+""+line.charAt(i+1));
                        i=i+3;
                    } else{
                        System.out.println("erro");    
                    }
                }
            } else {
                return;
            }
        }
        Pattern nont = Pattern.compile("[a-z]");
        Pattern ter = Pattern.compile("[A-Z]");
        for(String s: ga.getProductions().keySet()){
            ArrayList<String> prod = ga.getProductions().get(s);
            if(!ter.matcher(s).matches())
                return;
            for(String produc : prod) {
                switch (produc.length()) {
                    case 2:
                        {
                            Matcher nonterm = nont.matcher(produc.charAt(0)+"");
                            Matcher term = ter.matcher(produc.charAt(1)+"");
                            if(!nonterm.matches() || (!term.matches() && produc.charAt(0) != '&')){
                                return;
                            }  
                            if(!ga.getProductions().keySet().contains(produc.charAt(1)+"")){
                                return;
                            } 
                            break;
                        }
                    case 1:
                        {
                            Matcher nonterm = nont.matcher(produc.charAt(0)+"");
                            if(!nonterm.matches() && produc.charAt(0) != '&'){
                                return;
                            }      
                            break;
                        }
                    default:
                        return;
                }
            }
        }
        transformation.RemoveRegularGrammar(mapRG.get(name));
        mapRG.remove(name);
        transformation.addNewRegularGrammar(ga);
        //mapRG.put(ga.getName(), ga);
        
        jTAEditarGR.setText("");
    }//GEN-LAST:event_jBEditarGRActionPerformed

    private void jListGRValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListGRValueChanged
        if(jListGR.getSelectedValue() != null && mapRG.containsKey(jListGR.getSelectedValue())) {
            jTAEditarGR.setText(mapRG.get(jListGR.getSelectedValue()).toString());
        } else {
            jTAEditarGR.setText("");
        }
    }//GEN-LAST:event_jListGRValueChanged

    private void jListAFValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListAFValueChanged
        
    }//GEN-LAST:event_jListAFValueChanged

    private void jBVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizarActionPerformed
        try {
            interfaceWindows.FiniteAutomaton fa = new interfaceWindows.FiniteAutomaton(mapFA.get(jListAF.getSelectedValue()));
            fa.setVisible(true);
        } catch (Exception e) {
            System.out.println("erro");
        }

    }//GEN-LAST:event_jBVisualizarActionPerformed

    private void jCDeterministicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCDeterministicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCDeterministicoActionPerformed

    private void jBEnumAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnumAFActionPerformed
        try {
            int tam = (int) jSNum.getValue();
            finite_automaton.FiniteAutomaton f1 =  mapFA.get(jCBAF.getItemAt(jCBAF.getSelectedIndex()));
            Set<String> words = faalg.enumeration(f1, tam);
            ListWords list = new ListWords(words);
            list.setVisible(true);
        } catch (Exception e) {
            System.out.println("erro");
        }
    }//GEN-LAST:event_jBEnumAFActionPerformed

    private void jBDifAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDifAFActionPerformed
        try {
            finite_automaton.FiniteAutomaton f1 = mapFA.get(jCBAF1.getItemAt(jCBAF1.getSelectedIndex()));
            finite_automaton.FiniteAutomaton f2 = mapFA.get(jCBAF2.getItemAt(jCBAF2.getSelectedIndex()));
            if(!f1.alphabet.equals(f2.alphabet)){
                for(Character c: f1.alphabet){
                    if(!f2.alphabet.contains(c)){
                        f2.alphabet.add(c);
                    }
                }
                for(Character c: f2.alphabet){
                    if(!f1.alphabet.contains(c)){
                        f1.alphabet.add(c);
                    }
                }
            }
            finite_automaton.FiniteAutomaton f2n = faalg.complement(f2);
            f2n.setName("("+f2.getName()+")'");
            if(jCComplem.isSelected()){
                transformation.addNewFiniteAutomaton(f2n);
            }
            finite_automaton.FiniteAutomaton inters = faalg.intersection(f1, f2n);
            if(jCComplem.isSelected()){
                transformation.addNewFiniteAutomaton(f1.getComplement());
                transformation.addNewFiniteAutomaton(f2n.getComplement());
            }
            if(jCUniao.isSelected()){
                transformation.addNewFiniteAutomaton(inters.getUnion());
            }
            transformation.addNewFiniteAutomaton(inters);

        } catch (Exception e) {
            System.out.println("erro");
        }
    }//GEN-LAST:event_jBDifAFActionPerformed
   
    public void atualiza() {
        model3 = new DefaultListModel();
        jCBAF.removeAllItems();
        jCBAF1.removeAllItems();
        jCBAF2.removeAllItems();
        for(finite_automaton.FiniteAutomaton fa: transformation.getListFA()){
            model3.addElement(fa.getName());
            jCBAF.addItem(fa.getName());
            jCBAF1.addItem(fa.getName());
            jCBAF2.addItem(fa.getName());
        }
        jListAF.setModel(model3);
        
        /* Seta as informações nas listas e nas combos da GR*/
        model2 = new DefaultListModel();
        jCBGR1.removeAllItems();
        jCBGR2.removeAllItems();
        jCBGR3.removeAllItems();
        for(regular_grammar.RegularGrammar rg: transformation.getListRG()){
            model2.addElement(rg.getName());
            jCBGR1.addItem(rg.getName());
            jCBGR2.addItem(rg.getName());
            jCBGR3.addItem(rg.getName());
        }
        jListGR.setModel(model2);
        
        /* Seta as informações nas Listas e nas Combobox da ER*/
        model1 = new DefaultListModel();
        jCBER1.removeAllItems();
        jCBER2.removeAllItems();
        jCBER3.removeAllItems();
        for(regular_expression.RegularExpression re : transformation.getListRE()){
            model1.addElement(re.getExpression());
            jCBER1.addItem(re.getExpression());
            jCBER2.addItem(re.getExpression());
            jCBER3.addItem(re.getExpression());
        }
        jListER.setModel(model1);
        
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAFtoGR;
    private javax.swing.JButton jBConcGR;
    private javax.swing.JButton jBCriarER;
    private javax.swing.JButton jBCriarGR1;
    private javax.swing.JButton jBDeSimone;
    private javax.swing.JButton jBDetAF;
    private javax.swing.JButton jBDifAF;
    private javax.swing.JButton jBDifER;
    private javax.swing.JButton jBDifGR;
    private javax.swing.JButton jBEditarER;
    private javax.swing.JButton jBEditarGR;
    private javax.swing.JButton jBEnumAF;
    private javax.swing.JButton jBExcluirAF;
    private javax.swing.JButton jBExcluirER;
    private javax.swing.JButton jBExcluirGR;
    private javax.swing.JButton jBFechoGR;
    private javax.swing.JButton jBGRtoAF;
    private javax.swing.JButton jBIntersAF;
    private javax.swing.JButton jBIntersER;
    private javax.swing.JButton jBIntersGR;
    private javax.swing.JButton jBMinAF;
    private javax.swing.JButton jBRecAF;
    private javax.swing.JButton jBRevAF;
    private javax.swing.JButton jBRevER;
    private javax.swing.JButton jBRevGR;
    private javax.swing.JButton jBUniaoGR;
    private javax.swing.JButton jBVisualizar;
    private javax.swing.JComboBox<String> jCBAF;
    private javax.swing.JComboBox<String> jCBAF1;
    private javax.swing.JComboBox<String> jCBAF2;
    private javax.swing.JComboBox<String> jCBER1;
    private javax.swing.JComboBox<String> jCBER2;
    private javax.swing.JComboBox<String> jCBER3;
    private javax.swing.JComboBox<String> jCBGR1;
    private javax.swing.JComboBox<String> jCBGR2;
    private javax.swing.JComboBox<String> jCBGR3;
    private javax.swing.JCheckBox jCComplem;
    private javax.swing.JCheckBox jCCompleto;
    private javax.swing.JCheckBox jCDeterministico;
    private javax.swing.JCheckBox jCSemInal;
    private javax.swing.JCheckBox jCSemMort;
    private javax.swing.JCheckBox jCUniao;
    private javax.swing.JLabel jLReconhecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListAF;
    private javax.swing.JList<String> jListER;
    private javax.swing.JList<String> jListGR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner jSNum;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTAEditER;
    private javax.swing.JTextArea jTAEditarGR;
    private javax.swing.JTextArea jTANovaER;
    private javax.swing.JTextArea jTANovaGR;
    private javax.swing.JTextField jTNomeGR;
    private javax.swing.JTextField jTSentAF;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
