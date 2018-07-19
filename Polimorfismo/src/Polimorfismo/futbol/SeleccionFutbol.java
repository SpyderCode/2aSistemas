package Polimorfismo.futbol;

public abstract class SeleccionFutbol {
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	public SeleccionFutbol(int id,String nombre,String apellido,int edad) {
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
	public SeleccionFutbol() {
		
	}
    
    /*
     * Gets
     * */
	
    
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    
    /*
     * SETS
     */
    
    public void setId(int id) {
        this.id=id;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setApellido(String apellido) {
        this.apellido=apellido;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    
    public String toString() {
        return this.id+"\t"+
                this.nombre+"\t"+this.apellido+"\t"+
                this.edad+"\t";
    }
    
    /*Metodos de la clase*/
    public String viajar() {
    	return "El jugador viaja";
    }
    public String concentrarse() {
    	return "El jugador se concentra para el partido";
    }
    public String entrenamiento() {
    	return "El jugador entrena";
    }
    public String partidoFutbol() {
    	return "El jugador juega el partido";
    }
}
