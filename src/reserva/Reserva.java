package reserva;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private int quarto;
	private Date entrada;
	private Date saida;
	private Date entradaAtualizada;
	private Date saidaAtualizada;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	
	public Reserva(int quarto, Date entrada, Date saida) {
		this.quarto = quarto;
		this.entrada = entrada;
		this.saida = saida;
		this.entradaAtualizada = entradaAtualizada;
		this.saidaAtualizada = saidaAtualizada;
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
	
	public Date getEntradaAtualizada() {
		return entradaAtualizada;
	}

	public Date getSaidaAtualizada() {
		return saidaAtualizada;
	}
	
	public long duracao() {
		long tempo = saida.getTime() - entrada.getTime();
		return TimeUnit.DAYS.convert(tempo, TimeUnit.MILLISECONDS);
	}
	
	public String atualizarReserva (Date entrada, Date saida) {
		if(!entradaAtualizada.before(saidaAtualizada)) {
			return "Erro: a data de entrada deve ser anterior à data de saída!";
		}
		if (entradaAtualizada.equals(entrada) && saidaAtualizada.equals(saida)) {
			return "Erro: a data atualizada é igual à data anterior!";
		}
		this.entrada = entrada;
		this.saida = saida;
		
		return null;
	}

	@Override
	public String toString() {
		return "Reserva: quarto " + quarto + ", entrada em " + sdf.format(entrada) + ", saida em " + sdf.format(saida) + ", duração de " + duracao() + " noites!";
	}
	
}
