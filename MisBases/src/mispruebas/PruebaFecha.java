package mispruebas;

import mipoo.Fecha;

public class PruebaFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fecha f1 = new Fecha(10,10,2005);
Fecha f2= new Fecha(10,20,2000);


if (f1.fechaCorrecta()) {
	System.out.println(f1);
}
else 
System.out.println("la fecha introducida no es correcta");

StringBuffer sb=new StringBuffer("mi fecha: ");
sb.append(f1.getMes()).append("/").append(f1.getAño());

System.out.println(sb);

for (int i=1; i<=10; i++) {
	f1.diaSiguiente();
System.out.println(f1);
}


	
	}
}
