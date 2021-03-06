import Farmacia.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chivela
 */
public class FrmEntrada extends javax.swing.JFrame {

    /**
     * Creates new form FrmFornecedor
     */
    Conexao conexao = new Conexao();
    public String sql, identrada,receberproduto,receberidproduto,idparatualizar;
    int controlo =1,comparar = 0;
    String id = conexao.Read();
    

    public FrmEntrada() {
        initComponents();
       SelecionarM();
        //ProdutoFornecedor();
        desablitarcampo();
        buscardataa();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbproduto = new javax.swing.JTable();
        TXTPESQUISAR = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        quantidadeentrada = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        dataentrada = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        caducidadeentrada = new javax.swing.JFormattedTextField();
        salvarfornecedor = new javax.swing.JButton();
        editarfornecedor = new javax.swing.JButton();
        novofornecedor = new javax.swing.JButton();
        produtoentrada = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "PRODUTO", "QTD RESTANTE", "QTD CONTROL", "DATA DE ENTRADA", "CADUCIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbprodutoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbproduto);

        TXTPESQUISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPESQUISARActionPerformed(evt);
            }
        });
        TXTPESQUISAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTPESQUISARKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TXTPESQUISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(TXTPESQUISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ENTRADAS DOS PRODUTOS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRODUTO");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUANTIDADE");

        quantidadeentrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATA DA ENTRADA");

        try {
            dataentrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataentrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataentrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataentradaFocusGained(evt);
            }
        });
        dataentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataentradaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATA DE CADUCIDADE");

        try {
            caducidadeentrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        caducidadeentrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caducidadeentrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caducidadeentradaFocusGained(evt);
            }
        });

        salvarfornecedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        salvarfornecedor.setText("SALVA");
        salvarfornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarfornecedorActionPerformed(evt);
            }
        });

        editarfornecedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        editarfornecedor.setText("EDITAR");
        editarfornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarfornecedorActionPerformed(evt);
            }
        });

        novofornecedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        novofornecedor.setText("NOVO");
        novofornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novofornecedorActionPerformed(evt);
            }
        });

        produtoentrada.setText("Selecione o produto");
        produtoentrada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        produtoentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoentradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(novofornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produtoentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantidadeentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(salvarfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(caducidadeentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caducidadeentrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtoentrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantidadeentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dataentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(novofornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(editarfornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvarfornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarfornecedorActionPerformed

        if (comparar == 0) {
            SalvarProduto();

        } else {
            AtualizarProduto();
            comparar = 0;
            salvarfornecedor.setText("SALVAR");
        }
        SelecionarM();
        desablitarcampo();

    }//GEN-LAST:event_salvarfornecedorActionPerformed

    private void novofornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novofornecedorActionPerformed
        new Selecionar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_novofornecedorActionPerformed

    private void tbprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbprodutoMouseClicked

        TableModel model = tbproduto.getModel();
        identrada = (String) model.getValueAt(tbproduto.getSelectedRow(), 0);
        quantidadeentrada.setText((String) model.getValueAt(tbproduto.getSelectedRow(), 2));
        dataentrada.setText((String) model.getValueAt(tbproduto.getSelectedRow(), 4));
        caducidadeentrada.setText((String) model.getValueAt(tbproduto.getSelectedRow(), 5));
        String produto =(String) model.getValueAt(tbproduto.getSelectedRow(), 1);
        produtoentrada.setText(produto.toLowerCase());
        ProdutoFornecedor(identrada);
        desablitarcampo();
        editarfornecedor.setEnabled(true);


    }//GEN-LAST:event_tbprodutoMouseClicked

    private void editarfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarfornecedorActionPerformed
        salvarfornecedor.setEnabled(true);
        salvarfornecedor.setText("ATUALIZAR");
        comparar = 1;
        quantidadeentrada.setEnabled(true);
        dataentrada.setEnabled(true);
        caducidadeentrada.setEnabled(true);
        produtoentrada.setEnabled(true);

    }//GEN-LAST:event_editarfornecedorActionPerformed

    private void dataentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataentradaActionPerformed

    private void dataentradaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataentradaFocusGained

       buscardataa();
    }//GEN-LAST:event_dataentradaFocusGained

    private void caducidadeentradaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caducidadeentradaFocusGained
Date agora = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy");
        String recebedata = simpleDateFormat.format(agora);
        caducidadeentrada.setText(recebedata+"0");
    }//GEN-LAST:event_caducidadeentradaFocusGained

    private void produtoentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoentradaActionPerformed

    }//GEN-LAST:event_produtoentradaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
                                        new FrmFarmacia1().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void TXTPESQUISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPESQUISARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPESQUISARActionPerformed

    private void TXTPESQUISARKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPESQUISARKeyReleased
        // TODO add your handling code here:
        SelecionarM();
    }//GEN-LAST:event_TXTPESQUISARKeyReleased

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
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTPESQUISAR;
    private javax.swing.JFormattedTextField caducidadeentrada;
    private javax.swing.JFormattedTextField dataentrada;
    private javax.swing.JButton editarfornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton novofornecedor;
    public javax.swing.JButton produtoentrada;
    private javax.swing.JFormattedTextField quantidadeentrada;
    private javax.swing.JButton salvarfornecedor;
    private javax.swing.JTable tbproduto;
    // End of variables declaration//GEN-END:variables

    private void SalvarProduto() {
        sql = "insert into entradas values(null,'" + receberidproduto+ "', "
                + "'" + quantidadeentrada.getText().toUpperCase() + "','" + quantidadeentrada.getText().toUpperCase() + "',"
                + "'" + dataentrada.getText().toUpperCase() + "', '" + caducidadeentrada.getText()+ "','"+id+"',"
                + " '1')";

        try {
            conexao.conectar();
            int a = conexao.cadastrar_dado(sql);
            if (a != 0) {
                JOptionPane.showMessageDialog(null, "REGISTO CADASTRADO COM SUCESSO");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void AtualizarProduto() {

        sql = "update entradas set stock = '" + quantidadeentrada.getText()+ "', qtd = '" + quantidadeentrada.getText()+ "',producto_id = '" + idparatualizar+ "', data ='" + dataentrada.getText().toUpperCase() + "',"
                + "  caducidade = '" + caducidadeentrada.getText().toUpperCase() + "',"
                + "  funcionario_id = '" + id+ "' where id = '" + identrada + "'";

        try {
            conexao.conectar();
            int verificar = conexao.cadastrar_dado(sql);
            if (verificar != 0) {
                JOptionPane.showMessageDialog(null, "REGISTO ATUALIZADO COM SUCESSO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void LimparCampo() {

        quantidadeentrada.setEnabled(true);
        dataentrada.setEnabled(true);
        produtoentrada.setEnabled(true);
        caducidadeentrada.setEnabled(true);
        salvarfornecedor.setEnabled(true);
        novofornecedor.setEnabled(!true);
        editarfornecedor.setEnabled(!true);
        caducidadeentrada.setText("");

        quantidadeentrada.setText("");
        dataentrada.setText("");
            produtoentrada.setText(receberproduto);
        buscardataa();

    }

    private void desablitarcampo() {
        quantidadeentrada.setEnabled(false);
        dataentrada.setEnabled(false);
        produtoentrada.setEnabled(false);
         caducidadeentrada.setEnabled(!true);
        salvarfornecedor.setEnabled(false);
        editarfornecedor.setEnabled(false);
        novofornecedor.setEnabled(true);

    }

     private void SelecionarM() {
        sql = "SELECT entradas.id,SUM(entradas.stock),entradas.qtd,entradas.data,entradas.caducidade,"
                + "produto.nome,produto.tipo_medicamento,fornecedor.nome  FROM entradas inner join"
                + " produto on entradas.producto_id = produto.id inner join fornecedor on entradas.fornecedor_id = fornecedor.id && entradas.stock>-1 && "
                + "produto.nome like '" + TXTPESQUISAR.getText().toUpperCase() + "%' GROUP BY produto.id ORDER BY entradas.id DESC";
        DefaultTableModel dtm = (DefaultTableModel) tbproduto.getModel();
        if (dtm.getRowCount() != 0) {

            ((DefaultTableModel) tbproduto.getModel()).setNumRows(0);// serve para formatar a tualiza a tabela e vai repor as linhas que tiver dentro da tabela que esta no java
            tbproduto.updateUI();

        }

        try (PreparedStatement ps = (PreparedStatement) conexao.conectar().prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Object[] recebeDado = {rs.getString(1), rs.getString(6)+" "+rs.getString(7),  rs.getString(2), rs.getString(3), rs.getString(4)
                , rs.getString(5)};
                dtm.addRow(recebeDado);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void ProdutoFornecedor(String id) {
        sql = "select producto_id from entradas WHERE id='"+id+"' ORDER BY id desc";
        

        try (PreparedStatement ps = (PreparedStatement) conexao.conectar().prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                idparatualizar= rs.getString(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
      
    }

    private void buscardataa() {
        
        
        
         Date agora = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyMMdd");
        String recebedata = simpleDateFormat.format(agora);
        dataentrada.setText(recebedata);
    }

    public void ddd() {
        
        
        LimparCampo();
        comparar = 0;
        salvarfornecedor.setText("SALVAR");
        SelecionarM();
        if(controlo ==1){
            
            controlo++;
        }
        
    }
}
