
package uas.view.transaksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import uas.koneksi.Koneksi;
import uas.view.FormPeminjaman;


public class FormEditPeminjaman extends javax.swing.JFrame {
    
        String id;

    public FormEditPeminjaman(String id) {
        initComponents();
        this.id = id;
        Tampil();
    }

    private void Tampil(){
        LId.setText(id);
        
        Connection k =Koneksi.getKoneksi();
        String query= "SELECT id, id_pustaka, id_anggota, id_petugas, tgl_pinjam, tgl_hrs_kembali, tgl_kembali, denda, status From peminjaman Where id="+ id;
        
        try {
            Statement stmt = k.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()){
            TFid_pustaka.setText(rs.getString("id_pustaka"));
            TFid_anggota.setText(rs.getString("id_anggota"));
            TFid_petugas.setText(rs.getString("id_petugas"));
            TFtgl_pinjam.setText(rs.getString("tgl_pinjam"));
            TFtgl_hrs_kembali.setText(rs.getString("tgl_hrs_kembali"));
            TFtgl_kembali.setText(rs.getString("tgl_kembali"));
            TFdenda.setText(rs.getString("denda"));
            TFstatus.setText(rs.getString("status"));
            }
            rs.close();
        }catch(SQLException se){
           JOptionPane.showMessageDialog(null,"Terjadi Eror pada : "+se);
        }
    
    }
    private void Reset(){
        TFid_pustaka.setText("");
        TFid_anggota.setText("");
        TFid_petugas.setText("");
        TFtgl_pinjam.setText("");
        TFtgl_hrs_kembali.setText("");
        TFtgl_kembali.setText("");
        TFdenda.setText("");
        TFstatus.setText("");
    }
    private void EditTransaksi(int id_pustaka,int id_anggota,int id_petugas, String tgl_pinjam, String tgl_hrs_kembali, String tgl_kembali, int denda, String status){
           
        String query = "update peminjaman set id_pustaka=?,id_anggota=?, id_petugas=?, tgl_pinjam=?, tgl_hrs_kembali=?, tgl_kembali=?, denda=?, status=? where id="+id;
        Connection k = Koneksi.getKoneksi();
        
        try{
            PreparedStatement patmt = k.prepareStatement(query);
            patmt.setInt(1, id_pustaka);
            patmt.setInt(2, id_anggota);
            patmt.setInt(3, id_petugas);
            patmt.setString(4, tgl_pinjam);
            patmt.setString(5, tgl_hrs_kembali);
            patmt.setString(6, tgl_kembali);
            patmt.setInt(7, denda);
            patmt.setString(8, status);
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
        jLabel1 = new javax.swing.JLabel();
        BtnLihatIDPustaka = new javax.swing.JButton();
        BtnLihatIDAnggota = new javax.swing.JButton();
        BtnLihatIDPetugas = new javax.swing.JButton();
        TFid_pustaka = new javax.swing.JTextField();
        TFid_anggota = new javax.swing.JTextField();
        TFid_petugas = new javax.swing.JTextField();
        TFtgl_pinjam = new javax.swing.JTextField();
        TFtgl_hrs_kembali = new javax.swing.JTextField();
        TFtgl_kembali = new javax.swing.JTextField();
        TFdenda = new javax.swing.JTextField();
        TFstatus = new javax.swing.JTextField();
        LId = new javax.swing.JLabel();
        idpeminjaman = new javax.swing.JLabel();
        IDPustaka = new javax.swing.JLabel();
        IDAnggota = new javax.swing.JLabel();
        IDPetugas = new javax.swing.JLabel();
        Tglpinjam = new javax.swing.JLabel();
        Tglhrskembali = new javax.swing.JLabel();
        Tglkembali = new javax.swing.JLabel();
        Denda = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        FormatTanggal = new javax.swing.JLabel();
        BtnReset = new javax.swing.JButton();
        BtnSimpan = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT DATA PEMINJAMAN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 139, 960, 50);

        BtnLihatIDPustaka.setBackground(new java.awt.Color(42, 104, 177));
        BtnLihatIDPustaka.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnLihatIDPustaka.setForeground(new java.awt.Color(255, 255, 255));
        BtnLihatIDPustaka.setText("Lihat ID");
        BtnLihatIDPustaka.setContentAreaFilled(false);
        BtnLihatIDPustaka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLihatIDPustaka.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnLihatIDPustaka.setOpaque(true);
        BtnLihatIDPustaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLihatIDPustakaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLihatIDPustaka);
        BtnLihatIDPustaka.setBounds(410, 240, 60, 30);

        BtnLihatIDAnggota.setBackground(new java.awt.Color(42, 104, 177));
        BtnLihatIDAnggota.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnLihatIDAnggota.setForeground(new java.awt.Color(255, 255, 255));
        BtnLihatIDAnggota.setText("Lihat ID");
        BtnLihatIDAnggota.setContentAreaFilled(false);
        BtnLihatIDAnggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLihatIDAnggota.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnLihatIDAnggota.setOpaque(true);
        BtnLihatIDAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLihatIDAnggotaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLihatIDAnggota);
        BtnLihatIDAnggota.setBounds(410, 280, 60, 30);

        BtnLihatIDPetugas.setBackground(new java.awt.Color(42, 104, 177));
        BtnLihatIDPetugas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnLihatIDPetugas.setForeground(new java.awt.Color(255, 255, 255));
        BtnLihatIDPetugas.setText("Lihat ID");
        BtnLihatIDPetugas.setContentAreaFilled(false);
        BtnLihatIDPetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLihatIDPetugas.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnLihatIDPetugas.setOpaque(true);
        BtnLihatIDPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLihatIDPetugasActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLihatIDPetugas);
        BtnLihatIDPetugas.setBounds(410, 320, 60, 30);
        jPanel1.add(TFid_pustaka);
        TFid_pustaka.setBounds(260, 240, 150, 30);

        TFid_anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFid_anggotaActionPerformed(evt);
            }
        });
        jPanel1.add(TFid_anggota);
        TFid_anggota.setBounds(260, 280, 150, 30);
        jPanel1.add(TFid_petugas);
        TFid_petugas.setBounds(260, 320, 150, 30);
        jPanel1.add(TFtgl_pinjam);
        TFtgl_pinjam.setBounds(640, 200, 150, 30);

        TFtgl_hrs_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFtgl_hrs_kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(TFtgl_hrs_kembali);
        TFtgl_hrs_kembali.setBounds(640, 240, 150, 30);
        jPanel1.add(TFtgl_kembali);
        TFtgl_kembali.setBounds(640, 280, 150, 30);
        jPanel1.add(TFdenda);
        TFdenda.setBounds(640, 320, 150, 30);
        jPanel1.add(TFstatus);
        TFstatus.setBounds(640, 360, 150, 30);

        LId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LId.setForeground(new java.awt.Color(255, 255, 255));
        LId.setText("id");
        jPanel1.add(LId);
        LId.setBounds(270, 200, 110, 30);

        idpeminjaman.setBackground(new java.awt.Color(34, 51, 119));
        idpeminjaman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idpeminjaman.setForeground(new java.awt.Color(255, 255, 255));
        idpeminjaman.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idpeminjaman.setText("   ID Peminjaman");
        idpeminjaman.setOpaque(true);
        jPanel1.add(idpeminjaman);
        idpeminjaman.setBounds(140, 200, 270, 30);

        IDPustaka.setBackground(new java.awt.Color(34, 51, 119));
        IDPustaka.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDPustaka.setForeground(new java.awt.Color(255, 255, 255));
        IDPustaka.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDPustaka.setText("   ID Pustaka");
        IDPustaka.setOpaque(true);
        jPanel1.add(IDPustaka);
        IDPustaka.setBounds(140, 240, 270, 30);

        IDAnggota.setBackground(new java.awt.Color(34, 51, 119));
        IDAnggota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDAnggota.setForeground(new java.awt.Color(255, 255, 255));
        IDAnggota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDAnggota.setText("   ID Anggota");
        IDAnggota.setOpaque(true);
        jPanel1.add(IDAnggota);
        IDAnggota.setBounds(140, 280, 270, 30);

        IDPetugas.setBackground(new java.awt.Color(34, 51, 119));
        IDPetugas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDPetugas.setForeground(new java.awt.Color(255, 255, 255));
        IDPetugas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDPetugas.setText("   ID Petugas");
        IDPetugas.setOpaque(true);
        jPanel1.add(IDPetugas);
        IDPetugas.setBounds(140, 320, 270, 30);

        Tglpinjam.setBackground(new java.awt.Color(34, 51, 119));
        Tglpinjam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tglpinjam.setForeground(new java.awt.Color(255, 255, 255));
        Tglpinjam.setText("   Tanggal Pinjam");
        Tglpinjam.setOpaque(true);
        jPanel1.add(Tglpinjam);
        Tglpinjam.setBounds(520, 200, 270, 30);

        Tglhrskembali.setBackground(new java.awt.Color(34, 51, 119));
        Tglhrskembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tglhrskembali.setForeground(new java.awt.Color(255, 255, 255));
        Tglhrskembali.setText("   Tgl. Hrs. Kembali");
        Tglhrskembali.setOpaque(true);
        jPanel1.add(Tglhrskembali);
        Tglhrskembali.setBounds(520, 240, 270, 30);

        Tglkembali.setBackground(new java.awt.Color(34, 51, 119));
        Tglkembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tglkembali.setForeground(new java.awt.Color(255, 255, 255));
        Tglkembali.setText("   Tanggal Kembali");
        Tglkembali.setOpaque(true);
        jPanel1.add(Tglkembali);
        Tglkembali.setBounds(520, 280, 270, 30);

        Denda.setBackground(new java.awt.Color(34, 51, 119));
        Denda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Denda.setForeground(new java.awt.Color(255, 255, 255));
        Denda.setText("   Denda");
        Denda.setOpaque(true);
        jPanel1.add(Denda);
        Denda.setBounds(520, 320, 270, 30);

        Status.setBackground(new java.awt.Color(34, 51, 119));
        Status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 255));
        Status.setText("   Status");
        Status.setOpaque(true);
        jPanel1.add(Status);
        Status.setBounds(520, 360, 270, 30);

        FormatTanggal.setBackground(new java.awt.Color(255, 255, 255));
        FormatTanggal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        FormatTanggal.setForeground(new java.awt.Color(204, 204, 204));
        FormatTanggal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FormatTanggal.setText("( Tanggal / Bulan / Tahun )");
        FormatTanggal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FormatTanggal.setEnabled(false);
        FormatTanggal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FormatTanggal.setInheritsPopupMenu(false);
        FormatTanggal.setRequestFocusEnabled(false);
        FormatTanggal.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(FormatTanggal);
        FormatTanggal.setBounds(640, 180, 150, 20);

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
        FormPeminjaman awal = new FormPeminjaman();
        awal.setVisible(true);
        awal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:

        int id_pustaka = Integer.parseInt(TFid_pustaka.getText());
        int id_anggota = Integer.parseInt(TFid_anggota.getText());
        int id_petugas = Integer.parseInt(TFid_petugas.getText());
        String tgl_pinjam = TFtgl_pinjam.getText();
        String tgl_hrs_kembali = TFtgl_hrs_kembali.getText();
        String tgl_kembali = TFtgl_kembali.getText();
        int denda = Integer.parseInt(TFdenda.getText());
        String status = TFstatus.getText();

        EditTransaksi(id_pustaka, id_anggota, id_petugas, tgl_pinjam, tgl_hrs_kembali, tgl_kembali, denda, status);

        FormPeminjaman awal = new FormPeminjaman();
        awal.setVisible(true);
        awal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnLihatIDPustakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLihatIDPustakaActionPerformed
        // TODO add your handling code here:
        FormIdPustaka idpustaka = new FormIdPustaka();
        idpustaka.setVisible(true);
        idpustaka.setLocationRelativeTo(null);
    }//GEN-LAST:event_BtnLihatIDPustakaActionPerformed

    private void BtnLihatIDAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLihatIDAnggotaActionPerformed
        // TODO add your handling code here:
        FormIDAnggota idanggota = new FormIDAnggota();
        idanggota.setVisible(true);
        idanggota.setLocationRelativeTo(null);

    }//GEN-LAST:event_BtnLihatIDAnggotaActionPerformed

    private void BtnLihatIDPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLihatIDPetugasActionPerformed
        // TODO add your handling code here:
        FormIdPetugas idpetugas = new FormIdPetugas();
        idpetugas.setVisible(true);
        idpetugas.setLocationRelativeTo(null);
    }//GEN-LAST:event_BtnLihatIDPetugasActionPerformed

    private void TFtgl_hrs_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFtgl_hrs_kembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFtgl_hrs_kembaliActionPerformed

    private void TFid_anggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFid_anggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFid_anggotaActionPerformed

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
            java.util.logging.Logger.getLogger(FormEditPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormEditPeminjaman(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JButton BtnLihatIDAnggota;
    private javax.swing.JButton BtnLihatIDPetugas;
    private javax.swing.JButton BtnLihatIDPustaka;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JLabel Denda;
    private javax.swing.JLabel Footer1;
    private javax.swing.JLabel Footer2;
    private javax.swing.JLabel FormatTanggal;
    private javax.swing.JLabel IDAnggota;
    private javax.swing.JLabel IDPetugas;
    private javax.swing.JLabel IDPustaka;
    private javax.swing.JLabel LId;
    private javax.swing.JLabel Status;
    private javax.swing.JTextField TFdenda;
    private javax.swing.JTextField TFid_anggota;
    private javax.swing.JTextField TFid_petugas;
    private javax.swing.JTextField TFid_pustaka;
    private javax.swing.JTextField TFstatus;
    private javax.swing.JTextField TFtgl_hrs_kembali;
    private javax.swing.JTextField TFtgl_kembali;
    private javax.swing.JTextField TFtgl_pinjam;
    private javax.swing.JLabel Tglhrskembali;
    private javax.swing.JLabel Tglkembali;
    private javax.swing.JLabel Tglpinjam;
    private javax.swing.JLabel idpeminjaman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}