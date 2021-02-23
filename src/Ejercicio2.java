
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


public class Ejercicio2 extends javax.swing.JFrame {
    
    public MenuPrincipal men = new MenuPrincipal();
    public Ejercicios paci = new Ejercicios();
    public int idPaci = paci.idPaciente;
    public int tim = 5;
    public int nErrores = 0;
    public ArrayList <String> opciones = new ArrayList();
    
    public String escondida;
    public String correcta;
    public String reveladas="";
    public String auxCorrecta;
    
    public int monedas;
    public int recompensa = 7;
    
    
    public Ejercicio2() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/Logo.png")).getImage());
        lblLogrado.setVisible(false);
        lblAhorcado.setVisible(false);
        btnPlay.setVisible(false);
        pnlResp.setVisible(false);
        
        obtenerMonedas();
        ImageIcon pantalla = new ImageIcon(getClass().getResource("/Img/moneditas.png"));
        ImageIcon ico = new ImageIcon(pantalla.getImage().getScaledInstance(lblMons.getWidth(), lblMons.getHeight(), Image.SCALE_DEFAULT));
        lblMons.setIcon(ico);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/Ahorcado/" + nErrores + ".png"));
        lblAhorcado.setIcon(icon);
        
        this.setLocationRelativeTo(null);
        System.out.println("\n el id del paciente en Ejercicio 2 es ::::: " + idPaci);
        lblPaciente.setText("Paciente " + men.User.getPaci(idPaci).getNombre());
        generar();
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
    
    void generar(){
        opciones.add("M\tU\tS\tI\tC\tA");
        opciones.add("P\tE\tL\tI\tC\tU\tL\tA");
        opciones.add("V\tI\tD\tE\tO\tJ\tU\tE\tG\tO\tS");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        lblAhorcado = new javax.swing.JLabel();
        txtJuego = new javax.swing.JTextField();
        btnComenzar = new javax.swing.JButton();
        lblTiempo = new javax.swing.JLabel();
        pnlResp = new javax.swing.JPanel();
        txtLetra = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnProbar = new javax.swing.JButton();
        lblPaciente1 = new javax.swing.JLabel();
        lblPaciente2 = new javax.swing.JLabel();
        lblLogrado = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
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
        jPanel1.add(lblPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoNPequeño.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Ahorcado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lblImg.setBackground(new java.awt.Color(204, 204, 204));
        lblImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 400, 230));

