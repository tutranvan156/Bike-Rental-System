/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tutra
 */
public class LichSuGiaoDich extends javax.swing.JFrame {

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
     * @return the resultThongTinKhach
     */
    public ResultSet getResultThongTinKhach() {
        return resultThongTinKhach;
    }

    /**
     * @param resultThongTinKhach the resultThongTinKhach to set
     */
    public void setResultThongTinKhach(ResultSet resultThongTinKhach) {
        this.resultThongTinKhach = resultThongTinKhach;
    }

    /**
     * @return the resultThongTinXe
     */
    public ResultSet getResultThongTinXe() {
        return resultThongTinXe;
    }

    /**
     * @param resultThongTinXe the resultThongTinXe to set
     */
    public void setResultThongTinXe(ResultSet resultThongTinXe) {
        this.resultThongTinXe = resultThongTinXe;
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
     * @return the date
     */
    public DateFormat getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(DateFormat date) {
        this.date = date;
    }

    /**
     * @return the checkMaKhach
     */
    public Boolean getCheckMaKhach() {
        return checkMaKhach;
    }

    /**
     * @param checkMaKhach the checkMaKhach to set
     */
    public void setCheckMaKhach(Boolean checkMaKhach) {
        this.checkMaKhach = checkMaKhach;
    }

    /**
     * @return the checkMaXe
     */
    public Boolean getCheckMaXe() {
        return checkMaXe;
    }

    /**
     * @param checkMaXe the checkMaXe to set
     */
    public void setCheckMaXe(Boolean checkMaXe) {
        this.checkMaXe = checkMaXe;
    }

    /**
     * @return the checkNgayMuon
     */
    public Boolean getCheckNgayMuon() {
        return checkNgayMuon;
    }

    /**
     * @param checkNgayMuon the checkNgayMuon to set
     */
    public void setCheckNgayMuon(Boolean checkNgayMuon) {
        this.checkNgayMuon = checkNgayMuon;
    }

    /**
     * @return the btnExit
     */
    public javax.swing.JButton getBtnExit() {
        return btnExit;
    }

    /**
     * @param btnExit the btnExit to set
     */
    public void setBtnExit(javax.swing.JButton btnExit) {
        this.btnExit = btnExit;
    }

    /**
     * @return the btnFull
     */
    public javax.swing.JButton getBtnFull() {
        return btnFull;
    }

    /**
     * @param btnFull the btnFull to set
     */
    public void setBtnFull(javax.swing.JButton btnFull) {
        this.btnFull = btnFull;
    }

    /**
     * @return the btnSearch
     */
    public javax.swing.JButton getBtnSearch() {
        return btnSearch;
    }

    /**
     * @param btnSearch the btnSearch to set
     */
    public void setBtnSearch(javax.swing.JButton btnSearch) {
        this.btnSearch = btnSearch;
    }

    /**
     * @return the buttonGroup1
     */
    public javax.swing.ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    /**
     * @param buttonGroup1 the buttonGroup1 to set
     */
    public void setButtonGroup1(javax.swing.ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
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
     * @return the jComboBox3
     */
    public javax.swing.JComboBox<String> getjComboBox3() {
        return jComboBox3;
    }

    /**
     * @param jComboBox3 the jComboBox3 to set
     */
    public void setjComboBox3(javax.swing.JComboBox<String> jComboBox3) {
        this.jComboBox3 = jComboBox3;
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
     * @return the radioMaKhach
     */
    public javax.swing.JRadioButton getRadioMaKhach() {
        return radioMaKhach;
    }

    /**
     * @param radioMaKhach the radioMaKhach to set
     */
    public void setRadioMaKhach(javax.swing.JRadioButton radioMaKhach) {
        this.radioMaKhach = radioMaKhach;
    }

    /**
     * @return the radioMaXe
     */
    public javax.swing.JRadioButton getRadioMaXe() {
        return radioMaXe;
    }

    /**
     * @param radioMaXe the radioMaXe to set
     */
    public void setRadioMaXe(javax.swing.JRadioButton radioMaXe) {
        this.radioMaXe = radioMaXe;
    }

    /**
     * @return the radioNgayMuon
     */
    public javax.swing.JRadioButton getRadioNgayMuon() {
        return radioNgayMuon;
    }

    /**
     * @param radioNgayMuon the radioNgayMuon to set
     */
    public void setRadioNgayMuon(javax.swing.JRadioButton radioNgayMuon) {
        this.radioNgayMuon = radioNgayMuon;
    }

    /**
     * @return the tableLichSuGiaoDich
     */
    public javax.swing.JTable getTableLichSuGiaoDich() {
        return tableLichSuGiaoDich;
    }

    /**
     * @param tableLichSuGiaoDich the tableLichSuGiaoDich to set
     */
    public void setTableLichSuGiaoDich(javax.swing.JTable tableLichSuGiaoDich) {
        this.tableLichSuGiaoDich = tableLichSuGiaoDich;
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

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultThongTinKhach;
    private ResultSet resultThongTinXe;
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/thuexe";
    private String username = "root";
    private String password = "";
    private DateFormat date = new SimpleDateFormat("yyyy/MM/dd");
    private Boolean checkMaKhach = false;
    private Boolean checkMaXe = false;
    private Boolean checkNgayMuon = false;
    
    public LichSuGiaoDich() {
        initComponents();
        radioMaKhach.setSelected(false);
        radioMaXe.setSelected(false);
        radioNgayMuon.setSelected(false);
        loadKhachHang();
        loadXe();
        txtNgayMuon.setDateFormatString("dd/MM/yyyy");
    }
    
    private void loadKhachHang() {
        getComboMaKhach().removeAllItems();
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select maso from thong_tin_khach_hang"));
            ResultSet resultSet = getPreparedStatement().executeQuery();
            while (resultSet.next()) {
                getComboMaKhach().addItem(resultSet.getString("maso"));
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LichSuGiaoDich.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void loadXe() {
        getComboMaXe().removeAllItems();
        try {
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select maso from thong_tin_xe"));
            ResultSet resultSet = getPreparedStatement().executeQuery();
            while (resultSet.next()) {
                getComboMaXe().addItem(resultSet.getString("maso"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LichSuGiaoDich.class.getName()).log(Level.SEVERE, null, ex);
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

        jComboBox3 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        comboMaKhach = new javax.swing.JComboBox<>();
        comboMaXe = new javax.swing.JComboBox<>();
        txtNgayMuon = new com.toedter.calendar.JDateChooser();
        btnSearch = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnFull = new javax.swing.JButton();
        radioMaKhach = new javax.swing.JRadioButton();
        radioMaXe = new javax.swing.JRadioButton();
        radioNgayMuon = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLichSuGiaoDich = new javax.swing.JTable();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnFull.setText("Tất cả giao dịch");
        btnFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFullActionPerformed(evt);
            }
        });

        radioMaKhach.setText("Mã khách hàng");
        radioMaKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaKhachActionPerformed(evt);
            }
        });

        radioMaXe.setText("Mã xe");
        radioMaXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaXeActionPerformed(evt);
            }
        });

        radioNgayMuon.setText("Ngày mượn");
        radioNgayMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNgayMuonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioMaXe, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(radioMaKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(110, 110, 110)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboMaKhach, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboMaXe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNgayMuon, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnFull, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMaKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMaKhach))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMaXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMaXe))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioNgayMuon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnExit))
                .addGap(28, 28, 28)
                .addComponent(btnFull)
                .addGap(25, 25, 25))
        );

        tableLichSuGiaoDich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ tên", "Mã xe", "Biển số", "Loại xe", "Ngày mượn", "Ngày trả", "Phí thuê"
            }
        ));
        jScrollPane1.setViewportView(tableLichSuGiaoDich);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String[] header = {"Mã khách hàng", "Tên khách hàng", "Mã xe","Biển số", "Loại xe", "Ngày mượn", "Ngày trả", "Phí thuê"};
        DefaultTableModel model = new DefaultTableModel(null, header);
        String maXe = String.valueOf(getComboMaXe().getSelectedItem());
        String maKhach = String.valueOf(getComboMaKhach().getSelectedItem());
        String ngayMuon = "";
        if (getCheckNgayMuon() == true) {
            ngayMuon = getDate().format(getTxtNgayMuon().getDate());
        }
        try {
            
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            if (getCheckMaKhach() == true && getCheckNgayMuon() == false && getCheckMaXe() == false ) {
                setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select tra_xe.masokhach, thong_tin_khach_hang.hoten,"
                        + " tra_xe.masoxe, thong_tin_xe.bienso, "
                        + "thong_tin_xe.loaixe, tra_xe.ngaymuon, tra_xe.ngaytra,"
                        + " tra_xe.phithue from tra_xe, thong_tin_khach_hang, thong_tin_xe where"
                        + " tra_xe.masokhach = thong_tin_khach_hang.maso and "
                        + "tra_xe.masoxe = thong_tin_xe.maso and masokhach = ?"));               
                getPreparedStatement().setString(1, maKhach);
                ResultSet resultSet = getPreparedStatement().executeQuery();
                while (resultSet.next()) {
                    Vector v = new Vector();
                    v.add(resultSet.getString("masokhach"));
                    v.add(resultSet.getString("hoten"));
                    v.add(resultSet.getString("masoxe"));
                    v.add(resultSet.getString("bienso"));
                    v.add(resultSet.getString("loaixe"));
                    v.add(resultSet.getString("ngaymuon"));
                    v.add(resultSet.getString("ngaytra"));
                    v.add(resultSet.getString("phithue"));
                    model.addRow(v);
                }
                getTableLichSuGiaoDich().setModel(model);
            } else if (getCheckMaKhach() == false && getCheckNgayMuon() == true && getCheckMaXe() == false ) {
                                setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select tra_xe.masokhach, thong_tin_khach_hang.hoten,"
                                        + " tra_xe.masoxe, thong_tin_xe.bienso, "
                                        + "thong_tin_xe.loaixe, tra_xe.ngaymuon, tra_xe.ngaytra,"
                                        + " tra_xe.phithue from tra_xe, thong_tin_khach_hang, thong_tin_xe where"
                                        + " tra_xe.masokhach = thong_tin_khach_hang.maso and "
                                        + "tra_xe.masoxe = thong_tin_xe.maso and ngaymuon <= ? and ngaytra >= ?"));               
                getPreparedStatement().setString(1, ngayMuon);
                getPreparedStatement().setString(2, ngayMuon);
                ResultSet resultSet = getPreparedStatement().executeQuery();
                while (resultSet.next()) {
                    Vector v = new Vector();
                    v.add(resultSet.getString("masokhach"));
                    v.add(resultSet.getString("hoten"));
                    v.add(resultSet.getString("masoxe"));
                    v.add(resultSet.getString("bienso"));
                    v.add(resultSet.getString("loaixe"));
                    v.add(resultSet.getString("ngaymuon"));
                    v.add(resultSet.getString("ngaytra"));
                    v.add(resultSet.getString("phithue"));
                    model.addRow(v);

                }
                getTableLichSuGiaoDich().setModel(model);
            } else if (getCheckMaKhach() == false && getCheckNgayMuon() == false && getCheckMaXe() == true ) {
                                setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select tra_xe.masokhach, thong_tin_khach_hang.hoten,"
                                        + " tra_xe.masoxe, thong_tin_xe.bienso, "
                                        + "thong_tin_xe.loaixe, tra_xe.ngaymuon, tra_xe.ngaytra,"
                                        + " tra_xe.phithue from tra_xe, thong_tin_khach_hang, thong_tin_xe where"
                                        + " tra_xe.masokhach = thong_tin_khach_hang.maso and "
                                        + "tra_xe.masoxe = thong_tin_xe.maso and masoxe = ?"));               
                getPreparedStatement().setString(1, maXe);
                ResultSet resultSet = getPreparedStatement().executeQuery();
                while (resultSet.next()) {
                    Vector v = new Vector();
                    v.add(resultSet.getString("masokhach"));
                    v.add(resultSet.getString("hoten"));
                    v.add(resultSet.getString("masoxe"));
                    v.add(resultSet.getString("bienso"));
                    v.add(resultSet.getString("loaixe"));
                    v.add(resultSet.getString("ngaymuon"));
                    v.add(resultSet.getString("ngaytra"));
                    v.add(resultSet.getString("phithue"));
                    model.addRow(v);

                }
                getTableLichSuGiaoDich().setModel(model);
            } else if (getCheckMaKhach() == true && getCheckNgayMuon() == true && getCheckMaXe() == false ) {
                                setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select tra_xe.masokhach, thong_tin_khach_hang.hoten,"
                                        + " tra_xe.masoxe, thong_tin_xe.bienso, "
                                        + "thong_tin_xe.loaixe, tra_xe.ngaymuon, tra_xe.ngaytra,"
                                        + " tra_xe.phithue from tra_xe, thong_tin_khach_hang, thong_tin_xe where"
                                        + " tra_xe.masokhach = thong_tin_khach_hang.maso and "
                                        + "tra_xe.masoxe = thong_tin_xe.maso and masokhach = ? and ngaymuon <= ? and ngaytra >= ?"));   
                getPreparedStatement().setString(1, maKhach);
                getPreparedStatement().setString(2, ngayMuon);
                getPreparedStatement().setString(3, ngayMuon);
                ResultSet resultSet = getPreparedStatement().executeQuery();
                while (resultSet.next()) {
                    Vector v = new Vector();
                    v.add(resultSet.getString("masokhach"));
                    v.add(resultSet.getString("hoten"));
                    v.add(resultSet.getString("masoxe"));
                    v.add(resultSet.getString("bienso"));
                    v.add(resultSet.getString("loaixe"));
                    v.add(resultSet.getString("ngaymuon"));
                    v.add(resultSet.getString("ngaytra"));
                    v.add(resultSet.getString("phithue"));
                    model.addRow(v);

                }
                getTableLichSuGiaoDich().setModel(model);
            } else if (getCheckMaKhach() == false && getCheckNgayMuon() == true && getCheckMaXe() == true ) {
                                setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select tra_xe.masokhach, thong_tin_khach_hang.hoten,"
                                        + " tra_xe.masoxe, thong_tin_xe.bienso, "
                                        + "thong_tin_xe.loaixe, tra_xe.ngaymuon, tra_xe.ngaytra,"
                                        + " tra_xe.phithue from tra_xe, thong_tin_khach_hang, thong_tin_xe where"
                                        + " tra_xe.masokhach = thong_tin_khach_hang.maso and "
                                        + "tra_xe.masoxe = thong_tin_xe.maso and masoxe = ? and ngaymuon <= ? and ngaytra >= ?"));               
                
                getPreparedStatement().setString(1, maXe);
                getPreparedStatement().setString(2, ngayMuon);
                getPreparedStatement().setString(3, ngayMuon);
                ResultSet resultSet = getPreparedStatement().executeQuery();
                while (resultSet.next()) {
                    Vector v = new Vector();
                    v.add(resultSet.getString("masokhach"));
                    v.add(resultSet.getString("hoten"));
                    v.add(resultSet.getString("masoxe"));
                    v.add(resultSet.getString("bienso"));
                    v.add(resultSet.getString("loaixe"));
                    v.add(resultSet.getString("ngaymuon"));
                    v.add(resultSet.getString("ngaytra"));
                    v.add(resultSet.getString("phithue"));
                    model.addRow(v);

                }
                getTableLichSuGiaoDich().setModel(model);
            } else if (getCheckMaKhach() == true && getCheckNgayMuon() == false && getCheckMaXe() == true ) {
                                setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select tra_xe.masokhach, thong_tin_khach_hang.hoten,"
                                        + " tra_xe.masoxe, thong_tin_xe.bienso, "
                                        + "thong_tin_xe.loaixe, tra_xe.ngaymuon, tra_xe.ngaytra,"
                                        + " tra_xe.phithue from tra_xe, thong_tin_khach_hang, thong_tin_xe where"
                                        + " tra_xe.masokhach = thong_tin_khach_hang.maso and "
                                        + "tra_xe.masoxe = thong_tin_xe.maso and masokhach = ? and masoxe = ?"));               
                getPreparedStatement().setString(1, maKhach);
                getPreparedStatement().setString(2, maXe);
                ResultSet resultSet = getPreparedStatement().executeQuery();
                while (resultSet.next()) {
                    Vector v = new Vector();
                    v.add(resultSet.getString("masokhach"));
                    v.add(resultSet.getString("hoten"));
                    v.add(resultSet.getString("masoxe"));
                    v.add(resultSet.getString("bienso"));
                    v.add(resultSet.getString("loaixe"));
                    v.add(resultSet.getString("ngaymuon"));
                    v.add(resultSet.getString("ngaytra"));
                    v.add(resultSet.getString("phithue"));
                    model.addRow(v);

                }
                getTableLichSuGiaoDich().setModel(model);
            } else if (getCheckMaKhach() == false && getCheckMaXe() == false && getCheckNgayMuon() == false) {
                btnFullActionPerformed(evt);
            } else if (getCheckMaKhach() == true && getCheckMaXe() == true && getCheckNgayMuon() == true) {
                if (ngayMuon.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ngày mượn không được để trống");
                } else {
                    setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select tra_xe.masokhach, thong_tin_khach_hang.hoten,"
                            + " tra_xe.masoxe, thong_tin_xe.bienso, "
                            + "thong_tin_xe.loaixe, tra_xe.ngaymuon, tra_xe.ngaytra,"
                            + " tra_xe.phithue from tra_xe, thong_tin_khach_hang, thong_tin_xe where"
                            + " tra_xe.masokhach = thong_tin_khach_hang.maso and "
                            + "tra_xe.masoxe = thong_tin_xe.maso and masoxe = ? and "
                            + "masokhach = ? and ngaymuon <= ? and ngaytra >= ?"));
                    getPreparedStatement().setString(1, maXe);
                    getPreparedStatement().setString(2, maKhach);
                    getPreparedStatement().setString(3, ngayMuon);
                    getPreparedStatement().setString(4, ngayMuon);
                    ResultSet resultSet = getPreparedStatement().executeQuery();
                    while (resultSet.next()) {
                        Vector v = new Vector();
                        v.add(resultSet.getString("masokhach"));
                        v.add(resultSet.getString("hoten"));
                        v.add(resultSet.getString("masoxe"));
                        v.add(resultSet.getString("bienso"));
                        v.add(resultSet.getString("loaixe"));
                        v.add(resultSet.getString("ngaymuon"));
                        v.add(resultSet.getString("ngaytra"));
                        v.add(resultSet.getString("phithue"));
                        model.addRow(v);

                    }
                    getTableLichSuGiaoDich().setModel(model);
                    }
                
            }        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LichSuGiaoDich.class.getName()).log(Level.SEVERE, null, ex);
        }
        getRadioMaKhach().setSelected(false);
        getRadioMaXe().setSelected(false);
        getRadioNgayMuon().setSelected(false);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        this.hide();
        main.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFullActionPerformed
        // TODO add your handling code here:
        String[] header = {"Mã khách hàng", "Tên khách hàng", "Mã xe","Biển số", "Loại xe", "Ngày mượn", "Ngày trả", "Phí thuê"};
        DefaultTableModel model = new DefaultTableModel(null, header);    
        try {
            
            Class.forName(getClassname());
            setConnection((Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword()));
            setPreparedStatement((PreparedStatement) getConnection().prepareStatement("select tra_xe.masokhach, thong_tin_khach_hang.hoten,"
                    + " tra_xe.masoxe, thong_tin_xe.bienso, "
                    + "thong_tin_xe.loaixe, tra_xe.ngaymuon, tra_xe.ngaytra,"
                    + " tra_xe.phithue from tra_xe, thong_tin_khach_hang, thong_tin_xe where"
                    + " tra_xe.masokhach = thong_tin_khach_hang.maso and "
                    + "tra_xe.masoxe = thong_tin_xe.maso"));
            ResultSet resultSet = getPreparedStatement().executeQuery();
            while (resultSet.next()) {
                Vector v = new Vector();
                v.add(resultSet.getString("masokhach"));
                v.add(resultSet.getString("hoten"));
                v.add(resultSet.getString("masoxe"));
                v.add(resultSet.getString("bienso"));
                v.add(resultSet.getString("loaixe"));
                v.add(resultSet.getString("ngaymuon"));
                v.add(resultSet.getString("ngaytra"));
                v.add(resultSet.getString("phithue"));
                model.addRow(v);
                
            }
            getTableLichSuGiaoDich().setModel(model);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LichSuGiaoDich.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFullActionPerformed

    private void radioMaKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaKhachActionPerformed
        // TODO add your handling code here:
        if (getRadioMaKhach().isSelected() == true) setCheckMaKhach((Boolean) true);
    }//GEN-LAST:event_radioMaKhachActionPerformed

    private void radioMaXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaXeActionPerformed
        // TODO add your handling code here:
        if (getRadioMaXe().isSelected() == true) setCheckMaXe((Boolean) true);
    }//GEN-LAST:event_radioMaXeActionPerformed

    private void radioNgayMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNgayMuonActionPerformed
        // TODO add your handling code here:
        if (getRadioNgayMuon().isSelected() == true) setCheckNgayMuon((Boolean) true);
    }//GEN-LAST:event_radioNgayMuonActionPerformed

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
            java.util.logging.Logger.getLogger(LichSuGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LichSuGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LichSuGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LichSuGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LichSuGiaoDich().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFull;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboMaKhach;
    private javax.swing.JComboBox<String> comboMaXe;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioMaKhach;
    private javax.swing.JRadioButton radioMaXe;
    private javax.swing.JRadioButton radioNgayMuon;
    private javax.swing.JTable tableLichSuGiaoDich;
    private com.toedter.calendar.JDateChooser txtNgayMuon;
    // End of variables declaration//GEN-END:variables
}
