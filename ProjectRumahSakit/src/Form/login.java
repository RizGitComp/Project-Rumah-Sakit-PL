package Form;

import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {
    
    public login() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Usernametxt = new javax.swing.JTextField();
        Passwordtxt = new javax.swing.JPasswordField();
        Loginbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Showtoggle = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usernametxt.setBackground(new java.awt.Color(255, 255, 255));
        Usernametxt.setForeground(new java.awt.Color(51, 51, 51));
        Usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernametxtActionPerformed(evt);
            }
        });
        jPanel1.add(Usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 110, 31));
        Usernametxt.getAccessibleContext().setAccessibleName("");
        Usernametxt.getAccessibleContext().setAccessibleDescription("");

        Passwordtxt.setBackground(new java.awt.Color(255, 255, 255));
        Passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordtxtActionPerformed(evt);
            }
        });
        jPanel1.add(Passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 110, 30));

        Loginbutton.setBackground(new java.awt.Color(0, 157, 229));
        Loginbutton.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        Loginbutton.setForeground(new java.awt.Color(255, 255, 255));
        Loginbutton.setText("Login");
        Loginbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 80, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 80, 20));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 70, 30));

        Showtoggle.setBackground(new java.awt.Color(255, 255, 255));
        Showtoggle.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        Showtoggle.setForeground(new java.awt.Color(0, 0, 0));
        Showtoggle.setText("Show");
        Showtoggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Showtoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowtoggleActionPerformed(evt);
            }
        });
        jPanel1.add(Showtoggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 70, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Welcome (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernametxtActionPerformed

    }//GEN-LAST:event_UsernametxtActionPerformed

    private void LoginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbuttonActionPerformed
    if (Usernametxt.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Username harus Diisi!");
           Usernametxt.requestFocus();
    }
    else if (Passwordtxt.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Password harus Diisi!");
           Passwordtxt.requestFocus();
    }//GEN-LAST:event_LoginbuttonActionPerformed
    else if(Usernametxt.getText().contains("admin")&& Passwordtxt.getText().contains("admin")){
        new halamanMenu(). show();
        this.dispose();
    }
    else{
        JOptionPane.showMessageDialog(null,"Username dan Password tidak Sesuai");
    }
    }
    private void PasswordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordtxtActionPerformed

    private void ShowtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowtoggleActionPerformed
       if (Showtoggle.isSelected()){
           Passwordtxt.setEchoChar((char)0);
           Showtoggle.setText("Hide");
       
       }else {
        Passwordtxt.setEchoChar('*');
        Showtoggle.setText("Show");
    }//GEN-LAST:event_ShowtoggleActionPerformed
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Loginbutton;
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JToggleButton Showtoggle;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
