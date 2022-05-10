
package uas.view.transaksi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uas.koneksi.Koneksi;

public class FormIdPustaka extends javax.swing.JFrame {

    public FormIdPustaka() {
        initComponents();
        TampilTblIDPustaka();
    }
    
    private void TampilTblIDPustaka() {
        
        // buat model untuk tabel
        // sebagai wadah dari kolom dan baris
        DefaultTableModel dtm = new DefaultTableModel();
        
        // isi judul kolom
        dtm.addColumn("ID Pustaka");
        dtm.addColumn("Judul");
        dtm.addColumn("Pengarang");
        dtm.addColumn("Penerbit");
        dtm.addColumn("Tahun");
        dtm.addColumn("ISBN");
        dtm.addColumn("Jumlah");
        dtm.addColumn("Jenis Buku");
        dtm.addColumn("Lokasi Rak");
        
        
        // masukkan kolom tadi ke table model
        // table model diberi nama
        // ke object yg ada di design
        TblIDPustaka.setModel(dtm);
        
        // panggil koneksi
        Connection k = Koneksi.getKoneksi();
        
        // buat query
        String query = "SELECT * FROM pustaka ORDER BY id ASC";
        
        
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
                        rs.getString("judul"),
                        rs.getString("pengarang"),
                        rs.getString("penerbit"),
                        rs.getString("tahun"),
                        rs.getString("isbn"),
                        rs.getString("jumlah"),
                        rs.getString("jenis_buku"),
                        rs.getString("lokasi_rak"),
                        
                        
                    }
                        
                );
                
            }
            
            
        } catch (SQLException se) {
            
            JOptionPane.showMessageDialog(null, "Terjadi error pada: " + se);
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnKembali = new javax.swing.JButton();
        Tabel = new javax.swing.JScrollPane();
        TblIDPustaka = new javax.swing.JTable();
        Footer1 = new javax.swing.JLabel();
        Footer2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(955, 536));
        jPanel1.setMinimumSize(new java.awt.Dimension(955, 536));
        jPanel1.setPreferredSize(new java.awt.Dimension(955, 536));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATA PUSTAKA PERPUSTAKAAN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, 120, 970, 70);

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
        BtnKembali.setBounds(810, 440, 120, 30);

        TblIDPustaka.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel.setViewportView(TblIDPustaka);

        jPanel1.add(Tabel);
        Tabel.setBounds(130, 189, 690, 230);

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
        Background.setText("jLabel1");
        jPanel1.add(Background);
        Background.setBounds(0, 0, 960, 536);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(FormIdPustaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormIdPustaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormIdPustaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormIdPustaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormIdPustaka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JLabel Footer1;
    private javax.swing.JLabel Footer2;
    private javax.swing.JScrollPane Tabel;
    private javax.swing.JTable TblIDPustaka;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
