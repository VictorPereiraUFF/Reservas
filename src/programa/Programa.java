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
		
		System.out.print("Digite o número do quarto a ser reservado: ");
		int numeroQuarto = sc.nextInt();
		System.out.print("Digite a data de entrada da reserva: ");
		Date dataEntrada = sdf.parse(sc.next());
		System.out.print("Digite a data de saída da reserva: ");
		Date dataSaida = sdf.parse(sc.next());
		System.out.println();
		
		Reserva reserva = new Reserva(numeroQuarto, dataEntrada, dataSaida);
		
		System.out.println("Você deseja atualizar sua reserva? ");
		System.out.print("Digite 1 para sim e 0 para não: ");
		int resposta = sc.nextInt();
		
		if (resposta == 1) {
			System.out.print("Digite a nova data de entrada: ");
			Date dataEntradaAtualizada = sdf.parse(sc.next());
			System.out.print("Digite a nova data de saída: ");
			Date dataSaidaAtualizada = sdf.parse(sc.next());
			
			if(!dataSaidaAtualizada.after(dataEntradaAtualizada)) {
				System.out.println("Erro: a data de entrada deve ser anterior à data de saída!");
			}
			else if (dataEntradaAtualizada.equals(dataEntrada) && dataSaidaAtualizada.equals(dataSaida)) {
				System.out.println("Erro: a data atualizada é igual à data anterior!");
			}
			else {
				Reserva reservaAtualizada = new Reserva(numeroQuarto, dataEntradaAtualizada, dataSaidaAtualizada);
				System.out.println("Dados da reserva atualizada: " + reservaAtualizada);
				System.out.println("Aproveite a sua estadia!");
			}
		}
		else {
			if(!dataSaida.after(dataEntrada)) {
				System.out.println("Erro: a data de entrada deve ser anterior à data de saída!");
			}
			else {
				System.out.println("Dados da reserva: " + reserva);
			}
			System.out.println("Aproveite a sua estadia!");
		}
		
		sc.close();

	}

}
