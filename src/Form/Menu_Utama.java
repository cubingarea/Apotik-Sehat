/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.awt.Frame;

/**
 *
 * @author Cubirth
 */
public class Menu_Utama extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Utama
     */
    public Menu_Utama() {
        initComponents();
        setExtendedState(Frame.MAXIMIZED_BOTH);
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
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemuser = new javax.swing.JMenuItem();
        itemkeluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuobat = new javax.swing.JMenuItem();
        menukategoriobat = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selamat Datang di Apotik Sehat Selalu");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(475, 475, 475))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(380, Short.MAX_VALUE))
        );

        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("File");

        itemuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N
        itemuser.setText("User");
        itemuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemuserActionPerformed(evt);
            }
        });
        jMenu1.add(itemuser);

        itemkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete-Blue.png"))); // NOI18N
        itemkeluar.setText("Keluar");
        itemkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemkeluarActionPerformed(evt);
            }
        });
        jMenu1.add(itemkeluar);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Data");

        menuobat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pills-1.png"))); // NOI18N
        menuobat.setText("Data Obat");
        menuobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuobatActionPerformed(evt);
            }
        });
        jMenu2.add(menuobat);

        menukategoriobat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/books.png"))); // NOI18N
        menukategoriobat.setText("Data Kategori Obat");
        menukategoriobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menukategoriobatActionPerformed(evt);
            }
        });
        jMenu2.add(menukategoriobat);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Transaksi");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/snake_cup.png"))); // NOI18N
        jMenuItem1.setText("Transaksi Penjualan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jMenu4.setText("Laporan");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Report-Bound.png"))); // NOI18N
        jMenuItem3.setText("LAPORAN OBAT");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Report-Bound.png"))); // NOI18N
        jMenuItem2.setText("LAPORAN TRANSAKSI");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(0, 0, 0));
        jMenu5.setText("Help");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/About.png"))); // NOI18N
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemuserActionPerformed
        // TODO add your handling code here:
        Form_Petugas fp = new Form_Petugas();
        fp.setVisible(true);
    }//GEN-LAST:event_itemuserActionPerformed

    private void itemkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_itemkeluarActionPerformed

    private void menukategoriobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menukategoriobatActionPerformed
        // TODO add your handling code here:
        Form_KategoriObat fk = new Form_KategoriObat();
        fk.setVisible(true);
    }//GEN-LAST:event_menukategoriobatActionPerformed

    private void menuobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuobatActionPerformed
        // TODO add your handling code here:
        Form_Obat fo = new Form_Obat();
        fo.setVisible(true);
    }//GEN-LAST:event_menuobatActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Form_Trans_Detail ftd = new Form_Trans_Detail();
        ftd.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        FormObat fo = new FormObat();
        fo.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        FormTransaksi ft = new FormTransaksi();
        ft.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        About ab = new About();
        ab.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemkeluar;
    private javax.swing.JMenuItem itemuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menukategoriobat;
    private javax.swing.JMenuItem menuobat;
    // End of variables declaration//GEN-END:variables
}
