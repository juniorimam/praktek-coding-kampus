
package uas.view;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import uas.koneksi.Koneksi;
// Import Table Model untuk membuat tabel db
import javax.swing.table.DefaultTableModel;

// import joptionpane untuk notifikasi
import javax.swing.JOptionPane;
import uas.view.transaksi.FormEditPeminjaman;
import uas.view.transaksi.FormTambahPeminjaman;

public class FormPeminjaman extends javax.swing.JFrame {

    public FormPeminjaman() {
        initComponents();
        TampilTblPeminjaman();
    }

    //-----------------------------------------------------------------//
    /*
    FUNGSI UNTUK MENAMPILKAN TABEL TRANSAKSI
    */
    private void TampilTblPeminjaman() {
        
        // buat model untuk tabel
        // sebagai wadah dari kolom dan baris
        DefaultTableModel dtm = new DefaultTableModel();
        
        // isi judul kolom
        dtm.addColumn("ID Peminjaman");
        dtm.addColumn("ID Pustaka");
        dtm.addColumn("ID Anggota");
        dtm.addColumn("ID Petugas");
        dtm.addColumn("Tanggal Pinjam");
        dtm.addColumn("Tanggal Harus Kembali");
        dtm.addColumn("Tanggal Kembali");
        dtm.addColumn("Denda");
        dtm.addColumn("Status");
        
        // masukkan kolom tadi ke table model
        // table model diberi nama
        // ke object yg ada di design
        TblPeminjaman.setModel(dtm);
        
        // panggil koneksi
        Connection k = Koneksi.getKoneksi();
        
        // buat query
        String query = "SELECT * FROM peminjaman ORDER BY id ASC ";
        
        
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
                        
                        rs.getString("id"),
                        rs.getString("id_pustaka"),
                        rs.getString("id_anggota"),
                        rs.getString("id_petugas"),
                        rs.getString("tgl_pinjam"),
                        rs.getString("tgl_hrs_kembali"),
                        rs.getString("tgl_kembali"),
                        rs.getString("denda"),
                        rs.getString("status"),
                        
                    }
                        
                );
                
            }
            
            
        } catch (SQLException se) {
            
            JOptionPane.showMessageDialog(null, "Terjadi error pada: " + se);
            
        }
        
    }
    private void HapusPeminjaman(String id) {
         //pertanyaan
         int ya = JOptionPane.showConfirmDialog(null,"Apakah Anda yakin Menghapus data peminjaman dengan id "+id+"?","Konfirmasi",JOptionPane.YES_NO_OPTION);
         
         if (ya == 0 ) {
             try {
                 Connection k = Koneksi.getKoneksi();
                 String query ="DELETE FROM peminjaman WHERE id=" + id;
                 
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
        TblPeminjaman = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BtnTambah = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnKembali = new javax.swing.JButton();
        Footer1 = new javax.swing.JLabel();
        Footer2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(955, 536));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(955, 536));
        jPanel1.setMinimumSize(new java.awt.Dimension(955, 536));
        jPanel1.setLayout(null);

        TblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TblPeminjaman);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 190, 860, 240);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Peminjaman Buku Perpustakaan");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 130, 960, 40);

        BtnTambah.setBackground(new java.awt.Color(42, 104, 177));
        BtnTambah.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BtnTambah.setForeground(new java.awt.Color(255, 255, 255));
        BtnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/tambah.png"))); // NOI18N
        BtnTambah.setBorderPainted(false);
        BtnTambah.setContentAreaFilled(false);
        BtnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTambah.setFocusPainted(false);
        BtnTambah.setFocusable(false);
        BtnTambah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTambah.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTambah);
        BtnTambah.setBounds(50, 450, 119, 30);

        BtnEdit.setBackground(new java.awt.Color(42, 104, 177));
        BtnEdit.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BtnEdit.setForeground(new java.awt.Color(255, 255, 255));
        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/edit.png"))); // NOI18N
        BtnEdit.setBorderPainted(false);
        BtnEdit.setContentAreaFilled(false);
        BtnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEdit.setFocusPainted(false);
        BtnEdit.setFocusable(false);
        BtnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEdit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEdit);
        BtnEdit.setBounds(180, 450, 86, 30);

        BtnHapus.setBackground(new java.awt.Color(42, 104, 177));
        BtnHapus.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BtnHapus.setForeground(new java.awt.Color(255, 255, 255));
        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/hapus.png"))); // NOI18N
        BtnHapus.setBorderPainted(false);
        BtnHapus.setContentAreaFilled(false);
        BtnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnHapus.setFocusPainted(false);
        BtnHapus.setFocusable(false);
        BtnHapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnHapus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(BtnHapus);
        BtnHapus.setBounds(280, 450, 111, 30);

        BtnKembali.setBackground(new java.awt.Color(42, 104, 177));
        BtnKembali.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
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
        BtnKembali.setBounds(790, 450, 120, 30);

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

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // TODO add your handling code here:
        Home awal = new Home();
        awal.setVisible(true);
        awal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // TODO add your handling code here:
        int baris = TblPeminjaman.getSelectedRow();
        String id = (String) TblPeminjaman.getValueAt(baris, 0);
        
        FormEditPeminjaman edit = new FormEditPeminjaman (id);
        edit.setVisible(true);
        edit.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        int baris = TblPeminjaman.getSelectedRow();
        String id = (String) TblPeminjaman.getValueAt(baris, 0);
        HapusPeminjaman(id);
        TampilTblPeminjaman();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        // TODO add your handling code here:
        FormTambahPeminjaman tambah = new FormTambahPeminjaman();
        tambah.setVisible(true);
        tambah.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnTambahActionPerformed

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
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FormPeminjaman().setVisible(true);
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
    private javax.swing.JTable TblPeminjaman;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
