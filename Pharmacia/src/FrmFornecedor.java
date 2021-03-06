import Farmacia.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class FrmFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form FrmFornecedor
     */
    Conexao conexao = new Conexao();
    String sql, idfornecedor;
    int comparar = 0;

    public FrmFornecedor() {
        initComponents();
        SelecionarM();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nomefornecedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        telefonefornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        moradafornecedor = new javax.swing.JTextArea();
        salvarfornecedor = new javax.swing.JButton();
        editarfornecedor = new javax.swing.JButton();
        novofornecedor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        TXTPESQUISAR = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbfornecedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("CADASTRO DOS FORNECEDORES");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("NOME");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("TELEFONE");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("MORADA");

        moradafornecedor.setColumns(20);
        moradafornecedor.setRows(5);
        jScrollPane1.setViewportView(moradafornecedor);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(salvarfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarfornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novofornecedor)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomefornecedor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonefornecedor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomefornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefonefornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarfornecedor)
                    .addComponent(editarfornecedor)
                    .addComponent(novofornecedor)))
        );

        TXTPESQUISAR.setToolTipText("Busca");
        TXTPESQUISAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTPESQUISARKeyReleased(evt);
            }
        });

        tbfornecedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tbfornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "NOME", "TELEFONE", "MORADA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbfornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbfornecedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbfornecedor);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TXTPESQUISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(TXTPESQUISAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarfornecedorActionPerformed

        if (comparar == 0) {
            SalvarFornecedor();

        } else {
            AtualizarFornecedor();
            comparar = 0;
            salvarfornecedor.setText("SALVAR");
        }
        SelecionarM();
        desablitarcampo();

    }//GEN-LAST:event_salvarfornecedorActionPerformed

    private void novofornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novofornecedorActionPerformed
        LimparCampo();
        comparar = 0;
        salvarfornecedor.setText("SALVAR");
    }//GEN-LAST:event_novofornecedorActionPerformed

    private void TXTPESQUISARKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPESQUISARKeyReleased
        SelecionarM();
    }//GEN-LAST:event_TXTPESQUISARKeyReleased

    private void tbfornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbfornecedorMouseClicked

        TableModel model = tbfornecedor.getModel();
        idfornecedor = (String) model.getValueAt(tbfornecedor.getSelectedRow(), 0);
        nomefornecedor.setText((String) model.getValueAt(tbfornecedor.getSelectedRow(), 1));
        telefonefornecedor.setText((String) model.getValueAt(tbfornecedor.getSelectedRow(), 2));
        moradafornecedor.setText((String) model.getValueAt(tbfornecedor.getSelectedRow(), 3));

        desablitarcampo();
        editarfornecedor.setEnabled(true);


    }//GEN-LAST:event_tbfornecedorMouseClicked

    private void editarfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarfornecedorActionPerformed
        salvarfornecedor.setEnabled(true);
        salvarfornecedor.setText("ATUALIZAR");
        comparar = 1;
        nomefornecedor.setEnabled(true);
        telefonefornecedor.setEnabled(true);
        moradafornecedor.setEnabled(true);

    }//GEN-LAST:event_editarfornecedorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new FrmFarmacia1().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
                new FrmFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTPESQUISAR;
    private javax.swing.JButton editarfornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea moradafornecedor;
    private javax.swing.JTextField nomefornecedor;
    private javax.swing.JButton novofornecedor;
    private javax.swing.JButton salvarfornecedor;
    private javax.swing.JTable tbfornecedor;
    private javax.swing.JTextField telefonefornecedor;
    // End of variables declaration//GEN-END:variables

    private void SalvarFornecedor() {
        sql = "insert into fornecedor values(null,'" + nomefornecedor.getText().toUpperCase() + "', "
                + "'" + telefonefornecedor.getText().toUpperCase() + "', '" + moradafornecedor.getText().toUpperCase() + "')";

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

    private void AtualizarFornecedor() {

        sql = "update fornecedor set nome = '" + nomefornecedor.getText().toUpperCase() + "', telefone ='" + telefonefornecedor.getText().toUpperCase() + "',"
                + "  morada = '" + moradafornecedor.getText().toUpperCase() + "' where id = '" + idfornecedor + "'";

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

        nomefornecedor.setEnabled(true);
        telefonefornecedor.setEnabled(true);
        moradafornecedor.setEnabled(true);
        salvarfornecedor.setEnabled(true);
        novofornecedor.setEnabled(!true);
        editarfornecedor.setEnabled(!true);

        nomefornecedor.setText("");
        telefonefornecedor.setText("");
        moradafornecedor.setText("");

    }

    private void desablitarcampo() {
        nomefornecedor.setEnabled(false);
        telefonefornecedor.setEnabled(false);
        moradafornecedor.setEnabled(false);
        salvarfornecedor.setEnabled(false);
        editarfornecedor.setEnabled(false);
        novofornecedor.setEnabled(true);

    }

    private void SelecionarM() {
        sql = "select * from fornecedor where nome like '" + TXTPESQUISAR.getText().toUpperCase() + "%' ORDER BY id desc";
        DefaultTableModel dtm = (DefaultTableModel) tbfornecedor.getModel();
        if (dtm.getRowCount() != 0) {

            ((DefaultTableModel) tbfornecedor.getModel()).setNumRows(0);// serve para formatar a tualiza a tabela e vai repor as linhas que tiver dentro da tabela que esta no java
            tbfornecedor.updateUI();

        }

        try (PreparedStatement ps = (PreparedStatement) conexao.conectar().prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Object[] recebeDado = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                dtm.addRow(recebeDado);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
