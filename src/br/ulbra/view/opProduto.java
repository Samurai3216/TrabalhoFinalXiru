/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.dao.ProdutoDAO;
import br.ulbra.entity.Produto;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno.saolucas
 */
public class opProduto extends javax.swing.JFrame {

    /**
     * Creates new form opProduto
     */
    public opProduto() {
        initComponents();
        btnExcluirProduto.setEnabled(false);
        btnCalcularTotal.setEnabled(false);
        listarProdutos();
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
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnCalcularTotal = new javax.swing.JButton();
        btnInserirProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnAtualizarProduto = new javax.swing.JButton();
        btnSairProduto = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaProdutos = new javax.swing.JTable();
        lblTextoPesquisa = new javax.swing.JLabel();
        txtTextoPesquisa = new javax.swing.JTextField();
        btnPesquisaProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/person.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Operaçao Produtos");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(15, 214));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(656, 50));

        jPanel7.setLayout(new java.awt.GridLayout(1, 6, 5, 5));

        btnCalcularTotal.setText("Calcular");
        btnCalcularTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTotalActionPerformed(evt);
            }
        });
        jPanel7.add(btnCalcularTotal);

        btnInserirProduto.setText("INSERIR NOVO");
        btnInserirProduto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnInserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirProdutoActionPerformed(evt);
            }
        });
        jPanel7.add(btnInserirProduto);

        btnExcluirProduto.setText("EXCLUIR");
        btnExcluirProduto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });
        jPanel7.add(btnExcluirProduto);

        btnAtualizarProduto.setText("ATUALIZAR");
        btnAtualizarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnAtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarProdutoActionPerformed(evt);
            }
        });
        jPanel7.add(btnAtualizarProduto);

        btnSairProduto.setText("SAIR");
        btnSairProduto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnSairProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairProdutoActionPerformed(evt);
            }
        });
        jPanel7.add(btnSairProduto);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setPreferredSize(new java.awt.Dimension(15, 214));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Relação de Produtos")));

        tbListaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Produto", "Categoria Produto", "Valor Produto", "Quantidade Estoque", "Data Cadastro"
            }
        ));
        tbListaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbListaProdutos);

        lblTextoPesquisa.setText("Filtro pelo nome de produto");

        btnPesquisaProduto.setText("Pesquisar");
        btnPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtTextoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblTextoPesquisa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTextoPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTextoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed

        //Recuperou as informa��es da tabela
        /*Integer linhaSelecionada = tbListaUsuarios.getSelectedRow();
        String id_user = tbListaUsuarios.getValueAt(linhaSelecionada, 0).toString();
        String nomeUser = tbListaUsuarios.getValueAt(linhaSelecionada, 1).toString();
        String mensagem = "Deseja realmente excluir o usuario " + nomeUser + "?";
        int resposta = JOptionPane.showConfirmDialog(null, mensagem);*/

 /*if (resposta == 0) {
            CadastroUsuariosController op = new CadastroUsuariosController();
            op.deletarUsuariosController(id_user);
            String mensagem1 = "Registro excluido com sucesso!";
            JOptionPane.showMessageDialog(null, mensagem1);
            atualizarDadosTabela();
        } else if (resposta == 1) {
            String mensagem2 = "Exclus�o negada!";
            JOptionPane.showMessageDialog(null, mensagem2);
        }*/
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarProdutoActionPerformed
        listarProdutos();

    }//GEN-LAST:event_btnAtualizarProdutoActionPerformed

    private void btnSairProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairProdutoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairProdutoActionPerformed

    private void tbListaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaProdutosMouseClicked
        btnExcluirProduto.setEnabled(true);
        btnCalcularTotal.setEnabled(true);
        btnAtualizarProduto.setEnabled(true);

    }//GEN-LAST:event_tbListaProdutosMouseClicked

    private void btnPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaProdutoActionPerformed
        String nomeProduto = txtTextoPesquisa.getText();

    // Verifica se o campo de pesquisa está vazio
    if (nomeProduto.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, digite um nome de produto para pesquisar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        ProdutoDAO produtoDAO = new ProdutoDAO();

        List<Produto> produtosEncontrados = produtoDAO.pesquisarProduto(nomeProduto);

        DefaultTableModel model = (DefaultTableModel) tbListaProdutos.getModel();
        model.setRowCount(0);  // Limpa as linhas da tabela

        if (produtosEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum produto encontrado com o nome fornecido.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

        for (Produto produto : produtosEncontrados) {
            Object[] dados = {
                produto.getIdProd(),
                produto.getNomeProd(),
                produto.getCategoriaProd(),
                produto.getValorUnitProd(),
                produto.getQuantidadeProd(),
                produto.getDataCadProd()
            };
            model.addRow(dados);
        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao pesquisar produtos: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnPesquisaProdutoActionPerformed

    private void btnInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirProdutoActionPerformed
        cadProduto NovaTela = new cadProduto();
        NovaTela.setVisible(true);
    }//GEN-LAST:event_btnInserirProdutoActionPerformed

    private void btnCalcularTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTotalActionPerformed
        calcularValorTotal();
    }//GEN-LAST:event_btnCalcularTotalActionPerformed

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
            java.util.logging.Logger.getLogger(opProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarProduto;
    private javax.swing.JButton btnCalcularTotal;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnInserirProduto;
    private javax.swing.JButton btnPesquisaProduto;
    private javax.swing.JButton btnSairProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTextoPesquisa;
    private javax.swing.JTable tbListaProdutos;
    private javax.swing.JTextField txtTextoPesquisa;
    // End of variables declaration//GEN-END:variables

    private void listarProdutos() {
    try {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Produto> produtos = produtoDAO.listarProdutos(); // Chama o DAO para buscar os produtos no banco

        // Limpa a tabela antes de adicionar os novos produtos
        DefaultTableModel model = (DefaultTableModel) tbListaProdutos.getModel();
        model.setRowCount(0);  // Limpa as linhas da tabela

        // Adiciona os produtos na tabela
        for (Produto produto : produtos) {
            Object[] dados = {
                produto.getIdProd(),
                produto.getNomeProd(),
                produto.getCategoriaProd(),
                produto.getValorUnitProd(),
                produto.getQuantidadeProd(),
                produto.getDataCadProd()
            };
            model.addRow(dados); // Adiciona cada produto na tabela
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar os produtos: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void calcularValorTotal() {
    try {
        int linhaSelecionada = tbListaProdutos.getSelectedRow();

        if (linhaSelecionada != -1) {
            int idProduto = (int) tbListaProdutos.getValueAt(linhaSelecionada, 0); // ID está na coluna 0

            ProdutoDAO produtoDAO = new ProdutoDAO();
            Produto produto = produtoDAO.buscarProdutoPorId(idProduto); // Crie esse método se ainda não existir

            if (produto != null) {
                double valor = produto.getValorUnitProd();
                int qtde = produto.getQuantidadeProd();
                double valorTotal = valor * qtde;

                JOptionPane.showMessageDialog(this, "Valor total do produto: R$ " + valorTotal);
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado.");
            }
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao calcular valor: " + ex.getMessage());
    }
}
    
    }

    
    

