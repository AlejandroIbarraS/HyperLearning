
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Pacientes extends javax.swing.JFrame {
    public static int idPaciente;
    public MenuPrincipal men = new MenuPrincipal();
    public Pacientes() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/Logo.png")).getImage());
        this.setLocationRelativeTo(null);
        
        String cadAux="";
        for(int i=0;i<men.User.getNpac();i++){
            cadAux=cadAux+"\n" + men.User.getPaciente(i);
        }
        txtPacientes.setText(cadAux);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnComp = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPacientes = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnTransaccion = new javax.swing.JButton();
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
        jLabel5.setText("Pacientes asignados");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        btnComp.setBackground(new java.awt.Color(153, 0, 0));
        btnComp.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnComp.setForeground(new java.awt.Color(204, 204, 204));
        btnComp.setText("Agregar comportamiento");
        btnComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompActionPerformed(evt);
            }
        });
        jPanel1.add(btnComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 330, 50));

        btnHistorial.setBackground(new java.awt.Color(153, 0, 0));
        btnHistorial.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(204, 204, 204));
        btnHistorial.setText("Ver historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 140, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoNPequeño.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 70, 2));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setBorder(null);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 70, 40));

        txtPacientes.setEditable(false);
        txtPacientes.setColumns(20);
        txtPacientes.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtPacientes.setRows(5);
        jScrollPane1.setViewportView(txtPacientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 510, 270));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Id delpaciente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        btnTransaccion.setBackground(new java.awt.Color(153, 0, 0));
        btnTransaccion.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnTransaccion.setForeground(new java.awt.Color(204, 204, 204));
        btnTransaccion.setText("Transsaccion");
        btnTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 560, 490));

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
        MenuPrincipal menu = new MenuPrincipal();
        this.setVisible(false);
        menu.setVisible(true);
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese un ID de paciente","Error", JOptionPane.WARNING_MESSAGE);
        }else{
            idPaciente = Integer.valueOf(txtId.getText());
            System.out.println("\n el id del paciente en Pacientes es ::::: " + idPaciente);
            Historial historial = new Historial();
            System.out.println("\n Se inicio Historial");
            this.setVisible(false);
            historial.setVisible(true);
        }
            
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompActionPerformed
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese un ID de paciente","Error", JOptionPane.WARNING_MESSAGE);
        }else{
            if(txtId.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese un ID de paciente","Error", JOptionPane.WARNING_MESSAGE);
            }else{
                idPaciente = Integer.valueOf(txtId.getText());
                Comportamientos comp = new Comportamientos();
                System.out.println("\n el id del paciente en Pacientes es ::::: " + idPaciente);
                this.setVisible(false);
                comp.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnCompActionPerformed

    private void btnTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaccionActionPerformed
    int monedas =0;
    int trans =0;

        if(txtId.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Ingrese un ID de paciente","Error", JOptionPane.WARNING_MESSAGE);
        else{
            idPaciente = Integer.valueOf(txtId.getText());
            trans = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el costo","Monedas", JOptionPane.QUESTION_MESSAGE));
            try{
                //Conexión con la base de dayos db_hyper.sql
                //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_hyper", "root", "");
                Connection cn = new Conexion().getConnection();
                //Declaración de la alta de datos
                PreparedStatement pst = cn.prepareStatement("select * from pacientes where id_Paciente = ?");
                pst.setInt(1, idPaciente);
                ResultSet rs = pst.executeQuery();
                rs.next();
                monedas=rs.getInt("monedas");
                if(monedas<trans){
                    JOptionPane.showMessageDialog(null, "Monedas Insuficientes","Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // UPDATE
                pst = cn.prepareStatement("update pacientes set monedas = ? where id_Paciente = ?");
                pst.setInt(1, monedas-trans);
                pst.setInt(2, idPaciente);
                pst.executeUpdate();
                men.User.getPaci(idPaciente).actMonedas(monedas-trans);
                JOptionPane.showMessageDialog(null, "Ahora el paciente " + men.User.getPaci(idPaciente).getNombre() + " tiene " + men.User.getPaci(idPaciente).getMonedas() + " monedas","Transacción exitosa", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){e.printStackTrace();} 
            String cadAux="";
            for(int i=0;i<men.User.getNpac();i++){
                cadAux=cadAux+"\n" + men.User.getPaciente(i);
            }
            txtPacientes.setText(cadAux);
        }
    }//GEN-LAST:event_btnTransaccionActionPerformed

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
    private javax.swing.JButton btnComp;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTransaccion;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtPacientes;
    // End of variables declaration//GEN-END:variables
}
