
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ejercicios extends javax.swing.JFrame {

    public static int idPaciente;
    public String descE = "";
    
    public Ejercicios() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/Logo.png")).getImage());
        //txtId.setText("12");
        pnlEj.setVisible(false);
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGp = new javax.swing.ButtonGroup();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbtnEj3 = new javax.swing.JRadioButton();
        rbtnEj1 = new javax.swing.JRadioButton();
        rbtnEj2 = new javax.swing.JRadioButton();
        btnEjercicio = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        rbtnEj4 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        pnlEj = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEj = new javax.swing.JTextArea();
        lblEj = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 204, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Ejercicios");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        rbtnEj3.setBackground(new java.awt.Color(255, 255, 255));
        btnGp.add(rbtnEj3);
        rbtnEj3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtnEj3.setForeground(new java.awt.Color(153, 153, 153));
        rbtnEj3.setText("¿Qué objeto falta?");
        rbtnEj3.setToolTipText("");
        rbtnEj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEj3ActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnEj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        rbtnEj1.setBackground(new java.awt.Color(255, 255, 255));
        btnGp.add(rbtnEj1);
        rbtnEj1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtnEj1.setForeground(new java.awt.Color(153, 153, 153));
        rbtnEj1.setText("Memorama");
        rbtnEj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEj1ActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        rbtnEj2.setBackground(new java.awt.Color(255, 255, 255));
        btnGp.add(rbtnEj2);
        rbtnEj2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtnEj2.setForeground(new java.awt.Color(153, 153, 153));
        rbtnEj2.setText("Ahorcado");
        rbtnEj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEj2ActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnEj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnEjercicio.setBackground(new java.awt.Color(153, 0, 0));
        btnEjercicio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnEjercicio.setForeground(new java.awt.Color(204, 204, 204));
        btnEjercicio.setText("Ir a Ejercicio");
        btnEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjercicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 140, 50));

        btnVer.setBackground(new java.awt.Color(153, 0, 0));
        btnVer.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnVer.setForeground(new java.awt.Color(204, 204, 204));
        btnVer.setText("ver más");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        jPanel1.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 100, 40));

        rbtnEj4.setBackground(new java.awt.Color(255, 255, 255));
        btnGp.add(rbtnEj4);
        rbtnEj4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtnEj4.setForeground(new java.awt.Color(153, 153, 153));
        rbtnEj4.setText("El Camaleón");
        rbtnEj4.setToolTipText("");
        rbtnEj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEj4ActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnEj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 70, 2));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setBorder(null);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 70, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoNPequeño.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Id del paciente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 470, 390));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fn4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 350, 620));

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(153, 0, 0));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(204, 204, 204));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 90, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoNaranja.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 80));

        pnlEj.setBackground(new java.awt.Color(255, 255, 255));
        pnlEj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoNPequeño.png"))); // NOI18N
        pnlEj.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setAutoscrolls(true);

        txtEj.setColumns(20);
        txtEj.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtEj.setLineWrap(true);
        txtEj.setRows(5);
        jScrollPane1.setViewportView(txtEj);

        pnlEj.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 130));

        lblEj.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEj.setForeground(new java.awt.Color(153, 153, 153));
        lblEj.setText("Id del paciente");
        pnlEj.add(lblEj, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        btnOk.setBackground(new java.awt.Color(153, 0, 0));
        btnOk.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnOk.setForeground(new java.awt.Color(204, 204, 204));
        btnOk.setText("ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        pnlEj.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 60, 40));

        jPanel2.add(pnlEj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, 310));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        this.setVisible(false);
        menu.setVisible(true);
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void rbtnEj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEj3ActionPerformed
        pnlEj.setVisible(true);
        txtEj.setText(getDescEjercicio(3));
        lblEj.setText(getNomEjercicio(3));
    }//GEN-LAST:event_rbtnEj3ActionPerformed

    private void rbtnEj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEj2ActionPerformed
        pnlEj.setVisible(true);
        txtEj.setText(getDescEjercicio(2));
        lblEj.setText(getNomEjercicio(2));
    }//GEN-LAST:event_rbtnEj2ActionPerformed

    private void rbtnEj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEj4ActionPerformed
        pnlEj.setVisible(true);
        txtEj.setText(getDescEjercicio(4));
        lblEj.setText(getNomEjercicio(4));
    }//GEN-LAST:event_rbtnEj4ActionPerformed

    private void btnEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicioActionPerformed
        
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese un ID de paciente","Error", JOptionPane.WARNING_MESSAGE);
        }else{
            idPaciente = Integer.valueOf(txtId.getText());
            System.out.println("\n el id del paciente en Ejercicios es ::::: " + idPaciente);
            if (rbtnEj1.isSelected()){
                Ejercicio1 ej1 = new Ejercicio1();
                this.setVisible(false);
                ej1.setVisible(true);
            }else if (rbtnEj2.isSelected()){
                Ejercicio2 ej2 = new Ejercicio2();
                this.setVisible(false);
                ej2.setVisible(true);
            }else if (rbtnEj3.isSelected()){
                Ejercicio3 ej3 = new Ejercicio3();
                this.setVisible(false);
                ej3.setVisible(true);
            }else if (rbtnEj4.isSelected()){
                Ejercicio4 ej4 = new Ejercicio4();
                this.setVisible(false);
                ej4.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un ejercicio","Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnEjercicioActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        pnlEj.setVisible(true);
        int ejeS = 0;
        if (rbtnEj1.isSelected()){
            ejeS = 1;
        }else if (rbtnEj2.isSelected()){
            ejeS = 2;
        }else if (rbtnEj3.isSelected()){
            ejeS = 3;
        }else if (rbtnEj4.isSelected()){
            ejeS = 4;
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un ejercicio","Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        pnlEj.setVisible(false);
    }//GEN-LAST:event_btnOkActionPerformed

    private void rbtnEj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEj1ActionPerformed
        pnlEj.setVisible(true);
        txtEj.setText(getDescEjercicio(1));
        lblEj.setText(getNomEjercicio(1));
    }//GEN-LAST:event_rbtnEj1ActionPerformed

    public String getDescEjercicio(int ej){
        String dinamica="";
        try{
            //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_hyper", "root", "");
            Connection cn = new Conexion().getConnection();
            PreparedStatement pst = cn.prepareStatement("select * from ejercicios where id_ej = ?");
            pst.setInt(1, ej);
            ResultSet rs = pst.executeQuery();
            rs.next();
            dinamica = rs.getString("dinamica");

        }catch(Exception e){e.printStackTrace();}
        return dinamica;
    }
    
    public String getNomEjercicio(int ej){
        String dinamica="";
        try{
            //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_hyper", "root", "");
            Connection cn = new Conexion().getConnection();
            PreparedStatement pst = cn.prepareStatement("select * from ejercicios where id_ej = ?");
            pst.setInt(1, ej);
            ResultSet rs = pst.executeQuery();
            rs.next();
            dinamica = rs.getString("nombre");

        }catch(Exception e){e.printStackTrace();}
        return dinamica;
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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjercicio;
    private javax.swing.ButtonGroup btnGp;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEj;
    private javax.swing.JPanel pnlEj;
    private javax.swing.JRadioButton rbtnEj1;
    private javax.swing.JRadioButton rbtnEj2;
    private javax.swing.JRadioButton rbtnEj3;
    private javax.swing.JRadioButton rbtnEj4;
    private javax.swing.JTextArea txtEj;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
