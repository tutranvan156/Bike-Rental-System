/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tutra
 */
public class ThongTinKhach extends javax.swing.JFrame {

    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * @return the preparedStatement
     */
    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    /**
     * @param preparedStatement the preparedStatement to set
     */
    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }

    /**
     * @return the classname
     */
    public String getClassname() {
        return classname;
    }

    /**
     * @param classname the classname to set
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the btnAdd
     */
    public javax.swing.JButton getBtnAdd() {
        return btnAdd;
    }

    /**
     * @param btnAdd the btnAdd to set
     */
    public void setBtnAdd(javax.swing.JButton btnAdd) {
        this.btnAdd = btnAdd;
    }

    /**
     * @return the btnAdjust
     */
    public javax.swing.JButton getBtnAdjust() {
        return btnAdjust;
    }

    /**
     * @param btnAdjust the btnAdjust to set
     */
    public void setBtnAdjust(javax.swing.JButton btnAdjust) {
        this.btnAdjust = btnAdjust;
    }

    /**
     * @return the btnCancel
     */
    public javax.swing.JButton getBtnCancel() {
        return btnCancel;
    }

    /**
     * @param btnCancel the btnCancel to set
     */
    public void setBtnCancel(javax.swing.JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the tableThongTinKhach
     */
    public javax.swing.JTable getTableThongTinKhach() {
        return tableThongTinKhach;
    }

    /**
     * @param tableThongTinKhach the tableThongTinKhach to set
     */
    public void setTableThongTinKhach(javax.swing.JTable tableThongTinKhach) {
        this.tableThongTinKhach = tableThongTinKhach;
    }

    /**
     * @return the txtDiaChi
     */
    public javax.swing.JTextField getTxtDiaChi() {
        return txtDiaChi;
    }

    /**
     * @param txtDiaChi the txtDiaChi to set
     */
    public void setTxtDiaChi(javax.swing.JTextField txtDiaChi) {
        this.txtDiaChi = txtDiaChi;
    }

    /**
     * @return the txtDienThoai
     */
    public javax.swing.JTextField getTxtDienThoai() {
        return txtDienThoai;
    }

    /**
     * @param txtDienThoai the txtDienThoai to set
     */
    public void setTxtDienThoai(javax.swing.JTextField txtDienThoai) {
        this.txtDienThoai = txtDienThoai;
    }

    /**
     * @return the txtHoTen
     */
    public javax.swing.JTextField getTxtHoTen() {
        return txtHoTen;
    }

    /**
     * @param txtHoTen the txtHoTen to set
     */
    public void setTxtHoTen(javax.swing.JTextField txtHoTen) {
        this.txtHoTen = txtHoTen;
    }

    /**
     * @return the txtMaSo
     */
    public javax.swing.JTextField getTxtMaSo() {
        return txtMaSo;
    }

    /**
     * @param txtMaSo the txtMaSo to set
     */
    public void setTxtMaSo(javax.swing.JTextField txtMaSo) {
        this.txtMaSo = txtMaSo;
    }
    private Connection connection;
    private PreparedStatement preparedStatement;
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/thuexe";
    private String username = "root";
    private String password = "";
    /**
     * Creates new form ThemXe
     */
    public ThongTinKhach() {
        initComponents();
        btnAdd.setEnabled(true);
      
        btnAdjust.setEnabled(false);
        autoMaSo();
        tableUpdate();
        txtHoTen.setText("");
        txtDiaChi.setText("");
        txtDienThoai.setText("");
        txtHoTen.requestFocus();        
    }
    public void tableUpdate() {
        String[] header = {"Mã số", "Họ và tên", "Địa chỉ", "Số điện thoại"};
        DefaultTableModel model = new DefaultTableModel(null, header);
        
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("Select * from thong_tin_khach_hang"));
            ResultSet resultSet = getPreparedStatement().executeQuery();
            while (resultSet.next()) {
                Vector v = new Vector();
                v.add(resultSet.getString("maso"));
                v.add(resultSet.getString("hoten"));
                v.add(resultSet.getString("diachi"));
                v.add(resultSet.getString("sodienthoai"));
                model.addRow(v);
            }
            getTableThongTinKhach().setModel(model);
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongTinKhach.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinKhach.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaSo = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnAdjust = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtDienThoai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableThongTinKhach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin khách hàng"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Mã số");

        jLabel2.setText("Họ và tên");

        jLabel3.setText("Địa chỉ");

        jLabel4.setText("Điện thoại");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnAdjust.setText("Sửa");
        btnAdjust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjustActionPerformed(evt);
            }
        });

        btnCancel.setText("Thoát");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdjust, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(txtDiaChi)
                                    .addComponent(txtMaSo)
                                    .addComponent(txtDienThoai)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdjust)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableThongTinKhach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma so", "Loai", "Kieu", "Chua thue"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableThongTinKhach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableThongTinKhachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableThongTinKhach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String maSo = getTxtMaSo().getText();
        String hoTen = getTxtHoTen().getText();
        String diaChi = getTxtDiaChi().getText();
        String dienThoai = getTxtDienThoai().getText();
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword())); 
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("insert into thong_tin_khach_hang(maso, hoten, diachi, sodienthoai) values(?, ?, ?, ?)"));
            getPreparedStatement().setString(1, maSo);
            getPreparedStatement().setString(2, hoTen);
            getPreparedStatement().setString(3, diaChi);
            getPreparedStatement().setString(4, dienThoai);
            getPreparedStatement().executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công");
            autoMaSo();
            getTxtHoTen().setText("");
            getTxtDiaChi().setText("");
            getTxtDienThoai().setText("");
            getTxtHoTen().requestFocus();
            tableUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongTinKhach.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinKhach.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        this.hide();
        main.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tableThongTinKhachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThongTinKhachMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel row = (DefaultTableModel) getTableThongTinKhach().getModel();
        int selectIndex = getTableThongTinKhach().getSelectedRow();
        getTxtMaSo().setText((String) row.getValueAt(selectIndex, 0));
        getTxtHoTen().setText((String) row.getValueAt(selectIndex, 1));
        getTxtDiaChi().setText((String) row.getValueAt(selectIndex, 2));
        getTxtDienThoai().setText((String) row.getValueAt(selectIndex, 3));
        getBtnAdd().setEnabled(false);
        getBtnAdjust().setEnabled(true);

        
    }//GEN-LAST:event_tableThongTinKhachMouseClicked

    private void btnAdjustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjustActionPerformed
        // TODO add your handling code here:
        
        
        DefaultTableModel row = (DefaultTableModel) getTableThongTinKhach().getModel();
        int selectIndex = getTableThongTinKhach().getSelectedRow();
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword())); 
            String maSo = (String) row.getValueAt(selectIndex, 0);
            String hoTen = getTxtHoTen().getText();
            String diaChi = getTxtDiaChi().getText();
            String dienThoai = getTxtDienThoai().getText();
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("update thong_tin_khach_hang set hoten = ?, diachi = ?, sodienthoai = ? where maso = ?"));        
            getPreparedStatement().setString(1, hoTen);
            getPreparedStatement().setString(2, diaChi);
            getPreparedStatement().setString(3, dienThoai);
            getPreparedStatement().setString(4, maSo);
            getPreparedStatement().executeUpdate();
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công");
            getTxtDiaChi().setText("");
            getTxtDienThoai().setText("");
            getTxtHoTen().setText("");
            tableUpdate();
            autoMaSo();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongTinKhach.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinKhach.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAdjustActionPerformed
    
    /**
     * đây là phương thức dùng để tự động tăng id của khách hàng lên 1 đơn vị 
     */
    public void autoMaSo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            java.sql.Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("Select Max(maso) from thong_tin_khach_hang");
            resultSet.next();
            String maSo = resultSet.getString("Max(maso)");
            if (resultSet.getString("Max(maso)") == null) {
                getTxtMaSo().setText("1");
            } else {
                int id = Integer.parseInt(maSo);
                id++;
                getTxtMaSo().setText(String.valueOf(id));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongTinKhach.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinKhach.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
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
            java.util.logging.Logger.getLogger(ThongTinKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinKhach().setVisible(true);
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdjust;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableThongTinKhach;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSo;
    // End of variables declaration//GEN-END:variables
}
