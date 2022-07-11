/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Visao;

import clinicaveterinaria.Banco.Conexao;
import java.awt.HeadlessException;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author João Vitor
 */
public class alterarMedicamento extends javax.swing.JFrame {
    int op;
     Connection conn = null;
     PreparedStatement stm = null;
     ResultSet rs = null;
     int id;
    public alterarMedicamento() {
        initComponents();
        inserirCategoria();
        inserirFornecedor();
        //inserirInformacoes();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbFornecedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescM = new javax.swing.JTextArea();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtValidade = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnEnviarM = new javax.swing.JButton();
        btnNovoF = new javax.swing.JButton();
        btnNovaCat = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Medicamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar Medicamento"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Quantidade:");

        jLabel3.setText("Valor:");

        jLabel4.setText("Descrição:");

        jLabel6.setText("Fornecedor:");

        cmbFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um fornecedor" }));
        cmbFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbFornecedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbFornecedorFocusLost(evt);
            }
        });
        cmbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFornecedorActionPerformed(evt);
            }
        });

        txtDescM.setColumns(20);
        txtDescM.setRows(5);
        jScrollPane1.setViewportView(txtDescM);

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Categoria" }));
        cmbCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbCategoriaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbCategoriaFocusLost(evt);
            }
        });
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        jLabel8.setText("Categoria:");

        jLabel9.setText("Validade:");

        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtID.setEditable(false);

        jLabel10.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(cmbFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNomeM)
                                .addGap(49, 49, 49))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(310, 310, 310)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtValor)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(224, 224, 224))
                            .addComponent(txtQuant))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnEnviarM.setText("Enviar");
        btnEnviarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMActionPerformed(evt);
            }
        });

        btnNovoF.setText("Inserir Novo Fornecedor");
        btnNovoF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFActionPerformed(evt);
            }
        });

        btnNovaCat.setText("Inserir Nova Categoria");
        btnNovaCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEnviarM, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNovoF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovaCat, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviarM)
                    .addComponent(btnNovoF)
                    .addComponent(btnNovaCat))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFActionPerformed
        cadastroFornecedor janela = new cadastroFornecedor();
        janela.setVisible(true);
    }//GEN-LAST:event_btnNovoFActionPerformed

    private void btnEnviarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMActionPerformed
if(txtNomeM.getText().toString().equals("")|| txtValor.getText().toString().equals("R$0,00")|| txtValor.getText().toString().equals("")|| txtQuant.getText().toString().equals("")|| txtValidade.getText().toString().equals("  /  /    ")|| txtValidade.getText().toString().equals("")||cmbCategoria.getSelectedIndex() == 0 ||cmbFornecedor.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null,"Preencha todos os Campos");
        }else{
        inserirMedicamento();
        }
       
    }//GEN-LAST:event_btnEnviarMActionPerformed

    private void cmbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFornecedorActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnNovaCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaCatActionPerformed
         newCategoria janela = new newCategoria();
        janela.setVisible(true);
    }//GEN-LAST:event_btnNovaCatActionPerformed

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

    }//GEN-LAST:event_jPanel1FocusGained

    private void cmbCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCategoriaFocusLost
        
    }//GEN-LAST:event_cmbCategoriaFocusLost

    private void cmbFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFornecedorFocusLost
      
        
    }//GEN-LAST:event_cmbFornecedorFocusLost

    private void cmbCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCategoriaFocusGained
        
    }//GEN-LAST:event_cmbCategoriaFocusGained

    private void cmbFornecedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFornecedorFocusGained

    }//GEN-LAST:event_cmbFornecedorFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inserirFornecedor();
        inserirCategoria();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(alterarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alterarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alterarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alterarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alterarMedicamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarM;
    private javax.swing.JButton btnNovaCat;
    private javax.swing.JButton btnNovoF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbFornecedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescM;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNomeM;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JFormattedTextField txtValidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

  private void inserirMedicamento() {
            String sql = "UPDATE medicamento SET nome = ?, valor = ?, qtd = ?, descricao = ?, categoria_idcategoria = ?, fornecedor_idfornecedor = ?, validade = ? where idmedicamento = ?;";
            try{ 
            conn = Conexao.obterConexao();
            stm = conn.prepareStatement(sql);
            stm.setString(1, txtNomeM.getText());
            stm.setString(2, txtValor.getText());
            stm.setString(3, txtQuant.getText());
            stm.setString(4, txtDescM.getText());
            stm.setString(5, Integer.toString(cmbCategoria.getSelectedIndex()));
            stm.setString(6, Integer.toString(cmbFornecedor.getSelectedIndex()));
            stm.setString(7, txtValidade.getText());
            stm.setString(8, txtID.getText());
            stm.execute();
            
            JOptionPane.showMessageDialog(this,"salvo com sucesso.");
            this.setVisible(false);
            }
            catch(SQLException | HeadlessException erro){
            JOptionPane.showMessageDialog(this,
                         erro.getMessage());
            }
            finally{
                   Conexao.fecharConexao(conn, stm);
                }
            
       }

    /**/
    private void inserirCategoria(){
    String sql = "Select nome_categoria from CATEGORIA";
    try{
        cmbCategoria.removeAllItems();
        cmbCategoria.addItem("Selecione a Categoria");
        conn = Conexao.obterConexao();
        stm = conn.prepareStatement(sql);
        rs = stm.executeQuery();
        
        
        while(rs.next()){
            cmbCategoria.addItem(rs.getString("nome_categoria"));
        }
    }catch(Exception erro){
        JOptionPane.showMessageDialog(null, erro);
    }finally{
        Conexao.fecharConexao(conn, stm, rs);
    }
    
    }
    private void inserirFornecedor(){
    String sql = "Select nome_fornecedor from FORNECEDOR";
    try{
        cmbFornecedor.removeAllItems();
        cmbFornecedor.addItem("Selecione o Fornecedor");
        conn = Conexao.obterConexao();
        stm = conn.prepareStatement(sql);
        rs = stm.executeQuery();
        
        
        while(rs.next()){
            cmbFornecedor.addItem(rs.getString("nome_fornecedor"));
        }
    }catch(Exception erro){
        JOptionPane.showMessageDialog(null, erro);
    }finally{
        Conexao.fecharConexao(conn, stm, rs);
    }
    
    }


    public void exportarId(Medicamento med) {
       txtID.setText(Integer.toString(med.getID()));
       txtNomeM.setText(med.getNome());
       txtValor.setText(med.getValor());
       txtQuant.setText(Integer.toString(med.getQtd()));
       txtDescM.setText(med.getDescricao());
       txtValidade.setText(med.getValidade());
       cmbCategoria.setSelectedItem(med.getCategoria());
       cmbFornecedor.setSelectedItem(med.getFornecedor());
        
    }

}