
package uas.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import uas.dao.Koneksi;
// Import Table Model untuk membuat tabel db
import javax.swing.table.DefaultTableModel;
import uas.dao.Session;

// import joptionpane untuk notifikasi
import javax.swing.JOptionPane;
import javax.swing.Timer;
import uas.view.transaksi.FormEditJadwalKereta;
import uas.view.transaksi.FormTambahJadwal;

public class FormInfoJadwal extends javax.swing.JFrame {

    public FormInfoJadwal() {
        initComponents();
        TampilTblKereta();
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
    
    //-----------------------------------------------------------------//
    /*
    FUNGSI UNTUK MENAMPILKAN TABEL
    */
    private void TampilTblKereta() {
        
        // buat model untuk tabel
        // sebagai wadah dari kolom dan baris
        DefaultTableModel dtm = new DefaultTableModel();
        
        // isi judul kolom
        dtm.addColumn("Kode Kereta");
        dtm.addColumn("Kereta");
        dtm.addColumn("Jenis Kereta");
        dtm.addColumn("Jurusan");
        dtm.addColumn("Tanggal");
        dtm.addColumn("Jam Datang");
        dtm.addColumn("Jam Berangkat");
        
        // masukkan kolom tadi ke table model
        // table model diberi nama
        // ke object yg ada di design
        TblKereta.setModel(dtm);
        
        // panggil koneksi
        Connection k = Koneksi.getKoneksi();
        
        // buat query
        String query = "SELECT * FROM kereta ORDER BY idkereta ASC ";
        
        
        // eksekusi query tadi
        try {
            
            Statement stmt = k.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                
                // tambahkan baris
                dtm.addRow(
                    
                    // ganti dengan object
                    // hasil query
                    new Object[] {
                        
                        rs.getString("idkereta"),
                        rs.getString("kereta"),
                        rs.getString("jeniskereta"),
                        rs.getString("jurusan"),
                        rs.getString("tanggal"),
                        rs.getString("jamdatang"),
                        rs.getString("jamberangkat"),
                        
                    }
                        
                );
                
            }
            
            
        } catch (SQLException se) {
            
            JOptionPane.showMessageDialog(null, "Terjadi error pada: " + se);
            
        }
        
    }
    private void HapusTransaksi(String idkereta) {
         //pertanyaan
         int ya = JOptionPane.showConfirmDialog(null,"Apakah Anda yakin Menghapus transaksi dengan id "+idkereta+"?","Konfirmasi",JOptionPane.YES_NO_OPTION);
         
         if (ya == 0 ) {
             try {
                 Connection k = Koneksi.getKoneksi();
                 String query ="DELETE FROM kereta WHERE idkereta=" + idkereta;
                 
                 Statement stmt = k.createStatement();
                 stmt.executeUpdate(query);
                 
                 JOptionPane.showMessageDialog(null,"Data Telah Dihapus .");
                 stmt.close();
             }catch(SQLException se){
                  JOptionPane.showMessageDialog(null,"Terjadi eror pada :"+ se);
                  
             }
         }
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblKereta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Footer1 = new javax.swing.JLabel();
        Footer2 = new javax.swing.JLabel();
        BtnTambah = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnKembali = new javax.swing.JButton();
        LJam = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(955, 536));
        setMinimumSize(new java.awt.Dimension(955, 536));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(955, 536));
        jPanel1.setMinimumSize(new java.awt.Dimension(955, 536));
        jPanel1.setLayout(null);

        TblKereta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TblKereta);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 210, 860, 220);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Info Jadwal Kereta Api Stasiun Solo Balapan");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 150, 960, 50);

        Footer1.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        Footer1.setForeground(new java.awt.Color(255, 255, 255));
        Footer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Footer1.setText("STASIUN SOLO BALAPAN");
        Footer1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Footer1);
        Footer1.setBounds(0, 490, 960, 30);

        Footer2.setFont(new java.awt.Font("Tw Cen MT", 2, 12)); // NOI18N
        Footer2.setForeground(new java.awt.Color(255, 255, 255));
        Footer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Footer2.setText("JL. Walter Monginsidi No. 112 Kestalan, Banjarsari, Surakarta. Kode Pos 57133");
        Footer2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Footer2);
        Footer2.setBounds(0, 514, 960, 20);

        BtnTambah.setBackground(new java.awt.Color(42, 104, 177));
        BtnTambah.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BtnTambah.setForeground(new java.awt.Color(255, 255, 255));
        BtnTambah.setText("Tambah");
        BtnTambah.setContentAreaFilled(false);
        BtnTambah.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnTambah.setOpaque(true);
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTambah);
        BtnTambah.setBounds(50, 450, 70, 30);

        BtnEdit.setBackground(new java.awt.Color(42, 104, 177));
        BtnEdit.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BtnEdit.setForeground(new java.awt.Color(255, 255, 255));
        BtnEdit.setText("Edit");
        BtnEdit.setContentAreaFilled(false);
        BtnEdit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnEdit.setOpaque(true);
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEdit);
        BtnEdit.setBounds(140, 450, 70, 30);

        BtnHapus.setBackground(new java.awt.Color(42, 104, 177));
        BtnHapus.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BtnHapus.setForeground(new java.awt.Color(255, 255, 255));
        BtnHapus.setText("Hapus");
        BtnHapus.setContentAreaFilled(false);
        BtnHapus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnHapus.setOpaque(true);
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(BtnHapus);
        BtnHapus.setBounds(230, 450, 70, 30);

        BtnKembali.setBackground(new java.awt.Color(42, 104, 177));
        BtnKembali.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
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
        BtnKembali.setBounds(840, 450, 70, 30);

        LJam.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        LJam.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LJam);
        LJam.setBounds(870, 490, 80, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/bckgrnd2.png"))); // NOI18N
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

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        // TODO add your handling code here:
        FormTambahJadwal ftt = new FormTambahJadwal();
        ftt.setVisible(true);
        ftt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // TODO add your handling code here:
        Home fu = new Home();
        fu.setVisible(true);
        fu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // TODO add your handling code here:
        int baris = TblKereta.getSelectedRow();
        String idkereta = (String) TblKereta.getValueAt(baris, 0);
        
        FormEditJadwalKereta fet = new FormEditJadwalKereta (idkereta);
        fet.setVisible(true);
        fet.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        int baris = TblKereta.getSelectedRow();
        String idkereta = (String) TblKereta.getValueAt(baris, 0);
        HapusTransaksi(idkereta);
        TampilTblKereta();
    }//GEN-LAST:event_BtnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(FormInfoJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInfoJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInfoJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInfoJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInfoJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JLabel Footer1;
    private javax.swing.JLabel Footer2;
    private javax.swing.JLabel LJam;
    private javax.swing.JTable TblKereta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