        lblAhorcado.setBackground(new java.awt.Color(204, 204, 204));
        lblAhorcado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblAhorcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 260));

        txtJuego.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtJuego.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJuego.setBorder(null);
        jPanel1.add(txtJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 330, 40));

        btnComenzar.setBackground(new java.awt.Color(153, 0, 0));
        btnComenzar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnComenzar.setForeground(new java.awt.Color(204, 204, 204));
        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 130, 40));

        lblTiempo.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(102, 102, 102));
        lblTiempo.setText("00:00:05");
        jPanel1.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        pnlResp.setBackground(new java.awt.Color(255, 255, 255));
        pnlResp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLetra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLetra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLetra.setBorder(null);
        pnlResp.add(txtLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 50, 40));

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

        pnlResp.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        btnProbar.setBackground(new java.awt.Color(153, 0, 0));
        btnProbar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnProbar.setForeground(new java.awt.Color(204, 204, 204));
        btnProbar.setText("Probar");
        btnProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbarActionPerformed(evt);
            }
        });
        pnlResp.add(btnProbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, 70));

        lblPaciente1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        lblPaciente1.setForeground(new java.awt.Color(102, 102, 102));
        lblPaciente1.setText("Recuerda usar solo mayúsculas");
        pnlResp.add(lblPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        lblPaciente2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblPaciente2.setForeground(new java.awt.Color(102, 102, 102));
        lblPaciente2.setText("Adivina la palabra");
        pnlResp.add(lblPaciente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(pnlResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 260, 230));

        lblLogrado.setBackground(new java.awt.Color(204, 204, 204));
        lblLogrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogradoMouseClicked(evt);
            }
        });
        jPanel1.add(lblLogrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 120, 120));

        btnPlay.setBackground(new java.awt.Color(153, 0, 0));
        btnPlay.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(204, 204, 204));
        btnPlay.setText("Volver a jugar");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 180, 40));

        lblMons.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblMons.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(lblMons, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 50, 50));

        lblMoney.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(102, 102, 102));
        lblMoney.setText("$$$");
        jPanel1.add(lblMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, 30));

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

    void llenar(){
        int rand;
        Random r = new Random();
        rand = (int)(r.nextDouble()*3);
        correcta=opciones.get(rand).replace("\t","");
        auxCorrecta=correcta;
        escondida = generarEscondida(correcta);
        System.out.println(correcta);
        ImageIcon ico = new ImageIcon(getClass().getResource("/Ahorcado/" + correcta + ".png"));
        lblImg.setIcon(ico);
    }
    
    public String generarEscondida(String palabra){
        String cad="";
        for(int i=0; i<palabra.length();i++)
            cad=cad + "_";
        return cad;
    }
    
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
                    lblImg.setVisible(false);
                    lblAhorcado.setVisible(true);
                    imprimirEsc();
                    pnlResp.setVisible(true);
                } 
                tim--;
            }
        });
    }//GEN-LAST:event_btnComenzarActionPerformed
    
    public void imprimirEsc(){
        String cadAux="";
        for(int i=0;i<escondida.length();i++)
            cadAux=cadAux+" "+escondida.charAt(i);
        txtJuego.setText(cadAux);
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
    
    private void btnProbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbarActionPerformed
        char letra = txtLetra.getText().charAt(0);
        txtLetra.setText("");
        ganaste();
        if(letraIsIn(letra,reveladas))
            JOptionPane.showMessageDialog(null, "Ya intentaste con la " + letra,"Atento", JOptionPane.INFORMATION_MESSAGE);
        else{
            if(letraIsIn(letra,correcta)){
                //JOptionPane.showMessageDialog(null, "Vas bien","Excelente", JOptionPane.INFORMATION_MESSAGE);
                reveladas = reveladas + letra;
                auxCorrecta=auxCorrecta.replace(String.valueOf(letra),"");
                actualizarEstado(letra);
                imprimirEsc();
                ganaste();
            }else{
                nErrores ++;
                recompensa --;
                if(nErrores>5){
                    ImageIcon ic = new ImageIcon(getClass().getResource("/Ahorcado/" + nErrores + ".png"));
                    lblAhorcado.setIcon(ic);
                    ImageIcon pantalla = new ImageIcon(getClass().getResource("/Memorama/Triste.png"));
                    ImageIcon ico = new ImageIcon(pantalla.getImage().getScaledInstance(lblLogrado.getWidth(), lblLogrado.getHeight(), Image.SCALE_DEFAULT));
                    lblLogrado.setIcon(ico);
                    lblLogrado.setVisible(true);
                    btnPlay.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Perdiste :C","Disculpa", JOptionPane.ERROR_MESSAGE);
                }else{
                    reveladas = reveladas + letra;
                    ImageIcon ico = new ImageIcon(getClass().getResource("/Ahorcado/" + nErrores + ".png"));
                    lblAhorcado.setIcon(ico);
                    //JOptionPane.showMessageDialog(null, "Intenta con otra","Lo siento", JOptionPane.ERROR_MESSAGE);
                }
                
            }

        }
        
    }//GEN-LAST:event_btnProbarActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        Ejercicio2 ej = new Ejercicio2();
        this.setVisible(false);
        ej.setVisible(true);
    }//GEN-LAST:event_btnPlayActionPerformed

    private void lblLogradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogradoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogradoMouseClicked
    public void actualizarEstado(char let){
        char[] array = escondida.toCharArray();
        for(int i=0;i<correcta.length();i++){
            if(let == correcta.charAt(i))
                array[i]=let;
        }
        escondida=String.valueOf(array);
    }
    public boolean letraIsIn(char let, String pal){
        boolean res = false;
        for(int i=0;i<pal.length();i++){
            if(let == pal.charAt(i))
                return true;
        }
        return res;
    }
    
    public void ganaste(){
        if(auxCorrecta.equals("")){
            registrarMonedas(recompensa);
            JOptionPane.showMessageDialog(null, "Ganaste " + recompensa + " monedas !!!","Excelente", JOptionPane.INFORMATION_MESSAGE);
            ImageIcon pantalla = new ImageIcon(getClass().getResource("/Memoria/Feliz.png"));
            ImageIcon ico = new ImageIcon(pantalla.getImage().getScaledInstance(lblLogrado.getWidth(), lblLogrado.getHeight(), Image.SCALE_DEFAULT));
            lblLogrado.setIcon(ico);
            lblLogrado.setVisible(true);
            btnPlay.setVisible(true);
        }
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
    private javax.swing.JButton btnProbar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAhorcado;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblLogrado;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblMons;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblPaciente1;
    private javax.swing.JLabel lblPaciente2;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel pnlResp;
    private javax.swing.JTextField txtJuego;
    private javax.swing.JTextField txtLetra;
    // End of variables declaration//GEN-END:variables
}
