
import java.util.ArrayList;

/*
- String nombre: Almacena el nombre del Padre.
- int id: Almacena el identificador del padre en la base de datos.
- ArrayList <Paciente> pacientes: Almacena los pacientes asociados a ese padre.
*/
public class Padre {
    protected int id;
    protected String nombre;
    public ArrayList <Paciente> pacientes; 
    /*
    Función: Padre()
    Entradas:
        - int id: Identificador del padre en base de datos.
        - String nombre: Nombre del padre.
    Salidas:
    Funcionamiento: Método constructor de la clase Padre.
    */
    public Padre(int id, String nombre){
        pacientes = new ArrayList();
        this.id=id;
        this.nombre=nombre;
    }
    /*
    Función: agregarPaciente(Paciente p)
    Entradas:
        - Paciente p: Paciente a agregar.
    Salidas:
    Funcionamiento: Agrega un paciente al Arraylist del padre.
    */
    public void agregarPaciente(Paciente p){
        this.pacientes.add(p);
    }
    /*
    Función: getId()
    Entradas:
    Salidas: Retorna el identificador del padre en base de datos.
    */
    public int getID(){
        return this.id;
    }
    /*
    Función: getNombre()
    Entradas:
    Salidas: Retorna el Nombre del padre.
    */
    public String getNombre(){
        return this.nombre;
    }
    /*
    Función: getNpac()
    Entradas:
    Salidas: Retorna el Número de pacientes asociados al padre.
    */
    public int getNpac(){
        return this.pacientes.size();
    }
    /*
    Función: getPaciente(int a)
    Entradas:
        - int a: Indice del paciente dentro del arraylist.
    Salidas: Retorna el paciente alojado en dicho indice.
    */
    public Paciente getPaciente(int a){
        return this.pacientes.get(a);
    }
    /*
    Función: getPaci(int ide)
    Entradas:
        - int ide: Indice del paciente dentro de la base de datos.
    Salidas: Retorna el paciente con dicho identificador.
    Funcionamiento: Busca el identificador del paciente en cada uno de los elementos del arraylist.
    */
    public Paciente getPaci(int ide){
        for(Paciente p: pacientes){
            if(p.getId()==ide)
                return p;
        }
        return this.pacientes.get(0);
    }
    /*
    Función: existePaciente(Comportamiento comp)
    Entradas:
        - Paciente pac: Paciente a corroborar.
    Salidas: La función devuelve un -1 si el Paciente no existe para ese padre, y un 1 de caso contrario.
    */
    public int existePaciente(Paciente pac){
        for(Paciente p: pacientes){
            if(p.getId()==pac.getId())
                return 1;
        }
        return -1;
    }
}
