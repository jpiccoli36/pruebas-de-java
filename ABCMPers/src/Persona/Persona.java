package Persona;

public class Persona {
String nombre;
String apellido;
String DNI;
boolean Habilitado;
public Persona(String nombre, String apellido, String dni, boolean b) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.DNI=dni;
	this.Habilitado=b;
}
public  Persona(){
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getDNI() {
	return DNI;
}
public void setDNI(String dNI) {
	DNI = dNI;
}
public boolean isHabilitado() {
	return Habilitado;
}
public void setHabilitado(boolean habilitado) {
	Habilitado = habilitado;
}


}
