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
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author tutra
 */
public class TraXe extends javax.swing.JFrame {

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
     * @return the tongChiPhi
     */
    public int getTongChiPhi() {
        return tongChiPhi;
    }

    /**
     * @param tongChiPhi the tongChiPhi to set
     */
    public void setTongChiPhi(int tongChiPhi) {
        this.tongChiPhi = tongChiPhi;
    }

    /**
     * @return the phiThue
     */
    public String getPhiThue() {
        return phiThue;
    }

    /**
     * @param phiThue the phiThue to set
     */
    public void setPhiThue(String phiThue) {
        this.phiThue = phiThue;
    }

    /**
     * @return the btnTinhToan
     */
    public javax.swing.JButton getBtnTinhToan() {
        return btnTinhToan;
    }

    /**
     * @param btnTinhToan the btnTinhToan to set
     */
    public void setBtnTinhToan(javax.swing.JButton btnTinhToan) {
        this.btnTinhToan = btnTinhToan;
    }

    /**
     * @return the comboMaSoKhachHang
     */
    public javax.swing.JComboBox<String> getComboMaSoKhachHang() {
        return comboMaSoKhachHang;
    }

    /**
     * @param comboMaSoKhachHang the comboMaSoKhachHang to set
     */
    public void setComboMaSoKhachHang(javax.swing.JComboBox<String> comboMaSoKhachHang) {
        this.comboMaSoKhachHang = comboMaSoKhachHang;
    }

    /**
     * @return the comboMaSoXe
     */
    public javax.swing.JComboBox<String> getComboMaSoXe() {
        return comboMaSoXe;
    }

    /**
     * @param comboMaSoXe the comboMaSoXe to set
     */
    public void setComboMaSoXe(javax.swing.JComboBox<String> comboMaSoXe) {
        this.comboMaSoXe = comboMaSoXe;
    }

    /**
     * @return the jButton1
     */
    public javax.swing.JButton getjButton1() {
        return jButton1;
    }

    /**
     * @param jButton1 the jButton1 to set
     */
    public void setjButton1(javax.swing.JButton jButton1) {
        this.jButton1 = jButton1;
    }

    /**
     * @return the jButton2
     */
    public javax.swing.JButton getjButton2() {
        return jButton2;
    }

