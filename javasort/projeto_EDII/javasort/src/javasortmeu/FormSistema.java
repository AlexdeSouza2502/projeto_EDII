package javasortmeu;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {
    ArrayList<Dados> lista = new ArrayList<>();
    Comparator<Dados> compareTotal = 
            (Dados a1, Dados a2) ->
                    a1.getTotal()- a2.getTotal();
    Comparator<Dados> compareHp = 
            (Dados a1, Dados a2) ->
                    a1.getHp()- a2.getHp();
    Comparator<Dados> compareNumber = 
            (Dados a1, Dados a2) ->
                    a1.getNumber()- a2.getNumber();
    Comparator<Dados> compareTypeOne = 
            (Dados a1, Dados a2) ->
                    a1.getAttack()- a2.getAttack();
    Comparator<Dados> compareTypeTwo = 
            (Dados a1, Dados a2) ->
                    a1.getAttack()- a2.getAttack();
    
   
                    
    /*
    Comparator<Dados> comparePrioridade = 
            (Dados a1, Dados a2) ->
                    a1.getPrioridade()- a2.getPrioridade();*/
    
    public FormSistema() {
        initComponents();
        carregaArquivo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        opSeq = new javax.swing.JRadioButton();
        opBin = new javax.swing.JRadioButton();
        btnBusca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblProx.setBackground(new java.awt.Color(0, 0, 255));
        lblProx.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        lblProx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pokebola_1.png"))); // NOI18N
        lblProx.setText(" Ordenação de pokemon no pokedex ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gifs-da-pokedex-de-pokemon-8.gif"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jLabel2.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pokebola_1.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/treinador-de-pokemon_1.png"))); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number #", "Name", "Type One", "Type two", "Total", "HP", "Attack", "Defense", "SP"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Number", "Name", "Type 1", "Type 2", "Total", "HP", "Attack", "Defense", "Sp. Atk", "Sp" }));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/d5189tf-1f1a1def-f57f-45ec-8f41-bda4b745a44c.gif"))); // NOI18N

        txtBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados para busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N

        buttonGroup1.add(opSeq);
        opSeq.setText("Sequencial");
        opSeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSeqActionPerformed(evt);
            }
        });

        buttonGroup1.add(opBin);
        opBin.setText("Binária");

        btnBusca.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasortmeu/task.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(opSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(opBin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBusca)
                            .addComponent(btnOrdNome, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(cbOrdena, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(5401, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opSeq)
                            .addComponent(opBin))
                        .addGap(26, 26, 26)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(754, 754, 754))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(930, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo(){
     String csvFile = "dados_pokemon.csv";
        String line = "";
        String[] leitura = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Dados tempo = new Dados();
                leitura = line.split(",");
                tempo.setNumber(Integer.parseInt(leitura[0]));
                tempo.setName(leitura[1]);
                tempo.setTypeOne(leitura[2]);
                tempo.setTypeTwo(leitura[3]);
                tempo.setTotal(Integer.parseInt(leitura[4]));
                tempo.setHp(Integer.parseInt(leitura[5]));
                tempo.setAttack(Integer.parseInt(leitura[6]));
                tempo.setDefense(Integer.parseInt(leitura[7]));
                tempo.setSp(leitura[8]);
                /*System.out.println(leitura[0]+"\n");
                System.out.println(leitura[1]+"\n");
                System.out.println(leitura[2]+"\n");
                System.out.println(leitura[3]+"\n");
                System.out.println(leitura[4]+"\n");
                System.out.println(leitura[5]+"\n");
                System.out.println(leitura[6]+"\n");
                System.out.println(leitura[7]+"\n");
                
                System.out.println(leitura[8]+"\n");*/
                lista.add(tempo); 
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //https://1bestcsharp.blogspot.com/2016/03/java-populate-jtable-from-arraylist.html
    void mostra(){
        //limpando a tabela
        tabelaDados.setModel(new DefaultTableModel(null,new String[]{"Number","Name","Type 1","Type 2","Total","HP","Attack", "Defense", "SP"}));
       
        DefaultTableModel model = 
                (DefaultTableModel)tabelaDados.getModel();
        Object rowData[] = new Object[9];// qtd colunas
        for(Dados d: lista)
        {
            rowData[0] = d.getNumber();
            rowData[1] = d.getName();
            rowData[2] = d.getTypeOne();
            rowData[3] = d.getTypeTwo();
            rowData[4] = d.getTotal();
            rowData[5] = d.getHp();
            rowData[6] = d.getAttack();
            rowData[7] = d.getDefense();
            rowData[8] = d.getSp();
            System.out.println("TempMin:"+d.getTotal()+"\n");
            model.addRow(rowData);
        }// fim preenche modelo
    }// fim mostra
   
    
   
    
    
    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
    switch(cbOrdena.getSelectedIndex()){    
        case 0: lista.sort(compareNumber);
            break;
        case 1: Collections.sort(lista);
            break;
        case 2: lista.sort(compareTotal);
            break;
        case 3: lista.sort(compareTypeOne);
        break;
        case 4: lista.sort(compareTypeTwo);
        break;
        default: JOptionPane.showMessageDialog(null,"Em construção!");    
        }    
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        int cont=0;
        
        switch(cbOrdena.getSelectedIndex()){
            case 0:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;//d.getNumber().equals(Integer.parseInt((txtBusca.getText())))
                        if (d.getNumber() == Integer.parseInt(txtBusca.getText())){
                            JOptionPane.showMessageDialog(null, "Pokemon encontrado " + cont + " comparações");
                            break;
                        }
                    }
                }// fim if Sequencial;
                else {
                    Dados d = new Dados();
                    d.setNumber(Integer.parseInt(txtBusca.getText())); // alterar atributo de acordo com a seleção
                    // definir o comparator caso não seja o padrão na chamado da busca binária
                    int pos = Collections.binarySearch(lista, d); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Nome encontrado na, posicao " + pos);
                }// fim else binary
            break;
            case 1:  if(opSeq.isSelected()){
                for(Dados d: lista){
                    cont++;
                    if(d.getName().equals(txtBusca.getText())){
                        JOptionPane.showMessageDialog(null,"Pokemon encontrado "+cont+" comparações");
                        break;
                    }
                }
            }// fim if Sequencial;
            else{
                Dados d = new Dados();
                d.setName(txtBusca.getText()); // alterar atributo de acordo com a seleção
                // definir o comparator caso não seja o padrão na chamado da busca binária
                int pos = Collections.binarySearch(lista,d); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                JOptionPane.showMessageDialog(null,"Nome encontrado na, posicao "+pos);
            }// fim else binary
            break;
            case 2:
                 if(opSeq.isSelected()){
                for(Dados d: lista){
                    cont++;
                    if(d.getTypeOne().equals(txtBusca.getText())){
                        JOptionPane.showMessageDialog(null,"Pokemon encontrado "+cont+" comparações");
                        break;
                    }
                }
            }// fim if Sequencial;
            else{
                Dados d = new Dados();
                d.setTypeOne(txtBusca.getText()); // alterar atributo de acordo com a seleção
                // definir o comparator caso não seja o padrão na chamado da busca binária
                int pos = Collections.binarySearch(lista,d); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                JOptionPane.showMessageDialog(null,"Nome encontrado na, posicao "+pos);
            }// fim else binary
                
            break;
            default: JOptionPane.showMessageDialog(null,"Em construção!");
            case 3: 
            if(opSeq.isSelected()){
                for(Dados d: lista){
                    cont++;
                    if(!d.getTypeTwo().equals(txtBusca.getText())){
                    } else {
                        JOptionPane.showMessageDialog(null,"Pokemon encontrada "+cont+" comparações");
                        break;
                    }
                }
            }// fim if Sequencial;
            else{
                Dados d = new Dados();
                d.setTypeTwo(txtBusca.getText()); // alterar atributo de acordo com a seleção
                // definir o comparator caso não seja o padrão na chamado da busca binária
                int pos = Collections.binarySearch(lista,d); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                JOptionPane.showMessageDialog(null,"Nome encontrado na, posicao "+pos);
            }// fim else binary
            break;
            case 4:
                if(opSeq.isSelected()){
                for(Dados d: lista){
                    cont++;
                    if(!d.getSp().equals(txtBusca.getText())){
                    } else {
                        JOptionPane.showMessageDialog(null,"Pokemon encontrada "+cont+" comparações");
                        break;
                    }
                }
            }// fim if Sequencial;
          
            break;
                
            }// switch
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void opSeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSeqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opSeqActionPerformed

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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JRadioButton opBin;
    private javax.swing.JRadioButton opSeq;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
