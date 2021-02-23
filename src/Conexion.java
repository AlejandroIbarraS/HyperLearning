
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    
    public static Connection conectar = null;
    String host = "bevjxefat81yejkz1xcb-mysql.services.clever-cloud.com";
    String user = "urlhj4h0hxgayxdw"; 
    String pass = "pRGEEFIloHjdcv0teLSD";
    String name = "bevjxefat81yejkz1xcb";
    public static boolean iniciada = false;
    
    
    public Connection connection(){
        int exito =0;
        while(exito == 0){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url= "jdbc:mysql://" + host +"/" + name +"?useSSL=false";
                conectar=(Connection)DriverManager.getConnection(url,user,pass);
                exito ++;
                iniciada = true;
            }catch(Exception e){
                //JOptionPane.showMessageDialog(null,"Error de conexión, revise su conexión a internet","Error",JOptionPane.ERROR_MESSAGE);
                System.out.println("Conexión fallida");
                e.printStackTrace();
            }
        }
        return conectar;
    }
    
    public Connection getConnection(){
        return this.conectar;
    }
    
    public Boolean getIniciada(){
        return this.iniciada;
    }
}
