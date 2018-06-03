package interfaceWindows;
import finite_automaton.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class FiniteAutomaton extends javax.swing.JFrame {

    finite_automaton.FiniteAutomaton f = null;
    public FiniteAutomaton(finite_automaton.FiniteAutomaton f) {
        initComponents();
        this.f = f;
        jLNome.setText(f.getName());
        criarTabela();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAF = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTableAF.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jTableAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableAF);

        jLabel6.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Nome:");

        jLNome.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLNome, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAF;
    // End of variables declaration//GEN-END:variables

    private void criarTabela() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Transições");
        ArrayList<Character> alpha = f.getAlpha();
        ArrayList<State> states = f.getStates();
        for(Character a: f.getAlpha()){
            model.addColumn(a+"");
        }
        State init = f.getInitial();
        int iterator = 0;
        String Sinit = "->";
        if(init.getIsFinal())
            Sinit += "*";
        model.addRow(new String[]{Sinit+""+init.getName()});
        for(Character a: f.getAlpha()){
            int column = model.findColumn(a+"");
            if(init.transition.keySet().contains(a)){
                ArrayList<State> alc = init.getListStates(a);
                if(!alc.isEmpty()){
                    String Sstates = "";
                    for(State s: alc){
                        Sstates += s.getName()+",";
                    }
                    Sstates = Sstates.substring(0, Sstates.length()-1);
                    model.setValueAt(Sstates, 0, column);
                }
            } else {
                        model.setValueAt("-", 0, column);
            }
        }
        iterator++;
        for(State s: states){
            if(!s.equals(init)){
                String q = "";
                if(s.getIsFinal())
                    q += "*";
                model.addRow(new String[]{q+""+s.getName()});
                for(Character a: f.getAlpha()){
                    int column = model.findColumn(a+"");
                    if(s.transition.keySet().contains(a)){
                        ArrayList<State> alc = s.getListStates(a);
                        if(!alc.isEmpty()){
                            String Sstates = "";
                            for(State s1: alc){
                                Sstates += s1.getName()+",";
                            }
                            Sstates = Sstates.substring(0, Sstates.length()-1);
                            model.setValueAt(Sstates, iterator, column);
                        }
                    } else {
                        model.setValueAt("-", iterator, column);
                    }
                }
                iterator++;
            }
        }
        jTableAF.setModel(model);
    }
    
    
}
