
package uas.view.transaksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uas.dao.Koneksi;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
import uas.view.FormInfoJadwal;

public class FormTambahJadwal extends javax.swing.JFrame {
    int idkereta;

    public FormTambahJadwal() {
        initComponents();
        TampilDefault();
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
    
    private void TampilDefault(){
        Connection k = Koneksi.getKoneksi();
        String query_kereta = "select idkereta from kereta order by idkereta Desc Limit 1";
        
        try {
              Statement stmt = k.createStatement();
              ResultSet rs = stmt.executeQuery(query_kereta);
              
              while (rs.next()){
                  int id_transaksi_baru = Integer.parseInt(rs.getString("idkereta"))+1;
                  String id_transaksi_baru_s = Integer.toString(id_transaksi_baru);
                  LId.setText(id_transaksi_baru_s);
                  
                  }
                  rs.close();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"Tejadi eror pada : " +se);
        }
    }
    
  private void TambahKereta(int idkereta_in,String kereta_in,String jeniskereta_in,String jurusan_in, String tanggal_in, String jamdatang_in, String jamberangkat_in){
      
        String query = "Insert into kereta(idkereta,kereta,jeniskereta,jurusan,tanggal,jamdatang,jamberangkat)"
                       +"Values(?,?,?,?,?,?,?)";
        Connection k =Koneksi.getKoneksi();
        
        try {
            PreparedStatement patmt = k.prepareStatement(query);
            patmt.setInt(1, idkereta_in);
            patmt.setString(2, kereta_in);
            patmt.setString(3, jeniskereta_in);
            patmt.setString(4, jurusan_in);
            patmt.setString(5, tanggal_in);
            patmt.setString(6, jamdatang_in);
            patmt.setString(7, jamberangkat_in);
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
        BtnSimpan = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        BtnKembali = new javax.swing.JButton();
        TFkereta = new javax.swing.JTextField();
        TFjeniskereta = new javax.swing.JTextField();
        TFjurusan = new javax.swing.JTextField();
        FormatTanggal = new javax.swing.JLabel();
        TFtanggal = new javax.swing.JTextField();
        TFjamdatang = new javax.swing.JTextField();
        TFjamberangkat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LId = new javax.swing.JLabel();
        KodeKereta = new javax.swing.JLabel();
        Kereta = new javax.swing.JLabel();
        JenisKereta = new javax.swing.JLabel();
        Jurusan = new javax.swing.JLabel();
        Tanggal = new javax.swing.JLabel();
        JamDatang = new javax.swing.JLabel();
        JamBerangkat = new javax.swing.JLabel();
        Footer1 = new javax.swing.JLabel();
        Footer2 = new javax.swing.JLabel();
        LJam = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(955, 536));
        setMinimumSize(new java.awt.Dimension(955, 536));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(955, 536));
        jPanel1.setMinimumSize(new java.awt.Dimension(955, 536));
        jPanel1.setLayout(null);

