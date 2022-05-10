
package uas.view.transaksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uas.dao.Koneksi;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.Timer;
import uas.view.FormTransaksi;


public class FormTambahTransaksi extends javax.swing.JFrame {
    protected String idkereta,idpemesan,idpetugas;
  

    public FormTambahTransaksi() {
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
    
    void IdKereta(){
        FormIdKereta fia = new FormIdKereta();
        TFidkereta.setText(idkereta);
    }
    void IdPemesan(){
        FormIdPemesan fia = new FormIdPemesan();
        TFidpemesan.setText(idpemesan);
    }
    void IdPetugas(){
        FormIdPetugas fia = new FormIdPetugas();
        TFidpetugas.setText(idpetugas);
    }
    
    private void TampilDefault(){
        Connection k = Koneksi.getKoneksi();
        String query_transaksi = "select idtransaksi from transaksi order by idtransaksi Desc Limit 1";
        
        try {
              Statement stmt = k.createStatement();
              ResultSet rs = stmt.executeQuery(query_transaksi);
              
              while (rs.next()){
                  int id_transaksi_baru = Integer.parseInt(rs.getString("idtransaksi"))+1;
                  String id_transaksi_baru_s = Integer.toString(id_transaksi_baru);
                  LId.setText(id_transaksi_baru_s);
                  
                  }
                  rs.close();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"Terjadi error pada : " +se);
        }
    }
    
  private void TambahTransaksi(int idkereta_in,int idpemesan_in,int idpetugas_in,int harga_tiket_in, int jumlah_tiket_in, int total_bayar_in, String status_in){
      
        String query = "Insert into transaksi(idkereta,idpemesan,idpetugas,harga_tiket,jumlah_tiket,total_bayar,status)"
                       +"Values(?,?,?,?,?,?,?)";
        Connection k =Koneksi.getKoneksi();
        
        try {
            PreparedStatement patmt = k.prepareStatement(query);
            patmt.setInt(1, idkereta_in);
            patmt.setInt(2, idpemesan_in);
            patmt.setInt(3, idpetugas_in);
            patmt.setInt(4, harga_tiket_in);
            patmt.setInt(5, jumlah_tiket_in);
            patmt.setInt(6, total_bayar_in);
            patmt.setString(7, status_in);
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
        BtnLihatIDKereta = new javax.swing.JButton();
        BtnLihatIDPemesan = new javax.swing.JButton();
        BtnLihatIDPetugas = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        BtnTmbhJadwalKembali = new javax.swing.JButton();
        BtnSimpan = new javax.swing.JButton();
        TFidkereta = new javax.swing.JTextField();
        TFidpemesan = new javax.swing.JTextField();
        TFidpetugas = new javax.swing.JTextField();
        TFhargatiket = new javax.swing.JTextField();
        TFjumlahtiket = new javax.swing.JTextField();
        TFtotalbayar = new javax.swing.JTextField();
        TFstatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LId = new javax.swing.JLabel();
        idtransaksi = new javax.swing.JLabel();
        IDKereta = new javax.swing.JLabel();
        IDPemesan = new javax.swing.JLabel();
        IDPetugas = new javax.swing.JLabel();
        HargaTiket = new javax.swing.JLabel();
        JumlahTiket = new javax.swing.JLabel();
        TotalBayar = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        Footer1 = new javax.swing.JLabel();
        Footer2 = new javax.swing.JLabel();
        LJam = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(955, 536));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(955, 536));
        jPanel1.setMinimumSize(new java.awt.Dimension(955, 536));
        jPanel1.setLayout(null);

