package Mipoo;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha() {

	}

	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	private boolean esBsiesto() {
		return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
	}

	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, añoCorrecto;
		añoCorrecto = año > 0;
		mesCorrecto = 1 < mes && mes < 12;
		switch (mes) {
		case 2:
			if (esBsiesto()) {
				diaCorrecto = 1 < dia && dia <= 28;
			} else {
				diaCorrecto = 1 < dia && dia <= 29;
			}

			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = 1 < dia && dia <= 30;
			break;
		default:
			diaCorrecto = 1 < dia && dia <= 31;
		}
	
		return añoCorrecto && mesCorrecto && diaCorrecto;
	}

	public void diaSiguiente() {
		dia++;
		if(!fechaCorrecta()) {
			dia=1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				año++;
			}
		}
	}



		
	

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}

}
