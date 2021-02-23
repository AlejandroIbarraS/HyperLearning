
import java.util.ArrayList;

/*
- String nombre: Almacena el nombre del Paciente.
- int edad: Almacena la edad del paciente.
- int id: Almacena el identificador del paciente en la base de datos.
- ArrayList <Comportamiento> comportamientos: Almacena los comportamientos referentes a ese paciente.
*/
public class Paciente {
    private String nombre;
    private int edad;
    private int id;
    private int monedas;
    protected ArrayList <Comportamiento> comportamientos; 
    /*
    Función: Paciente()
    Entradas:
        - String nom: Nombre del paciente.
        - int ed: Edad del paciente.
        - int id: Identificador del paciente en base de datos.
    Salidas:
    Funcionamiento: Método constructor de la clase Paciente.
    */
    public Paciente (String nom, int ed, int id,int mon){
        comportamientos = new ArrayList();
        this.nombre=nom;
        this.edad=ed;
        this.id=id;
        this.monedas=mon;
    }
    /*
    Función: getEdad()
    Entradas:
    Salidas: Retorna la variable edad del paciente.
    */
    public int getEdad(){
        return this.edad;
    }
    /*
    Función: getId()
    Entradas:
    Salidas: Retorna el identificador del paciente en base de datos.
    */
    public int getId(){
        return this.id;
    }
    /*
    Función: getMonedas()
    Entradas:
    Salidas: Retorna la cantidad de monedas que tiene actualmente el paciente;
    */
    public int getMonedas(){
        return this.monedas;
    }
    
    /*
    Función: actMonedas()
    Entradas:
        - mon : cantidad de monedas a actualizar
    Salidas: Actualiza la cantidad de monedas que tiene el paciente.
    */
    public void actMonedas(int mon){
        this.monedas=mon;
    }
    
    /*
    Función: getNombre()
    Entradas:
    Salidas: Retorna el nombre del Paciente.
    */
    public String getNombre(){
        return this.nombre;
    }
    /*
    Función: agregarComp()
    Entradas:
        - Comportamiento C: Comportamiento que se va a agregar al paciente.
    Salidas:
    */
    public void agregarComp(Comportamiento c){
        this.comportamientos.add(c);
    }
    /*
    Función: getComportamiento(int a)
    Entradas:
        - int a: Indice de un comportamiento dentro del arraylist.
    Salidas: Retorna el comportamiento en dicho indice.
    */
    public Comportamiento getComportamiento(int a){
        return this.comportamientos.get(a);
    }
    /*
    Función: getNcomps()
    Entradas:
    Salidas: Retorna el numero de comportamientos registrados en un paciente.
    */
    public int getNcomps(){
        return this.comportamientos.size();
    }
    /*
    Función: existeComp(Comportamiento comp)
    Entradas:
        - Comportamiento comp: Comportamiento a corroborar.
    Salidas: La función devuelve un -1 si el comportamiento no existe para ese paciente, y un 1 de caso contrario.
    */
    public int existeComp(Comportamiento comp){
        for(Comportamiento c: comportamientos){
            if(c.getId()==comp.getId())
                return 1;
        }
        return -1;
    }
    /*
    Función: toString()
    Entradas:
    Salidas: Cadena referente al método toString de la clase.
    */
    public String toString(){
        return "\nid: "+ this.id + "\t" + this.nombre + "    de    " + this.edad + " años, monedas actuales:  " + this.monedas;
    }
}
