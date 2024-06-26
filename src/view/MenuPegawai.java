/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.PakaianController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import model.Pakaian;

/**
 *
 * @author MSI Modern 14
 */
public class MenuPegawai extends javax.swing.JFrame {

    /**
     * Creates new form MenuPegawai
     */
    public MenuPegawai() {
        initComponents();
        TableData();
    }
        public static MenuPegawai getInstance() {
        return new MenuPegawai();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgJenis = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPakaian = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtDesain = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtBahan = new javax.swing.JTextField();
        txtWarna = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        cbUkuran = new javax.swing.JComboBox<>();
        rbBaju = new javax.swing.JRadioButton();
        rbCelana = new javax.swing.JRadioButton();
        Jaket = new javax.swing.JRadioButton();
        btnCelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(812, 612));
        jPanel1.setMinimumSize(new java.awt.Dimension(812, 612));
        jPanel1.setPreferredSize(new java.awt.Dimension(812, 612));

        jLabel1.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel1.setText("Jenis");

        jLabel2.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel2.setText("Model");

        jLabel3.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel3.setText("Desain");

        jLabel4.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel4.setText("Bahan");

        jLabel5.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel5.setText("Warna");

        jLabel6.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel6.setText("ukuran");

        jLabel7.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        jLabel7.setText("harga");

        tabelPakaian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pakaian", "Jenis", "Model", "Desain", "Bahan", "Warna", "Ukuran", "Harga"
            }
        ));
        tabelPakaian.setMaximumSize(null);
        tabelPakaian.setMinimumSize(null);
        tabelPakaian.setPreferredSize(null);
        tabelPakaian.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelPakaian.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelPakaian.setShowGrid(false);
        jScrollPane1.setViewportView(tabelPakaian);

        btnTambah.setBackground(new java.awt.Color(153, 255, 255));
        btnTambah.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 204, 102));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(153, 255, 255));
        btnUbah.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 204, 102));
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(153, 255, 255));
        btnHapus.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 204, 102));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtDesain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesainActionPerformed(evt);
            }
        });
        txtDesain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDesainKeyTyped(evt);
            }
        });

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });
        txtModel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModelKeyTyped(evt);
            }
        });

        txtBahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBahanActionPerformed(evt);
            }
        });
        txtBahan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBahanKeyTyped(evt);
            }
        });

        txtWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarnaActionPerformed(evt);
            }
        });
        txtWarna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWarnaKeyTyped(evt);
            }
        });

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHargaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaKeyTyped(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Buxton Sketch", 3, 48)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 204, 102));
        jLabel31.setText("MENU PEGAWAI - DATA PAKAIAN ");
        jLabel31.setPreferredSize(new java.awt.Dimension(532, 60));

        btnKembali.setBackground(new java.awt.Color(153, 255, 255));
        btnKembali.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 204, 102));
        btnKembali.setText("Kembali Ke Menu Login");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnHistory.setBackground(new java.awt.Color(153, 255, 255));
        btnHistory.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        btnHistory.setForeground(new java.awt.Color(255, 204, 102));
        btnHistory.setActionCommand("History Pembelian");
        btnHistory.setLabel("History Pembelian");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        cbUkuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Ukuran", "XS", "S", "M", "L", "XL", "XXL", "XXXL", "XXXXL" }));

        bgJenis.add(rbBaju);
        rbBaju.setText("Baju");
        rbBaju.setDoubleBuffered(true);
        rbBaju.setMultiClickThreshhold(1L);
        rbBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBajuActionPerformed(evt);
            }
        });

        bgJenis.add(rbCelana);
        rbCelana.setText("Celana");
        rbCelana.setContentAreaFilled(false);
        rbCelana.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbCelana.setDoubleBuffered(true);
        rbCelana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCelanaActionPerformed(evt);
            }
        });

        bgJenis.add(Jaket);
        Jaket.setText("Jaket");
        Jaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JaketActionPerformed(evt);
            }
        });

        btnCelar.setBackground(new java.awt.Color(153, 255, 255));
        btnCelar.setFont(new java.awt.Font("Buxton Sketch", 1, 18)); // NOI18N
        btnCelar.setForeground(new java.awt.Color(255, 204, 102));
        btnCelar.setText("Clear");
        btnCelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(241, 241, 241)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(rbBaju, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbCelana, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(Jaket, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDesain, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtBahan, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(311, 311, 311)
                            .addComponent(btnHistory))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(288, 288, 288)
                            .addComponent(btnKembali))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btnCelar)
                        .addGap(22, 22, 22)
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbah)
                        .addGap(27, 27, 27)
                        .addComponent(btnHapus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rbBaju)
                    .addComponent(rbCelana)
                    .addComponent(Jaket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDesain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtWarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnCelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKembali)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void TableData() {
        DefaultTableModel tableModel = (DefaultTableModel) tabelPakaian.getModel();
        tableModel.setRowCount(0);
        List<List<String>> data = Pakaian.getDataPakaian();
        for (List<String> row : data) {
            tableModel.addRow(row.toArray());
        }
        tabelPakaian.setDefaultEditor(Object.class, null);
    }

    public void clear() {
        bgJenis.clearSelection();
        txtModel.setText("");
        txtDesain.setText("");
        txtBahan.setText("");
        txtWarna.setText("");
        cbUkuran.setSelectedIndex(0);
        txtHarga.setText("");
    }

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed

