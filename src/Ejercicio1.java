
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


public class Ejercicio1 extends javax.swing.JFrame {
    
    public MenuPrincipal men = new MenuPrincipal();
    public Ejercicios paci = new Ejercicios();
    public int idPaci = paci.idPaciente;
    public ArrayList <String> oficios = new ArrayList();
    public ArrayList <Integer> oEjer = new ArrayList();
    public ArrayList <Integer> checked = new ArrayList();
    public int tim = 5;
    public int tim2 = 2;
    public int correcto;
    public int correctos =0;
    public int[] mostrado = {1,1,1,1};
    Timer tiempo2 = new Timer(1000,null);
    public int monedas;
    public int recompensa = 10;
    
    public Ejercicio1() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/Logo.png")).getImage());
        btnPlay.setVisible(false);
        lblPalabra.setVisible(false);
        lblPalabra1.setVisible(false);
        
        generarOficios();
        
        obtenerMonedas();
        ImageIcon pantalla = new ImageIcon(getClass().getResource("/Img/moneditas.png"));
        ImageIcon ico = new ImageIcon(pantalla.getImage().getScaledInstance(lblMons.getWidth(), lblMons.getHeight(), Image.SCALE_DEFAULT));
        lblMons.setIcon(ico);
        
        this.setLocationRelativeTo(null);
        System.out.println("\n el id del paciente en ejercicio 1 es ::::: " + idPaci);
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
    
    
    void llenar(){
        int rand;
        Random r = new Random();
        
        for(int i=0; i<4;i++){
            rand = (int)(r.nextDouble()*8);
            if(oEjer.isEmpty()||oEjer.indexOf(rand)==-1)
                oEjer.add(rand);
            else
                i--;
        }
        for(int i=0;i<oEjer.size();i++)
            mostrar(i);
    }
    
    public void mostrar(int n){
        ImageIcon ico;
        ico = new ImageIcon(getClass().getResource("/Memorama/" + oficios.get(oEjer.get(n)) + ".png"));
        if(n==0)
            lblImg1.setIcon(ico);
        else if(n==1)
            lblImg2.setIcon(ico);
        else if(n==2)
            lblImg3.setIcon(ico);
        else if(n==3)
            lblImg4.setIcon(ico); 
        
    }
    
