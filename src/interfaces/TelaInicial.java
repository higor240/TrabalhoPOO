
package interfaces;

import classes.Jogo;
import classes.BibliotecaDeJogos;
/**
 *
 * @author Higor
 */
public class TelaInicial extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaInicial.class.getName());

    public TelaInicial() {
        initComponents();
        BibliotecaDeJogos biblioteca = new BibliotecaDeJogos();
        if (biblioteca.getJogos().isEmpty()) {
            btnCompraJogo.setEnabled(false);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCadastrarJogo = new javax.swing.JButton();
        btnCompraJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BEM VINDO A GAMESTORE");

        btnCadastrarJogo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCadastrarJogo.setText("CADASTRAR JOGO");
        btnCadastrarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarJogoActionPerformed(evt);
            }
        });

        btnCompraJogo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCompraJogo.setText("COMPRAR JOGO");
        btnCompraJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCompraJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarJogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(btnCadastrarJogo)
                .addGap(18, 18, 18)
                .addComponent(btnCompraJogo)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarJogoActionPerformed
        this.dispose();
        CadastrarJogo cadastrarJogo = new CadastrarJogo();
        cadastrarJogo.setVisible(true);
        cadastrarJogo.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCadastrarJogoActionPerformed

    private void btnCompraJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraJogoActionPerformed

        this.dispose();
        ComprarJogo comprarJogo = new ComprarJogo();
        comprarJogo.setVisible(true);
        comprarJogo.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCompraJogoActionPerformed

    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarJogo;
    private javax.swing.JButton btnCompraJogo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
