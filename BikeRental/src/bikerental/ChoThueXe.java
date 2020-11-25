/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author tutra
 */
public class ChoThueXe extends javax.swing.JFrame {

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
     * @return the phiThue
     */
    public int getPhiThue() {
        return phiThue;
    }

    /**
     * @param phiThue the phiThue to set
     */
    public void setPhiThue(int phiThue) {
        this.phiThue = phiThue;
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
     * @return the btnChoThue
     */
    public javax.swing.JButton getBtnChoThue() {
        return btnChoThue;
    }

    /**
     * @param btnChoThue the btnChoThue to set
     */
    public void setBtnChoThue(javax.swing.JButton btnChoThue) {
        this.btnChoThue = btnChoThue;
    }

    /**
     * @return the comboMaKhach
     */
    public javax.swing.JComboBox<String> getComboMaKhach() {
        return comboMaKhach;
    }

    /**
     * @param comboMaKhach the comboMaKhach to set
     */
    public void setComboMaKhach(javax.swing.JComboBox<String> comboMaKhach) {
        this.comboMaKhach = comboMaKhach;
    }

    /**
     * @return the comboMaXe
     */
    public javax.swing.JComboBox<String> getComboMaXe() {
        return comboMaXe;
    }

    /**
     * @param comboMaXe the comboMaXe to set
     */
    public void setComboMaXe(javax.swing.JComboBox<String> comboMaXe) {
        this.comboMaXe = comboMaXe;
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
     * @return the jLabel8
     */
    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    /**
     * @param jLabel8 the jLabel8 to set
     */
    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
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
     * @return the txtChuaThue
     */
    public javax.swing.JTextField getTxtChuaThue() {
        return txtChuaThue;
    }

    /**
     * @param txtChuaThue the txtChuaThue to set
     */
    public void setTxtChuaThue(javax.swing.JTextField txtChuaThue) {
        this.txtChuaThue = txtChuaThue;
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
     * @return the txtPhiThueMotNgay
     */
    public javax.swing.JTextField getTxtPhiThueMotNgay() {
        return txtPhiThueMotNgay;
    }

    /**
     * @param txtPhiThueMotNgay the txtPhiThueMotNgay to set
     */
    public void setTxtPhiThueMotNgay(javax.swing.JTextField txtPhiThueMotNgay) {
        this.txtPhiThueMotNgay = txtPhiThueMotNgay;
    }

    /**
     * @return the txtTenKhach
     */
    public javax.swing.JTextField getTxtTenKhach() {
        return txtTenKhach;
    }

    /**
     * @param txtTenKhach the txtTenKhach to set
     */
    public void setTxtTenKhach(javax.swing.JTextField txtTenKhach) {
        this.txtTenKhach = txtTenKhach;
    }

    /**
     * Creates new form ChoThueXe
     */
    private Connection connection;
    private PreparedStatement preparedStatement;
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/thuexe";
    private String username = "root";
    private String password = "";
    private int phiThue;
    public ChoThueXe() {
        initComponents();
        
        txtNgayMuon.setEnabled(false);
        comboMaKhach.setEnabled(false);
        txtTenKhach.setEnabled(false);
       
        btnChoThue.setEnabled(false);
        taiDanhSachXe();
        taiDanhSachKhachHang();
        txtNgayMuon.setDateFormatString("dd/MM/yyyy");
  
    }
    public void taiDanhSachXe() {
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select * from thong_tin_xe"));
            ResultSet resultSet = getPreparedStatement().executeQuery();
            getComboMaXe().removeAllItems();
            while (resultSet.next()) {
                getComboMaXe().addItem(resultSet.getString(1));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ChoThueXe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void taiDanhSachKhachHang() {
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select * from thong_tin_khach_hang"));
            ResultSet resultSet = getPreparedStatement().executeQuery();
            getComboMaKhach().removeAllItems();
            while (resultSet.next()) {
                getComboMaKhach().addItem(resultSet.getString(1));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ChoThueXe.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel5 = new javax.swing.JLabel();
        comboMaXe = new javax.swing.JComboBox<>();
        comboMaKhach = new javax.swing.JComboBox<>();
        txtTenKhach = new javax.swing.JTextField();
        txtNgayMuon = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtChuaThue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPhiThueMotNgay = new javax.swing.JTextField();
        btnChoThue = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cho thuê xe"));

        jLabel1.setText("Mã số xe");

        jLabel2.setText("Mã số khách hàng");

        jLabel3.setText("Tên khách hàng");

        jLabel5.setText("Ngày thuê");

        comboMaXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMaXeActionPerformed(evt);
            }
        });

        comboMaKhach.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMaKhachItemStateChanged(evt);
            }
        });
        comboMaKhach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboMaKhachMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboMaKhachMousePressed(evt);
            }
        });
        comboMaKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMaKhachActionPerformed(evt);
            }
        });

        txtTenKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhachActionPerformed(evt);
            }
        });

        txtNgayMuon.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtNgayMuonComponentAdded(evt);
            }
        });
        txtNgayMuon.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                txtNgayMuonHierarchyChanged(evt);
            }
        });
        txtNgayMuon.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtNgayMuonAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtNgayMuon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNgayMuonFocusLost(evt);
            }
        });
        txtNgayMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNgayMuonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNgayMuonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNgayMuonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNgayMuonMousePressed(evt);
            }
        });
        txtNgayMuon.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtNgayMuonInputMethodTextChanged(evt);
            }
        });
        txtNgayMuon.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtNgayMuonPropertyChange(evt);
            }
        });
        txtNgayMuon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNgayMuonKeyReleased(evt);
            }
        });
        txtNgayMuon.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtNgayMuonVetoableChange(evt);
            }
        });

        jLabel8.setText("Phí thuê một ngày");

        txtPhiThueMotNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhiThueMotNgayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(comboMaXe, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtChuaThue, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhiThueMotNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMaKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboMaXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtChuaThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboMaKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPhiThueMotNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        btnChoThue.setText("Cho thuê");
        btnChoThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoThueActionPerformed(evt);
            }
        });

        btnCancel.setText("Thoát");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnChoThue, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChoThue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChoThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoThueActionPerformed
        // TODO add your handling code here:
        
        String maSoXe = getComboMaXe().getSelectedItem().toString();
        String maSoKhach = getComboMaKhach().getSelectedItem().toString();
        
        java.util.Date ngayMuon = getTxtNgayMuon().getDate();
        java.sql.Date sqlDateMuon = new java.sql.Date(ngayMuon.getTime());      
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("insert into thue_xe (masoxe, masokhach, phimuon, ngaymuon) values (?, ?, ?, ?) "));
            getPreparedStatement().setString(1, maSoXe);
            getPreparedStatement().setString(2, maSoKhach);
            getPreparedStatement().setInt(3, getPhiThue());
            getPreparedStatement().setDate(4, sqlDateMuon);
            getPreparedStatement().executeUpdate();           
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("update thong_tin_xe set chuathue = 'No' where maso = ?"));
            getPreparedStatement().setString(1, maSoXe);
            getPreparedStatement().executeUpdate();
            JOptionPane.showMessageDialog(this, "Thuê xe thành công");
            Main main = new Main();
            this.hide();
            main.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ChoThueXe.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_btnChoThueActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        this.hide();
        main.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void comboMaXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMaXeActionPerformed
        String maXe = getComboMaXe().getSelectedItem().toString();
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select * from thong_tin_xe where maso = ?"));
            getPreparedStatement().setString(1, maXe);
            ResultSet resultSet = getPreparedStatement().executeQuery();
            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy xe");
            } else {
                String chuaThue = resultSet.getString("chuathue");
                getTxtChuaThue().setText("Chưa thuê".trim());
                getTxtChuaThue().setEditable(false);
                if (chuaThue.equals("Yes")) {
               
                    getTxtNgayMuon().setEnabled(true);
                    getComboMaKhach().setEnabled(true);
                    getTxtTenKhach().setEnabled(true);  
                    getBtnChoThue().setEnabled(true);
                    setPhiThue(resultSet.getInt("phi"));
                    getTxtPhiThueMotNgay().setText(String.valueOf(getPhiThue()));
                    getTxtPhiThueMotNgay().setEditable(false);
                    
                } else {
                    getTxtChuaThue().setText("Đã thuê".trim());
                    getTxtChuaThue().setEditable(false);
                    getTxtTenKhach().setText("");
                 
                    getTxtNgayMuon().setEnabled(false);
                    getComboMaKhach().setEnabled(false);
                    getTxtTenKhach().setEnabled(false);
                    getBtnChoThue().setEnabled(false);
                }
            }            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ChoThueXe.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_comboMaXeActionPerformed
    
    
    private void comboMaKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMaKhachActionPerformed
        // TODO add your handling code here:
        
        String maKhach = getComboMaKhach().getSelectedItem().toString();
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
                getTxtTenKhach().setText(hoTen.trim());
                getTxtTenKhach().setEditable(false);
            }
                 
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ChoThueXe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboMaKhachActionPerformed

    private void comboMaKhachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMaKhachMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMaKhachMouseClicked

    private void comboMaKhachItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMaKhachItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMaKhachItemStateChanged

    private void comboMaKhachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMaKhachMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMaKhachMousePressed

    private void txtNgayMuonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgayMuonMouseExited
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(this, "demo");
    }//GEN-LAST:event_txtNgayMuonMouseExited

    private void txtNgayMuonHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtNgayMuonHierarchyChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNgayMuonHierarchyChanged

    private void txtNgayMuonAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtNgayMuonAncestorAdded
      //   JOptionPane.showMessageDialog(this, "demo");// TODO add your handling code here:
    }//GEN-LAST:event_txtNgayMuonAncestorAdded

    private void txtNgayMuonInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtNgayMuonInputMethodTextChanged
       // JOptionPane.showMessageDialog(this, "demo");// TODO add your handling code here:
    }//GEN-LAST:event_txtNgayMuonInputMethodTextChanged

    private void txtNgayMuonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgayMuonMouseEntered
        // TODO add your handling code here:
         //JOptionPane.showMessageDialog(this, "demo");
    }//GEN-LAST:event_txtNgayMuonMouseEntered

    private void txtNgayMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgayMuonMouseClicked
         //JOptionPane.showMessageDialog(this, "demo");// TODO add your handling code here:
    }//GEN-LAST:event_txtNgayMuonMouseClicked

    private void txtNgayMuonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgayMuonMousePressed
         //JOptionPane.showMessageDialog(this, "demo");// TODO add your handling code here:
    }//GEN-LAST:event_txtNgayMuonMousePressed

    private void txtNgayMuonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtNgayMuonPropertyChange
        // TODO add your handling code here:

        
    }//GEN-LAST:event_txtNgayMuonPropertyChange

    private void txtNgayMuonComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtNgayMuonComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNgayMuonComponentAdded

    private void txtNgayMuonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNgayMuonFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNgayMuonFocusLost

    private void txtNgayMuonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgayMuonKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayMuonKeyReleased

    private void txtNgayMuonVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtNgayMuonVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayMuonVetoableChange

    private void txtTenKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhachActionPerformed

    private void txtPhiThueMotNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhiThueMotNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhiThueMotNgayActionPerformed

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
            java.util.logging.Logger.getLogger(ChoThueXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoThueXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoThueXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoThueXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoThueXe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChoThue;
    private javax.swing.JComboBox<String> comboMaKhach;
    private javax.swing.JComboBox<String> comboMaXe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtChuaThue;
    private com.toedter.calendar.JDateChooser txtNgayMuon;
    private javax.swing.JTextField txtPhiThueMotNgay;
    private javax.swing.JTextField txtTenKhach;
    // End of variables declaration//GEN-END:variables

//    private PreparedStatement connection(String update_thong_tin_xe_set_chuathue__No_wher) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
