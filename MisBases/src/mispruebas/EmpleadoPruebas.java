package mispruebas;
import java.io.IOException;
import java.util.Scanner;
import mipoo.Empleado;

public class EmpleadoPruebas {
	
final static int MAX_EMPLEADOS=20;
static Empleado[] empleados = new Empleado [MAX_EMPLEADOS];

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int indice = 0;
		String dni, nombre;
        double sueldoBase;
        int horasExtras;
        double tipoIRPF;
        char casado;  // S ó N
        int numeroHijos;
		int i;
		int N;

        do {
            System.out.print("Número de empleados? ");
            N = sc.nextInt();
        } while (N < 0 || N > MAX_EMPLEADOS);
       
        for (i = 1; i <= N; i++) {
            sc.nextLine(); //limpiar el intro
            System.out.println("Empleado " + i);
            System.out.print("Nif: ");
            dni = sc.nextLine();
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            System.out.print("Sueldo Base: ");
            sueldoBase = sc.nextDouble();
            System.out.print("Horas extra: ");
            horasExtras = sc.nextInt();
            System.out.print("Tipo de IRPF: ");
            tipoIRPF = sc.nextDouble();
            System.out.print("Casado (S/N): ");
            casado = (char) System.in.read();
            System.out.print("Número de hijos: ");
            numeroHijos = sc.nextInt();

//            e = new Empleado(); //crear una nueva instancia de empleado

//            e.setNombre(nombre);
//            e.setSueldoBase(sueldoBase);
//            e.setHorasExtras(horasExtras);
//            e.setTipoIRPF(tipoIRPF);
//            e.setCasado(Character.toUpperCase(casado));
//            e.setNumeroHijos(numeroHijos);
//
//            empleados[indice] = e; //se añade el empleado al array
//            indice++;
//		
	}

}
}
