package reserva;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private int quarto;
	private Date entrada;
	private Date saida;
	
	public Reserva(int quarto, Date entrada, Date saida) {
		this.quarto = quarto;
		this.entrada = entrada;
		this.saida = saida;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	public Date getEntrada() {
		return entrada;
	}

	public Date getSaida() {
		return saida;
	}
	
	public long duracao() {
		long tempo = saida.getTime() - entrada.getTime();
		TimeUnit.DAYS.convert(tempo, TimeUnit.MILLISECONDS);
		return tempo;
	}
	
	public void atualizarReserva (Date entrada, Date saida) {
		this.entrada = entrada;
		this.saida = saida;
	}

	@Override
	public String toString() {
		return "Reserva [quarto=" + quarto + ", entrada=" + entrada + ", saida=" + saida + "]";
	}
	
}
