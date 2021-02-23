
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


public class Ejercicio3 extends javax.swing.JFrame {
    
    public MenuPrincipal men = new MenuPrincipal();
    public Ejercicios paci = new Ejercicios();
    public int idPaci = paci.idPaciente;
    public ArrayList <Integer> oEjer = new ArrayList();
    public ArrayList <Integer> rEjer = new ArrayList();
    public int tim = 5;
    public int correcta;
    public int pCorrOrden;
    public int pCorrRes;
    
    public int monedas;
    public int recompensa = 3;
    
    public Ejercicio3() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/Logo.png")).getImage());
        pnlRes.setVisible(false);
        btnPlay.setVisible(false);
        lblLogrado.setVisible(false);
        this.setLocationRelativeTo(null);
        
        obtenerMonedas();
        ImageIcon pantalla = new ImageIcon(getClass().getResource("/Img/moneditas.png"));
        ImageIcon ico = new ImageIcon(pantalla.getImage().getScaledInstance(lblMons.getWidth(), lblMons.getHeight(), Image.SCALE_DEFAULT));
        lblMons.setIcon(ico);
        
        System.out.println("\n el id del paciente en Ejercicio 3 es ::::: " + idPaci);
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
        lbl3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        lblLogrado = new javax.swing.JLabel();
        pnlRes = new javax.swing.JPanel();
        lblR3 = new javax.swing.JLabel();
        lblR2 = new javax.swing.JLabel();
        lblR1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        lblPaciente1 = new javax.swing.JLabel();
        lblMoney = new javax.swing.JLabel();
        lblMons = new javax.swing.JLabel();
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
        jPanel1.add(lblPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoNPequeño.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        lbl3.setBackground(new java.awt.Color(204, 204, 204));
        lbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 100, 90));

        lbl1.setBackground(new java.awt.Color(204, 204, 204));
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 100, 90));

        lbl2.setBackground(new java.awt.Color(204, 204, 204));
        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 100, 90));

        lbl4.setBackground(new java.awt.Color(204, 204, 204));
        lbl4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 100, 90));

        lbl5.setBackground(new java.awt.Color(204, 204, 204));
        lbl5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 100, 90));

        lbl6.setBackground(new java.awt.Color(204, 204, 204));
        lbl6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 100, 90));

        lbl7.setBackground(new java.awt.Color(204, 204, 204));
        lbl7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 100, 90));

        lbl8.setBackground(new java.awt.Color(204, 204, 204));
        lbl8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 100, 90));

        lbl9.setBackground(new java.awt.Color(204, 204, 204));
        lbl9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 100, 90));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("¿Qué objeto falta?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        lblTiempo.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(102, 102, 102));
        lblTiempo.setText("00:00:05");
        jPanel1.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        btnComenzar.setBackground(new java.awt.Color(153, 0, 0));
        btnComenzar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnComenzar.setForeground(new java.awt.Color(204, 204, 204));
        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 130, 40));

        lblLogrado.setBackground(new java.awt.Color(204, 204, 204));
        lblLogrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogradoMouseClicked(evt);
            }
        });
        jPanel1.add(lblLogrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 120, 110));

        pnlRes.setBackground(new java.awt.Color(255, 255, 255));
        pnlRes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblR3.setBackground(new java.awt.Color(204, 204, 204));
        lblR3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblR3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblR3MouseClicked(evt);
            }
        });
        pnlRes.add(lblR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 100, 90));

        lblR2.setBackground(new java.awt.Color(204, 204, 204));
        lblR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblR2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblR2MouseClicked(evt);
            }
        });
        pnlRes.add(lblR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 100, 90));

        lblR1.setBackground(new java.awt.Color(204, 204, 204));
        lblR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblR1MouseClicked(evt);
            }
        });
        pnlRes.add(lblR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 90));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("¿Cuál desapareció?");
        pnlRes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel1.add(pnlRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 360, 180));

        btnPlay.setBackground(new java.awt.Color(153, 0, 0));
        btnPlay.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(204, 204, 204));
        btnPlay.setText("Volver a jugar");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 180, 40));

        lblPaciente1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPaciente1.setForeground(new java.awt.Color(102, 102, 102));
        lblPaciente1.setText("Observa las imagenes, cuando acabe el tiempo selecciona la que falta.");
        jPanel1.add(lblPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lblMoney.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(102, 102, 102));
        lblMoney.setText("$$$");
        jPanel1.add(lblMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, 30));

        lblMons.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblMons.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(lblMons, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 50, 50));

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
        llenar();
        tiempo.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){

                if(tim >= 0)
                lblTiempo.setText("00:00:0" + tim);
                if(tim == 0){
                    oEjer.set(pCorrOrden,0);
                    llenar9();
                    pnlRes.setVisible(true);
                }
                    
                tim--;
            }
        });

    }//GEN-LAST:event_btnComenzarActionPerformed

    private void lblR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblR1MouseClicked
        compara(0);
    }//GEN-LAST:event_lblR1MouseClicked

    private void lblR2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblR2MouseClicked
        compara(1);
    }//GEN-LAST:event_lblR2MouseClicked

    private void lblR3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblR3MouseClicked
        compara(2);
    }//GEN-LAST:event_lblR3MouseClicked

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        Ejercicio3 ej = new Ejercicio3();
        this.setVisible(false);
        ej.setVisible(true);
    }//GEN-LAST:event_btnPlayActionPerformed

    private void lblLogradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogradoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogradoMouseClicked
    
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
    
    public void compara(int num){
       if(correcta==rEjer.get(num)){
           registrarMonedas(recompensa);
            JOptionPane.showMessageDialog(null, "Respuesta correcta, ganaste " + recompensa + " monedas","Excelente", JOptionPane.INFORMATION_MESSAGE);
            btnPlay.setVisible(true);
            ImageIcon pantalla = new ImageIcon(getClass().getResource("/Memoria/Feliz.png"));
            ImageIcon ico = new ImageIcon(pantalla.getImage().getScaledInstance(lblLogrado.getWidth(), lblLogrado.getHeight(), Image.SCALE_DEFAULT));
            lblLogrado.setIcon(ico);
            lblLogrado.setVisible(true);
       }
       else{
           JOptionPane.showMessageDialog(null, "Respuesta incorrecta","Pon más atención", JOptionPane.ERROR_MESSAGE);
           recompensa--;
       }
            
    }
    
    
    void llenar(){
        int rand;
        Random r = new Random();
        
        for(int i=0; i<9;i++){
            rand = (int)(r.nextDouble()*11+1);
            if(oEjer.isEmpty()||oEjer.indexOf(rand)==-1)
                oEjer.add(rand);
            else
                i--;
        }
        
        System.out.print("Arreglo de orden : ");
        for(int i=0;i<oEjer.size();i++)
            System.out.print(" "+ oEjer.get(i)+" ");
        llenar9();
        
        pCorrOrden = (int)(r.nextDouble()*oEjer.size());
        correcta = oEjer.get(pCorrOrden);
        pCorrRes = (int)(r.nextDouble()*100)%3;
        
        for(int i=0; i<3;i++){
            rand = (int)(r.nextDouble()*11+1);
            if( ( rEjer.isEmpty() && oEjer.indexOf(rand)==-1 )  ||  (oEjer.indexOf(rand)==-1 && rEjer.indexOf(rand) == -1) )
                if(i==pCorrRes)
                    rEjer.add(correcta);
                else
                    rEjer.add(rand);
            else
                i--;
        }
        
        
        System.out.print("Arreglo de resultados : ");
        for(int i=0;i<rEjer.size();i++)
            System.out.print(" "+ rEjer.get(i)+" ");
        ImageIcon ico;
        ico = new ImageIcon(getClass().getResource("/Memoria/" + rEjer.get(0) + ".png"));
        lblR1.setIcon(ico);
        ico = new ImageIcon(getClass().getResource("/Memoria/" + rEjer.get(1) + ".png"));
        lblR2.setIcon(ico);
        ico = new ImageIcon(getClass().getResource("/Memoria/" + rEjer.get(2) + ".png"));
        lblR3.setIcon(ico);
         
    }
    
    public void llenar9(){
        ImageIcon ico;
        ico = new ImageIcon(getClass().getResource("/Memoria/" + oEjer.get(0) + ".png"));
        lbl1.setIcon(ico);
        ico = new ImageIcon(getClass().getResource("/Memoria/" + oEjer.get(1) + ".png"));
        lbl2.setIcon(ico);
        ico = new ImageIcon(getClass().getResource("/Memoria/" + oEjer.get(2) + ".png"));
        lbl3.setIcon(ico);
        ico = new ImageIcon(getClass().getResource("/Memoria/" + oEjer.get(3) + ".png"));
        lbl4.setIcon(ico); 
        ico = new ImageIcon(getClass().getResource("/Memoria/" + oEjer.get(4) + ".png"));
        lbl5.setIcon(ico); 
        ico = new ImageIcon(getClass().getResource("/Memoria/" + oEjer.get(5) + ".png"));
        lbl6.setIcon(ico); 
        ico = new ImageIcon(getClass().getResource("/Memoria/" + oEjer.get(6) + ".png"));
        lbl7.setIcon(ico); 
        ico = new ImageIcon(getClass().getResource("/Memoria/" + oEjer.get(7) + ".png"));
        lbl8.setIcon(ico); 
        ico = new ImageIcon(getClass().getResource("/Memoria/" + oEjer.get(8) + ".png"));
        lbl9.setIcon(ico);
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
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblLogrado;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblMons;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblPaciente1;
    private javax.swing.JLabel lblR1;
    private javax.swing.JLabel lblR2;
    private javax.swing.JLabel lblR3;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel pnlRes;
    // End of variables declaration//GEN-END:variables
}
