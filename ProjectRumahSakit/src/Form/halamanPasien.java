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


public class halamanPasien extends javax.swing.JFrame {
private Connection conn = (Connection) new koneksi().connect();
private DefaultTableModel tabmode;
    
    public halamanPasien() {
        initComponents();
        aktif();
        datatable();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        kodepasientxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        namapasientxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        umurpasienTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JKelamin = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        alamatTxt = new javax.swing.JTextField();
        ButtonClear = new javax.swing.JButton();
        ButtonSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_pasien = new javax.swing.JTable();
        buttoncari = new javax.swing.JButton();
        caritxt = new javax.swing.JTextField();
        ButtonUbah = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Pasien");

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
        jLabel3.setText("Kode Pasien : ");

        kodepasientxt.setBackground(new java.awt.Color(255, 255, 255));
        kodepasientxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nama Pasien :");

        namapasientxt.setBackground(new java.awt.Color(255, 255, 255));
        namapasientxt.setForeground(new java.awt.Color(0, 0, 0));
        namapasientxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namapasientxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Umur : ");

        umurpasienTxt.setBackground(new java.awt.Color(255, 255, 255));
        umurpasienTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Jenis Kelamin :");

        JKelamin.setBackground(new java.awt.Color(255, 255, 255));
        JKelamin.setForeground(new java.awt.Color(0, 0, 0));
        JKelamin.setMaximumRowCount(8);
        JKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita" }));
        JKelamin.setName(""); // NOI18N
        JKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JKelaminActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Alamat : ");

        alamatTxt.setBackground(new java.awt.Color(255, 255, 255));
        alamatTxt.setForeground(new java.awt.Color(0, 0, 0));

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

        tabel_pasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama Pasien", "Jenis Kelamin", "Umur", "Alamat"
            }
        ));
        tabel_pasien.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabel_pasienAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabel_pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_pasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_pasien);

        buttoncari.setBackground(new java.awt.Color(255, 255, 255));
        buttoncari.setForeground(new java.awt.Color(0, 0, 0));
        buttoncari.setText("Cari");
        buttoncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncariActionPerformed(evt);
            }
        });

        caritxt.setBackground(new java.awt.Color(255, 255, 255));
        caritxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caritxtKeyPressed(evt);
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
                                                .addComponent(kodepasientxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(137, 137, 137)
                                                .addComponent(jLabel7))
                                            .addComponent(namapasientxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(alamatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(umurpasienTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                        .addGap(486, 486, 486))))
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
                        .addComponent(buttoncari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caritxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(ButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(kodepasientxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(namapasientxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(alamatTxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(umurpasienTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(caritxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttoncari)
                    .addComponent(ButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        kodepasientxt.requestFocus();
    }
    
    protected void kosong(){
        kodepasientxt.setText("");
        namapasientxt.setText("");
        umurpasienTxt.setText ("");
        alamatTxt.setText ("");
    }
    
    protected void datatable(){
    Object[] Baris ={"ID Pasien","Nama","Jenis Kelamin","Umur","Alamat"};
        tabmode = new DefaultTableModel (null, Baris);
        
        String cariid=caritxt.getText();
        
        try {
            String sql = "SELECT * FROM pasien where kode_pasien like '%"+cariid+"%' or nama_pasien like'%"+cariid+"' order by kode_pasien asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                tabmode.addRow(new Object[]{
                    hasil.getString (1),
                    hasil.getString (2),
                    hasil.getString (3),
                    hasil.getString (4),
                    hasil.getString (5),
                });
            }
            tabel_pasien.setModel(tabmode);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal"+e);
        }
    }
    
    private void JKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JKelaminActionPerformed

    private void ButtonSimpanActionPerformed(java.awt.event.ActionEvent evt){
   
    try{
        String sql = "Insert into pasien values (?,?,?,?,?)";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, kodepasientxt.getText());
        stat.setString(2,namapasientxt.getText());
        stat.setString(3, (String) JKelamin.getSelectedItem());
        stat.setString(4,umurpasienTxt.getText());
        stat.setString(5,alamatTxt.getText());
        
        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        kosong();
        kodepasientxt.requestFocus();
    }
        catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"data gagal disimpan"+e);
        }
    datatable();
    }
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new halamanMenu(). show();
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void tabel_pasienAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabel_pasienAncestorAdded
        // TODO add your handling 
    }//GEN-LAST:event_tabel_pasienAncestorAdded

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        kodepasientxt.setText("");
        namapasientxt.setText("");
        umurpasienTxt.setText ("");
        alamatTxt.setText ("");
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void namapasientxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namapasientxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namapasientxtActionPerformed

    private void ButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUbahActionPerformed
        try{
            String sql = "update pasien set nama_pasien=?,jeniskelamin_pasien=?,umur_pasien=?,alamat_pasien=? where kode_pasien='"+kodepasientxt.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, namapasientxt.getText());
            stat.setString(2, (String) JKelamin.getSelectedItem());
            stat.setString(3, umurpasienTxt.getText());
            stat.setString(4, alamatTxt.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil diubah");
            kosong();
            kodepasientxt.requestFocus();
        }
    catch (SQLException e){
        JOptionPane.showMessageDialog(null, "data gagal diubah"+e);
    }
    datatable();
    }//GEN-LAST:event_ButtonUbahActionPerformed

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "hapus","konfirmasi dialog",JOptionPane.YES_NO_OPTION);
            if (ok==0){
               String sql = "delete from pasien where kode_pasien ='"+kodepasientxt.getText()+"'";
               try{ 
                   PreparedStatement stat = conn.prepareStatement(sql);
                   stat.executeUpdate();
                   JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                   kosong();
                   kodepasientxt.requestFocus();
               }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Data gagal dihapus"+e);
            }
            datatable();
        }
    }//GEN-LAST:event_ButtonHapusActionPerformed

    private void tabel_pasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_pasienMouseClicked
        int bar = tabel_pasien.getSelectedRow();
        String a = tabel_pasien.getValueAt(bar, 0).toString();
        String b = tabel_pasien.getValueAt(bar, 1).toString();
        String c = tabel_pasien.getValueAt(bar, 2).toString();
        String d = tabel_pasien.getValueAt(bar, 3).toString();
        String e = tabel_pasien.getValueAt(bar, 4).toString();
        
        kodepasientxt.setText (a);
        namapasientxt.setText ( b);
        JKelamin.setSelectedItem(c);
        umurpasienTxt.setText (d);
        alamatTxt.setText (e);
        
        
    }//GEN-LAST:event_tabel_pasienMouseClicked

    private void buttoncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncariActionPerformed
       datatable();
    }//GEN-LAST:event_buttoncariActionPerformed

    private void caritxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caritxtKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           datatable();
       }
    }//GEN-LAST:event_caritxtKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonSimpan;
    private javax.swing.JButton ButtonUbah;
    private javax.swing.JComboBox<String> JKelamin;
    private javax.swing.JTextField alamatTxt;
    private javax.swing.JButton buttoncari;
    private javax.swing.JTextField caritxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kodepasientxt;
    private javax.swing.JTextField namapasientxt;
    private javax.swing.JTable tabel_pasien;
    private javax.swing.JTextField umurpasienTxt;
    // End of variables declaration//GEN-END:variables
}
