
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Comportamientos extends javax.swing.JFrame {

    public MenuPrincipal men = new MenuPrincipal();
    public Pacientes paci = new Pacientes();
    public int idPaci = paci.idPaciente;
    
    public Comportamientos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/Logo.png")).getImage());
        this.setLocationRelativeTo(null);
        System.out.println("\n el id del paciente en Comportamientos es ::::: " + idPaci);
        agregarComportamientos();
        lblPaciente.setText("Paciente " + men.User.getPaci(idPaci).getNombre());
    }

    public void agregarComportamientos(){
        Comportamiento caux;
        try{
            //Conexión con la base de datos bd_hyper.sql
            //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_hyper", "root", "");
            Connection cn = new Conexion().connection();
            //Declaración de la consulta
            PreparedStatement pst = cn.prepareStatement("select * from comportamientos where id_paciente = ?");
            //Declaración de parametros en la consulta
            pst.setInt(1,idPaci);
            //Ejecución de la consulta
            ResultSet rs = pst.executeQuery();
            //Extracción de datos.
            while(rs.next()){
                caux = new Comportamiento(rs.getInt("id_comp"),rs.getString("descripcion"),rs.getString("comentario"),rs.getString("tipo"),rs.getString("fecha"));
                if(men.User.getPaci(idPaci).existeComp(caux)==-1)
                    men.User.getPaci(idPaci).agregarComp(caux);
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtDescComp = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtDia = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtMes = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtAnio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        txtDescComp2 = new javax.swing.JScrollPane();
        txtComentarios = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

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
        jLabel5.setText("Agregar comportamientos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(153, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(204, 204, 204));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 140, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("-");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(253, 246, 246));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(null);
        txtDescComp.setViewportView(txtDescripcion);

        jPanel1.add(txtDescComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 440, 260));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoNPequeño.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Ingrese sus comentarios");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 50, 2));

        txtDia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDia.setBorder(null);
        jPanel1.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 50, 40));

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 50, 2));

        txtMes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMes.setBorder(null);
        jPanel1.add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 50, 40));

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 50, 2));

        txtAnio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnio.setBorder(null);
        jPanel1.add(txtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 50, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Comportamiento...");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("-");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Describa el comportamiento");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        cmbTipo.setBackground(new java.awt.Color(153, 0, 0));
        cmbTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbTipo.setForeground(new java.awt.Color(204, 204, 204));
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "positivo", "negativo" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 120, 40));

        txtComentarios.setBackground(new java.awt.Color(253, 246, 246));
        txtComentarios.setColumns(20);
        txtComentarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtComentarios.setForeground(new java.awt.Color(153, 153, 153));
        txtComentarios.setLineWrap(true);
        txtComentarios.setRows(5);
        txtComentarios.setBorder(null);
        txtDescComp2.setViewportView(txtComentarios);

        jPanel1.add(txtDescComp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 340, 260));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Fecha");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        lblPaciente.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPaciente.setForeground(new java.awt.Color(102, 102, 102));
        lblPaciente.setText("Paciente");
        jPanel1.add(lblPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 870, 480));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 620));

        jButton8.setBackground(new java.awt.Color(0, 0, 102));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 204, 204));
        jButton8.setText("Salir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Pacientes pacientes = new Pacientes();
        this.setVisible(false);
        pacientes.setVisible(true);
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String fecha=txtDia.getText()+ "-" + txtMes.getText()+ "-" + txtAnio.getText();
        String desc = txtDescripcion.getText();
        String com = txtComentarios.getText();
        String tip = (String)cmbTipo.getSelectedItem();
        try{
            //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_hyper", "root", "");
            Connection cn = new Conexion().connection();
            PreparedStatement pst = cn.prepareStatement("insert into comportamientos values(?,?,?,?,?,?)");
            
            pst.setString(1, "0");
            pst.setInt(2,idPaci);
            pst.setString(3,desc);
            pst.setString(4, com);
            pst.setString(5,tip);
            pst.setString(6,fecha);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Comportamiento con fecha: " + fecha + " fue registrado con éxito","Registro de comportamiento", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){e.printStackTrace();}
        agregarComportamientos();
        System.out.println("\n\nAhora el paciente " + men.User.getPaci(idPaci).getNombre() + " tiene " + men.User.getPaci(idPaci).getNcomps());
        
        txtDescripcion.setText("");
        txtComentarios.setText("");
        
    }//GEN-LAST:event_btnAgregarActionPerformed

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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextArea txtComentarios;
    private javax.swing.JScrollPane txtDescComp;
    private javax.swing.JScrollPane txtDescComp2;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables
}
