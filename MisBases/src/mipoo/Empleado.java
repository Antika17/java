package mipoo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Empleado {
	private static BigDecimal importeHoraExt;
	private String nif;
	private String nombres;
	private BigDecimal sueldoBase;
	private  Integer horasExtras;
	private double tipoIrpf;
	private boolean casado;
	private int numHijos;
	

	
	public Empleado(String nif, String nombres, BigDecimal sueldoBase, Integer horasExtras, double tipoIrpf,
			boolean casado, int numHijos) {
		super();
		this.nif = nif;
		this.nombres = nombres;
		this.sueldoBase = sueldoBase;
		this.horasExtras = horasExtras;
		this.tipoIrpf = tipoIrpf;
		this.casado = casado;
		this.numHijos = numHijos;
	}
	public Empleado(String dni) {
		// TODO Auto-generated constructor stub
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public BigDecimal getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(BigDecimal sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public Integer getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(Integer horasExtras) {
		this.horasExtras = horasExtras;
	}
	public double getTipIrpf() {
		return tipoIrpf;
	}
	public void setTipIrpf(double tipIrpf) {
		this.tipoIrpf = tipIrpf;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public int getNumHijos() {
		return numHijos;
	}
	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}
	public static BigDecimal getImporteHoraExt() {
		return importeHoraExt;
	}
	public static void setImporteHoraExt(BigDecimal importeHoraExt) {
		Empleado.importeHoraExt = importeHoraExt;
	}
	
	
	
	public  BigDecimal complemento() {
		
		return importeHoraExt.multiply(new BigDecimal(horasExtras));
		
	}
	
	public BigDecimal sueldoBruto() {
		return sueldoBase.add(complemento());
		
	}
	
	public BigDecimal calcularRetencion() {
		if (casado) {
			tipoIrpf=tipoIrpf-2;
		}
		
		tipoIrpf=tipoIrpf-numHijos;
		
		if(tipoIrpf<0) {
			tipoIrpf=0;
		}
				
		return sueldoBruto().multiply(new BigDecimal(tipoIrpf)).divide(new BigDecimal(100));
		}
	public BigDecimal sueldoACobrar() {
		return sueldoBruto().subtract(calcularRetencion());
	}
	@Override
	public String toString() {
		StringBuilder sb=  new StringBuilder();
		sb.append(nif).append(nombres);
		sb.append("\nsueldo base: " ).append(sueldoBase);
		sb.append("\nHoras extras: ").append(horasExtras);
		sb.append("\nTipo Irpf: ").append(tipoIrpf);
		sb.append("\nCasao: ").append(casado);
		sb.append("\nNumero de hijos: ").append(numHijos);
		
		return sb.toString();
	
	}
	
	
	}



