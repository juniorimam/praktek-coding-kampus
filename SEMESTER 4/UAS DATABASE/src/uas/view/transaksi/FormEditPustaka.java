package uas.view.transaksi;

import java.sql.Connection;
import uas.koneksi.Koneksi;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import uas.view.FormPustaka;

public class FormEditPustaka extends javax.swing.JFrame {
    
    String id;

    public FormEditPustaka(String id) {
        initComponents();
        this.id = id;
        Tampil();
    }
    
    private void Tampil(){
        LId.setText(id);
        
        Connection k =Koneksi.getKoneksi();
        String query= "SELECT judul, pengarang, penerbit, tahun, isbn, jumlah, jenis_buku, lokasi_rak From pustaka Where id="+ id;
        
        try {
            Statement stmt = k.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()){
            TFjudul.setText(rs.getString("judul"));
            TFpengarang.setText(rs.getString("pengarang"));
            TFpenerbit.setText(rs.getString("penerbit"));
            TFtahun.setText(rs.getString("tahun"));
            TFisbn.setText(rs.getString("isbn"));
            TFjumlah.setText(rs.getString("jumlah"));
            TFjenis_buku.setText(rs.getString("jenis_buku"));
            TFlokasi_rak.setText(rs.getString("lokasi_rak"));
            }
            rs.close();
        }catch(SQLException se){
           JOptionPane.showMessageDialog(null,"Terjadi Eror pada : "+se);
        }
    
    }
    private void Reset(){
        TFjudul.setText("");
        TFpengarang.setText("");
        TFpenerbit.setText("");
        TFtahun.setText("");
        TFisbn.setText("");
        TFjumlah.setText("");
        TFjenis_buku.setText("");
        TFlokasi_rak.setText("");
    }
    private void EditPustaka(String judul,String pengarang,String penerbit,String tahun, String isbn, int jumlah, String jenisbuku, String lokasirak){
           
        String query = "update pustaka set judul=?,pengarang=?,penerbit=?,tahun=?, isbn=?, jumlah=?, jenis_buku=?, lokasi_rak=? where id="+id;
        Connection k = Koneksi.getKoneksi();
        
        try{
            PreparedStatement patmt = k.prepareStatement(query);
            patmt.setString(1, judul);
            patmt.setString(2, pengarang);
            patmt.setString(3, penerbit);
            patmt.setString(4, tahun);
            patmt.setString(5, isbn);
            patmt.setInt(6, jumlah);
            patmt.setString(7, jenisbuku);
            patmt.setString(8, lokasirak);
            patmt.executeUpdate();
            this.dispose();
            
        
        } catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Terjadi eror pada : " +se);
        
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
        TFlokasi_rak = new javax.swing.JTextField();
        TFjenis_buku = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TFjudul = new javax.swing.JTextField();
        TFpengarang = new javax.swing.JTextField();
        TFpenerbit = new javax.swing.JTextField();
        TFtahun = new javax.swing.JTextField();
        TFisbn = new javax.swing.JTextField();
        TFjumlah = new javax.swing.JTextField();
        LId = new javax.swing.JLabel();
        IDpustaka = new javax.swing.JLabel();
        Judul = new javax.swing.JLabel();
        Pengarang = new javax.swing.JLabel();
        Penerbit = new javax.swing.JLabel();
        Tahun = new javax.swing.JLabel();
        isbn = new javax.swing.JLabel();
        Jumlah = new javax.swing.JLabel();
        jenis_buku = new javax.swing.JLabel();
        lokasi_rak = new javax.swing.JLabel();
        BtnSimpan = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        BtnKembali = new javax.swing.JButton();
        Footer1 = new javax.swing.JLabel();
        Footer2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(955, 536));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(955, 536));
        jPanel1.setMinimumSize(new java.awt.Dimension(955, 536));
        jPanel1.setLayout(null);
        jPanel1.add(TFlokasi_rak);
        TFlokasi_rak.setBounds(630, 370, 150, 30);
        jPanel1.add(TFjenis_buku);
        TFjenis_buku.setBounds(630, 330, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT PUSTAKA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 150, 960, 29);
        jPanel1.add(TFjudul);
        TFjudul.setBounds(310, 250, 150, 30);
        jPanel1.add(TFpengarang);
        TFpengarang.setBounds(310, 290, 150, 30);
        jPanel1.add(TFpenerbit);
        TFpenerbit.setBounds(310, 330, 150, 30);

        TFtahun.setToolTipText("Tahun / Bulan / Tanggal");
        jPanel1.add(TFtahun);
        TFtahun.setBounds(630, 210, 150, 30);
        jPanel1.add(TFisbn);
        TFisbn.setBounds(630, 250, 150, 30);
        jPanel1.add(TFjumlah);
        TFjumlah.setBounds(630, 290, 150, 30);

        LId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LId.setForeground(new java.awt.Color(255, 255, 255));
        LId.setText("id");
        jPanel1.add(LId);
        LId.setBounds(320, 210, 10, 30);

        IDpustaka.setBackground(new java.awt.Color(34, 51, 119));
        IDpustaka.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDpustaka.setForeground(new java.awt.Color(255, 255, 255));
        IDpustaka.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDpustaka.setText("   ID Pustaka");
        IDpustaka.setOpaque(true);
        jPanel1.add(IDpustaka);
        IDpustaka.setBounds(190, 210, 270, 30);

        Judul.setBackground(new java.awt.Color(34, 51, 119));
        Judul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Judul.setForeground(new java.awt.Color(255, 255, 255));
        Judul.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Judul.setText("   Judul");
        Judul.setOpaque(true);
        jPanel1.add(Judul);
        Judul.setBounds(190, 250, 270, 30);

        Pengarang.setBackground(new java.awt.Color(34, 51, 119));
        Pengarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pengarang.setForeground(new java.awt.Color(255, 255, 255));
        Pengarang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Pengarang.setText("  Pengarang");
        Pengarang.setOpaque(true);
        jPanel1.add(Pengarang);
        Pengarang.setBounds(190, 290, 270, 30);

        Penerbit.setBackground(new java.awt.Color(34, 51, 119));
        Penerbit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Penerbit.setForeground(new java.awt.Color(255, 255, 255));
        Penerbit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Penerbit.setText("  Penerbit");
        Penerbit.setOpaque(true);
        jPanel1.add(Penerbit);
        Penerbit.setBounds(190, 330, 270, 30);

        Tahun.setBackground(new java.awt.Color(34, 51, 119));
        Tahun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tahun.setForeground(new java.awt.Color(255, 255, 255));
        Tahun.setText("   Tahun");
        Tahun.setOpaque(true);
        jPanel1.add(Tahun);
        Tahun.setBounds(510, 210, 270, 30);

        isbn.setBackground(new java.awt.Color(34, 51, 119));
        isbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        isbn.setForeground(new java.awt.Color(255, 255, 255));
        isbn.setText("   ISBN");
        isbn.setOpaque(true);
        jPanel1.add(isbn);
        isbn.setBounds(510, 250, 270, 30);

        Jumlah.setBackground(new java.awt.Color(34, 51, 119));
        Jumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jumlah.setForeground(new java.awt.Color(255, 255, 255));
        Jumlah.setText("   Jumlah");
        Jumlah.setOpaque(true);
        jPanel1.add(Jumlah);
        Jumlah.setBounds(510, 290, 270, 30);

        jenis_buku.setBackground(new java.awt.Color(34, 51, 119));
        jenis_buku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jenis_buku.setForeground(new java.awt.Color(255, 255, 255));
        jenis_buku.setText("   Jenis Buku");
        jenis_buku.setOpaque(true);
        jPanel1.add(jenis_buku);
        jenis_buku.setBounds(510, 330, 270, 30);

        lokasi_rak.setBackground(new java.awt.Color(34, 51, 119));
        lokasi_rak.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lokasi_rak.setForeground(new java.awt.Color(255, 255, 255));
        lokasi_rak.setText("   Lokasi Rak");
        lokasi_rak.setOpaque(true);
        jPanel1.add(lokasi_rak);
        lokasi_rak.setBounds(510, 370, 270, 30);

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
        BtnSimpan.setBounds(340, 440, 110, 30);

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

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // TODO add your handling code here:
        FormPustaka awal = new FormPustaka();
        awal.setVisible(true);
        awal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:

        String judul = TFjudul.getText();
        String pengarang = TFpengarang.getText();
        String penerbit = TFpenerbit.getText();
        String tahun = TFtahun.getText();
        String isbn = TFisbn.getText();
        int jumlah = Integer.parseInt(TFjumlah.getText());
        String jenisbuku = TFjenis_buku.getText();
        String lokasirak = TFlokasi_rak.getText();

        EditPustaka(judul,pengarang,penerbit,tahun,isbn,jumlah,jenisbuku,lokasirak);

        FormPustaka awal = new FormPustaka();
        awal.setVisible(true);
        awal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(FormEditPustaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditPustaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditPustaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditPustaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditPustaka(null).setVisible(true);
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
    private javax.swing.JLabel IDpustaka;
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel Jumlah;
    private javax.swing.JLabel LId;
    private javax.swing.JLabel Penerbit;
    private javax.swing.JLabel Pengarang;
    private javax.swing.JTextField TFisbn;
    private javax.swing.JTextField TFjenis_buku;
    private javax.swing.JTextField TFjudul;
    private javax.swing.JTextField TFjumlah;
    private javax.swing.JTextField TFlokasi_rak;
    private javax.swing.JTextField TFpenerbit;
    private javax.swing.JTextField TFpengarang;
    private javax.swing.JTextField TFtahun;
    private javax.swing.JLabel Tahun;
    private javax.swing.JLabel isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jenis_buku;
    private javax.swing.JLabel lokasi_rak;
    // End of variables declaration//GEN-END:variables
}
