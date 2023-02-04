package Mipoo;

public class Person {
private String nombre;
private String direccion;
private String codPostal;
private String ciudad;
private Fecha fechaNacimiento;

public Person() {
    fechaNacimiento = new Fecha();
}

public Person(String nombre, String direccion, String codPostal, String ciudad, Fecha fechaNacimiento) {
	
	this.nombre = nombre;
	this.direccion = direccion;
	this.codPostal = codPostal;
	this.ciudad = ciudad;
	this.fechaNacimiento = fechaNacimiento;
}

public Person(String nombre, String direccion, String codPostal, String ciudad) {
this (nombre,direccion,codPostal,ciudad,null);

	
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getCodPostal() {
	return codPostal;
}

public void setCodPostal(String codPostal) {
	this.codPostal = codPostal;
}

public String getCiudad() {
	return ciudad;
}

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}

public Fecha getFechaNacimiento() {
	return fechaNacimiento;
}

public void setFechaNacimiento(Fecha fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}

@Override
public String toString() {
	StringBuilder sb=new StringBuilder();
	sb.append("Nombre: ").append(nombre);
	sb.append("\nFecha nacimiento: ").append(fechaNacimiento);
	sb.append("\nDireccion: ").append(direccion).append("\n");
	sb.append(codPostal).append(" ").append(ciudad);
	return sb.toString();
	
}



}
