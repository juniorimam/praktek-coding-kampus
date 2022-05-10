
package uas.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import uas.dao.Koneksi;
import uas.dao.Session;

public class Home extends javax.swing.JFrame {


    public Home() {
      initComponents();
      SalamHome();
      JamSekarang();
    }
    
    public void JamSekarang(){
        //butuh TImer untuk menjalankan Jam     
        ActionListener al = new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String null_jam = "";
                String null_menit ="";
                String null_detik = "";
                //detik diambil dari date
                Date d = new Date();
                int nilai_jam = d.getHours();
                int nilai_menit = d.getMinutes();
                int nilai_detik = d.getSeconds();
                
                //biar format 2 digit, jika < 10
                if (nilai_jam < 10) {
                    null_jam = "0";
                }
                if(nilai_menit < 10){
                    null_menit = "0";
                }
                if(nilai_detik < 10){
                    null_detik = "0";
                }
                //jam, menit, detik dijatikan String format 2 digit
                String jam = null_jam + Integer.toString(nilai_jam);
                String menit = null_menit + Integer.toString(nilai_menit);
                String detik = null_detik + Integer.toString(nilai_detik);
                
               //format jam:menit:detik
                LJam.setText(""+jam +":"+menit+":"+detik);
            }
        };
        new Timer(1000, al).start();
    }
    
    private void SalamHome(){
        String username = Session.getUsernameSession();
        String password = Session.getPasswordSession();
        String nama = null;
        
        Connection k = Koneksi.getKoneksi();
        String query_petugas = "SELECT * FROM petugas WHERE username = '" + username + "' AND password = '" + password + "' ";
        
        try {
            Statement stmt = k.createStatement();
            ResultSet rs = stmt.executeQuery(query_petugas);
            
            while(rs.next()){
                nama = rs.getString("nama");
                
            }
            rs.close();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"terjadi eror pada : "+se);
     
        }
        LSalamHome.setText("Selamat Datang di Pemesanan Tiket Kereta Api , "+nama+".");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnLogout = new javax.swing.JButton();
        BtnInfoJadwal = new javax.swing.JButton();
        BtnTransaksi = new javax.swing.JButton();
        BtnInfo = new javax.swing.JButton();
        LSalamHome = new javax.swing.JLabel();
        LJam = new javax.swing.JLabel();
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

        BtnLogout.setBackground(new java.awt.Color(42, 104, 177));
        BtnLogout.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        BtnLogout.setForeground(new java.awt.Color(255, 255, 255));
        BtnLogout.setText("Logout");
        BtnLogout.setContentAreaFilled(false);
        BtnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLogout.setDefaultCapable(false);
        BtnLogout.setFocusPainted(false);
        BtnLogout.setFocusable(false);
        BtnLogout.setOpaque(true);
        BtnLogout.setRequestFocusEnabled(false);
        BtnLogout.setSelected(true);
        BtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLogout);
        BtnLogout.setBounds(860, 20, 73, 40);

        BtnInfoJadwal.setBackground(new java.awt.Color(42, 104, 177));
        BtnInfoJadwal.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        BtnInfoJadwal.setForeground(new java.awt.Color(255, 255, 255));
        BtnInfoJadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/ico1.png"))); // NOI18N
        BtnInfoJadwal.setText("Info Jadwal");
        BtnInfoJadwal.setContentAreaFilled(false);
        BtnInfoJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInfoJadwal.setDefaultCapable(false);
        BtnInfoJadwal.setFocusable(false);
        BtnInfoJadwal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnInfoJadwal.setIconTextGap(9);
        BtnInfoJadwal.setOpaque(true);
        BtnInfoJadwal.setRequestFocusEnabled(false);
        BtnInfoJadwal.setRolloverEnabled(false);
        BtnInfoJadwal.setSelected(true);
        BtnInfoJadwal.setVerifyInputWhenFocusTarget(false);
        BtnInfoJadwal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnInfoJadwal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnInfoJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoJadwalActionPerformed(evt);
            }
        });
        jPanel1.add(BtnInfoJadwal);
        BtnInfoJadwal.setBounds(70, 210, 190, 220);

        BtnTransaksi.setBackground(new java.awt.Color(42, 104, 177));
        BtnTransaksi.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        BtnTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        BtnTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/ico2.png"))); // NOI18N
        BtnTransaksi.setText("Transaksi");
        BtnTransaksi.setContentAreaFilled(false);
        BtnTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTransaksi.setDefaultCapable(false);
        BtnTransaksi.setFocusable(false);
        BtnTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTransaksi.setIconTextGap(9);
        BtnTransaksi.setOpaque(true);
        BtnTransaksi.setRequestFocusEnabled(false);
        BtnTransaksi.setRolloverEnabled(false);
        BtnTransaksi.setSelected(true);
        BtnTransaksi.setVerifyInputWhenFocusTarget(false);
        BtnTransaksi.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnTransaksi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTransaksiActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTransaksi);
        BtnTransaksi.setBounds(380, 210, 190, 220);

        BtnInfo.setBackground(new java.awt.Color(42, 104, 177));
        BtnInfo.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        BtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        BtnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/ico3.png"))); // NOI18N
        BtnInfo.setText("Info");
        BtnInfo.setContentAreaFilled(false);
        BtnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInfo.setDefaultCapable(false);
        BtnInfo.setFocusable(false);
        BtnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnInfo.setIconTextGap(9);
        BtnInfo.setOpaque(true);
        BtnInfo.setRequestFocusEnabled(false);
        BtnInfo.setRolloverEnabled(false);
        BtnInfo.setSelected(true);
        BtnInfo.setVerifyInputWhenFocusTarget(false);
        BtnInfo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnInfo);
        BtnInfo.setBounds(680, 210, 190, 220);

        LSalamHome.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        LSalamHome.setText("SalamHome");
        jPanel1.add(LSalamHome);
        LSalamHome.setBounds(90, 170, 670, 23);

        LJam.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        LJam.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LJam);
        LJam.setBounds(870, 490, 80, 50);

        Footer1.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        Footer1.setForeground(new java.awt.Color(255, 255, 255));
        Footer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Footer1.setText("STASIUN SOLO BALAPAN");
        Footer1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Footer1);
        Footer1.setBounds(0, 490, 950, 30);

        Footer2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Footer2.setForeground(new java.awt.Color(255, 255, 255));
        Footer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Footer2.setText("JL. Walter Monginsidi No. 112 Kestalan, Banjarsari, Surakarta. Kode Pos 57133");
        Footer2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Footer2);
        Footer2.setBounds(0, 510, 960, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/bckgrnd2.png"))); // NOI18N
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

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
        // TODO add your handling code here:
        Info fu = new Info();
        fu.setVisible(true);
        fu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnInfoActionPerformed

    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
        // TODO add your handling code here:
        FormLogin fu = new FormLogin();
        fu.setVisible(true);
        fu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnLogoutActionPerformed

    private void BtnInfoJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoJadwalActionPerformed
        // TODO add your handling code here:
        FormInfoJadwal fu = new FormInfoJadwal();
        fu.setVisible(true);
        fu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnInfoJadwalActionPerformed

    private void BtnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTransaksiActionPerformed
        // TODO add your handling code here:
        FormTransaksi fu = new FormTransaksi();
        fu.setVisible(true);
        fu.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnTransaksiActionPerformed

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
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnInfoJadwal;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JButton BtnTransaksi;
    private javax.swing.JLabel Footer1;
    private javax.swing.JLabel Footer2;
    private javax.swing.JLabel LJam;
    private javax.swing.JLabel LSalamHome;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
