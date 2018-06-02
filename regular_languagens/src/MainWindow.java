
import finite_automaton.FA_algorithms;
import javax.swing.DefaultListModel;
import regular_expression.RegularExpression;
import regular_grammar.RG_Algorithms;
import regular_grammar.RegularGrammar;
import transformation.Transformation;


public class MainWindow extends javax.swing.JFrame {

    Transformation transformation;
    RG_Algorithms rgalg;
    FA_algorithms faalg;
    
    public MainWindow() {
        initComponents(); 
        transformation = new Transformation();
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
        jButton3 = new javax.swing.JButton();
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
        jCComEquiv = new javax.swing.JCheckBox();
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
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jBFechoGR = new javax.swing.JButton();
        jBUniaoGR = new javax.swing.JButton();
        jBConcGR = new javax.swing.JButton();
        jCBGR4 = new javax.swing.JComboBox<>();
        jCBGR5 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTANovaGR = new javax.swing.JTextArea();
        jTNomeGR = new javax.swing.JTextField();
        jBCriarGR1 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jBEditGR = new javax.swing.JButton();
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
        jBEditER = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListER = new javax.swing.JList<>();
        jBExcluirER = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTANovaER = new javax.swing.JTextArea();
        jTNomeER = new javax.swing.JTextField();
        jBCriarER = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(jListAF);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jButton3.setText("Visualizar");

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
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jCBAF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        jCComEquiv.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCComEquiv.setText("Com estados equivalentes");

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
                    .addComponent(jCComEquiv)
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
                .addComponent(jCComEquiv)
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
                .addContainerGap(16, Short.MAX_VALUE))
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
        jCBGR1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBRevGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBRevGR.setText("Reverso");
        jBRevGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRevGRActionPerformed(evt);
            }
        });

        jCBGR2.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCBGR2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCBGR3.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCBGR3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jBGRtoAF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, Short.MAX_VALUE))
                    .addComponent(jLabel19)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBDifGR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBIntersGR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBGR2, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                        .addComponent(jCBGR3, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE))))
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
                .addGap(18, 18, 18)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel17.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Operações para GR");

        jLabel18.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel18.setText("Selecione as Gramáticas:");

        jBFechoGR.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBFechoGR.setText("Fechamento");
        jBFechoGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFechoGRActionPerformed(evt);
            }
        });

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

        jCBGR4.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCBGR4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCBGR5.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jCBGR5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel24.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel24.setText("Crie uma nova GR");

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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBConcGR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBFechoGR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel18))
                            .addComponent(jCBGR4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBGR5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBUniaoGR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel24)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jTNomeGR, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jBCriarGR1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTNomeGR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCriarGR1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBGR4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBGR5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jBUniaoGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBConcGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFechoGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel23.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Lista de Gramáticas");

        jBEditGR.setBackground(new java.awt.Color(204, 204, 204));
        jBEditGR.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jBEditGR.setText("Editar");
        jBEditGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditGRActionPerformed(evt);
            }
        });

        jListGR.setFont(new java.awt.Font("Source Sans Pro", 0, 11)); // NOI18N
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
                    .addComponent(jBEditGR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEditGR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBDifER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBIntersER, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBDeSimone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBRevER, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCBER1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBER2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBER3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBER3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jBIntersER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBDifER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel22.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Lista de Expressões");

        jBEditER.setBackground(new java.awt.Color(204, 204, 204));
        jBEditER.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jBEditER.setText("Editar");
        jBEditER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditERActionPerformed(evt);
            }
        });

        jListER.setFont(new java.awt.Font("Source Sans Pro", 0, 11)); // NOI18N
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
                    .addComponent(jBEditER, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEditER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel27.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel27.setText("Crie uma nova ER");

        jLabel28.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel28.setText("Nome:");

        jTANovaER.setColumns(20);
        jTANovaER.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jTANovaER.setRows(5);
        jScrollPane3.setViewportView(jTANovaER);

        jTNomeER.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N

        jBCriarER.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jBCriarER.setText("Criar Expressão");
        jBCriarER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCriarERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTNomeER, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBCriarER, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTNomeER, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jBCriarER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Expressões Regulares", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jBRecAFActionPerformed
    
    DefaultListModel model1 = new DefaultListModel();
    private void jBEditERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditERActionPerformed
        //remove dos combobox
        jCBER1.removeItemAt(jCBER1.getSelectedIndex());
        jCBER2.removeItemAt(jCBER2.getSelectedIndex());
        jCBER3.removeItemAt(jCBER3.getSelectedIndex());
        
        //altera
        String aux = jTANovaER.getText();
        jTANovaER.setName(aux);
        
        //add nos combobox
        jCBER1.addItem(jTANovaER.getText());
        jCBER2.addItem(jTANovaER.getText());
        jCBER3.addItem(jTANovaER.getText());
        
        model1.addElement(jTANovaER.getText());
        jListER.setModel(model1);  
    }//GEN-LAST:event_jBEditERActionPerformed

    DefaultListModel model2 = new DefaultListModel();
    private void jBEditGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditGRActionPerformed
        //remove dos combobox
        jCBGR1.removeItemAt(jCBGR1.getSelectedIndex());
        jCBGR2.removeItemAt(jCBGR2.getSelectedIndex());
        jCBGR3.removeItemAt(jCBGR3.getSelectedIndex());
        jCBGR4.removeItemAt(jCBGR4.getSelectedIndex());
        jCBGR5.removeItemAt(jCBGR5.getSelectedIndex());
        
        //altera
        String aux = jTANovaGR.getText();
        jTANovaGR.setName(aux);
        
        //add nos combobox
        jCBGR1.addItem(jTANovaGR.getText());
        jCBGR2.addItem(jTANovaGR.getText());
        jCBGR3.addItem(jTANovaGR.getText());
        jCBGR4.addItem(jTANovaGR.getText());
        jCBGR5.addItem(jTANovaGR.getText());
        
        model2.addElement(jTANovaGR.getText());
        jListGR.setModel(model2); 
    }//GEN-LAST:event_jBEditGRActionPerformed

    private void jBGRtoAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGRtoAFActionPerformed
        RegularGrammar g1 = rgalg.stringINgrammar(jCBGR1.getItemAt(jCBGR1.getSelectedIndex()));
        transformation.RGtoAF(g1);
    }//GEN-LAST:event_jBGRtoAFActionPerformed

    private void jBExcluirAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBExcluirAFActionPerformed

    private void jBIntersAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIntersAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIntersAFActionPerformed
    
    private void jBCriarERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCriarERActionPerformed
        jCBER1.addItem(jTANovaER.getText());
        jCBER2.addItem(jTANovaER.getText());
        jCBER3.addItem(jTANovaER.getText());
        
        model1.addElement(jTANovaER.getText());
        jListER.setModel(model1);
    }//GEN-LAST:event_jBCriarERActionPerformed

    private void jBExcluirERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirERActionPerformed
        if(jCBER1.getItemCount() != 0 && !model1.isEmpty()){
            jCBER1.removeItemAt(jCBER1.getSelectedIndex());
            jCBER2.removeItemAt(jCBER2.getSelectedIndex());
            jCBER3.removeItemAt(jCBER3.getSelectedIndex());

            model1.removeElement(jTANovaER.getSelectedText());
            jListER.setModel(model1);
        }
        
    }//GEN-LAST:event_jBExcluirERActionPerformed

    private void jBRevERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRevERActionPerformed
        RegularExpression e = new RegularExpression("", jCBER1.getItemAt(jCBER1.getSelectedIndex()));
        transformation.Reverse(e);
    }//GEN-LAST:event_jBRevERActionPerformed

    private void jBDeSimoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeSimoneActionPerformed
        RegularExpression e = new RegularExpression("", jCBER1.getItemAt(jCBER1.getSelectedIndex()));
        transformation.DeSimone(e);
    }//GEN-LAST:event_jBDeSimoneActionPerformed

    private void jBIntersERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIntersERActionPerformed
        RegularExpression e1 = new RegularExpression("", jCBER2.getItemAt(jCBER2.getSelectedIndex()));
        RegularExpression e2 = new RegularExpression("", jCBER3.getItemAt(jCBER3.getSelectedIndex()));
        transformation.Intersection(e1, e2);
    }//GEN-LAST:event_jBIntersERActionPerformed

    private void jBDifERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDifERActionPerformed
        RegularExpression e1 = new RegularExpression("", jCBER2.getItemAt(jCBER2.getSelectedIndex()));
        RegularExpression e2 = new RegularExpression("", jCBER3.getItemAt(jCBER3.getSelectedIndex()));
        transformation.Difference(e1, e2);
    }//GEN-LAST:event_jBDifERActionPerformed

    private void jBExcluirGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirGRActionPerformed
        if(jCBGR1.getItemCount() != 0 && !model2.isEmpty()){
            jCBGR1.removeItemAt(jCBGR1.getSelectedIndex());
            jCBGR2.removeItemAt(jCBGR2.getSelectedIndex());
            jCBGR3.removeItemAt(jCBGR3.getSelectedIndex());
            jCBGR4.removeItemAt(jCBGR2.getSelectedIndex());
            jCBGR5.removeItemAt(jCBGR3.getSelectedIndex());

            model2.removeElement(jTANovaGR.getSelectedText());
            jListGR.setModel(model2);
        }
    }//GEN-LAST:event_jBExcluirGRActionPerformed

    private void jBCriarGR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCriarGR1ActionPerformed
        jCBGR1.addItem(jTANovaGR.getText());
        jCBGR2.addItem(jTANovaGR.getText());
        jCBGR3.addItem(jTANovaGR.getText());
        jCBGR4.addItem(jTANovaGR.getText());
        jCBGR5.addItem(jTANovaGR.getText());
        
        model2.addElement(jTANovaGR.getText());
        jListGR.setModel(model2);
    }//GEN-LAST:event_jBCriarGR1ActionPerformed

    private void jBRevGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRevGRActionPerformed
        RegularGrammar g1 = rgalg.stringINgrammar(jCBGR1.getItemAt(jCBGR1.getSelectedIndex()));
        transformation.Reverse(g1);
    }//GEN-LAST:event_jBRevGRActionPerformed

    private void jBIntersGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIntersGRActionPerformed
        RegularGrammar g1 = rgalg.stringINgrammar(jCBGR2.getItemAt(jCBGR2.getSelectedIndex()));
        RegularGrammar g2 = rgalg.stringINgrammar(jCBGR3.getItemAt(jCBGR3.getSelectedIndex()));
        transformation.Intersection(g1, g2);
    }//GEN-LAST:event_jBIntersGRActionPerformed

    private void jBDifGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDifGRActionPerformed
        RegularGrammar g1 = rgalg.stringINgrammar(jCBGR2.getItemAt(jCBGR2.getSelectedIndex()));
        RegularGrammar g2 = rgalg.stringINgrammar(jCBGR3.getItemAt(jCBGR3.getSelectedIndex()));
        transformation.Difference(g1, g2);
    }//GEN-LAST:event_jBDifGRActionPerformed

    private void jBUniaoGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUniaoGRActionPerformed
        RegularGrammar g1 = rgalg.stringINgrammar(jCBGR4.getItemAt(jCBGR4.getSelectedIndex()));
        RegularGrammar g2 = rgalg.stringINgrammar(jCBGR5.getItemAt(jCBGR5.getSelectedIndex()));
        rgalg.union(g1, g2);
    }//GEN-LAST:event_jBUniaoGRActionPerformed

    private void jBConcGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConcGRActionPerformed
        RegularGrammar g1 = rgalg.stringINgrammar(jCBGR4.getItemAt(jCBGR4.getSelectedIndex()));
        RegularGrammar g2 = rgalg.stringINgrammar(jCBGR5.getItemAt(jCBGR5.getSelectedIndex()));
        rgalg.concatenation(g1, g2);
    }//GEN-LAST:event_jBConcGRActionPerformed

    private void jBFechoGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFechoGRActionPerformed
        RegularGrammar g1 = rgalg.stringINgrammar(jCBGR4.getItemAt(jCBGR4.getSelectedIndex()));
        rgalg.closure(g1);
    }//GEN-LAST:event_jBFechoGRActionPerformed

    private void jBDetAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDetAFActionPerformed
        //FiniteAutomaton f1 = new FiniteAutomaton(jCBFA.getItemAt(jCBFA.getSelectedIndex()));
        //FiniteAutomaton f1 = new FiniteAutomaton();
        //faalg.determinize(f1);
    }//GEN-LAST:event_jBDetAFActionPerformed

    private void jCBAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAFActionPerformed

    private void jBMinAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMinAFActionPerformed
        //FiniteAutomaton f1 = new FiniteAutomaton(jCBFA.getItemAt(jCBFA.getSelectedIndex()));
        //FiniteAutomaton f1 = new FiniteAutomaton();
        //faalg.minimize(f1);
    }//GEN-LAST:event_jBMinAFActionPerformed

    private void jBRevAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRevAFActionPerformed
        //FiniteAutomaton f1 = new FiniteAutomaton(jCBFA.getItemAt(jCBFA.getSelectedIndex()));
        //FiniteAutomaton f1 = new FiniteAutomaton();
        //faalg.reverse(f1);
    }//GEN-LAST:event_jBRevAFActionPerformed

    private void jBAFtoGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAFtoGRActionPerformed
        //FiniteAutomaton f1 = new FiniteAutomaton(jCBFA.getItemAt(jCBFA.getSelectedIndex()));
        //FiniteAutomaton f1 = new FiniteAutomaton();
        //transformation.AFtoRG(f1);
    }//GEN-LAST:event_jBAFtoGRActionPerformed

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
    private javax.swing.JButton jBEditER;
    private javax.swing.JButton jBEditGR;
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
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCBAF;
    private javax.swing.JComboBox<String> jCBAF1;
    private javax.swing.JComboBox<String> jCBAF2;
    private javax.swing.JComboBox<String> jCBER1;
    private javax.swing.JComboBox<String> jCBER2;
    private javax.swing.JComboBox<String> jCBER3;
    private javax.swing.JComboBox<String> jCBGR1;
    private javax.swing.JComboBox<String> jCBGR2;
    private javax.swing.JComboBox<String> jCBGR3;
    private javax.swing.JComboBox<String> jCBGR4;
    private javax.swing.JComboBox<String> jCBGR5;
    private javax.swing.JCheckBox jCComEquiv;
    private javax.swing.JCheckBox jCComplem;
    private javax.swing.JCheckBox jCCompleto;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTANovaER;
    private javax.swing.JTextArea jTANovaGR;
    private javax.swing.JTextField jTNomeER;
    private javax.swing.JTextField jTNomeGR;
    private javax.swing.JTextField jTSentAF;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
