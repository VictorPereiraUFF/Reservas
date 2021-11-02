package entities;

import java.util.Date;

public class HorarioResort extends Horario{

	private double valorResort;
	
	public HorarioResort() {
		super();
	}

	public HorarioResort(String nome, Integer quarto, Date checkIn, Date checkOut, Double valorReserva, Double valorResort) {
		super(nome, quarto, checkIn, checkOut, valorReserva);
		this.valorResort = valorResort;
	}

	public double getValorResort() {
		return valorResort;
	}

	public void setValorResort(double valorResort) {
		this.valorResort = valorResort;
	}
	
	@Override
	public double conta() {
		return diff * (valorReserva + valorResort);
	}
	
	
	
	
	
}