    /**
     * @param jButton2 the jButton2 to set
     */
    public void setjButton2(javax.swing.JButton jButton2) {
        this.jButton2 = jButton2;
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
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
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
     * @return the tableTraXe
     */
    public javax.swing.JTable getTableTraXe() {
        return tableTraXe;
    }

    /**
     * @param tableTraXe the tableTraXe to set
     */
    public void setTableTraXe(javax.swing.JTable tableTraXe) {
        this.tableTraXe = tableTraXe;
    }

    /**
     * @return the txtNgayMuon
     */
    public com.toedter.calendar.JDateChooser getTxtNgayMuon() {
        return txtNgayMuon;
    }

    /**
     * @param txtNgayMuon the txtNgayMuon to set
     */
    public void setTxtNgayMuon(com.toedter.calendar.JDateChooser txtNgayMuon) {
        this.txtNgayMuon = txtNgayMuon;
    }

    /**
     * @return the txtNgayTra
     */
    public com.toedter.calendar.JDateChooser getTxtNgayTra() {
        return txtNgayTra;
    }

    /**
     * @param txtNgayTra the txtNgayTra to set
     */
    public void setTxtNgayTra(com.toedter.calendar.JDateChooser txtNgayTra) {
        this.txtNgayTra = txtNgayTra;
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

    /**
     * @return the txtTenKhachHang
     */
    public javax.swing.JTextField getTxtTenKhachHang() {
        return txtTenKhachHang;
    }

    /**
     * @param txtTenKhachHang the txtTenKhachHang to set
     */
    public void setTxtTenKhachHang(javax.swing.JTextField txtTenKhachHang) {
        this.txtTenKhachHang = txtTenKhachHang;
    }

    /**
     * @return the txtTongChiPhi
     */
    public javax.swing.JTextField getTxtTongChiPhi() {
        return txtTongChiPhi;
    }

    /**
     * @param txtTongChiPhi the txtTongChiPhi to set
     */
    public void setTxtTongChiPhi(javax.swing.JTextField txtTongChiPhi) {
        this.txtTongChiPhi = txtTongChiPhi;
    }

    /**
     * Creates new form TraXe
     */
    private Connection connection;
    private PreparedStatement preparedStatement;
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/thuexe";
    private String username = "root";
    private String password = "";
    private int tongChiPhi;
    private String phiThue;
    
    public TraXe() {
        initComponents();
        tableUpdate();
        comboMaSoKhachHang.removeAllItems();
        comboMaSoXe.removeAllItems();
        txtNgayMuon.setDateFormatString("dd/MM/yyyy");
        txtNgayTra.setDateFormatString("dd/MM/yyyy");
    }

    public void tableUpdate() {
        String[] header = {"Mã số khách hàng", "Mã số xe", "Phí thuê", "Ngày mượn"};
            DefaultTableModel model  = new DefaultTableModel(null, header);
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select * from thue_xe"));
            ResultSet resultSet = getPreparedStatement().executeQuery();
            while(resultSet.next()) {
                Vector v = new Vector();
                v.add(resultSet.getString("masokhach"));
                v.add(resultSet.getString("masoxe")); 
                v.add(resultSet.getString("phimuon"));
                v.add(resultSet.getDate("ngaymuon")); 
                model.addRow(v);
            }
            getTableTraXe().setModel(model);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TraXe.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel5 = new javax.swing.JLabel();
        txtPhiThue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        txtTongChiPhi = new javax.swing.JTextField();
        btnTinhToan = new javax.swing.JButton();
        comboMaSoKhachHang = new javax.swing.JComboBox<>();
        comboMaSoXe = new javax.swing.JComboBox<>();
        txtNgayMuon = new com.toedter.calendar.JDateChooser();
        txtNgayTra = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTraXe = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã số khách hàng");

        jLabel2.setText("Mã số xe");

        jLabel3.setText("Phí thuê");

        jLabel4.setText("Ngày mượn");

        jLabel5.setText("Ngày trả");

        jLabel7.setText("Tên khách hàng");

        txtTongChiPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongChiPhiActionPerformed(evt);
            }
        });

