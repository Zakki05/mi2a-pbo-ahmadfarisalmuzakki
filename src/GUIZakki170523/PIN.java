/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIZakki170523;

/**
 *
 * @author LENOVO
 */
public class PIN extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    public PIN() {
        initComponents();
        pinSalahLBL.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLanjutkan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pinSalahLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        getContentPane().setLayout(null);

        Header.setBackground(new java.awt.Color(102, 102, 255));
        Header.setForeground(new java.awt.Color(255, 255, 255));
        Header.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Bank Zakki Sejahtera");
        Header.add(jLabel1);
        jLabel1.setBounds(310, 50, 400, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setText("_______________________");
        Header.add(jLabel2);
        jLabel2.setBounds(310, 80, 391, 30);

        passwordTXT.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        passwordTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Header.add(passwordTXT);
        passwordTXT.setBounds(330, 310, 350, 37);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lupa PIN ?");
        Header.add(jLabel3);
        jLabel3.setBounds(430, 360, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Masukkan PIN Anda");
        Header.add(jLabel4);
        jLabel4.setBounds(370, 250, 280, 30);

        btnLanjutkan.setBackground(new java.awt.Color(255, 255, 255));
        btnLanjutkan.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnLanjutkan.setText("LANJUTKAN");
        btnLanjutkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutkanActionPerformed(evt);
            }
        });
        Header.add(btnLanjutkan);
        btnLanjutkan.setBounds(830, 20, 170, 80);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jButton2.setText("BATAL");
        Header.add(jButton2);
        jButton2.setBounds(20, 20, 170, 80);

        pinSalahLBL.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        pinSalahLBL.setForeground(new java.awt.Color(255, 51, 51));
        pinSalahLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pinSalahLBL.setText("PIN ANDA SALAH !");
        Header.add(pinSalahLBL);
        pinSalahLBL.setBounds(400, 450, 210, 20);

        getContentPane().add(Header);
        Header.setBounds(0, 0, 1020, 600);

        setSize(new java.awt.Dimension(1046, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLanjutkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutkanActionPerformed
        // TODO add your handling code here:
        PinModel pin = new PinModel();
        if(passwordTXT.getText().equals(pin.getPin())){
            new HalamanUtama().setVisible(true);
            this.setVisible(false);
        } else{
            pinSalahLBL.setVisible(true);
        }
    }//GEN-LAST:event_btnLanjutkanActionPerformed

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
            java.util.logging.Logger.getLogger(PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnLanjutkan;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField passwordTXT;
    private javax.swing.JLabel pinSalahLBL;
    // End of variables declaration//GEN-END:variables
}
