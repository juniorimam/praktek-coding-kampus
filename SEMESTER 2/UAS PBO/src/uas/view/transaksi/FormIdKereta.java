
package uas.view.transaksi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import uas.dao.Koneksi;
import uas.view.FormTransaksi;

public class FormIdKereta extends javax.swing.JFrame {

    public FormIdKereta() {
        initComponents();
        TampilTblIDKereta();
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
    
    private void TampilTblIDKereta() {
        
        // buat model untuk tabel
        // sebagai wadah dari kolom dan baris
        DefaultTableModel dtm = new DefaultTableModel();
        
        // isi judul kolom
        dtm.addColumn("ID Kereta");
        dtm.addColumn("Kereta");
        dtm.addColumn("Jenis Kereta");
        dtm.addColumn("Jurusan");
        dtm.addColumn("Tanggal");
        dtm.addColumn("Jam Datang");
        dtm.addColumn("Jam Berangkat");
        
        
        // masukkan kolom tadi ke table model
        // table model diberi nama
        // ke object yg ada di design
        TblIDKereta.setModel(dtm);
        
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Footer1 = new javax.swing.JLabel();
        Footer2 = new javax.swing.JLabel();
        BtnKembali = new javax.swing.JButton();
        Tabel = new javax.swing.JScrollPane();
        TblIDKereta = new javax.swing.JTable();
        LJam = new javax.swing.JLabel();
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
        jLabel2.setText("DATA KERETA STASIUN SOLO BALAPAN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, 150, 970, 40);

        Footer1.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        Footer1.setForeground(new java.awt.Color(255, 255, 255));
        Footer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Footer1.setText("STASIUN SOLO BALAPAN");
        Footer1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Footer1);
        Footer1.setBounds(0, 490, 960, 30);

        Footer2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Footer2.setForeground(new java.awt.Color(255, 255, 255));
        Footer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Footer2.setText("JL. Walter Monginsidi No. 112 Kestalan, Banjarsari, Surakarta. Kode Pos 57133");
        Footer2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Footer2);
        Footer2.setBounds(0, 510, 960, 30);

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
        BtnKembali.setBounds(840, 430, 90, 40);

        TblIDKereta.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel.setViewportView(TblIDKereta);

        jPanel1.add(Tabel);
        Tabel.setBounds(130, 200, 690, 219);

        LJam.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        LJam.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LJam);
        LJam.setBounds(870, 490, 80, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/gambar/bckgrnd2.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(FormIdKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormIdKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormIdKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormIdKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormIdKereta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JLabel Footer1;
    private javax.swing.JLabel Footer2;
    private javax.swing.JLabel LJam;
    private javax.swing.JScrollPane Tabel;
    private javax.swing.JTable TblIDKereta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
