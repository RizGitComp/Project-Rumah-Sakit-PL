package Form;

import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import Koneksi.koneksi;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class halamanDokter extends javax.swing.JFrame {
   
private Connection conn = (Connection) new koneksi().connect();
private DefaultTableModel tabmode;

    public halamanDokter() {
        initComponents();
        aktif();
        datatable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        kodedokterTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        namadokterTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        notelpTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        alamatTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SpesialisBox = new javax.swing.JComboBox<>();
        ButtonClear = new javax.swing.JButton();
        ButtonSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDokter = new javax.swing.JTable();
        CariButton = new javax.swing.JButton();
        CariTxt = new javax.swing.JTextField();
        ButtonUbah = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();
        JKelamin = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Dokter");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cropped logo rs.png"))); // NOI18N

        BackButton.setBackground(new java.awt.Color(255, 255, 255));
        BackButton.setForeground(new java.awt.Color(0, 0, 0));
        BackButton.setText("Kembali Ke Menu");
        BackButton.setToolTipText("");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackButton)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(210, 255, 210));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Kode Dokter : ");

        kodedokterTxt.setBackground(new java.awt.Color(255, 255, 255));
        kodedokterTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nama Dokter :");

        namadokterTxt.setBackground(new java.awt.Color(255, 255, 255));
        namadokterTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("No.Telepon :");

        notelpTxt.setBackground(new java.awt.Color(255, 255, 255));
        notelpTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Jenis Kelamin :");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Alamat : ");

        alamatTxt.setBackground(new java.awt.Color(255, 255, 255));
        alamatTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Spesialis :");

        SpesialisBox.setBackground(new java.awt.Color(255, 255, 255));
        SpesialisBox.setForeground(new java.awt.Color(0, 0, 0));
        SpesialisBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Penyakit Dalam", "Anak", "Bedah", "Mata", "Paru", "Kulit", "Neurologi", "Kesehatan Jiwa", " " }));

        ButtonClear.setBackground(new java.awt.Color(255, 255, 255));
        ButtonClear.setForeground(new java.awt.Color(0, 0, 0));
        ButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh-16x16.png"))); // NOI18N
        ButtonClear.setText("Clear");
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        ButtonSimpan.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSimpan.setForeground(new java.awt.Color(0, 0, 0));
        ButtonSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/apply-16x16.png"))); // NOI18N
        ButtonSimpan.setText("Simpan");
        ButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanActionPerformed(evt);
            }
        });

        tabelDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama Dokter", "Jenis Kelamin", "No Telp", "Alamat", "Spesialis"
            }
        ));
        tabelDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDokter);

        CariButton.setBackground(new java.awt.Color(255, 255, 255));
        CariButton.setForeground(new java.awt.Color(0, 0, 0));
        CariButton.setText("Cari");
        CariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariButtonActionPerformed(evt);
            }
        });

        CariTxt.setBackground(new java.awt.Color(255, 255, 255));
        CariTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CariTxtKeyPressed(evt);
            }
        });

        ButtonUbah.setBackground(new java.awt.Color(255, 255, 255));
        ButtonUbah.setForeground(new java.awt.Color(0, 0, 0));
        ButtonUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ubah.png"))); // NOI18N
        ButtonUbah.setText("Ubah");
        ButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUbahActionPerformed(evt);
            }
        });

        ButtonHapus.setBackground(new java.awt.Color(255, 255, 255));
        ButtonHapus.setForeground(new java.awt.Color(0, 0, 0));
        ButtonHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancel-16x16.png"))); // NOI18N
        ButtonHapus.setText("Hapus");
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });

        JKelamin.setBackground(new java.awt.Color(255, 255, 255));
        JKelamin.setForeground(new java.awt.Color(0, 0, 0));
        JKelamin.setMaximumRowCount(2);
        JKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita", " " }));
        JKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JKelaminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(JKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(kodedokterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(137, 137, 137)
                                                .addComponent(jLabel7))
                                            .addComponent(namadokterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(alamatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(notelpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(SpesialisBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CariButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CariTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(ButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(kodedokterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(namadokterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(alamatTxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(notelpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(SpesialisBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonClear)
                    .addComponent(ButtonUbah)
                    .addComponent(ButtonHapus))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CariTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CariButton)
                    .addComponent(ButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(428, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void aktif(){
        kodedokterTxt.requestFocus();
    }
   
    protected void kosong(){
        kodedokterTxt.setText("");
        namadokterTxt.setText("");
        notelpTxt.setText ("");
        alamatTxt.setText ("");
    }   
    
    protected void datatable(){
    Object[] Baris ={"ID Dokter","Nama","Jenis Kelamin","Nomor Telepon","Alamat","Spesialis"};
        tabmode = new DefaultTableModel (null, Baris);
        
        String cariid=CariTxt.getText();
        
        try {
            String sql = "SELECT * FROM dokter where kode_dokter like '%"+cariid+"%' or nama_dokter like'%"+cariid+"' order by kode_dokter asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                tabmode.addRow(new Object[]{
                    hasil.getString (1),
                    hasil.getString (2),
                    hasil.getString (3),
                    hasil.getString (4),
                    hasil.getString (5),
                    hasil.getString (6),
                });
            }
            tabelDokter.setModel(tabmode);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal"+e);
        }
    }
    
    
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new halamanMenu(). show();
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        kodedokterTxt.setText("");
        namadokterTxt.setText("");
        notelpTxt.setText ("");
        alamatTxt.setText ("");
       
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void JKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JKelaminActionPerformed

    private void ButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanActionPerformed
     
        try{
        String sql = "Insert into dokter values (?,?,?,?,?,?)";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, kodedokterTxt.getText());
        stat.setString(2,namadokterTxt.getText());
        stat.setString(3, (String) JKelamin.getSelectedItem());
        stat.setString(4,notelpTxt.getText());
        stat.setString(5,alamatTxt.getText());
        stat.setString(6, (String) SpesialisBox.getSelectedItem());
        
        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        kosong();
        kodedokterTxt.requestFocus();
    }
        catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"data gagal disimpan"+e);
        }
    datatable();
    }//GEN-LAST:event_ButtonSimpanActionPerformed

    private void ButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUbahActionPerformed
      try{
            String sql = "update dokter set nama_dokter=?,jeniskelamin_dokter=?,no_telp=?,alamat_dokter=?,spesialis=? where kode_dokter='"+kodedokterTxt.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, namadokterTxt.getText());
            stat.setString(2, (String) JKelamin.getSelectedItem());
            stat.setString(3, notelpTxt.getText());
            stat.setString(4, alamatTxt.getText());
            stat.setString(6, (String) SpesialisBox.getSelectedItem());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil diubah");
            kosong();
            kodedokterTxt.requestFocus();
        }
    catch (SQLException e){
        JOptionPane.showMessageDialog(null, "data gagal diubah"+e);
    }
    datatable();
    }//GEN-LAST:event_ButtonUbahActionPerformed

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "hapus","konfirmasi dialog",JOptionPane.YES_NO_OPTION);
            if (ok==0){
               String sql = "delete from dokter where kode_dokter ='"+kodedokterTxt.getText()+"'";
               try{ 
                   PreparedStatement stat = conn.prepareStatement(sql);
                   stat.executeUpdate();
                   JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                   kosong();
                   kodedokterTxt.requestFocus();
               }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Data gagal dihapus"+e);
            }
            datatable();
        }
    }//GEN-LAST:event_ButtonHapusActionPerformed

    private void tabelDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDokterMouseClicked
        int bar = tabelDokter.getSelectedRow();
        String a = tabelDokter.getValueAt(bar, 0).toString();
        String b = tabelDokter.getValueAt(bar, 1).toString();
        String c = tabelDokter.getValueAt(bar, 2).toString();
        String d = tabelDokter.getValueAt(bar, 3).toString();
        String e = tabelDokter.getValueAt(bar, 4).toString();
        String f = tabelDokter.getValueAt(bar, 5).toString();
        
        kodedokterTxt.setText (a);
        namadokterTxt.setText ( b);
        JKelamin.setSelectedItem(c);
        notelpTxt.setText (d);
        alamatTxt.setText (e);
        SpesialisBox.setSelectedItem(f);
    }//GEN-LAST:event_tabelDokterMouseClicked

    private void CariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariButtonActionPerformed
        datatable();
    }//GEN-LAST:event_CariButtonActionPerformed

    private void CariTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CariTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           datatable();
       }
    }//GEN-LAST:event_CariTxtKeyPressed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonSimpan;
    private javax.swing.JButton ButtonUbah;
    private javax.swing.JButton CariButton;
    private javax.swing.JTextField CariTxt;
    private javax.swing.JComboBox<String> JKelamin;
    private javax.swing.JComboBox<String> SpesialisBox;
    private javax.swing.JTextField alamatTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kodedokterTxt;
    private javax.swing.JTextField namadokterTxt;
    private javax.swing.JTextField notelpTxt;
    private javax.swing.JTable tabelDokter;
    // End of variables declaration//GEN-END:variables
}
