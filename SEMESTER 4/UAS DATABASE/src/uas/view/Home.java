
package uas.view;

public class Home extends javax.swing.JFrame {


    public Home() {
      initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnLogout = new javax.swing.JButton();
        BtnPustaka = new javax.swing.JButton();
        BtnPeminjaman = new javax.swing.JButton();
        BtnAnggota = new javax.swing.JButton();
        LSalamHome = new javax.swing.JLabel();
        Footer1 = new javax.swing.JLabel();
        Footer2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 228, 228));
        setMaximumSize(new java.awt.Dimension(955, 536));
        setMinimumSize(new java.awt.Dimension(955, 536));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(955, 536));
        jPanel1.setMinimumSize(new java.awt.Dimension(955, 536));
        jPanel1.setPreferredSize(new java.awt.Dimension(955, 536));
        jPanel1.setLayout(null);

        BtnLogout.setBackground(new java.awt.Color(227, 59, 59));
        BtnLogout.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        BtnLogout.setForeground(new java.awt.Color(255, 255, 255));
        BtnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/logout.png"))); // NOI18N
        BtnLogout.setBorderPainted(false);
        BtnLogout.setContentAreaFilled(false);
        BtnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLogout.setDefaultCapable(false);
        BtnLogout.setFocusCycleRoot(true);
        BtnLogout.setFocusable(false);
        BtnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLogout.setRequestFocusEnabled(false);
        BtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLogout);
        BtnLogout.setBounds(860, 20, 73, 70);

        BtnPustaka.setBackground(new java.awt.Color(255, 255, 255));
        BtnPustaka.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        BtnPustaka.setForeground(new java.awt.Color(255, 255, 255));
        BtnPustaka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/ico1.png"))); // NOI18N
        BtnPustaka.setBorderPainted(false);
        BtnPustaka.setContentAreaFilled(false);
        BtnPustaka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPustaka.setDefaultCapable(false);
        BtnPustaka.setFocusPainted(false);
        BtnPustaka.setFocusable(false);
        BtnPustaka.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnPustaka.setIconTextGap(10);
        BtnPustaka.setRequestFocusEnabled(false);
        BtnPustaka.setRolloverEnabled(false);
        BtnPustaka.setVerifyInputWhenFocusTarget(false);
        BtnPustaka.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnPustaka.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnPustaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPustakaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPustaka);
        BtnPustaka.setBounds(70, 200, 190, 240);

        BtnPeminjaman.setBackground(new java.awt.Color(255, 255, 255));
        BtnPeminjaman.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        BtnPeminjaman.setForeground(new java.awt.Color(255, 255, 255));
        BtnPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/ico2.png"))); // NOI18N
        BtnPeminjaman.setBorderPainted(false);
        BtnPeminjaman.setContentAreaFilled(false);
        BtnPeminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPeminjaman.setDefaultCapable(false);
        BtnPeminjaman.setFocusPainted(false);
        BtnPeminjaman.setFocusable(false);
        BtnPeminjaman.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnPeminjaman.setIconTextGap(10);
        BtnPeminjaman.setRequestFocusEnabled(false);
        BtnPeminjaman.setRolloverEnabled(false);
        BtnPeminjaman.setSelected(true);
        BtnPeminjaman.setVerifyInputWhenFocusTarget(false);
        BtnPeminjaman.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnPeminjaman.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPeminjamanActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPeminjaman);
        BtnPeminjaman.setBounds(380, 190, 190, 250);

        BtnAnggota.setBackground(new java.awt.Color(255, 255, 255));
        BtnAnggota.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        BtnAnggota.setForeground(new java.awt.Color(255, 255, 255));
        BtnAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/ico3.png"))); // NOI18N
        BtnAnggota.setBorderPainted(false);
        BtnAnggota.setContentAreaFilled(false);
        BtnAnggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAnggota.setDefaultCapable(false);
        BtnAnggota.setFocusPainted(false);
        BtnAnggota.setFocusable(false);
        BtnAnggota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAnggota.setIconTextGap(10);
        BtnAnggota.setRequestFocusEnabled(false);
        BtnAnggota.setRolloverEnabled(false);
        BtnAnggota.setSelected(true);
        BtnAnggota.setVerifyInputWhenFocusTarget(false);
        BtnAnggota.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnAnggota.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnggotaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAnggota);
        BtnAnggota.setBounds(690, 190, 190, 250);

        LSalamHome.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        LSalamHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LSalamHome.setText("Selamat Datang");
        jPanel1.add(LSalamHome);
        LSalamHome.setBounds(0, 137, 960, 40);

        Footer1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Footer1.setForeground(new java.awt.Color(255, 255, 255));
        Footer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Footer1.setText("STMIK SINAR NUSANTARA");
        Footer1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Footer1);
        Footer1.setBounds(0, 490, 960, 30);

        Footer2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Footer2.setForeground(new java.awt.Color(255, 255, 255));
        Footer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Footer2.setText("Jl. KH Samanhudi 84-86, Laweyan, Surakarta, Jawa Tengah - Indonesia 57142");
        Footer2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Footer2);
        Footer2.setBounds(0, 510, 960, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/bg.jpg"))); // NOI18N
        Background.setText("jLabel2");
        jPanel1.add(Background);
        Background.setBounds(0, 0, 955, 536);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnLogoutActionPerformed

    private void BtnPustakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPustakaActionPerformed
        // TODO add your handling code here:
        FormPustaka idpustaka = new FormPustaka();
        idpustaka.setVisible(true);
        idpustaka.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnPustakaActionPerformed

    private void BtnAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnggotaActionPerformed
        // TODO add your handling code here:
        FormAnggota idanggota = new FormAnggota();
        idanggota.setVisible(true);
        idanggota.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_BtnAnggotaActionPerformed

    private void BtnPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPeminjamanActionPerformed
        // TODO add your handling code here:
        FormPeminjaman idpeminjaman = new FormPeminjaman();
        idpeminjaman.setVisible(true);
        idpeminjaman.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnPeminjamanActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home awal = new Home();
                // tampilkan FormUtama
                awal.setVisible(true);
                // untuk menengahkan form
                awal.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnAnggota;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JButton BtnPeminjaman;
    private javax.swing.JButton BtnPustaka;
    private javax.swing.JLabel Footer1;
    private javax.swing.JLabel Footer2;
    private javax.swing.JLabel LSalamHome;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