        BtnSimpan.setBackground(new java.awt.Color(42, 104, 177));
        BtnSimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        BtnSimpan.setText("Simpan");
        BtnSimpan.setContentAreaFilled(false);
        BtnSimpan.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnSimpan.setOpaque(true);
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSimpan);
        BtnSimpan.setBounds(340, 430, 90, 40);

        BtnReset.setBackground(new java.awt.Color(42, 104, 177));
        BtnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnReset.setForeground(new java.awt.Color(255, 255, 255));
        BtnReset.setText("Reset");
        BtnReset.setContentAreaFilled(false);
        BtnReset.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnReset.setOpaque(true);
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(BtnReset);
        BtnReset.setBounds(510, 430, 90, 40);

        BtnKembali.setBackground(new java.awt.Color(42, 104, 177));
        BtnKembali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnKembali.setForeground(new java.awt.Color(255, 255, 255));
        BtnKembali.setText("Kembali");
        BtnKembali.setContentAreaFilled(false);
        BtnKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnKembali.setDefaultCapable(false);
        BtnKembali.setFocusPainted(false);
        BtnKembali.setFocusable(false);
        BtnKembali.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnKembali.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnKembali.setOpaque(true);
        BtnKembali.setRequestFocusEnabled(false);
        BtnKembali.setSelected(true);
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(BtnKembali);
        BtnKembali.setBounds(830, 430, 90, 40);
        jPanel1.add(TFkereta);
        TFkereta.setBounds(310, 270, 150, 30);
        jPanel1.add(TFjeniskereta);
        TFjeniskereta.setBounds(310, 310, 150, 30);
        jPanel1.add(TFjurusan);
        TFjurusan.setBounds(310, 350, 150, 30);

        FormatTanggal.setBackground(new java.awt.Color(255, 255, 255));
        FormatTanggal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        FormatTanggal.setForeground(new java.awt.Color(204, 204, 204));
        FormatTanggal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FormatTanggal.setText("( Tahun / Bulan / Tanggal )");
        FormatTanggal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FormatTanggal.setEnabled(false);
        FormatTanggal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FormatTanggal.setInheritsPopupMenu(false);
        FormatTanggal.setRequestFocusEnabled(false);
        FormatTanggal.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(FormatTanggal);
        FormatTanggal.setBounds(630, 250, 150, 20);

        TFtanggal.setToolTipText("Tahun / Bulan / Tanggal");
        jPanel1.add(TFtanggal);
        TFtanggal.setBounds(630, 270, 150, 30);
        jPanel1.add(TFjamdatang);
        TFjamdatang.setBounds(630, 310, 150, 30);
        jPanel1.add(TFjamberangkat);
        TFjamberangkat.setBounds(630, 350, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TAMBAH JADWAL KERETA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 170, 960, 29);

        LId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LId.setForeground(new java.awt.Color(255, 255, 255));
        LId.setText("id");
        jPanel1.add(LId);
        LId.setBounds(320, 230, 10, 30);

        KodeKereta.setBackground(new java.awt.Color(255, 153, 0));
        KodeKereta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        KodeKereta.setForeground(new java.awt.Color(255, 255, 255));
        KodeKereta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KodeKereta.setText("   Kode Kereta");
        KodeKereta.setOpaque(true);
        jPanel1.add(KodeKereta);
        KodeKereta.setBounds(190, 230, 270, 30);

        Kereta.setBackground(new java.awt.Color(255, 153, 0));
        Kereta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Kereta.setForeground(new java.awt.Color(255, 255, 255));
        Kereta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Kereta.setText("   Kereta");
        Kereta.setOpaque(true);
        jPanel1.add(Kereta);
        Kereta.setBounds(190, 270, 270, 30);

        JenisKereta.setBackground(new java.awt.Color(255, 153, 0));
        JenisKereta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JenisKereta.setForeground(new java.awt.Color(255, 255, 255));
        JenisKereta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JenisKereta.setText("  Jenis Kereta");
        JenisKereta.setOpaque(true);
        jPanel1.add(JenisKereta);
        JenisKereta.setBounds(190, 310, 270, 30);

        Jurusan.setBackground(new java.awt.Color(255, 153, 0));
        Jurusan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jurusan.setForeground(new java.awt.Color(255, 255, 255));
        Jurusan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Jurusan.setText("  Jurusan");
        Jurusan.setOpaque(true);
        jPanel1.add(Jurusan);
        Jurusan.setBounds(190, 350, 270, 30);

        Tanggal.setBackground(new java.awt.Color(255, 153, 0));
        Tanggal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tanggal.setForeground(new java.awt.Color(255, 255, 255));
        Tanggal.setText("   Tanggal");
        Tanggal.setOpaque(true);
        jPanel1.add(Tanggal);
        Tanggal.setBounds(510, 270, 270, 30);

        JamDatang.setBackground(new java.awt.Color(255, 153, 0));
        JamDatang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JamDatang.setForeground(new java.awt.Color(255, 255, 255));
        JamDatang.setText("   Jam Datang");
        JamDatang.setOpaque(true);
        jPanel1.add(JamDatang);
        JamDatang.setBounds(510, 310, 270, 30);

        JamBerangkat.setBackground(new java.awt.Color(255, 153, 0));
        JamBerangkat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JamBerangkat.setForeground(new java.awt.Color(255, 255, 255));
        JamBerangkat.setText("   Jam Berangkat");
        JamBerangkat.setOpaque(true);
        jPanel1.add(JamBerangkat);
        JamBerangkat.setBounds(510, 350, 270, 30);

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

        LJam.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        LJam.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LJam);
        LJam.setBounds(870, 490, 80, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/bckgrnd2.png"))); // NOI18N
        Background.setText("jLabel10");
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
        
        int idkereta_in = Integer.parseInt(LId.getText());
        String kereta_in = TFkereta.getText();
        String jeniskereta_in = TFjeniskereta.getText();
        String jurusan_in = TFjurusan.getText();
        String tanggal_in = TFtanggal.getText();
        String jamdatang_in = TFjamdatang.getText();
        String jamberangkat_in = TFjamberangkat.getText();

        TambahKereta(idkereta_in,kereta_in,jeniskereta_in,jurusan_in,tanggal_in,jamdatang_in,jamberangkat_in);
        
        FormInfoJadwal fu = new FormInfoJadwal();
        fu.setVisible(true);
        fu.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // TODO add your handling code here:
        FormInfoJadwal fu = new FormInfoJadwal();
        fu.setVisible(true);
        fu.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed
    
    private void Reset() {
       
       TFkereta.setText("");
       TFjeniskereta.setText("");
       TFjurusan.setText("");
       TFtanggal.setText("");
       TFjamdatang.setText("");
       TFjamberangkat.setText("");
       
   }
    
    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_BtnResetActionPerformed

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
            java.util.logging.Logger.getLogger(FormTambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTambahJadwal().setVisible(true);
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
    private javax.swing.JLabel FormatTanggal;
    private javax.swing.JLabel JamBerangkat;
    private javax.swing.JLabel JamDatang;
    private javax.swing.JLabel JenisKereta;
    private javax.swing.JLabel Jurusan;
    private javax.swing.JLabel Kereta;
    private javax.swing.JLabel KodeKereta;
    private javax.swing.JLabel LId;
    private javax.swing.JLabel LJam;
    private javax.swing.JTextField TFjamberangkat;
    private javax.swing.JTextField TFjamdatang;
    private javax.swing.JTextField TFjeniskereta;
    private javax.swing.JTextField TFjurusan;
    private javax.swing.JTextField TFkereta;
    private javax.swing.JTextField TFtanggal;
    private javax.swing.JLabel Tanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
