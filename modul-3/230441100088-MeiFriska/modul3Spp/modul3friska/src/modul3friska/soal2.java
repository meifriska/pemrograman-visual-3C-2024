/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul3friska;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author lanny aprilia
 */
public class soal2 extends javax.swing.JFrame {
    private ArrayList<String> daftarBulanLunas = new ArrayList<>();
    private DefaultTableModel tableModel;

    public soal2() {
        initComponents();
        this.setLocationRelativeTo(null);
        totalbayar.setEditable(false);
        status.setEditable(false);
        
        tableModel = new DefaultTableModel(new String[]{"Nama", "Bulan", "Jumlah SPP", "Status"}, 0);
        tabel2.setModel(tableModel);
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox8 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        bulan1 = new javax.swing.JCheckBox();
        bulan2 = new javax.swing.JCheckBox();
        bulan3 = new javax.swing.JCheckBox();
        bulan4 = new javax.swing.JCheckBox();
        bulan5 = new javax.swing.JCheckBox();
        bulan6 = new javax.swing.JCheckBox();
        bulan7 = new javax.swing.JCheckBox();
        bulan8 = new javax.swing.JCheckBox();
        bulan9 = new javax.swing.JCheckBox();
        bulan10 = new javax.swing.JCheckBox();
        bulan11 = new javax.swing.JCheckBox();
        bulan12 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jumlahspp = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        totalbayar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        hitung = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        triwayat = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel2 = new javax.swing.JTable();

        jCheckBox8.setText("September");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(228, 224, 225));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        jLabel1.setText("Pembayaran SPP");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 201, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\lanny aprilia\\Downloads\\logo.png")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 130, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\lanny aprilia\\Downloads\\logo2.png")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 90));

        jPanel4.setBackground(new java.awt.Color(214, 192, 179));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("BULAN");
        jPanel4.add(jLabel2);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 100, 110));

        jPanel5.setBackground(new java.awt.Color(214, 192, 179));
        jPanel5.setLayout(new java.awt.GridLayout(2, 6));

        bulan1.setText("Januari");
        jPanel5.add(bulan1);

        bulan2.setText("Febryuari");
        jPanel5.add(bulan2);

        bulan3.setText("Maret");
        bulan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulan3ActionPerformed(evt);
            }
        });
        jPanel5.add(bulan3);

        bulan4.setText("April");
        jPanel5.add(bulan4);

        bulan5.setText("Mei");
        jPanel5.add(bulan5);

        bulan6.setText("Juni");
        jPanel5.add(bulan6);

        bulan7.setText("Juli");
        jPanel5.add(bulan7);

        bulan8.setText("Agustus");
        jPanel5.add(bulan8);

        bulan9.setText("September");
        jPanel5.add(bulan9);

        bulan10.setText("Oktober");
        jPanel5.add(bulan10);

        bulan11.setText("November");
        jPanel5.add(bulan11);

        bulan12.setText("Desember");
        jPanel5.add(bulan12);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 110));

        jPanel6.setBackground(new java.awt.Color(228, 224, 225));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(214, 192, 179));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("SPP perbulan");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Status");

        jumlahspp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahsppActionPerformed(evt);
            }
        });

        status.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Total Bayar");

        totalbayar.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nama)
                    .addComponent(jumlahspp)
                    .addComponent(status)
                    .addComponent(totalbayar, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahspp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 410, 140));

        tabel1.setBackground(new java.awt.Color(214, 192, 179));
        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Jan", "Feb", "Mar", "Apr", "Mei", "Juni", "Juli", "Agust", "Sep", "Okt", "Nov", "Des"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabel1);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 670, 50));

        jPanel8.setBackground(new java.awt.Color(214, 192, 179));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hitung.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        jPanel8.add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, -1));

        reset.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel8.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, -1));

        kembali.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        kembali.setText("kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        jPanel8.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 80, -1));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 160, 110));

        triwayat.setColumns(20);
        triwayat.setRows(5);
        jScrollPane4.setViewportView(triwayat);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 270, 160));

        tabel2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nama", "bulan", "jumlah SPP"
            }
        ));
        jScrollPane3.setViewportView(tabel2);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 690, 100));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 200, 680, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jumlahsppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahsppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahsppActionPerformed

        
    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
    if (nama.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukan Nama Bang.", "Info", JOptionPane.ERROR_MESSAGE);
        return;
    }
    else if (!(bulan1.isSelected() || bulan2.isSelected() || bulan3.isSelected() || bulan4.isSelected() ||
               bulan5.isSelected() || bulan6.isSelected() || bulan7.isSelected() || bulan8.isSelected() ||
               bulan9.isSelected() || bulan10.isSelected() || bulan11.isSelected() || bulan12.isSelected())) {
        JOptionPane.showMessageDialog(this, "Pilih setidaknya satu bulan yang harus dibayar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!isSppValid()) {
        JOptionPane.showMessageDialog(this, "Jumlah SPP harus berupa angka yang valid dan tidak boleh negatif.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String namaInput = nama.getText();
    double spp = Double.parseDouble(jumlahspp.getText());
    daftarBulanLunas.clear();

    StringBuilder riwayat = new StringBuilder("Nama: " + nama.getText() + "\nBulan yang sudah dibayar:\n");
    StringBuilder bulanBelumDibayar = new StringBuilder("\n\nBulan yang belum dibayar:\n");
    StringBuilder bulanLunas = new StringBuilder();
    StringBuilder statusPembayaran = new StringBuilder();
    int jumlahBulanDipilih = 0; 
    int jumlahBulanBelumDibayar = 0; 

    if (bulan1.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("Januari - Lunas\n");
        bulanLunas.append("januari\n,");
        daftarBulanLunas.add("Januari");
        bulan1.setEnabled(false);
        tabel1.setValueAt(true, tabel1.getRowCount() - 1, 1);
    } else {
        bulanBelumDibayar.append("Januari\n");
        jumlahBulanBelumDibayar++;
    }
    if (bulan2.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("Februari - Lunas\n");
         bulanLunas.append("Februari\n,");
        daftarBulanLunas.add("Februari");
        bulan2.setEnabled(false);
        tabel1.setValueAt(true, tabel1.getRowCount() - 1, 2); 
    } else {
        bulanBelumDibayar.append("Februari\n");
        jumlahBulanBelumDibayar++;
    }
    if (bulan3.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("Maret - Lunas\n");
        bulanLunas.append("Maret\n,");
        daftarBulanLunas.add("Maret");
        bulan3.setEnabled(false);
         tabel1.setValueAt(true, tabel1.getRowCount() - 1, 3); 
    } else {
        bulanBelumDibayar.append("Maret\n");
        jumlahBulanBelumDibayar++;
    }
    if (bulan4.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("April - Lunas\n");
         bulanLunas.append("April\n,");
        daftarBulanLunas.add("April");
        bulan4.setEnabled(false);
        tabel1.setValueAt(true, tabel1.getRowCount() - 1, 4); 
    } else {
        bulanBelumDibayar.append("April\n");
        jumlahBulanBelumDibayar++;
    }
    if (bulan5.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("Mei - Lunas\n");
         bulanLunas.append("Mei\n,");
        daftarBulanLunas.add("Mei");
        bulan5.setEnabled(false);
         tabel1.setValueAt(true, tabel1.getRowCount() - 1, 5); 
    } else {
        bulanBelumDibayar.append("Mei\n");
        jumlahBulanBelumDibayar++;
    }
    if (bulan6.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("Juni - Lunas\n");
         bulanLunas.append("juni\n,");
        daftarBulanLunas.add("Juni");
        bulan6.setEnabled(false);
         tabel1.setValueAt(true, tabel1.getRowCount() - 1, 6); 
    } else {
        bulanBelumDibayar.append("Juni\n");
        jumlahBulanBelumDibayar++;
    }
    if (bulan7.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("Juli - Lunas\n");
         bulanLunas.append("juli\n,");
        daftarBulanLunas.add("Juli");
        bulan7.setEnabled(false);
         tabel1.setValueAt(true, tabel1.getRowCount() - 1, 7); 
    } else {
        bulanBelumDibayar.append("Juli\n");
        jumlahBulanBelumDibayar++;
    }
    if (bulan8.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("Agustus - Lunas\n");
         bulanLunas.append("Agustus\n,");
        daftarBulanLunas.add("Agustus");
        bulan8.setEnabled(false);
         tabel1.setValueAt(true, tabel1.getRowCount() - 1, 8); 
    } else {
        bulanBelumDibayar.append("Agustus\n");
        jumlahBulanBelumDibayar++;
    }
    if (bulan9.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("September - Lunas\n");
         bulanLunas.append("September\n,");
        daftarBulanLunas.add("September");
        bulan9.setEnabled(false);
        tabel1.setValueAt(true, tabel1.getRowCount() - 1, 9); 
    } else {
        bulanBelumDibayar.append("September\n");
        jumlahBulanBelumDibayar++;
    }
    if (bulan10.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("Oktober - Lunas\n");
         bulanLunas.append("Oktober\n,");
        daftarBulanLunas.add("Oktober");
        bulan10.setEnabled(false);
        tabel1.setValueAt(true, tabel1.getRowCount() - 1, 10); 
    } else {
        bulanBelumDibayar.append("Oktober\n");
        jumlahBulanBelumDibayar++;
    }
    if (bulan11.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("November - Lunas\n");
         bulanLunas.append("November\n,");
        daftarBulanLunas.add("November");
        bulan11.setEnabled(false);
        tabel1.setValueAt(true, tabel1.getRowCount() - 1, 11); 
    } else {
        bulanBelumDibayar.append("November\n");
        jumlahBulanBelumDibayar++;
    }
    if (bulan12.isSelected()) {
        jumlahBulanDipilih++;
        riwayat.append("Desember - Lunas\n");
         bulanLunas.append("Desember\n,");
         
        daftarBulanLunas.add("Desember");
        bulan12.setEnabled(false);
        tabel1.setValueAt(true, tabel1.getRowCount() - 1, 12); 
    } else {
        bulanBelumDibayar.append("Desember\n");
        jumlahBulanBelumDibayar++;
    }

    double totalPembayaran = jumlahBulanDipilih * spp;
//    String statusPembayaran = jumlahBulanDipilih == 12 ? "Lunas" : "Menunggak";
    if (jumlahBulanBelumDibayar == 0) {
        status.setText("Sudah Lunas");
    } else {
        status.setText("Menunggak");
        riwayat.append(bulanBelumDibayar.toString());
    }
    tableModel.setRowCount(0); // Hapus data lama
    tableModel.addRow(new Object[]{namaInput, bulanLunas.toString(), totalPembayaran,totalPembayaran});
    totalbayar.setText("Rp " + totalPembayaran);
    triwayat.setText(riwayat.toString());
//    status.setText(statusPembayaran);
    }//GEN-LAST:event_hitungActionPerformed
    
    
    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
     int pilihan = JOptionPane.showConfirmDialog(this, "Apakah kamu yakin ingin menghapus riwayat pembayaran?", "Konfirmasi Penghapusan", JOptionPane.YES_NO_OPTION);

        if (pilihan == JOptionPane.YES_OPTION) {
            nama.setText("");
            bulan1.setSelected(false);
            bulan2.setSelected(false);
            bulan3.setSelected(false);
            bulan4.setSelected(false);
            bulan5.setSelected(false);
            bulan6.setSelected(false);
            bulan7.setSelected(false);
            bulan8.setSelected(false);
            bulan9.setSelected(false);
            bulan10.setSelected(false);
            bulan11.setSelected(false);
            bulan12.setSelected(false);
            bulan1.setEnabled(true);
            bulan2.setEnabled(true);
            bulan3.setEnabled(true);
            bulan4.setEnabled(true);
            bulan5.setEnabled(true);
            bulan6.setEnabled(true);
            bulan7.setEnabled(true);
            bulan8.setEnabled(true);
            bulan9.setEnabled(true);
            bulan10.setEnabled(true);
            bulan11.setEnabled(true);
            bulan12.setEnabled(true);
            triwayat.setText("");
            jumlahspp.setText("");
            totalbayar.setText("");
            status.setText("");
        }
               
    }//GEN-LAST:event_resetActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
    System.exit(0);
    }//GEN-LAST:event_kembaliActionPerformed

    private void bulan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulan3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bulan3ActionPerformed
     private boolean isSppValid() {
        try {
            double spp = Double.parseDouble(jumlahspp.getText());
            return spp >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    
    
    }
     private void tampilkanDaftarBulanLunas() {
        StringBuilder daftarLunas = new StringBuilder("=================================\nDaftar Bulan yang Sudah Dibayar\n=================================\n");
        for (String bulan : daftarBulanLunas) {
            daftarLunas.append("| "+bulan +" (Lunas)"+ "\n-----------------------------------\n");
        }
            JOptionPane.showMessageDialog(this, daftarLunas.toString(), "Riwayat Pembayaran", JOptionPane.INFORMATION_MESSAGE);
    }
     
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
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bulan1;
    private javax.swing.JCheckBox bulan10;
    private javax.swing.JCheckBox bulan11;
    private javax.swing.JCheckBox bulan12;
    private javax.swing.JCheckBox bulan2;
    private javax.swing.JCheckBox bulan3;
    private javax.swing.JCheckBox bulan4;
    private javax.swing.JCheckBox bulan5;
    private javax.swing.JCheckBox bulan6;
    private javax.swing.JCheckBox bulan7;
    private javax.swing.JCheckBox bulan8;
    private javax.swing.JCheckBox bulan9;
    private javax.swing.JButton hitung;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlahspp;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField nama;
    private javax.swing.JButton reset;
    private javax.swing.JTextField status;
    private javax.swing.JTable tabel1;
    private javax.swing.JTable tabel2;
    private javax.swing.JTextField totalbayar;
    private javax.swing.JTextArea triwayat;
    // End of variables declaration//GEN-END:variables
}