        btnTinhToan.setText("Tính toán");
        btnTinhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhToanActionPerformed(evt);
            }
        });

        comboMaSoKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboMaSoKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMaSoKhachHangActionPerformed(evt);
            }
        });

        comboMaSoXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Xác nhận trả");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnTinhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenKhachHang)
                            .addComponent(txtPhiThue)
                            .addComponent(comboMaSoKhachHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboMaSoXe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNgayMuon, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(txtNgayTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongChiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 50, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboMaSoKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(comboMaSoXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPhiThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTinhToan)
                    .addComponent(txtTongChiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tableTraXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã số khách hàng", "Mã số xe", "Phí thuê", "Ngày thuê"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTraXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTraXeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTraXe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableTraXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTraXeMouseClicked
        // TODO add your handling code here:
        
        
        DefaultTableModel row = (DefaultTableModel) getTableTraXe().getModel();
        int selectIndex = getTableTraXe().getSelectedRow();
        getComboMaSoKhachHang().removeAllItems();
        getComboMaSoKhachHang().addItem((String) row.getValueAt(selectIndex, 0));
        String maKhach = getComboMaSoKhachHang().getSelectedItem().toString();
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select * from thong_tin_khach_hang where maso = ?"));
            getPreparedStatement().setString(1, maKhach);
            ResultSet resultSet = getPreparedStatement().executeQuery();
            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(this, "Không có thông tin của khách hàng nào");
            } else {
                String hoTen = resultSet.getString("hoten");
                getTxtTenKhachHang().setText(hoTen.trim());
                getTxtTenKhachHang().setEditable(false);
            }
                 
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ChoThueXe.class.getName()).log(Level.SEVERE, null, ex);
        }
        setPhiThue((String) row.getValueAt(selectIndex, 2));
        getComboMaSoXe().removeAllItems();
        getComboMaSoXe().addItem((String) row.getValueAt(selectIndex, 1));
        getTxtPhiThue().setText((String) row.getValueAt(selectIndex, 2));
        getTxtNgayMuon().setDate((Date) row.getValueAt(selectIndex, 3));
        getComboMaSoXe().setEditable(false);
        getComboMaSoKhachHang().setEditable(false);
        getTxtPhiThue().setEditable(false);
       
          
    }//GEN-LAST:event_tableTraXeMouseClicked

    private void btnTinhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhToanActionPerformed
        // TODO add your handling code here:
        int phi = Integer.valueOf(getPhiThue());
        if (getTxtNgayMuon().getDate() != null && getTxtNgayTra().getDate() != null) {
            Date ngayMuon = getTxtNgayMuon().getDate();
            Date ngayTra = getTxtNgayTra().getDate();
            long thoiGianMuon = ngayTra.getTime() - ngayMuon.getTime();           
            float soNgayMuon = (int)(thoiGianMuon / (1000 * 60 * 60 * 24));
            if (soNgayMuon < 0) {
                JOptionPane.showMessageDialog(this, "Ngày trả phải sau ngày mượn");
                return;
            }
            if (soNgayMuon < 1) {
                JOptionPane.showMessageDialog(this, "Phải mượn ít nhất một ngày");
            }
            setTongChiPhi((int) Math.round(soNgayMuon * phi * 1.1));
            getTxtTongChiPhi().setText(String.valueOf(getTongChiPhi()));
      
        } else if (getTxtNgayTra().getDate() == null || getTxtNgayMuon().getDate() == null){
            JOptionPane.showMessageDialog(this, "Thông tin chưa đây đủ");
        }
        
    }//GEN-LAST:event_btnTinhToanActionPerformed

    private void txtTongChiPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongChiPhiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongChiPhiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        String maSoKhachHang = getComboMaSoKhachHang().getSelectedItem().toString();
        String maSoXe = getComboMaSoXe().getSelectedItem().toString();
        java.util.Date ngayMuon = getTxtNgayMuon().getDate();
        java.sql.Date sqlDateMuon = new java.sql.Date(ngayMuon.getTime());
        java.util.Date ngayTra = getTxtNgayTra().getDate();
        java.sql.Date sqlDateTra = new java.sql.Date(ngayTra.getTime());
        
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("insert into tra_xe (masokhach, masoxe, ngaymuon, ngaytra, phithue) values (?, ?, ?, ?, ?) "));
            getPreparedStatement().setString(1, maSoXe);
            getPreparedStatement().setString(2, maSoKhachHang);
            getPreparedStatement().setDate(3, sqlDateMuon);
            getPreparedStatement().setDate(4, sqlDateTra);
            getPreparedStatement().setInt(5, (int)getTongChiPhi());
            getPreparedStatement().executeUpdate();           
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("update thong_tin_xe set chuathue = 'Yes' where maso = ?"));
            getPreparedStatement().setString(1, maSoXe);
            getPreparedStatement().executeUpdate();
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("delete from thue_xe where masoxe = ?"));
            getPreparedStatement().setString(1, maSoXe);
            getPreparedStatement().executeUpdate();
            JOptionPane.showMessageDialog(this, "Trả xe thành công");
          
            Main main = new Main();
            this.hide();
            main.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ChoThueXe.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        this.hide();
        main.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboMaSoKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMaSoKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMaSoKhachHangActionPerformed

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
            java.util.logging.Logger.getLogger(TraXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraXe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTinhToan;
    private javax.swing.JComboBox<String> comboMaSoKhachHang;
    private javax.swing.JComboBox<String> comboMaSoXe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTraXe;
    private com.toedter.calendar.JDateChooser txtNgayMuon;
    private com.toedter.calendar.JDateChooser txtNgayTra;
    private javax.swing.JTextField txtPhiThue;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTongChiPhi;
    // End of variables declaration//GEN-END:variables
}
