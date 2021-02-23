
/*
- int id: Almacena el identificador del padre en la base de datos.
- String descripcion: Almacena la descripción del comportamiento.
- String comentario: Almacena el comentario del padre referente a ese comportamiento.
- String tipo: Almacena si el comportamiento es positivo o negativo.
- String fecha: Almacena l fecha en l que el paciente tuvo dicho comportamiento.
*/
public class Comportamiento {
    private int id;
    private String descripcion;
    private String comentario;
    private String tipo;
    private String fecha;
    /*
    Función: Comportamiento()
    Entradas:
        - int ide: Almacena el identificador del padre en la base de datos.
        - String desc: Almacena la descripción del comportamiento.
        - String com: Almacena el comentario del padre referente a ese comportamiento.
        - String tip: Almacena si el comportamiento es positivo o negativo.
        - String fech: Almacena la fecha en l que el paciente tuvo dicho comportamiento.
    Salidas:
    Funcionamiento: Método constructor de la clase Comportamiento.
    */
    public Comportamiento(int ide, String desc, String com, String tip, String fech){
        this.id = ide;
        this.descripcion=desc;
        this.comentario=com;
        this.tipo=tip;
        this.fecha=fech;
    }
    /*
    Función: getId()
    Entradas:
    Salidas: Retorna el identificador del comportamiento en base de datos.
    */
    public int getId(){
        return this.id;
    }
    /*
    Función: getDesc()
    Entradas:
    Salidas: Retorna la descripción del comportamiento.
    */
    public String getDesc(){
        return this.descripcion;
    }
    /*
    Función: getComm()
    Entradas:
    Salidas: Retorna el comentario del padre referente a dicho comportamiento.
    */
    public String getComm(){
        return this.comentario;
    }
    /*
    Función: getAct()
    Entradas:
    Salidas: Retorna la actitud positiva o negativa referente al comportamiento.
    */
    public String getAct(){
        return this.tipo;
    }
    /*
    Función: getFecha()
    Entradas:
    Salidas: Retorna la fecha en la que el paciente experimento dicho comportamiento.
    */
    public String getFecha(){
        return this.fecha;
    }
    /*
    Función: toString()
    Entradas:
    Salidas: Cadena referente al método toString de la clase.
    */
    public String toString(){
        return this.fecha + "\t" + this.tipo + "\t" + this.descripcion;
    }
}
