package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import reserva.Reserva;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.print("Digite o n�mero do quarto a ser reservado: ");
		int numeroQuarto = sc.nextInt();
		System.out.print("Digite a data de entrada da reserva: ");
		Date dataEntrada = sdf.parse(sc.next());
		System.out.print("Digite a data de sa�da da reserva: ");
		Date dataSaida = sdf.parse(sc.next());
		System.out.println();
		
		Reserva reserva = new Reserva(numeroQuarto, dataEntrada, dataSaida);
		
		System.out.println("Voc� deseja atualizar sua reserva? ");
		System.out.print("Digite 1 para sim e 0 para n�o: ");
		int resposta = sc.nextInt();
		
		if (resposta == 1) {
			System.out.print("Digite a nova data de entrada: ");
			Date dataEntradaAtualizada = sdf.parse(sc.next());
			System.out.print("Digite a nova data de sa�da: ");
			Date dataSaidaAtualizada = sdf.parse(sc.next());
			

			String erroReserva = reserva.atualizarReserva(dataEntradaAtualizada, dataSaidaAtualizada);
			if (erroReserva != null) {
				System.out.println(erroReserva);
			}
			else {
				System.out.println("Dados da reserva atualizada: " + reserva);
				System.out.println("Aproveite a sua estadia!");
			}
		}

		else {
			if(!dataSaida.after(dataEntrada)) {
				System.out.println("Erro: a data de entrada deve ser anterior � data de sa�da!");
			}
			else {
				System.out.println("Dados da reserva: " + reserva);
			}
			System.out.println("Aproveite a sua estadia!");
		}
		
		sc.close();

	}

}
