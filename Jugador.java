public class Jugador extends Persona{
	
	String equipo;
	String posicion;
	int numero;
	int amonestaciones;
	int expulsiones;
	int goles;
	long sueldo;
	boolean seleccionnacional; 
	
	public Jugador(String equipo, String posicion, int numero, int amonestaciones, int expulsiones, int goles, long sueldo,boolean seleccionnacional,String nombre, String apellidopaterno, String apellidomaterno, int edad, float peso, float estatura, String nacionalidad, String RFC){
		super(nombre, apellidopaterno,apellidomaterno,edad,peso,estatura,nacionalidad,RFC);
		setEquipo(equipo);
		setPosicion(posicion);
		setNumero(numero);
		setAmonestaciones(amonestaciones);
		setExpulsiones(expulsiones);
		setGoles(goles);
		setSueldo(sueldo);
		setSeleccionNacional(seleccionnacional);
		
	}		
	
	public void setEquipo(String equipo){
		this.equipo = equipo;
	}
	
	public void setPosicion(String posicion){
		this.posicion = posicion;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public void setAmonestaciones(int amonestaciones){
		this.amonestaciones = amonestaciones;
	}
	
	public void setExpulsiones(int expulsiones){
		this.expulsiones = expulsiones;
	}
	
	public void setGoles(int goles){
		this.goles = goles;
	}
	
	public void setSueldo(long sueldo){
		this.sueldo = sueldo;
	}
	
	public void setSeleccionNacional(boolean seleccionnacional){
		this.seleccionnacional = seleccionnacional;
	}


	public String getEquipo(){
		return this.equipo;
	}
	
	public String getPosicion(){
		return this.posicion;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public int getAmonestaciones(){
		return this.amonestaciones;
	}
	
	public int getExpulsiones(){
		return this.expulsiones;
	}
	
	public int getGoles(){
		return this.goles;
	}
	
	public long getSueldo(){
		return this.sueldo;
	}
	
	public boolean getSeleccionNacional(){
		return this.seleccionnacional;
	}
		
}