
package uas.view.transaksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import uas.koneksi.Koneksi;
import java.sql.PreparedStatement;
import uas.view.FormAnggota;

public class FormTambahAnggota extends javax.swing.JFrame {
    int id;

    public FormTambahAnggota() {
        initComponents();
        Tampil();
    }
    
    private void Tampil(){
        Connection k = Koneksi.getKoneksi();
        String query_anggota = "select id from anggota order by id Desc Limit 1";
        
        try {
              Statement stmt = k.createStatement();
              ResultSet rs = stmt.executeQuery(query_anggota);
              
              while (rs.next()){
                  int id_anggota_baru = Integer.parseInt(rs.getString("id"))+1;
                  String id_anggota_baru_s = Integer.toString(id_anggota_baru);
                  LId.setText(id_anggota_baru_s);
                  }
                  rs.close();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"Tejadi eror pada : " +se);
        }
    }
    
  private void TambahAnggota(int id, String nim, String nama, String alamat, String jurusan, String telepon){
      
        String query = "Insert into anggota(id,nim,nama,alamat,jurusan,telepon)"
                       +"Values(?,?,?,?,?,?)";
        Connection k =Koneksi.getKoneksi();
        
        try {
            PreparedStatement patmt = k.prepareStatement(query);
            patmt.setInt(1, id);
            patmt.setString(2, nim);
            patmt.setString(3, nama);
            patmt.setString(4, alamat);
            patmt.setString(5, jurusan);
            patmt.setString(6, telepon);
            patmt.executeUpdate();
            this.dispose();

            
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"Terjadi eror pada : " +se);
        }
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
        jLabel1 = new javax.swing.JLabel();
        TFnim = new javax.swing.JTextField();
        nim = new javax.swing.JLabel();
        TFnama = new javax.swing.JTextField();
        TFalamat = new javax.swing.JTextField();
        TFjurusan = new javax.swing.JTextField();
        TFtelepon = new javax.swing.JTextField();
        LId = new javax.swing.JLabel();
        IDanggota = new javax.swing.JLabel();
        Judul = new javax.swing.JLabel();
        Pengarang = new javax.swing.JLabel();
        Tahun = new javax.swing.JLabel();
        isbn = new javax.swing.JLabel();
        BtnSimpan = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        BtnKembali = new javax.swing.JButton();
        Footer1 = new javax.swing.JLabel();
        Footer2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(955, 536));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(955, 536));
        jPanel1.setMinimumSize(new java.awt.Dimension(955, 536));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TAMBAH ANGGOTA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 140, 960, 29);

        TFnim.setToolTipText("");
        jPanel1.add(TFnim);
        TFnim.setBounds(310, 250, 150, 30);

        nim.setBackground(new java.awt.Color(34, 51, 119));
        nim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nim.setForeground(new java.awt.Color(255, 255, 255));
        nim.setText("   NIM");
        nim.setOpaque(true);
        jPanel1.add(nim);
        nim.setBounds(190, 250, 270, 30);
        jPanel1.add(TFnama);
        TFnama.setBounds(310, 290, 150, 30);
        jPanel1.add(TFalamat);
        TFalamat.setBounds(310, 330, 150, 30);

        TFjurusan.setToolTipText("");
        jPanel1.add(TFjurusan);
        TFjurusan.setBounds(630, 250, 150, 30);
        jPanel1.add(TFtelepon);
        TFtelepon.setBounds(630, 290, 150, 30);

        LId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LId.setForeground(new java.awt.Color(255, 255, 255));
        LId.setText("id");
        jPanel1.add(LId);
        LId.setBounds(320, 210, 140, 30);

        IDanggota.setBackground(new java.awt.Color(34, 51, 119));
        IDanggota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDanggota.setForeground(new java.awt.Color(255, 255, 255));
        IDanggota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDanggota.setText("   ID Anggota");
        IDanggota.setOpaque(true);
        jPanel1.add(IDanggota);
        IDanggota.setBounds(190, 210, 270, 30);

        Judul.setBackground(new java.awt.Color(34, 51, 119));
        Judul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Judul.setForeground(new java.awt.Color(255, 255, 255));
        Judul.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Judul.setText("   Nama");
        Judul.setOpaque(true);
        jPanel1.add(Judul);
        Judul.setBounds(190, 290, 270, 30);

        Pengarang.setBackground(new java.awt.Color(34, 51, 119));
        Pengarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pengarang.setForeground(new java.awt.Color(255, 255, 255));
        Pengarang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Pengarang.setText("  Alamat");
        Pengarang.setOpaque(true);
        jPanel1.add(Pengarang);
        Pengarang.setBounds(190, 330, 270, 30);

        Tahun.setBackground(new java.awt.Color(34, 51, 119));
        Tahun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tahun.setForeground(new java.awt.Color(255, 255, 255));
        Tahun.setText("   Jurusan");
        Tahun.setOpaque(true);
        jPanel1.add(Tahun);
        Tahun.setBounds(510, 250, 270, 30);

        isbn.setBackground(new java.awt.Color(34, 51, 119));
        isbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        isbn.setForeground(new java.awt.Color(255, 255, 255));
        isbn.setText("   No. Telp");
        isbn.setOpaque(true);
        jPanel1.add(isbn);
        isbn.setBounds(510, 290, 270, 30);

        BtnSimpan.setBackground(new java.awt.Color(42, 104, 177));
        BtnSimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        BtnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/simpan.png"))); // NOI18N
        BtnSimpan.setBorderPainted(false);
        BtnSimpan.setContentAreaFilled(false);
        BtnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSimpan.setFocusPainted(false);
        BtnSimpan.setFocusable(false);
        BtnSimpan.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSimpan);
        BtnSimpan.setBounds(330, 440, 110, 30);

        BtnReset.setBackground(new java.awt.Color(42, 104, 177));
        BtnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnReset.setForeground(new java.awt.Color(255, 255, 255));
        BtnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/reset.png"))); // NOI18N
        BtnReset.setBorderPainted(false);
        BtnReset.setContentAreaFilled(false);
        BtnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnReset.setFocusPainted(false);
        BtnReset.setFocusable(false);
        BtnReset.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(BtnReset);
        BtnReset.setBounds(500, 440, 100, 30);

        BtnKembali.setBackground(new java.awt.Color(42, 104, 177));
        BtnKembali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnKembali.setForeground(new java.awt.Color(255, 255, 255));
        BtnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/kembali.png"))); // NOI18N
        BtnKembali.setBorderPainted(false);
        BtnKembali.setContentAreaFilled(false);
        BtnKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnKembali.setDefaultCapable(false);
        BtnKembali.setFocusPainted(false);
        BtnKembali.setFocusable(false);
        BtnKembali.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnKembali.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnKembali.setRequestFocusEnabled(false);
        BtnKembali.setSelected(true);
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(BtnKembali);
        BtnKembali.setBounds(800, 440, 120, 30);

        Footer1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Footer1.setForeground(new java.awt.Color(255, 255, 255));
        Footer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Footer1.setText("STMIK SINAR NUSANTARA");
        Footer1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Footer1);
        Footer1.setBounds(0, 490, 950, 30);

        Footer2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Footer2.setForeground(new java.awt.Color(255, 255, 255));
        Footer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Footer2.setText("Jl. KH Samanhudi 84-86, Laweyan, Surakarta, Jawa Tengah - Indonesia 57142");
        Footer2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Footer2);
        Footer2.setBounds(0, 510, 960, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/bg.jpg"))); // NOI18N
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        
        int id = Integer.parseInt(LId.getText());
        String nim = TFnim.getText();
        String nama = TFnama.getText();
        String alamat = TFalamat.getText();
        String jurusan = TFjurusan.getText();
        String telepon = TFtelepon.getText();

        TambahAnggota(id,nim,nama,alamat,jurusan,telepon);

        FormAnggota awal = new FormAnggota();
        awal.setVisible(true);
        awal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // TODO add your handling code here:
        FormAnggota awal = new FormAnggota();
        awal.setVisible(true);
        awal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed
    
    private void Reset(){
        TFnama.setText("");
        TFalamat.setText("");
        TFjurusan.setText("");
        TFtelepon.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(FormTambahAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTambahAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTambahAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTambahAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTambahAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JLabel Footer1;
    private javax.swing.JLabel Footer2;
    private javax.swing.JLabel IDanggota;
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel LId;
    private javax.swing.JLabel Pengarang;
    private javax.swing.JTextField TFalamat;
    private javax.swing.JTextField TFjurusan;
    private javax.swing.JTextField TFnama;
    private javax.swing.JTextField TFnim;
    private javax.swing.JTextField TFtelepon;
    private javax.swing.JLabel Tahun;
    private javax.swing.JLabel isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nim;
    // End of variables declaration//GEN-END:variables
}
