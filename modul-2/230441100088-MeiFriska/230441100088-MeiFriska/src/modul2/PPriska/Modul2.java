
package modul2.PPriska;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lanny aprilia
 */
public class Modul2 extends javax.swing.JFrame {

    /**
     * Creates new form TokoPastryLanny
     */
    
    public Modul2() {
        initComponents();
        txtjumlah.setEditable(false);
        txttotal.setEditable(false);
        txtdiskon.setEditable(false);
        txthargasetelahdiskon.setEditable(false);
        txtchange.setEditable(false);
        
        txtcash.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                penghitungan();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgmenu = new javax.swing.ButtonGroup();
        bgtopping = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        rdbmenu1 = new javax.swing.JRadioButton();
        rdbmenu2 = new javax.swing.JRadioButton();
        rdbmenu3 = new javax.swing.JRadioButton();
        rdbmenu4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rdbtoping1 = new javax.swing.JRadioButton();
        rdbtoping2 = new javax.swing.JRadioButton();
        rdbtoping3 = new javax.swing.JRadioButton();
        rdbtoping4 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnjumlahminus = new javax.swing.JButton();
        btnjumlahplus = new javax.swing.JButton();
        btnhitung = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtdiskon = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtcash = new javax.swing.JTextField();
        txtchange = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txthargasetelahdiskon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel1.setText("Gyeoul Bakery");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 190, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel27.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel27.setText("jl.in aja dulu Blok kenangan gang gamon");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 300, 30));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel4.setText("No.Tel 2309-0987-5678");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 170, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\image-removebg-preview (3).png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 90, 90));

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\image-removebg-preview (3).png")); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 110));

        jPanel2.setBackground(new java.awt.Color(204, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        jPanel2.setForeground(new java.awt.Color(204, 255, 0));
        jPanel2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 22)); // NOI18N
        jLabel5.setText("--- Menu ---");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        bgmenu.add(rdbmenu1);
        rdbmenu1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rdbmenu1.setText("Bagels ");
        rdbmenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbmenu1ActionPerformed(evt);
            }
        });
        jPanel2.add(rdbmenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 30));

        bgmenu.add(rdbmenu2);
        rdbmenu2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rdbmenu2.setText("Pretzel ");
        jPanel2.add(rdbmenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, -1));

        bgmenu.add(rdbmenu3);
        rdbmenu3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rdbmenu3.setText("Croissant ");
        jPanel2.add(rdbmenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        bgmenu.add(rdbmenu4);
        rdbmenu4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rdbmenu4.setText("Rolls ");
        jPanel2.add(rdbmenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 220, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel11.setText("Rp. 76.000");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 90, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel12.setText("Rp 87.000");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 80, -1));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel13.setText("Rp 67.000");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, -1));

        jLabel14.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel14.setText("Rp 75.000");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 90, -1));

        jLabel16.setFont(new java.awt.Font("Monotype Corsiva", 0, 22)); // NOI18N
        jLabel16.setText("--- Spesial Topping---");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        bgtopping.add(rdbtoping1);
        rdbtoping1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rdbtoping1.setText("Mozarella ");
        rdbtoping1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtoping1ActionPerformed(evt);
            }
        });
        jPanel2.add(rdbtoping1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 110, -1));

        bgtopping.add(rdbtoping2);
        rdbtoping2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rdbtoping2.setText("Full Crem ");
        jPanel2.add(rdbtoping2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 120, -1));

        bgtopping.add(rdbtoping3);
        rdbtoping3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rdbtoping3.setText("Keju Parut ");
        jPanel2.add(rdbtoping3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 110, -1));

        bgtopping.add(rdbtoping4);
        rdbtoping4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rdbtoping4.setText("Coklat Parut ");
        jPanel2.add(rdbtoping4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 110, -1));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel15.setText("Rp 20.00");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 90, -1));

        jLabel17.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel17.setText("Rp 21.000");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 96, 90, 30));

        jLabel18.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel18.setText("Rp 23.000");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 90, 20));

        jLabel19.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel19.setText("Rp.24.000");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 90, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel20.setText("====================================================================");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 620, 30));

        btnjumlahminus.setText("-");
        btnjumlahminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjumlahminusActionPerformed(evt);
            }
        });
        jPanel2.add(btnjumlahminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        btnjumlahplus.setText("+");
        btnjumlahplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjumlahplusActionPerformed(evt);
            }
        });
        jPanel2.add(btnjumlahplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        btnhitung.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnhitung.setText("Count");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });
        jPanel2.add(btnhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 80, -1));

        jLabel21.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel21.setText("Harga Ahir :");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 90, -1));

        jLabel22.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel22.setText("Jumlah :");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel2.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 210, -1));

        txtjumlah.setEditable(false);
        txtjumlah.setText("0");
        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });
        jPanel2.add(txtjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 40, -1));

        jLabel23.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel23.setText("Change :");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        txtdiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiskonActionPerformed(evt);
            }
        });
        jPanel2.add(txtdiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 210, -1));

        jLabel24.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel24.setText("Total   :");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 60, -1));

        txtcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcashActionPerformed(evt);
            }
        });
        jPanel2.add(txtcash, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 210, -1));

        txtchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchangeActionPerformed(evt);
            }
        });
        jPanel2.add(txtchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 210, -1));

        jLabel25.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel25.setText("Cash     :");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 60, -1));

        btnreset.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel2.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));

        btncancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel2.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, -1));

        jLabel26.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel26.setText("Diskon :");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));
        jPanel2.add(txthargasetelahdiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 210, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\download (8).png")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\download (7).png")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\download (6).png")); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\download (5).png")); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\download (4).png")); // NOI18N
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\image-removebg-preview (4) (2).png")); // NOI18N
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 630, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void penghitungan() {
        try {
            double hargasetelahdiskon = Double.parseDouble(txthargasetelahdiskon.getText());
            double uangmasuk = Double.parseDouble(txtcash.getText());
            double kembalian = uangmasuk - hargasetelahdiskon;

            if (kembalian >= 0) {
                txtchange.setText(String.valueOf(kembalian));
            } else {
                txtchange.setText("uangmu bang gak cukup hehe");
            }
        } catch (NumberFormatException e) {
            txtchange.setText("Input Tidak Sesuai");
        }
    }
    
    
    
    
    private void rdbmenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbmenu1ActionPerformed

    private void rdbtoping1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtoping1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtoping1ActionPerformed

    private void txtdiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiskonActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        bgmenu.clearSelection();
        bgtopping.clearSelection();
        int jumlah = 0;
        txtjumlah.setText(String.valueOf(jumlah));
        txttotal.setText("");
        txtdiskon.setText("");
        txtcash.setText("");
        txtchange.setText("");
        txthargasetelahdiskon.setText("");
        
        
    }//GEN-LAST:event_btnresetActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        int keluar = JOptionPane.showConfirmDialog(this,"Anda Yakin Ingin Keluar Program?","Keluar",JOptionPane.YES_NO_OPTION);
        if (keluar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        // TODO add your handling code here:
        if (bgmenu.getSelection() == this) {
            JOptionPane.showMessageDialog(this, "menunya di pilih dulu lah buwang!", "INFUWO", JOptionPane.WARNING_MESSAGE);
        } else if (bgtopping.getSelection() == this) {
            JOptionPane.showMessageDialog(this, "topping bang topping!", "INFUWO", JOptionPane.WARNING_MESSAGE);
        } else if (Integer.parseInt(txtjumlah.getText()) <= 0) { 
            JOptionPane.showMessageDialog(this, "Jangan Pelit Bang Belinya Harus lebih dari 0", "INFUWO", JOptionPane.WARNING_MESSAGE);
        } else {
            double harga = 0;
            double diskon = 0;
            double cash = 0;
            double change = 0;
            
            if (rdbmenu1.isSelected()){
                String jumlahpesanan = txtjumlah.getText();
                harga += 75000 * Integer.parseInt(jumlahpesanan);
                if (rdbtoping1.isSelected()){
                    harga += 20000 * Integer.parseInt(jumlahpesanan);
                } else if (rdbtoping2.isSelected()){
                    harga += 21000 * Integer.parseInt(jumlahpesanan);
                } else if (rdbtoping3.isSelected()){
                    harga += 23000 * Integer.parseInt(jumlahpesanan);
                } else {
                    harga += 24000 * Integer.parseInt(jumlahpesanan);
                }
                txttotal.setText(String.valueOf(harga));
                    if (harga > 100000) {
                        diskon = harga * 0.05;
                        txtdiskon.setText(String.valueOf(diskon));
                        harga -= diskon;
                        txthargasetelahdiskon.setText(String.valueOf(harga));
                    } else {
                        txtdiskon.setText("0");
                        txthargasetelahdiskon.setText(String.valueOf(harga));
                    }
            }
            
            if (rdbmenu2.isSelected()){
                String jumlahpesanan = txtjumlah.getText();
                harga += 67000 * Integer.parseInt(jumlahpesanan);
                if (rdbtoping1.isSelected()){
                    harga += 20000 * Integer.parseInt(jumlahpesanan);
                } else if (rdbtoping2.isSelected()){
                    harga += 21000 * Integer.parseInt(jumlahpesanan);
                } else if (rdbtoping3.isSelected()){
                    harga += 23000 * Integer.parseInt(jumlahpesanan);
                } else {
                    harga += 24000 * Integer.parseInt(jumlahpesanan);
                }
                txttotal.setText(String.valueOf(harga));
                    if (harga >= 100000) {
                        diskon = harga * 0.05;
                        txtdiskon.setText(String.valueOf(diskon));
                        harga -= diskon;
                        txthargasetelahdiskon.setText(String.valueOf(harga));
                    } else {
                        txtdiskon.setText("0");
                        txthargasetelahdiskon.setText(String.valueOf(harga));
                    }
            }
            
            if (rdbmenu3.isSelected()){
                String jumlahpesanan = txtjumlah.getText();
                harga += 87000 * Integer.parseInt(jumlahpesanan);
                if (rdbtoping1.isSelected()){
                    harga += 20000 * Integer.parseInt(jumlahpesanan);
                } else if (rdbtoping2.isSelected()){
                    harga += 21000 * Integer.parseInt(jumlahpesanan);
                } else if (rdbtoping3.isSelected()){
                    harga += 23000 * Integer.parseInt(jumlahpesanan);
                } else {
                    harga += 24000 * Integer.parseInt(jumlahpesanan);
                }
                txttotal.setText(String.valueOf(harga));
                    if (harga >= 100000) {
                        diskon = harga * 0.05;
                        txtdiskon.setText(String.valueOf(diskon));
                        harga -= diskon;
                        txthargasetelahdiskon.setText(String.valueOf(harga));
                    } else {
                        txtdiskon.setText("0");
                        txthargasetelahdiskon.setText(String.valueOf(harga));
                    }
            }
            
            if (rdbmenu4.isSelected()){
                String jumlahpesanan = txtjumlah.getText();
                harga += 76000 * Integer.parseInt(jumlahpesanan);
                if (rdbtoping1.isSelected()){
                    harga += 20000 * Integer.parseInt(jumlahpesanan);
                } else if (rdbtoping2.isSelected()){
                    harga += 21000 * Integer.parseInt(jumlahpesanan);
                } else if (rdbtoping3.isSelected()){
                    harga += 23000 * Integer.parseInt(jumlahpesanan);
                } else {
                    harga += 24000 * Integer.parseInt(jumlahpesanan);
                }
                txttotal.setText(String.valueOf(harga));
                    if (harga >= 100000) {
                        diskon = harga * 0.05;
                        txtdiskon.setText(String.valueOf(diskon));
                        harga -= diskon;
                        txthargasetelahdiskon.setText(String.valueOf(harga));
                    } else {
                        txtdiskon.setText("0");
                        txthargasetelahdiskon.setText(String.valueOf(harga));
                    }
            }
            
         
        }
    }//GEN-LAST:event_btnhitungActionPerformed

    
    private void btnjumlahminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjumlahminusActionPerformed
        int jumlah = Integer.parseInt(txtjumlah.getText());
        if (jumlah <= 1) {
            JOptionPane.showMessageDialog(this, "Jangan Pelit Pelit Bang Harus Lebih Dari 0");
        } else {
            jumlah--;
        }
        txtjumlah.setText(String.valueOf(jumlah));

    }//GEN-LAST:event_btnjumlahminusActionPerformed

    private void btnjumlahplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjumlahplusActionPerformed
        // TODO add your handling code here:
        int jumlah = Integer.parseInt(txtjumlah.getText());
            jumlah++;
        txtjumlah.setText(String.valueOf(jumlah));
    }//GEN-LAST:event_btnjumlahplusActionPerformed

    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahActionPerformed

    private void txtchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchangeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtchangeActionPerformed

    private void txtcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcashActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtcashActionPerformed
   
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
            java.util.logging.Logger.getLogger(Modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgmenu;
    private javax.swing.ButtonGroup bgtopping;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnjumlahminus;
    private javax.swing.JButton btnjumlahplus;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdbmenu1;
    private javax.swing.JRadioButton rdbmenu2;
    private javax.swing.JRadioButton rdbmenu3;
    private javax.swing.JRadioButton rdbmenu4;
    private javax.swing.JRadioButton rdbtoping1;
    private javax.swing.JRadioButton rdbtoping2;
    private javax.swing.JRadioButton rdbtoping3;
    private javax.swing.JRadioButton rdbtoping4;
    private javax.swing.JTextField txtcash;
    private javax.swing.JTextField txtchange;
    private javax.swing.JTextField txtdiskon;
    private javax.swing.JTextField txthargasetelahdiskon;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
