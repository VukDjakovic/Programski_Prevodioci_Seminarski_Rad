/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JavaIznajmljivanjeMuzickeOpreme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Comparator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author vukdj
 */
public class muzickaoprema extends javax.swing.JFrame {

    /**
     * Creates new form muzickaoprema
     */
    public muzickaoprema() {
        initComponents();
        prikazTabele();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxTip = new javax.swing.JComboBox<>();
        txtProizvodjac = new javax.swing.JTextField();
        txtNaziv = new javax.swing.JTextField();
        txtCena = new javax.swing.JTextField();
        txtDatum_iznajmljivanja = new javax.swing.JTextField();
        txtDatum_vracanja = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnIzmeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxFilter_tip = new javax.swing.JComboBox<>();
        cbxFilter_cena = new javax.swing.JComboBox<>();
        btnFiltriraj = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Muzička Oprema");
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Tip:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Proizvođač:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Naziv:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cena (RSD):");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Datum iznajmljivanja:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Datum vraćanja:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 40));

        cbxTip.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxTip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gitara", "Bubnjevi", "Klavir", "Violina", "Saksofon", "Truba", "Ostalo" }));
        cbxTip.setPreferredSize(new java.awt.Dimension(200, 40));

        txtProizvodjac.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtProizvodjac.setPreferredSize(new java.awt.Dimension(200, 40));

        txtNaziv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNaziv.setPreferredSize(new java.awt.Dimension(200, 40));

        txtCena.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCena.setPreferredSize(new java.awt.Dimension(200, 40));

        txtDatum_iznajmljivanja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDatum_iznajmljivanja.setToolTipText("dd/MM/yyyy");
        txtDatum_iznajmljivanja.setPreferredSize(new java.awt.Dimension(200, 40));

        txtDatum_vracanja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDatum_vracanja.setToolTipText("dd/MM/yyyy");
        txtDatum_vracanja.setPreferredSize(new java.awt.Dimension(200, 40));

        btnDodaj.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.setBorder(null);
        btnDodaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDodaj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDodaj.setPreferredSize(new java.awt.Dimension(100, 40));
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnIzmeni.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnIzmeni.setText("Izmeni");
        btnIzmeni.setBorder(null);
        btnIzmeni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIzmeni.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIzmeni.setPreferredSize(new java.awt.Dimension(100, 40));
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        btnObrisi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.setBorder(null);
        btnObrisi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnObrisi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnObrisi.setPreferredSize(new java.awt.Dimension(100, 40));
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Filteri:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Po tipu:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Po ceni:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 40));

        cbxFilter_tip.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxFilter_tip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bez filtera", "Abecedno uzlazno", "Abecedno silazno" }));
        cbxFilter_tip.setPreferredSize(new java.awt.Dimension(200, 40));

        cbxFilter_cena.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxFilter_cena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bez filtera", "Od najniže", "Od najviše" }));
        cbxFilter_cena.setPreferredSize(new java.awt.Dimension(200, 40));

        btnFiltriraj.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnFiltriraj.setText("Filtriraj");
        btnFiltriraj.setBorder(null);
        btnFiltriraj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltriraj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFiltriraj.setPreferredSize(new java.awt.Dimension(100, 40));
        btnFiltriraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProizvodjac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDatum_iznajmljivanja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDatum_vracanja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btnFiltriraj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxFilter_tip, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxFilter_cena, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProizvodjac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatum_iznajmljivanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxFilter_tip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxFilter_cena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatum_vracanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltriraj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tip", "Proizvođač", "Naziv", "Cena", "Iznajmljeno", "Datum vraćanja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prikazTabele() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bazaiznajmljivanjemuzickeopreme","root","");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM Oprema");

        ResultSet rs = ps.executeQuery();
        java.sql.ResultSetMetaData stData = rs.getMetaData();

        int q = stData.getColumnCount();

        DefaultTableModel RecordTable = (DefaultTableModel) Tabela.getModel();
        RecordTable.setRowCount(0);

        while (rs.next()) {
            Vector<Object> columnData = new Vector<>();
            int i;

            for (i = 1; i <= q; i++) {
                columnData.add(rs.getInt("ID_opreme"));
                columnData.add(rs.getString("Tip"));
                columnData.add(rs.getString("Proizvodjac"));
                columnData.add(rs.getString("Naziv"));
                columnData.add(rs.getInt("Cena"));
                columnData.add(rs.getString("Datum_iznajmljivanja"));
                columnData.add(rs.getString("Datum_vracanja"));
            }
            RecordTable.addRow(columnData);
        }

    } catch (Exception ex) {
        Logger.getLogger(muzickaoprema.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    
    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        try {
            String tip=cbxTip.getSelectedItem().toString();
            String proizvodjac=txtProizvodjac.getText();
            String naziv=txtNaziv.getText();
            String cenaStr=txtCena.getText();
            int cena=Integer.parseInt(cenaStr);
            String datum_iznajmljivanja=txtDatum_iznajmljivanja.getText();
            String datum_vracanja=txtDatum_vracanja.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bazaiznajmljivanjemuzickeopreme","root","");
            PreparedStatement ps = con.prepareStatement("insert into Oprema(Tip, Proizvodjac, Naziv, Cena, Datum_iznajmljivanja, Datum_vracanja)values(?,?,?,?,?,?)");
            ps.setString(1,tip);
            ps.setString(2,proizvodjac);
            ps.setString(3,naziv);
            ps.setInt(4,cena);
            ps.setString(5, datum_iznajmljivanja);
            ps.setString(6, datum_vracanja);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Oprema dodata!");
            prikazTabele();
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(muzickaoprema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        DefaultTableModel RecordTable=(DefaultTableModel)Tabela.getModel();
        int izabraniRed=Tabela.getSelectedRow();
        
        try {
            int ID_opreme=Integer.parseInt(RecordTable.getValueAt(izabraniRed, 0).toString());
            String tip=cbxTip.getSelectedItem().toString();
            String proizvodjac=txtProizvodjac.getText();
            String naziv=txtNaziv.getText();
            String cenaStr=txtCena.getText();
            int cena=Integer.parseInt(cenaStr);
            String datum_iznajmljivanja=txtDatum_iznajmljivanja.getText();
            String datum_vracanja=txtDatum_vracanja.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bazaiznajmljivanjemuzickeopreme","root","");
            PreparedStatement ps = con.prepareStatement("update Oprema set Tip=?,Proizvodjac=?,Naziv=?,Cena=?,Datum_iznajmljivanja=?,Datum_vracanja=? where ID_opreme=?");
            ps.setInt(7, ID_opreme);
            ps.setString(1,tip);
            ps.setString(2,proizvodjac);
            ps.setString(3,naziv);
            ps.setInt(4,cena);
            ps.setString(5, datum_iznajmljivanja);
            ps.setString(6, datum_vracanja);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Promena izvršena!");
            prikazTabele();
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(muzickaoprema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        DefaultTableModel RecordTable=(DefaultTableModel)Tabela.getModel();
        int izabraniRed=Tabela.getSelectedRow();
        
        try {
            int ID_opreme=Integer.parseInt(RecordTable.getValueAt(izabraniRed, 0).toString());
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bazaiznajmljivanjemuzickeopreme","root","");
            PreparedStatement ps=con.prepareStatement("delete from Oprema where ID_opreme=?");
            ps.setInt(1, ID_opreme);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Oprema obrisana!");
            prikazTabele();
        } catch (Exception ex) {
            Logger.getLogger(muzickaoprema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        DefaultTableModel RecordTable=(DefaultTableModel)Tabela.getModel();
            int izabraniRed=Tabela.getSelectedRow();
            
            cbxTip.setSelectedItem(RecordTable.getValueAt(izabraniRed, 1) != null ?
                         RecordTable.getValueAt(izabraniRed, 1).toString() : "");
            txtProizvodjac.setText(RecordTable.getValueAt(izabraniRed, 2) != null ?
                         RecordTable.getValueAt(izabraniRed, 2).toString() : "");
            txtNaziv.setText(RecordTable.getValueAt(izabraniRed, 3) != null ?
                         RecordTable.getValueAt(izabraniRed, 3).toString() : "");
            txtCena.setText(RecordTable.getValueAt(izabraniRed, 4) != null ?
                         RecordTable.getValueAt(izabraniRed, 4).toString() : "");
            txtDatum_iznajmljivanja.setText(RecordTable.getValueAt(izabraniRed, 5) != null ?
                         RecordTable.getValueAt(izabraniRed, 5).toString() : "");
            txtDatum_vracanja.setText(RecordTable.getValueAt(izabraniRed, 6) != null ?
                         RecordTable.getValueAt(izabraniRed, 6).toString() : "");
    }//GEN-LAST:event_TabelaMouseClicked

    private void btnFiltrirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrirajActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        Tabela.setRowSorter(sorter);

        String izabranaCena = cbxFilter_cena.getSelectedItem().toString();
        String izabraniTip = cbxFilter_tip.getSelectedItem().toString();
        
        if (izabranaCena.equals("Od najniže")){
            sorter.setComparator(4, Comparator.naturalOrder());
            Tabela.getRowSorter().toggleSortOrder(4);
        } else if (izabranaCena.equals("Od najviše")) {
            sorter.setComparator(4, Comparator.reverseOrder());
            Tabela.getRowSorter().toggleSortOrder(4);
        }
        
        if (izabraniTip.equals("Abecedno uzlazno")){
            sorter.setComparator(1, Comparator.naturalOrder());
            Tabela.getRowSorter().toggleSortOrder(1);
        } else if (izabraniTip.equals("Abecedno silazno")) {
            sorter.setComparator(1, Comparator.reverseOrder());
            Tabela.getRowSorter().toggleSortOrder(1);
        }
    }//GEN-LAST:event_btnFiltrirajActionPerformed

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
            java.util.logging.Logger.getLogger(muzickaoprema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(muzickaoprema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(muzickaoprema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(muzickaoprema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new muzickaoprema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnFiltriraj;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JComboBox<String> cbxFilter_cena;
    private javax.swing.JComboBox<String> cbxFilter_tip;
    private javax.swing.JComboBox<String> cbxTip;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCena;
    private javax.swing.JTextField txtDatum_iznajmljivanja;
    private javax.swing.JTextField txtDatum_vracanja;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtProizvodjac;
    // End of variables declaration//GEN-END:variables
}
