
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Ejercicio4 extends javax.swing.JFrame {
    
    public MenuPrincipal men = new MenuPrincipal();
    public Ejercicios paci = new Ejercicios();
    public int idPaci = paci.idPaciente;
    
    public ArrayList <String> poses = new ArrayList();
    public int tim = 20;
    public int ciclos = 3;
    
    public int monedas;
    public int recompensa = 0;
    
    public Ejercicio4() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/Logo.png")).getImage());
        pnlRes.setVisible(false);
        this.setLocationRelativeTo(null);
        generarPosiciones();
        
        obtenerMonedas();
        ImageIcon pantalla = new ImageIcon(getClass().getResource("/Img/moneditas.png"));
        ImageIcon ico = new ImageIcon(pantalla.getImage().getScaledInstance(lblMons.getWidth(), lblMons.getHeight(), Image.SCALE_DEFAULT));
        lblMons.setIcon(ico);
        
        System.out.println("\n el id del paciente en ejercicio 4 es ::::: " + idPaci);
        lblPaciente.setText("Paciente " + men.User.getPaci(idPaci).getNombre());
    }
    
    public void obtenerMonedas(){
        try{
            //Conexión con la base de dayos db_hyper.sql
            //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_hyper", "root", "");
            Connection cn = new Conexion().getConnection();
            //Declaración de la alta de datos
            PreparedStatement pst = cn.prepareStatement("select * from pacientes where id_Paciente = ?");
            pst.setInt(1, idPaci);
            ResultSet rs = pst.executeQuery();
            rs.next();
            monedas=rs.getInt("monedas");
                
        }catch(Exception e){e.printStackTrace();}
        lblMoney.setText("$" + monedas);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPosicion = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        lblPaciente3 = new javax.swing.JLabel();
        lblPaciente2 = new javax.swing.JLabel();
        lblPaciente1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        pnlRes = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtCal = new javax.swing.JTextField();
        lblPosicion1 = new javax.swing.JLabel();
        lblPosicion2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        lblMons = new javax.swing.JLabel();
        lblMoney = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        lblPaciente.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPaciente.setForeground(new java.awt.Color(102, 102, 102));
        lblPaciente.setText("Paciente");
        jPanel1.add(lblPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoNPequeño.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        lblPosicion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPosicion.setForeground(new java.awt.Color(102, 102, 102));
        lblPosicion.setText("Posiciones");
        jPanel1.add(lblPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        lblImg.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 610, 370));

        lblPaciente3.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPaciente3.setForeground(new java.awt.Color(102, 102, 102));
        lblPaciente3.setText("tu puedes hacerlo!!!");
        jPanel1.add(lblPaciente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 240, 40));

        lblPaciente2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPaciente2.setForeground(new java.awt.Color(102, 102, 102));
        lblPaciente2.setText("Imita las posiciones que se te mostrarán");
        jPanel1.add(lblPaciente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 490, 40));

        lblPaciente1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPaciente1.setForeground(new java.awt.Color(102, 102, 102));
        lblPaciente1.setText("da click en comenzar");
        jPanel1.add(lblPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("El Camaleón");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        lblTiempo.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(102, 102, 102));
        lblTiempo.setText("00:00:20");
        jPanel1.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        btnComenzar.setBackground(new java.awt.Color(153, 0, 0));
        btnComenzar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnComenzar.setForeground(new java.awt.Color(204, 204, 204));
        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 130, 40));

        pnlRes.setBackground(new java.awt.Color(255, 255, 255));

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

        txtCal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCal.setBorder(null);

        lblPosicion1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPosicion1.setForeground(new java.awt.Color(102, 102, 102));
        lblPosicion1.setText("del paciente");

        lblPosicion2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPosicion2.setForeground(new java.awt.Color(102, 102, 102));
        lblPosicion2.setText("Evalúa del 1 al 10 la actitud");

        btnIngresar.setBackground(new java.awt.Color(153, 0, 0));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(204, 204, 204));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlResLayout = new javax.swing.GroupLayout(pnlRes);
        pnlRes.setLayout(pnlResLayout);
        pnlResLayout.setHorizontalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResLayout.createSequentialGroup()
                .addGroup(pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPosicion2)
                    .addGroup(pnlResLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txtCal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlResLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlResLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosicion1))))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        pnlResLayout.setVerticalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblPosicion1))
                    .addComponent(lblPosicion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(pnlRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 220, 180));

        lblMons.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblMons.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(lblMons, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 50, 50));

        lblMoney.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(102, 102, 102));
        lblMoney.setText("$$$");
        jPanel1.add(lblMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 860, 480));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Ejercicios ej = new Ejercicios();
        this.setVisible(false);
        ej.setVisible(true);
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        Timer tiempo = new Timer(1000,null);
        tiempo.start();
        actualizarImg(ciclos);
        lblPosicion.setText(poses.get(ciclos));
        tiempo.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){

                if(tim >= 0 && ciclos >= 0){
                    lblTiempo.setText("00:00:" + tim);
                }
                if(tim == 0 && ciclos > 0){
                    ciclos--;
                    actualizarImg(ciclos);
                    lblPosicion.setText(poses.get(ciclos));
                    tim=5;
                    
                }if(ciclos==0)
                    pnlRes.setVisible(true);
                tim--;
            }
        });
    }//GEN-LAST:event_btnComenzarActionPerformed

    public void registrarMonedas(int n){
        monedas = monedas + n;
        // UPDATE
        try{
            //Conexión con la base de dayos db_hyper.sql
            //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_hyper", "root", "");
            Connection cn = new Conexion().getConnection();
            //Declaración de la alta de datos
            PreparedStatement pst = cn.prepareStatement("update pacientes set monedas = ? where id_Paciente = ?");
            pst.setInt(1, monedas);
            pst.setInt(2, idPaci);
            pst.executeUpdate();
        }catch(Exception e){e.printStackTrace();}
        men.User.getPaci(idPaci).actMonedas(monedas);
        lblMoney.setText("$" + monedas);
    }
    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        recompensa = Integer.valueOf(txtCal.getText());
        if(recompensa>8){
            JOptionPane.showMessageDialog(null, "El paciente ha tenido buen desempeño,por favor registre su comportamiento, ganaste " + recompensa + " monedas","Excelente", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El paciente no esta teniendo la respuesta esperada, registre su comportamiento por favor, ganaste " + recompensa + " monedas","Desafortunado", JOptionPane.WARNING_MESSAGE); 
        }
        registrarMonedas(recompensa);
        
        System.out.println("\n el id del paciente en Ejercicio 4 es ::::: " + idPaci);
        Pacientes paci = new Pacientes();
        paci.idPaciente=idPaci;
        
        Comportamientos comp = new Comportamientos();
        this.setVisible(false);
        comp.setVisible(true);
    }//GEN-LAST:event_btnIngresarActionPerformed
    
    public void actualizarImg(int c){
        ImageIcon ico;
        ico = new ImageIcon(getClass().getResource("/Camaleon/" + poses.get(ciclos) + ".png"));
        lblImg.setIcon(ico);
    }
    
    void generarPosiciones(){
        poses.add("Guerrero");
        poses.add("High Lunge");
        poses.add("Low Lunge");
        poses.add("Savasana");
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
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblMons;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblPaciente1;
    private javax.swing.JLabel lblPaciente2;
    private javax.swing.JLabel lblPaciente3;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lblPosicion1;
    private javax.swing.JLabel lblPosicion2;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel pnlRes;
    private javax.swing.JTextField txtCal;
    // End of variables declaration//GEN-END:variables
}
