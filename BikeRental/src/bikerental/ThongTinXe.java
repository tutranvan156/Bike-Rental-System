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
public class ThongTinXe extends javax.swing.JFrame {

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
     * @return the btnDelete
     */
    public javax.swing.JButton getBtnDelete() {
        return btnDelete;
    }

    /**
     * @param btnDelete the btnDelete to set
     */
    public void setBtnDelete(javax.swing.JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    /**
     * @return the comboBoxChuaThue
     */
    public javax.swing.JComboBox<String> getComboBoxChuaThue() {
        return comboBoxChuaThue;
    }

    /**
     * @param comboBoxChuaThue the comboBoxChuaThue to set
     */
    public void setComboBoxChuaThue(javax.swing.JComboBox<String> comboBoxChuaThue) {
        this.comboBoxChuaThue = comboBoxChuaThue;
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
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
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
     * @return the tableThongTinXe
     */
    public javax.swing.JTable getTableThongTinXe() {
        return tableThongTinXe;
    }

    /**
     * @param tableThongTinXe the tableThongTinXe to set
     */
    public void setTableThongTinXe(javax.swing.JTable tableThongTinXe) {
        this.tableThongTinXe = tableThongTinXe;
    }

    /**
     * @return the txtBienSo
     */
    public javax.swing.JTextField getTxtBienSo() {
        return txtBienSo;
    }

    /**
     * @param txtBienSo the txtBienSo to set
     */
    public void setTxtBienSo(javax.swing.JTextField txtBienSo) {
        this.txtBienSo = txtBienSo;
    }

    /**
     * @return the txtLoaiXe
     */
    public javax.swing.JTextField getTxtLoaiXe() {
        return txtLoaiXe;
    }

    /**
     * @param txtLoaiXe the txtLoaiXe to set
     */
    public void setTxtLoaiXe(javax.swing.JTextField txtLoaiXe) {
        this.txtLoaiXe = txtLoaiXe;
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

    /**
     * @return the txtPhiThue
     */
    public javax.swing.JTextField getTxtPhiThue() {
        return txtPhiThue;
    }

    /**
     * @param txtPhiThue the txtPhiThue to set
     */
    public void setTxtPhiThue(javax.swing.JTextField txtPhiThue) {
        this.txtPhiThue = txtPhiThue;
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
    public ThongTinXe() {
        initComponents();
        btnAdd.setEnabled(true);
        btnDelete.setEnabled(false);
        btnAdjust.setEnabled(false);
        autoMaSo();
        txtBienSo.setText("");
        txtLoaiXe.setText("");
        comboBoxChuaThue.setSelectedIndex(0);
        comboBoxChuaThue.setEnabled(false);
        txtBienSo.requestFocus();
        txtPhiThue.setText("");
        tableUpdate();
    }
    public void tableUpdate() {
        String[] header = {"Mã số", "Biển số", "Loại xe", "Chưa thuê", "Phí thuê"};
        DefaultTableModel model = new DefaultTableModel(null, header);
        
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("Select * from thong_tin_xe"));
            ResultSet resultSet = getPreparedStatement().executeQuery();
            while (resultSet.next()) {
                Vector v = new Vector();
                v.add(resultSet.getString("maso"));
                v.add(resultSet.getString("bienso"));
                v.add(resultSet.getString("loaixe"));
                v.add(resultSet.getString("chuathue"));
                v.add(resultSet.getString("phi"));
                model.addRow(v);
            }
            getTableThongTinXe().setModel(model);
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ThongTinXe.class.getName()).log(Level.SEVERE, null, ex);
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
        txtBienSo = new javax.swing.JTextField();
        txtLoaiXe = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdjust = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        comboBoxChuaThue = new javax.swing.JComboBox<>();
        txtPhiThue = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableThongTinXe = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin xe"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Mã số");

        jLabel2.setText("Biển số");

        jLabel3.setText("Loại xe");

        jLabel4.setText("Chưa thuê");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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

        comboBoxChuaThue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        comboBoxChuaThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxChuaThueActionPerformed(evt);
            }
        });

        jLabel5.setText("Phí thuê");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(btnAdjust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPhiThue)
                    .addComponent(txtBienSo)
                    .addComponent(txtLoaiXe)
                    .addComponent(txtMaSo)
                    .addComponent(comboBoxChuaThue, 0, 147, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhiThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboBoxChuaThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdjust)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        tableThongTinXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma so", "Loai", "Kieu", "Chua thue", "Phi thue"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableThongTinXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableThongTinXeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableThongTinXe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String maSo = getTxtMaSo().getText();
        String bienSo = getTxtBienSo().getText();
        String loaiXe = getTxtLoaiXe().getText();
        String chuaThue = getComboBoxChuaThue().getSelectedItem().toString();
        String phiThue = getTxtPhiThue().getText();
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword())); 
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("insert into thong_tin_xe(maso, bienso, loaixe, chuathue, phi) values(?, ?, ?, ?, ?)"));
            getPreparedStatement().setString(1, maSo);
            getPreparedStatement().setString(2, bienSo);
            getPreparedStatement().setString(3, loaiXe);
            getPreparedStatement().setString(4, chuaThue);
            getPreparedStatement().setString(5, phiThue);
            getPreparedStatement().executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm xe thành công");
            autoMaSo();
            getTxtBienSo().setText("");
            getTxtLoaiXe().setText("");
            getComboBoxChuaThue().setSelectedIndex(0);
            getTxtBienSo().requestFocus();
            getTxtPhiThue().setText("");
            tableUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ThongTinXe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        this.hide();
        main.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void comboBoxChuaThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxChuaThueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxChuaThueActionPerformed

    private void tableThongTinXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThongTinXeMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel row = (DefaultTableModel) getTableThongTinXe().getModel();
        int selectIndex = getTableThongTinXe().getSelectedRow();
        getTxtMaSo().setText((String) row.getValueAt(selectIndex, 0));
        getTxtBienSo().setText((String) row.getValueAt(selectIndex, 1));
        getTxtLoaiXe().setText((String) row.getValueAt(selectIndex, 2));
        getComboBoxChuaThue().setSelectedItem(row.getValueAt(selectIndex, 3));
        getTxtPhiThue().setText((String) row.getValueAt(selectIndex, 4));
        getBtnAdd().setEnabled(false);
        getBtnDelete().setEnabled(true);
        getBtnAdjust().setEnabled(true);
        
    }//GEN-LAST:event_tableThongTinXeMouseClicked

    private void btnAdjustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjustActionPerformed
        // TODO add your handling code here:
        
        
        DefaultTableModel row = (DefaultTableModel) getTableThongTinXe().getModel();
        int selectIndex = getTableThongTinXe().getSelectedRow();
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword())); 
            String maSo = (String) row.getValueAt(selectIndex, 0);
            String bienSo = getTxtBienSo().getText();
            String loaiXe = getTxtLoaiXe().getText();
            String chuaThue = (String) getComboBoxChuaThue().getSelectedItem();
            String phiThue = (String) getTxtPhiThue().getText();
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("update thong_tin_xe set bienso = ? , loaixe = ?, chuathue = ? , phi = ? where maso = ?"));        
            getPreparedStatement().setString(1, bienSo);
            getPreparedStatement().setString(2, loaiXe);
            getPreparedStatement().setString(3, chuaThue);          
            getPreparedStatement().setString(4, phiThue);
            getPreparedStatement().setString(5, maSo);
            getPreparedStatement().executeUpdate();
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công");
            autoMaSo();
            getTxtBienSo().setText("");
            getTxtLoaiXe().setText("");
            getComboBoxChuaThue().setSelectedIndex(-1);
            getTxtBienSo().requestFocus();
            getTxtPhiThue().setText("");
            tableUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ThongTinXe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdjustActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel row = (DefaultTableModel) getTableThongTinXe().getModel();
        int selectIndex = getTableThongTinXe().getSelectedRow();
        int dialogResult = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không", "Warning", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                Class.forName(getClassname());
                setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
                String chuaThue = (String) row.getValueAt(selectIndex, 3);
                
                if (chuaThue.equals("No")) {
                    JOptionPane.showMessageDialog(this, "Không thể xóa xe đang được thuê");
                } else {
                    String maSo = (String) row.getValueAt(selectIndex, 0);
                    setPreparedStatement((PreparedStatement) getConnection().prepareStatement("delete from thong_tin_xe where maso = ?"));            
                    getPreparedStatement().setString(1, maSo);
                    getPreparedStatement().executeUpdate();
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    getTxtBienSo().setText("");
                    getTxtLoaiXe().setText("");
                    getTxtBienSo().requestFocus();
                    getTxtPhiThue().setText("");
                    tableUpdate();
                    autoMaSo(); 
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ThongTinXe.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }       
                
                
                
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    /**
     * đây là phương thức dùng để tự động tăng id của xe lên 1 đơn vị 
     */
    public void autoMaSo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            java.sql.Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("Select Max(maso) from thong_tin_xe");
            resultSet.next();
            String maSo = resultSet.getString("Max(maso)");
            if (resultSet.getString("Max(maso)") == null) {
                getTxtMaSo().setText("1");
            } else {
                int id = Integer.parseInt(maSo);
                id++;
                getTxtMaSo().setText(String.valueOf(id));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ThongTinXe.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ThongTinXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinXe().setVisible(true);
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdjust;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> comboBoxChuaThue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableThongTinXe;
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JTextField txtLoaiXe;
    private javax.swing.JTextField txtMaSo;
    private javax.swing.JTextField txtPhiThue;
    // End of variables declaration//GEN-END:variables
}