        BtnLihatIDKereta.setBackground(new java.awt.Color(42, 104, 177));
        BtnLihatIDKereta.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnLihatIDKereta.setForeground(new java.awt.Color(255, 255, 255));
        BtnLihatIDKereta.setText("Lihat ID");
        BtnLihatIDKereta.setContentAreaFilled(false);
        BtnLihatIDKereta.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnLihatIDKereta.setOpaque(true);
        BtnLihatIDKereta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLihatIDKeretaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLihatIDKereta);
        BtnLihatIDKereta.setBounds(420, 250, 60, 30);

        BtnLihatIDPemesan.setBackground(new java.awt.Color(42, 104, 177));
        BtnLihatIDPemesan.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnLihatIDPemesan.setForeground(new java.awt.Color(255, 255, 255));
        BtnLihatIDPemesan.setText("Lihat ID");
        BtnLihatIDPemesan.setContentAreaFilled(false);
        BtnLihatIDPemesan.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnLihatIDPemesan.setOpaque(true);
        BtnLihatIDPemesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLihatIDPemesanActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLihatIDPemesan);
        BtnLihatIDPemesan.setBounds(420, 290, 60, 30);

        BtnLihatIDPetugas.setBackground(new java.awt.Color(42, 104, 177));
        BtnLihatIDPetugas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnLihatIDPetugas.setForeground(new java.awt.Color(255, 255, 255));
        BtnLihatIDPetugas.setText("Lihat ID");
        BtnLihatIDPetugas.setContentAreaFilled(false);
        BtnLihatIDPetugas.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnLihatIDPetugas.setOpaque(true);
        BtnLihatIDPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLihatIDPetugasActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLihatIDPetugas);
        BtnLihatIDPetugas.setBounds(420, 330, 60, 30);

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

        BtnTmbhJadwalKembali.setBackground(new java.awt.Color(42, 104, 177));
        BtnTmbhJadwalKembali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnTmbhJadwalKembali.setForeground(new java.awt.Color(255, 255, 255));
        BtnTmbhJadwalKembali.setText("Kembali");
        BtnTmbhJadwalKembali.setContentAreaFilled(false);
        BtnTmbhJadwalKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTmbhJadwalKembali.setDefaultCapable(false);
        BtnTmbhJadwalKembali.setFocusPainted(false);
        BtnTmbhJadwalKembali.setFocusable(false);
        BtnTmbhJadwalKembali.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTmbhJadwalKembali.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnTmbhJadwalKembali.setOpaque(true);
        BtnTmbhJadwalKembali.setRequestFocusEnabled(false);
        BtnTmbhJadwalKembali.setSelected(true);
        BtnTmbhJadwalKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTmbhJadwalKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTmbhJadwalKembali);
        BtnTmbhJadwalKembali.setBounds(830, 430, 90, 40);

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
        jPanel1.add(TFidkereta);
        TFidkereta.setBounds(270, 250, 150, 30);
        jPanel1.add(TFidpemesan);
        TFidpemesan.setBounds(270, 290, 150, 30);
        jPanel1.add(TFidpetugas);
        TFidpetugas.setBounds(270, 330, 150, 30);
        jPanel1.add(TFhargatiket);
        TFhargatiket.setBounds(640, 210, 150, 30);

        TFjumlahtiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFjumlahtiketActionPerformed(evt);
            }
        });
        jPanel1.add(TFjumlahtiket);
        TFjumlahtiket.setBounds(640, 250, 150, 30);
        jPanel1.add(TFtotalbayar);
        TFtotalbayar.setBounds(640, 290, 150, 30);
        jPanel1.add(TFstatus);
        TFstatus.setBounds(640, 330, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TAMBAH TRANSAKSI");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 150, 960, 29);

        LId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LId.setForeground(new java.awt.Color(255, 255, 255));
        LId.setText("id");
        jPanel1.add(LId);
        LId.setBounds(280, 210, 110, 30);

        idtransaksi.setBackground(new java.awt.Color(255, 153, 0));
        idtransaksi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idtransaksi.setForeground(new java.awt.Color(255, 255, 255));
        idtransaksi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idtransaksi.setText("   ID Transaksi");
        idtransaksi.setOpaque(true);
        jPanel1.add(idtransaksi);
        idtransaksi.setBounds(150, 210, 270, 30);

        IDKereta.setBackground(new java.awt.Color(255, 153, 0));
        IDKereta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDKereta.setForeground(new java.awt.Color(255, 255, 255));
        IDKereta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDKereta.setText("   ID Kereta");
        IDKereta.setOpaque(true);
        jPanel1.add(IDKereta);
        IDKereta.setBounds(150, 250, 270, 30);

        IDPemesan.setBackground(new java.awt.Color(255, 153, 0));
        IDPemesan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDPemesan.setForeground(new java.awt.Color(255, 255, 255));
        IDPemesan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDPemesan.setText("   ID Pemesan");
        IDPemesan.setOpaque(true);
        jPanel1.add(IDPemesan);
        IDPemesan.setBounds(150, 290, 270, 30);

        IDPetugas.setBackground(new java.awt.Color(255, 153, 0));
        IDPetugas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDPetugas.setForeground(new java.awt.Color(255, 255, 255));
        IDPetugas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDPetugas.setText("   ID Petugas");
        IDPetugas.setOpaque(true);
        jPanel1.add(IDPetugas);
        IDPetugas.setBounds(150, 330, 270, 30);

        HargaTiket.setBackground(new java.awt.Color(255, 153, 0));
        HargaTiket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HargaTiket.setForeground(new java.awt.Color(255, 255, 255));
        HargaTiket.setText("   Harga Tiket");
        HargaTiket.setOpaque(true);
        jPanel1.add(HargaTiket);
        HargaTiket.setBounds(520, 210, 270, 30);

        JumlahTiket.setBackground(new java.awt.Color(255, 153, 0));
        JumlahTiket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JumlahTiket.setForeground(new java.awt.Color(255, 255, 255));
        JumlahTiket.setText("   Jumlah Tiket");
        JumlahTiket.setOpaque(true);
        jPanel1.add(JumlahTiket);
        JumlahTiket.setBounds(520, 250, 270, 30);

        TotalBayar.setBackground(new java.awt.Color(255, 153, 0));
        TotalBayar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TotalBayar.setForeground(new java.awt.Color(255, 255, 255));
        TotalBayar.setText("   Total Bayar");
        TotalBayar.setOpaque(true);
        jPanel1.add(TotalBayar);
        TotalBayar.setBounds(520, 290, 270, 30);

        Status.setBackground(new java.awt.Color(255, 153, 0));
        Status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 255));
        Status.setText("   Status");
        Status.setOpaque(true);
        jPanel1.add(Status);
        Status.setBounds(520, 330, 270, 30);

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

    private void BtnLihatIDPemesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLihatIDPemesanActionPerformed
        // TODO add your handling code here:
        FormIdPemesan fia = new FormIdPemesan();
        fia.setVisible(true);
        fia.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_BtnLihatIDPemesanActionPerformed

    private void BtnTmbhJadwalKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTmbhJadwalKembaliActionPerformed
        // TODO add your handling code here:
        FormTransaksi fu = new FormTransaksi();
        fu.setVisible(true);
        fu.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnTmbhJadwalKembaliActionPerformed
    
    private void Reset() {
       
       TFidkereta.setText("");
       TFidpemesan.setText("");
       TFidpetugas.setText("");
       TFhargatiket.setText("");
       TFjumlahtiket.setText("");
       TFtotalbayar.setText("");
       TFstatus.setText("");
       
   }
    
    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        int idkereta_in = Integer.parseInt(TFidkereta.getText());
        int idpemesan_in = Integer.parseInt(TFidpemesan.getText());
        int idpetugas_in = Integer.parseInt(TFidpetugas.getText());
        int harga_tiket_in = Integer.parseInt(TFhargatiket.getText());
        int jumlah_tiket_in = Integer.parseInt(TFjumlahtiket.getText());
        int total_bayar_in = Integer.parseInt(TFtotalbayar.getText());
        String status_in = TFstatus.getText();

        TambahTransaksi(idkereta_in,idpemesan_in,idpetugas_in,harga_tiket_in,jumlah_tiket_in,total_bayar_in,status_in);
        
        FormTransaksi fu = new FormTransaksi();
        fu.setVisible(true);
        fu.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnLihatIDKeretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLihatIDKeretaActionPerformed
        // TODO add your handling code here:
        FormIdKereta fia = new FormIdKereta();
        fia.setVisible(true);
        fia.setLocationRelativeTo(null);
    }//GEN-LAST:event_BtnLihatIDKeretaActionPerformed

    private void BtnLihatIDPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLihatIDPetugasActionPerformed
        // TODO add your handling code here:
        FormIdPetugas fia = new FormIdPetugas();
        fia.setVisible(true);
        fia.setLocationRelativeTo(null);
    }//GEN-LAST:event_BtnLihatIDPetugasActionPerformed

    private void TFjumlahtiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFjumlahtiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFjumlahtiketActionPerformed

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
            java.util.logging.Logger.getLogger(FormTambahTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTambahTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTambahTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTambahTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTambahTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnLihatIDKereta;
    private javax.swing.JButton BtnLihatIDPemesan;
    private javax.swing.JButton BtnLihatIDPetugas;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnTmbhJadwalKembali;
    private javax.swing.JLabel Footer1;
    private javax.swing.JLabel Footer2;
    private javax.swing.JLabel HargaTiket;
    private javax.swing.JLabel IDKereta;
    private javax.swing.JLabel IDPemesan;
    private javax.swing.JLabel IDPetugas;
    private javax.swing.JLabel JumlahTiket;
    private javax.swing.JLabel LId;
    private javax.swing.JLabel LJam;
    private javax.swing.JLabel Status;
    private javax.swing.JTextField TFhargatiket;
    private javax.swing.JTextField TFidkereta;
    private javax.swing.JTextField TFidpemesan;
    private javax.swing.JTextField TFidpetugas;
    private javax.swing.JTextField TFjumlahtiket;
    private javax.swing.JTextField TFstatus;
    private javax.swing.JTextField TFtotalbayar;
    private javax.swing.JLabel TotalBayar;
    private javax.swing.JLabel idtransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
