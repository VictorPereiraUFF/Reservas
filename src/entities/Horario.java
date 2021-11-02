package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Horario {
	
	private String nome;
	private Integer quarto;
	private Date checkIn;
	private Date checkOut;
	protected Double valorReserva;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	public Horario() {
		
	}

	public Horario(String nome, Integer quarto, Date checkIn, Date checkOut, Double valorReserva) {
		this.nome = nome;
		this.quarto = quarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.valorReserva = valorReserva;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuarto() {
		return quarto;
	}

	public void setQuarto(Integer quarto) {
		this.quarto = quarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public Double getValorReserva() {
		return valorReserva;
	}

	public void setValorReserva(Double valorReserva) {
		this.valorReserva = valorReserva;
	}

	public long duracao() {
		long diff = checkOut.getTime()-checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public double conta() {
		return diff * valorReserva;
	}
	
	
	
}
	
	