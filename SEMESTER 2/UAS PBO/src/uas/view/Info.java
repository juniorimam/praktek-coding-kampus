package uas.view;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import uas.dao.Session;
import java.awt.event.KeyEvent;
import uas.view.Home;
import uas.dao.Koneksi;

public class Info extends javax.swing.JFrame {


    public Info() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnTransaksiKembali = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(955, 536));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(955, 536));
        jPanel1.setMinimumSize(new java.awt.Dimension(955, 536));
        jPanel1.setLayout(null);

        BtnTransaksiKembali.setBackground(new java.awt.Color(255, 153, 0));
        BtnTransaksiKembali.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnTransaksiKembali.setForeground(new java.awt.Color(255, 255, 255));
        BtnTransaksiKembali.setText("Kembali");
        BtnTransaksiKembali.setContentAreaFilled(false);
        BtnTransaksiKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTransaksiKembali.setDefaultCapable(false);
        BtnTransaksiKembali.setFocusPainted(false);
        BtnTransaksiKembali.setFocusable(false);
        BtnTransaksiKembali.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTransaksiKembali.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnTransaksiKembali.setOpaque(true);
        BtnTransaksiKembali.setRequestFocusEnabled(false);
        BtnTransaksiKembali.setSelected(true);
        BtnTransaksiKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTransaksiKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTransaksiKembali);
        BtnTransaksiKembali.setBounds(850, 480, 90, 40);

        jLabel7.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("3.  dIMAS ALFATA                       /     17.5.00134");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 220, 510, 60);

        jLabel8.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PROJECT UAS PBO");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 510, 60);

        jLabel10.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("ANGGOTA KELOMPOK :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 120, 510, 60);

        jLabel13.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("\" PENJUALAN TIKET KERETA API \"");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 70, 510, 60);

        jLabel9.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("KELOMPOK 4");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 30, 510, 60);

        jLabel12.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("2.  yUNI PINILEH                         /     17.5.00122");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 190, 510, 60);

        jLabel11.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("1.  JUNIOR IMAM NUGROHO       /     17.5.00105");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 160, 510, 60);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/bckgrndinfo.png"))); // NOI18N
        Background.setDoubleBuffered(true);
        Background.setOpaque(true);
        Background.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Background);
        Background.setBounds(0, 0, 955, 536);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTransaksiKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTransaksiKembaliActionPerformed
        // TODO add your handling code here:
        Home fu = new Home();
        fu.setVisible(true);
        fu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnTransaksiKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnTransaksiKembali;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