    public void mostrar1seg(int n){
        ImageIcon ico;
        ico = new ImageIcon(getClass().getResource("/Memorama/" + oficios.get(oEjer.get(n)) + ".png"));
        if(n==0)
            lblImg1.setIcon(ico);
        else if(n==1)
            lblImg2.setIcon(ico);
        else if(n==2)
            lblImg3.setIcon(ico);
        else if(n==3)
            lblImg4.setIcon(ico); 
    }
    
    
    void revisar(int res){
        tim2=1;
        ImageIcon pantalla= new ImageIcon(getClass().getResource("/Memoria/Feliz.png"));
        ImageIcon ico = new ImageIcon(pantalla.getImage().getScaledInstance(lblLogrado.getWidth(), lblLogrado.getHeight(), Image.SCALE_DEFAULT));
        if(res==correcto){correctos++;
            mostrar(correcto);
            JOptionPane.showMessageDialog(null, "Respuesta correcta, continúa","Excelente", JOptionPane.INFORMATION_MESSAGE);
        if(correctos<4){
                siguiente();
            }else{
                lblLogrado.setIcon(ico);
                lblLogrado.setVisible(true);
                btnPlay.setVisible(true);
                registrarMonedas(recompensa);
                JOptionPane.showMessageDialog(null, "Has ganado, ahora tienes " + monedas + " monedas","Excelente", JOptionPane.INFORMATION_MESSAGE);
            }
                
        }else{
            //JOptionPane.showMessageDialog(null, "Respuesta incorrecta","Pon más atención", JOptionPane.ERROR_MESSAGE);
            recompensa--;
            mostrar(res);
            mostrado[res]=1;
            tiempo2.restart();
            tiempo2.addActionListener(new java.awt.event.ActionListener(){
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    System.out.println(mostrado[res]);
                    if(mostrado[res] == 1){
                        mostrar(res);
                    }
                    if(mostrado[res] == 0){
                        ocultar(res);
                        tiempo2.stop();
                        
                    }
                    mostrado[res]--;
                }
            });
            
            System.out.println("Continua");
            //ocultar(res);
        }
            
        
    }
    
    public void ocultar(int n){
        ImageIcon pantalla = new ImageIcon(getClass().getResource("/Memorama/fuera.png"));
        ImageIcon ico = new ImageIcon(pantalla.getImage().getScaledInstance(lblImg1.getWidth(), lblImg1.getHeight(), Image.SCALE_DEFAULT));
        
        if(n==0)
            lblImg1.setIcon(ico);
        else if(n==1)
            lblImg2.setIcon(ico);
        else if(n==2)
            lblImg3.setIcon(ico);
        else if(n==3)
            lblImg4.setIcon(ico); 
    }
    
    public void ocultar(String todos){
        ImageIcon pantalla = new ImageIcon(getClass().getResource("/Memorama/fuera.png"));
        ImageIcon ico = new ImageIcon(pantalla.getImage().getScaledInstance(lblImg1.getWidth(), lblImg1.getHeight(), Image.SCALE_DEFAULT));
        lblImg1.setIcon(ico);
        lblImg2.setIcon(ico);
        lblImg3.setIcon(ico);
        lblImg4.setIcon(ico);
    }
    
    void vaciar(){
        ocultar("todos");
        siguiente();
    }
    
    void siguiente(){
        int aux=0;
        Random r = new Random();
        while(aux!=-1){
            correcto = (int)(r.nextDouble()*4);
            aux=checked.indexOf(correcto);
        }
        checked.add(correcto);
        lblPalabra.setText(oficios.get(oEjer.get(correcto)));
        lblPalabra.setVisible(true);
        lblPalabra1.setVisible(true);
    }
    
    void generarOficios(){
        oficios.add("Abogado");
        oficios.add("Bombero");
        oficios.add("Cartero");
        oficios.add("Chef");
        oficios.add("Maestra");
        oficios.add("Plomero");
        oficios.add("Policia");
        oficios.add("Veterinaria");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnComenzar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblImg4 = new javax.swing.JLabel();
        lblImg3 = new javax.swing.JLabel();
        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        lblPalabra = new javax.swing.JLabel();
        lblPalabra1 = new javax.swing.JLabel();
        lblPaciente1 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        lblLogrado = new javax.swing.JLabel();
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

        btnComenzar.setBackground(new java.awt.Color(153, 0, 0));
        btnComenzar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnComenzar.setForeground(new java.awt.Color(204, 204, 204));
        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 130, 40));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        lblTiempo.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(102, 102, 102));
        lblTiempo.setText("00:00:05");
        jPanel1.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoNPequeño.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Memorama");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lblImg4.setBackground(new java.awt.Color(204, 204, 204));
        lblImg4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImg4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg4MouseClicked(evt);
            }
        });
        jPanel1.add(lblImg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 190, 170));

        lblImg3.setBackground(new java.awt.Color(204, 204, 204));
        lblImg3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg3MouseClicked(evt);
            }
        });
        jPanel1.add(lblImg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 190, 170));

        lblImg1.setBackground(new java.awt.Color(204, 204, 204));
        lblImg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg1MouseClicked(evt);
            }
        });
        jPanel1.add(lblImg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 190, 170));

        lblImg2.setBackground(new java.awt.Color(204, 204, 204));
        lblImg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg2MouseClicked(evt);
            }
        });
        jPanel1.add(lblImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 190, 170));

        lblPaciente.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPaciente.setForeground(new java.awt.Color(102, 102, 102));
        lblPaciente.setText("Paciente");
        jPanel1.add(lblPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        lblPalabra.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPalabra.setForeground(new java.awt.Color(102, 102, 102));
        lblPalabra.setText("00:00:05");
        jPanel1.add(lblPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        lblPalabra1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPalabra1.setForeground(new java.awt.Color(102, 102, 102));
        lblPalabra1.setText("Selecciona la imagen de:");
        jPanel1.add(lblPalabra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        lblPaciente1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPaciente1.setForeground(new java.awt.Color(102, 102, 102));
        lblPaciente1.setText("Observa las imagenes y selecciona la opción correspondiente a la palabra.");
        jPanel1.add(lblPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        btnPlay.setBackground(new java.awt.Color(153, 0, 0));
        btnPlay.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(204, 204, 204));
        btnPlay.setText("Volver a jugar");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 180, 40));

        lblLogrado.setBackground(new java.awt.Color(204, 204, 204));
        lblLogrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogradoMouseClicked(evt);
            }
        });
        jPanel1.add(lblLogrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 120, 110));

        lblMons.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblMons.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(lblMons, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 50, 50));

        lblMoney.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(102, 102, 102));
        lblMoney.setText("$$$");
        jPanel1.add(lblMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 780, 470));

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
        System.exit(0);
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
                if(tim == 0)
                    vaciar();
                tim--;
            }
        });
        
    }//GEN-LAST:event_btnComenzarActionPerformed

    private void lblImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg1MouseClicked
        revisar(0);
    }//GEN-LAST:event_lblImg1MouseClicked

    private void lblImg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg2MouseClicked
        revisar(1);
    }//GEN-LAST:event_lblImg2MouseClicked

    private void lblImg3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg3MouseClicked
        revisar(2);
    }//GEN-LAST:event_lblImg3MouseClicked

    private void lblImg4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg4MouseClicked
        revisar(3);
    }//GEN-LAST:event_lblImg4MouseClicked

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        Ejercicio1 ej = new Ejercicio1();
        this.setVisible(false);
        ej.setVisible(true);
    }//GEN-LAST:event_btnPlayActionPerformed

    private void lblLogradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogradoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogradoMouseClicked

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JLabel lblImg3;
    private javax.swing.JLabel lblImg4;
    private javax.swing.JLabel lblLogrado;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblMons;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblPaciente1;
    private javax.swing.JLabel lblPalabra;
    private javax.swing.JLabel lblPalabra1;
    private javax.swing.JLabel lblTiempo;
    // End of variables declaration//GEN-END:variables
}
