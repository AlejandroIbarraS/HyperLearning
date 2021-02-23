

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MenuPrincipal extends javax.swing.JFrame {

    public static Padre User;
    
    public MenuPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/Logo.png")).getImage());
        this.setLocationRelativeTo(null);
        IniciarSesion ini = new IniciarSesion();
        
        lblSaludo.setText("Hola " + ini.nombre);
        
        int id=0;
        
        try{
            //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_hyper", "root", "");
            System.out.println("\n Se llama un menu principal");
            Connection cn = new Conexion().getConnection();
            PreparedStatement pst = cn.prepareStatement("select * from  padres where nombre = ?");
            
            pst.setString(1, ini.nombre);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                id=(rs.getInt("id"));
            } else{
                //JOptionPane.showMessageDialog(null, "Error al consultar DB","Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){e.printStackTrace();}
        
        User=new Padre(id,ini.nombre);
        agregarPacientes();
        
        //System.out.printf("\nEl usuario tiene asignados " + User.getNpac() + " pacientes\nCuyos nombres son:\n");
        for(int i=0;i<User.getNpac();i++)
            System.out.printf("\n" + User.getPaciente(i).getNombre() + " id: " + User.getPaciente(i).getId());
        
        
    }
    public void agregarPacientes(){
        int count=0;
        Paciente paux;
        try{
            // conexión con la base de datos
            //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_hyper", "root", "");
            Connection cn = new Conexion().getConnection();
            //Se obtiene el número de pacientes asignados al usuario
            PreparedStatement pst = cn.prepareStatement("select count(*) AS nPacientes from pacientes where id_Padre = ?");
            pst.setInt(1, User.getID());
            ResultSet rs = pst.executeQuery();
            rs.next();
            count = rs.getInt("nPacientes");

            //JOptionPane.showMessageDialog(null, "El numero de pacientes es " + count ,"Num", JOptionPane.ERROR_MESSAGE);
            //Se obtienen los registros de todos los pacientes asignados a ese usuario
            pst = cn.prepareStatement("select * from pacientes where id_Padre = ?");
            pst.setInt(1, User.getID());
            rs = pst.executeQuery();
            //System.out.println("agregando pacientes:::::");
            while(rs.next()){
                //System.out.println(rs.getString("nombre") + rs.getInt("edad") + rs.getInt("id_Paciente"));
                paux = new Paciente(rs.getString("nombre"),rs.getInt("edad"),rs.getInt("id_Paciente"),rs.getInt("monedas"));
                if(User.existePaciente(paux)==-1)
                    User.agregarPaciente(paux);
            }
            //System.out.println("\nTermino de agregar");
        }catch(Exception e){e.printStackTrace();}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRP = new javax.swing.JButton();
        btnEjercicios = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        lblSaludo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Menu Principal");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        btnRP.setBackground(new java.awt.Color(153, 0, 0));
        btnRP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRP.setForeground(new java.awt.Color(204, 204, 204));
        btnRP.setText("Registrar Paciente");
        btnRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRPActionPerformed(evt);
            }
        });
        jPanel1.add(btnRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 290, 70));

        btnEjercicios.setBackground(new java.awt.Color(153, 0, 0));
        btnEjercicios.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEjercicios.setForeground(new java.awt.Color(204, 204, 204));
        btnEjercicios.setText("Ejercicios");
        btnEjercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjerciciosActionPerformed(evt);
            }
        });
        jPanel1.add(btnEjercicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 290, 70));

        btnPaciente.setBackground(new java.awt.Color(153, 0, 0));
        btnPaciente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPaciente.setForeground(new java.awt.Color(204, 204, 204));
        btnPaciente.setText("Pacientes");
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 290, 70));

        lblSaludo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSaludo.setForeground(new java.awt.Color(153, 153, 153));
        lblSaludo.setText("Nombre de Usuario");
        jPanel1.add(lblSaludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoNPequeño.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 610, 450));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fn4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 320, 620));

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(153, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(204, 204, 204));
        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoNaranja.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        IniciarSesion iniciar = new IniciarSesion();
        this.setVisible(false);
        iniciar.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        Pacientes pacientes = new Pacientes();
        this.setVisible(false);
        pacientes.setVisible(true);
        
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnEjerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjerciciosActionPerformed
        Ejercicios ejercicios = new Ejercicios();
        this.setVisible(false);
        ejercicios.setVisible(true);
    }//GEN-LAST:event_btnEjerciciosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRPActionPerformed
        String nom="";
        int ed=0;
        nom = JOptionPane.showInputDialog(null, "Ingrese el nombre del Paciente","Registrar Paciente", JOptionPane.QUESTION_MESSAGE);
        ed = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del Paciente","Registrar Paciente", JOptionPane.QUESTION_MESSAGE));
        try{
            //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_hyper", "root", "");
            Connection cn = new Conexion().getConnection();
            PreparedStatement pst = cn.prepareStatement("insert into pacientes values(?,?,?,?,?)");
            
            pst.setString(1, "0");
            pst.setInt(2,User.getID());
            pst.setString(3,nom);
            pst.setInt(4, ed);
            pst.setInt(5,0);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Paciente, " + nom + " registrado con éxito","Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){e.printStackTrace();}
        agregarPacientes();
        System.out.printf("\nEl usuario tiene asignados " + User.getNpac() + "pacientes\nCuyos nombres son:\n");
        for(int i=0;i<User.getNpac();i++)
            System.out.printf("\n" + User.getPaciente(i).getNombre());
    }//GEN-LAST:event_btnRPActionPerformed

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
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEjercicios;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnRP;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSaludo;
    // End of variables declaration//GEN-END:variables
}
