/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author faizaaulia
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        Reset1 = new javax.swing.JButton();
        btnRefresh1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rdPerempuan = new javax.swing.JRadioButton();
        rdLaki = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("The Real Informatic School");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 30, 360, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORM BIODATA SISWA SMK TELKOM MALANG");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 620, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 70);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(null);

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama Siswa", "Jenis Kelamin", "Kelas", "Email", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 560, 380);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(230, 70, 570, 400);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(null);

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel4.add(btnEdit);
        btnEdit.setBounds(450, 10, 90, 30);

        btnAdd1.setText("SAVE");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd1);
        btnAdd1.setBounds(10, 11, 90, 30);

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete);
        btnDelete.setBounds(340, 10, 90, 30);

        Reset1.setText("CLEAR");
        Reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset1ActionPerformed(evt);
            }
        });
        jPanel4.add(Reset1);
        Reset1.setBounds(120, 10, 90, 30);

        btnRefresh1.setText("REFRESH");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnRefresh1);
        btnRefresh1.setBounds(230, 10, 90, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(230, 10, 570, 50);

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(0, 30, 210, 10);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Isian Data Siswa");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(10, 10, 120, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NIS");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(10, 40, 21, 15);
        jPanel5.add(txtNIS);
        txtNIS.setBounds(10, 60, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(10, 160, 120, 15);
        jPanel5.add(txtNama);
        txtNama.setBounds(10, 120, 200, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nama");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(10, 100, 60, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Kelas");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(10, 210, 60, 15);
        jPanel5.add(txtKelas);
        txtKelas.setBounds(10, 230, 200, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Alamat");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(10, 330, 60, 15);
        jPanel5.add(txtEmail);
        txtEmail.setBounds(10, 290, 200, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Email");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(10, 270, 60, 15);

        buttonGroup1.add(rdPerempuan);
        rdPerempuan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdPerempuan.setText("Perempuan");
        jPanel5.add(rdPerempuan);
        rdPerempuan.setBounds(100, 180, 87, 23);

        buttonGroup1.add(rdLaki);
        rdLaki.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdLaki.setText("Laki-laki");
        jPanel5.add(rdLaki);
        rdLaki.setBounds(10, 180, 65, 23);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(10, 350, 200, 90);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 10, 220, 460);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 800, 470);

        setSize(new java.awt.Dimension(806, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if("".equals(txtNIS.getText()) || "".equals(txtNama.getText()) || 
                "".equals(txtKelas.getText()) || "".equals(txtEmail.getText()) ||
                "".equals(txtAlamat.getText())){
            JOptionPane.showMessageDialog(this, "Harap lengkapi data","Error", JOptionPane.WARNING_MESSAGE);
        }else{
            String JK = "";
            if(rdLaki.isSelected())
                JK = "L";
            else
                JK = "P";
            
            String SQL = "UPDATE t_siswa SET "
                + "NamaSiswa='"+txtNama.getText()+"', JenisKelamin='"+JK+"', "
                +"Kelas='"+txtKelas.getText()+"', "
                +"Email='"+txtEmail.getText()+"', "
                +"Alamat='"+txtAlamat.getText()+"' " 
                +"WHERE NIS='"+txtNIS.getText()+"'";
            
            int status = KoneksiDB.execute(SQL);
            if(status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate","Sukses", JOptionPane.INFORMATION_MESSAGE);
                    selectData();                
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal diupdate","Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tbData.getSelectedRow();
        if(baris != -1) {
            String NIS = tbData.getValueAt(baris,0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if(status==1) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu!", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void Reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset1ActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtNIS.setText("");
        txtKelas.setText("");
        buttonGroup1.clearSelection();
        txtAlamat.setText("");
        txtEmail.setText("");
        
    }//GEN-LAST:event_Reset1ActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
        if("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText()) || 
            "".equals(txtKelas.getText()) || "".equals(txtNama.getText()) || "".equals(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String JK = "";
            if(rdLaki.isSelected()) {
                JK = "L";
            } else {
                JK = "P";
            }
            String SQL = "INSERT INTO t_siswa (NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat) "
                    + "VALUES('"+txtNIS.getText()+"','"+txtNama.getText()+"','"+JK+"',"
                    + "'"+txtKelas.getText()+"','"+txtEmail.getText()+"','"+txtAlamat.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if(status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        // TODO add your handling code here:
        int baris = tbData.getSelectedRow();
        if(baris != -1) {
            txtNIS.setText(tbData.getValueAt(baris,0).toString());
            txtNama.setText(tbData.getValueAt(baris,1).toString());
            if("Laki-laki".equals(tbData.getValueAt(baris,2).toString())) {
                rdLaki.setSelected(true);
            } else {
                rdPerempuan.setSelected(true);
            }
            txtKelas.setText(tbData.getValueAt(baris,3).toString());
            txtEmail.setText(tbData.getValueAt(baris,4).toString());
            txtAlamat.setText(tbData.getValueAt(baris,5).toString());
        }
    }//GEN-LAST:event_tbDataMouseClicked

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset1;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JTable tbData;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()){
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String JenisKelamin = "";
                if("L".equals(rs.getString(3))){
                    JenisKelamin = "Laki-laki";
                }else{
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(4);
                String Email = rs.getString(5);
                String Alamat = rs.getString(6);
                String data[] = {NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat};
                dtm.addRow(data);
            }
        }catch(SQLException ex){
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null,ex);
        }
        tbData.setModel(dtm);
    }
}