// TODO add your handling code here:
        if (bgJenis.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Inputkan Jenis Pakaian! ");
        } else if (txtModel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inputkan Model Pakaian! ");
            txtModel.requestFocus();
        } else if (txtDesain.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inputkan Desain Pakaian! ");
            txtDesain.requestFocus();
        } else if (txtBahan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inputkan Bahan Pakaian! ");
            txtBahan.requestFocus();
        } else if (txtWarna.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inputkan Warna Pakaian! ");
            txtWarna.requestFocus();
        } else if (cbUkuran.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Inputkan Ukuran Pakaian! ");
        } else if (txtHarga.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inputkan Harga Pakaian! ");
            txtHarga.requestFocus();
        } else {
            String Jenis = "";
            for (Enumeration<AbstractButton> buttons = bgJenis.getElements(); buttons.hasMoreElements();) {
                AbstractButton button = buttons.nextElement();
                if (button.getModel() == bgJenis.getSelection()) {
                    Jenis = button.getText();
                }
            }
            int response = JOptionPane.showConfirmDialog(null, "Apakah Data Pakaian Sudah Benar ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                Pakaian.TambahPakaian(Pakaian.getLastId(),Jenis, txtModel.getText(), txtDesain.getText(), txtBahan.getText(), txtWarna.getText(), cbUkuran.getSelectedItem().toString(), txtHarga.getText());
                JOptionPane.showMessageDialog(null, "Data pakaian Berhasil Ditambahkan!");
                TableData();
                clear();
            }
            else{JOptionPane.showMessageDialog(null, "Penambahan Pakaian Dibatalkan!");}
        }

    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        int row = tabelPakaian.getSelectedRow();
        if (row >= 0) {
            Pakaian.idUbahData = tabelPakaian.getValueAt(row, 0).toString();
            UbahView.getInstance().setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Tidak ada baris pada tabel yang dipilih! ");
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int row = tabelPakaian.getSelectedRow();
        if (row >= 0) {
            DefaultTableModel model = (DefaultTableModel) tabelPakaian.getModel();
                String id = model.getValueAt(row, 0).toString();
            int response = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus data Pakaian dengan id "+id+" ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                PakaianController.HapusPakaian(id);
                JOptionPane.showMessageDialog(null, "Data pakaian Berhasil Dihapus!");
                TableData();
            }else{JOptionPane.showMessageDialog(null, "Penghapusan Pakaian Dibatalkan!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tidak ada baris pada tabel yang dipilih! ");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtDesainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesainActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtBahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBahanActionPerformed

    private void txtWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarnaActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginView.getInstance().setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
        HistoryPembelianPegawai.getInstance().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void txtHargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyPressed

    }//GEN-LAST:event_txtHargaKeyPressed

    private void txtHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
        boolean max = txtModel.getText().length() > 40;
        if (max) {
            evt.consume();
        }
    }//GEN-LAST:event_txtHargaKeyTyped

    private void rbBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBajuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBajuActionPerformed

    private void JaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JaketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JaketActionPerformed

    private void rbCelanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCelanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCelanaActionPerformed

    private void btnCelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelarActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnCelarActionPerformed

    private void txtModelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModelKeyTyped
        // TODO add your handling code here:
        boolean max = txtModel.getText().length() > 40;
        if (max) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModelKeyTyped

    private void txtDesainKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesainKeyTyped
        // TODO add your handling code here:
        boolean max = txtDesain.getText().length() > 40;
        if (max) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDesainKeyTyped

    private void txtBahanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBahanKeyTyped
        // TODO add your handling code here:
        boolean max = txtBahan.getText().length() > 40;
        if (max) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBahanKeyTyped

    private void txtWarnaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWarnaKeyTyped
        // TODO add your handling code here:
        boolean max = txtModel.getText().length() > 40;
        if (max) {
            evt.consume();
        }
    }//GEN-LAST:event_txtWarnaKeyTyped

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
            java.util.logging.Logger.getLogger(MenuPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPegawai.getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Jaket;
    private javax.swing.ButtonGroup bgJenis;
    private javax.swing.JButton btnCelar;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbUkuran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbBaju;
    private javax.swing.JRadioButton rbCelana;
    private javax.swing.JTable tabelPakaian;
    private javax.swing.JTextField txtBahan;
    private javax.swing.JTextField txtDesain;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtWarna;
    // End of variables declaration//GEN-END:variables
}
